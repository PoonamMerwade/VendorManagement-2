package com.cts;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@ComponentScan(basePackages = {"com.cts"})
@EnableSwagger2
@SpringBootApplication
@EntityScan
public class ProductManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementApplication.class, args);
	}
	@Bean
	Docket configureSwagger() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/products/**"))
				.build()
				
				.apiInfo(new ApiInfo("Product API Documentation",
						"A Sample API for Vendors",
						"1.0.0",
						"Shopping is Fun",
						new Contact("Poonam", "www.poonamcorporation.com", "poonam@gmail.com"), 
						"Standard API License",
						"www.poonam.com",
						Collections.emptyList()));
				}

}
