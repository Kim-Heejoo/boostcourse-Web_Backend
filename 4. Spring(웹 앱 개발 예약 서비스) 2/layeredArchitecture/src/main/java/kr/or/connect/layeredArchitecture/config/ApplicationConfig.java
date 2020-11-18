package kr.or.connect.layeredArchitecture.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "kr.or.connect.layeredArchitecture.dao",  "kr.or.connect.layeredArchitecture.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {

}