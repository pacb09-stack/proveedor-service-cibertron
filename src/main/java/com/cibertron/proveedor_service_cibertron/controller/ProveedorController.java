package com.cibertron.proveedor_service_cibertron.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cibertron.proveedor_service_cibertron.remote.ProductoFeign;

@RestController
@RequestMapping("/api-rest/v1")
public class ProveedorController {
	
	@Autowired
	private ProductoFeign productoFeign;

	
	@GetMapping("/proveedores-mensaje")
	public String mensaje() {
		return "Integración Exitosa";
	}
	
	@GetMapping("/proveedores-productos")
	public List<String> productos() {
	    return productoFeign.obtenerProductos();
	}

}
