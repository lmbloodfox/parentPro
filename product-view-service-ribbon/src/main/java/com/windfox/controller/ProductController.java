package com.windfox.controller;

import com.windfox.pojo.Product;
import com.windfox.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("products")
    public Object products(Model m ){
        List<Product> list = productService.listProducts();
        m.addAttribute("ps",list);
        return m;
    }
}
