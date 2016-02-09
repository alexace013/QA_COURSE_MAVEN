package utils;

import org.testng.Assert;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    @FileProperties(properties = true)
    private static final String PROPERTY_FILE = "/application.properties";
    private static Properties properties = new Properties();

    /**
     * Static method for load property from {@value PROPERTY_FILE}
     *
     * @param name parameter to the indicate which browser will be selected as the driver
     * @return {@link String}
     * @throws IOException when {@value PROPERTY_FILE} has failed data of failed path
     */
    public static String loadProperty(String name) {

        try {

            /**
             * {@link Properties#load(InputStream)}
             * {@link Class#getResourceAsStream(String)}
             * */
            properties.load(PropertyLoader.class.getResourceAsStream(PROPERTY_FILE));

        } catch (IOException e) {

            /**
             * {@link Assert#fail(String)}
             * */
            Assert.fail(String.format("incorrect property name - < %s >", name));

        }

        String value = "";

        if (name != null) {

            /**
             * {@link Properties#getProperty(String)}
             * */
            value = properties.getProperty(name);

        }

        return value;

    }

}
