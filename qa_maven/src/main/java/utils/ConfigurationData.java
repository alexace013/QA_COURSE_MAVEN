package utils;

import exception.ElementNoFound;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigurationData {

    private static final Logger log = Logger.getLogger("log4j.rootLogger");
    @FileProperties(properties = true)
    private static final String UI_MAPPING_PATH = "src/main/resources/UIMapping.properties";
    private static ConfigurationData config;
    private final Properties PROPERTIES;
    private Map<String, String> propertiesMap;

    private ConfigurationData() {

        this.PROPERTIES = new Properties();
        log.info(String.format("created properties"));

        try {

            this.propertiesMap = loadPropertiesToMap();
            log.info(String.format("created map properties"));

        } catch (IOException e) {

            e.printStackTrace();
            log.error(String.format("Exception < %s >", e.getStackTrace()));

        }

    }

    /**
     * Static method for return configuration data
     *
     * @return {@link ConfigurationData#ConfigurationData()}
     */
    public static ConfigurationData getConfigurationData() {

        if (config == null) {
            config = new ConfigurationData();

        }

        return config;

    }

    /**
     * Private method for loaded properties to the map {@link ConfigurationData#propertiesMap}
     *
     * @return {@link HashMap<String, String> with {@value PROPERTIES}} If file is not exists and
     * path correct, otherwise {@link FileNotFoundException}
     * @throws IOException           If {@link FileInputStream not opening a connection to an actual
     *                               file {@value UI_MAPPING_PATH}}
     * @throws FileNotFoundException If false {@link Files#exists(Path, LinkOption...) and
     *                               {@link Paths#get(String, String...)}, where
     *                               String => {@value UI_MAPPING_PATH}}
     */
    private Map<String, String> loadPropertiesToMap() throws ElementNoFound {

        if (Files.exists(Paths.get(UI_MAPPING_PATH))) {

            FileInputStream fileInputStream = null;

            try {

                fileInputStream = new FileInputStream(UI_MAPPING_PATH);
                PROPERTIES.load(fileInputStream);


            } catch (IOException e) {

                e.printStackTrace();

            }

        } else {

            throw new ElementNoFound(
                    String.format("< %s > not found exception", UI_MAPPING_PATH.substring(13)));

        }

        return propertiesMap = new HashMap<String, String>((Map) PROPERTIES);

    }

    /**
     * Private method for return value property
     *
     * @param key some string parameter from {@fileProperties UIMapping.properties}
     * @return string locator with parameters from {@fileProperties UIMapping.properties}
     */
    private String getPropertyValue(String key) {
        return propertiesMap.get(key);
    }

    /**
     * Method get locator
     *
     * @param key some locator from {@fileProperties UIMapping.properties}
     * @return {@link By without parameter}
     * @throws {@link exception.ElementNoFound}
     */
    public By getLocator(String key) throws ElementNoFound {

        String[] partsOfLocators = getPropertyValue(key).split("\"");
        String findMethod = partsOfLocators[0].substring(0, partsOfLocators[0].length() - 1);
        String locator = partsOfLocators[1];

        switch (findMethod) {

            case "id":
                return By.id(locator);

            case "name":
                return By.name(locator);

            case "class":
                return By.className(locator);

            case "cssSelector":
                return By.cssSelector(locator);

            case "xpath":
                return By.xpath(locator);

            case "tagName":
                return By.tagName(locator);

            case "linkText":
                return By.linkText(locator);

            case "partialLinkText":
                return By.partialLinkText(locator);

            default:
                throw new ElementNoFound(
                        String.format("Locator < %s >  not defined!", locator));
        }

    }

}
