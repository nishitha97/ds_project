package com.distributedsystems.assignment2.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * Swagger configuration properties
 *
 * run on http://localhost:8081/swagger-ui.html
 * @author IT17006880
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket assignmentApi() {
        //all controllers in the given package will be added to SwaggerUI
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.distributedsystems.assignment2")).paths(regex("/api.*"))
                .build().apiInfo(metaData());
    }

    //setting metaData
    private ApiInfo metaData() {

        return new ApiInfoBuilder().title("Distributed Systems").description("Rest Api-IT17006880").version("1.0").build();

    }
}
