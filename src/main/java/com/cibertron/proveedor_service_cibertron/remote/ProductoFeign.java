package com.cibertron.proveedor_service_cibertron.remote;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="producto-service-cibertron")
public interface ProductoFeign {

	 @GetMapping("/api-rest/v1/productos")
	    List<String> obtenerProductos();
	
}
