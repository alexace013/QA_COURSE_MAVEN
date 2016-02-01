package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigData {

    private static final Logger log = Logger.getLogger("log4j.rootLogger");
    private static File file = new File("UIMapping.properties");
    private static final String UI_MAPPING_PATH = file.getPath();
    private static Properties properties;
    private static ConfigData config;
    private Map<String, String> map;

    private ConfigData() {
        try {
            properties.load(ConfigData.class.getResourceAsStream(file.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        map = new HashMap<>((Map) properties);
    }

    public static ConfigData getConfigData() {
        if (config == null) {
            config = new ConfigData();
        }
        return config;
    }

    public By getLocator(String key) throws IOException {

        String[] partsOfLocators = getValueFromMap(key).split("\"");
        String findElement = partsOfLocators[0].substring(0, partsOfLocators[0].length() - 1);
        String locator = partsOfLocators[1];

        switch (findElement) {

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
                throw new IOException(
                        String.format("Locator '%s'  not defined!", locator));

        }

    }

    private String getValueFromMap(String key) {
        return map.get(key);
    }


}
