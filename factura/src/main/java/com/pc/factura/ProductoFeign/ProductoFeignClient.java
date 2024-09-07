package com.pc.factura.ProductoFeign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "producto-service", url ="http://localhost:8082/api/productos")
public interface ProductoFeignClient {

}
