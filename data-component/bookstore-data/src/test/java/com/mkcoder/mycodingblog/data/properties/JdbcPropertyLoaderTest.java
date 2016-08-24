package com.mkcoder.mycodingblog.data.properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import static org.junit.Assert.assertEquals;

/**
 *a simple test that checks if the PropertyLoader loads the actually file from the disk
 */
@Component
public class JdbcPropertyLoaderTest {

    @Test
    public void testIfPropertyFileLoadsCorrectValuesUsingSpringContext() {
            String path = "application-context.xml";
        ApplicationContext context =
                new ClassPathXmlApplicationContext(path);
        JdbcPropertyLoader propertyLoader = context.getBean(JdbcPropertyLoader.class);
        assertEquals("root", propertyLoader.getJdbcPassword());
        assertEquals("root", propertyLoader.getJdbcUsername());
        assertEquals("jdbc:mysql://localhost:3306/very_large_bookstore", propertyLoader.getJdbcUrl());

    }


}
