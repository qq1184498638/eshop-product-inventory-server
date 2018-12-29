package com.springcloud.eshop.product.inventories.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductInventoriesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInventoriesServerApplication.class, args);
	}

}

