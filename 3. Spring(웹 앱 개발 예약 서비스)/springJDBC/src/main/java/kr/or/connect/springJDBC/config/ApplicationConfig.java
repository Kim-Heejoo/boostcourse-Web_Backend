package kr.or.connect.springJDBC.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DBConfig.class})
@ComponentScan(basePackages = { "kr.or.connect.springJDBC.dao" })
public class ApplicationConfig {

}