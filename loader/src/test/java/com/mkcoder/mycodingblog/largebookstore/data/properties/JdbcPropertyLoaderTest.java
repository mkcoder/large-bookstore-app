package com.mkcoder.mycodingblog.largebookstore.data.properties;

import com.mkcoder.mycodingblog.largebookstore.properties.data.JdbcPropertyLoader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static junit.framework.Assert.assertEquals;

/**
 *a simple test that checks if the PropertyLoader loads the actually file from the disk
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.mkcoder.mycodingblog.largebookstore.configurations.DatabaseConfigurePropertyLoader.class, JdbcPropertyLoader.class}, loader = AnnotationConfigContextLoader.class )
public class JdbcPropertyLoaderTest {

    @Autowired
    private Environment env;

    @Autowired
    private JdbcPropertyLoader props;


    @Test
    public void testIfPropertyFileLoadsCorrectValuesUsingSpringContext() {
        assertEquals(env.getProperty("jdbc.driver"), props.getJdbcDriver());
        assertEquals(env.getProperty("jdbc.url"), props.getJdbcUrl());
        assertEquals(env.getProperty("jdbc.password"), props.getJdbcPassword());
        assertEquals(env.getProperty("jdbc.username"), props.getJdbcUsername());

    }

}
