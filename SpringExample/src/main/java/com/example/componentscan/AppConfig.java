package com.example.componentscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.example.componentscan") // This annotation enables component scanning for the specified package
// It allows Spring to automatically detect and register beans in the specified package
// You can also specify multiple packages if needed by using basePackages = {"package1", "package2"}
public class AppConfig {//configuration class for component scanning
    // This class can be used to define additional beans or configurations if needed
    // You can also use annotations like @Configuration and @ComponentScan here if you prefer Java-based configuration

}
