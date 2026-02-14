package com.cibertron.proveedor_service_cibertron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProveedorServiceCibertronApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProveedorServiceCibertronApplication.class, args);
	}

}
