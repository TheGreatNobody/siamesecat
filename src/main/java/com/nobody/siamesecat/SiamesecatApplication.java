package com.nobody.siamesecat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SiamesecatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SiamesecatApplication.class, args);
	}

}
