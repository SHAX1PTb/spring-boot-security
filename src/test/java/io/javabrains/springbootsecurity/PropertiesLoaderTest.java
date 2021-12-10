package io.javabrains.springbootsecurity;

import junit.framework.TestCase;
import org.junit.Test;

public class PropertiesLoaderTest extends TestCase {

   // @Test
    public void testLoadProp(){

        PropertiesLoader propertiesLoader = new PropertiesLoader();

        propertiesLoader.propLoader("a");

    }

}