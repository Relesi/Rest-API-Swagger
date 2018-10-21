package com.relesi.restapi.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.relesi.restapi"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Produtos Rest API", 
				"API Produtos",
				"1.0",
				"Term of Service",
				new Contact("Renato Lessa", "http://www.renato.relesi.com.br/",
						"renatolessa.2011@hotmail.com"), 
				"Apache License Version 2.0", 
				"http://www.apache.org/license.html", new ArrayList<VendorExtension>()
				);
		
		return apiInfo;
	}
	
}
