package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"metier", "dao"})
public class AppConfig {
    // Other configuration if needed
}
