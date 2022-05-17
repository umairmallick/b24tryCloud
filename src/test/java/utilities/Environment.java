package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Dynamically loads test data to variables, according to the env value.
 * First checks if "env" value was passed from maven command line.
 * If yes, it will use that value.
 * If not, it will use value in local configuration.properties file
 *
 *
 * */

public class Environment {

        public static final String URL;
        public static final String USERNAME;
        public static final String PASSWORD;

        static { //runs once in beginning when we use the class- static block
            //class to read from .properties files
            Properties properties = null;
            String environment = System.getProperty("env") != null ? System.getProperty("env") : ConfigurationReader.getProperty("env");
            //String environment = ConfigurationReader.get("environment");

            try {

                String path = System.getProperty("user.dir") + "/src/test/resources/env/" + environment + ".properties";

                FileInputStream input = new FileInputStream(path);
                properties = new Properties();
                properties.load(input);
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            URL = properties.getProperty("url");
            USERNAME = properties.getProperty("username");
            PASSWORD = properties.getProperty("password");

        }

}
