package com.windfox.client;

import com.windfox.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("projectDataService")
public interface ProductClientFeign {

    @GetMapping("products")
    public List<Product> listProducts();

}
