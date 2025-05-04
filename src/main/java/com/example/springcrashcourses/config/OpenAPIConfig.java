package com.example.springcrashcourses.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI openAPIInformation() {
        Contact contact = new Contact()
                .name("Jrad Mariem")
                .email("springdoc@gmail.com");

        Info info = new Info()
                .title("Study Case Foyer")
                .version("1.0.0")
                .description("Spring Boot Foyer Project")
                .summary("Manage Application with web services for ASI II Course")
                .contact(contact)
                .license(new License().name("Apache 2.0").url("http://springdoc.org"));

        return new OpenAPI().info(info);    }

    @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only client Management API")
                .pathsToMatch("/client/**")
                .build();
    }

}
