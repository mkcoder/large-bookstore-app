package com.mkcoder.mycodingblog.largebookstore.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * a simple java class that will load the database properties from the file and return it to the user
 */
@Configuration
@PropertySource("classpath:database.properties")
public class DatabaseConfigurePropertyLoader {

    @Autowired
    private Environment environment;

    @Bean
    public String jdbcUrl() {
        return environment.getProperty("jdbc.url");
    }

    @Bean
    public String jdbcUsername() {
        return environment.getProperty("jdbc.username");
    }

    @Bean
    public String jdbcPassword() {
        return environment.getProperty("jdbc.password");
    }

    @Bean
    public String jdbcDriver() {
        return environment.getProperty("jdbc.driver");
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
