package utils;

import org.testng.Assert;

import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    @FileProperties(properties = true)
    private static final String PROPERTY_FILE = "src/main/resources/application.properties";

    public static String loadProperty(String name) {

        Properties properties = new Properties();

        try {

            properties.load(PropertyLoader.class.getResourceAsStream(PROPERTY_FILE));

        } catch (IOException e) {

            Assert.fail(String.format("incorrect property name - < %s >", name));

        }

        String value = "";

        if (name != null) {

            value = properties.getProperty(name);

        }

        return value;

    }

}
