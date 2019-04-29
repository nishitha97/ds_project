package com.distributedsystems.assignment2.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "")
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

}
