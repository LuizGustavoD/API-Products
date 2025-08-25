package io.ProductsAPI;

import org.antlr.v4.runtime.CodePointBuffer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

@SpringBootApplication
public class ProductsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductsApiApplication.class, args);
	}
}
