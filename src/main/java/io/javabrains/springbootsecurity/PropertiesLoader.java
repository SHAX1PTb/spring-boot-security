package io.javabrains.springbootsecurity;

import org.apache.commons.lang.text.StrSubstitutor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import java.io.IOException;
import java.util.Properties;


public class PropertiesLoader {
    private final Log log = LogFactory.getLog(PropertiesLoader.class);


    static String propLocal = " ";

    public void propLoader(String a) {

        Properties properties = readLocalProp();
        String appHome = PropertiesLoader.class.getClassLoader().getResource("util").getPath();
//        System.out.println(appHome);
        log.info(appHome);

        System.setProperty("Shankar","a");

        properties.forEach((k,v) -> {
            String key = String.valueOf(k);
            String value = (String) (v);

            System.setProperty(key, StrSubstitutor.replaceSystemProperties(value));

        });
    }

    private Properties readLocalProp() {
        Properties prop = new Properties();
        try {
            prop.load(PropertiesLoader.class.getResourceAsStream(propLocal));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
}
