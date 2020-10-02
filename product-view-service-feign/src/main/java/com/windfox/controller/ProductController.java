package com.windfox.controller;

import com.windfox.pojo.Product;
import com.windfox.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

//    @Value("${version}")
//    String version;

    @Autowired
    FeignService feignService;

    @RequestMapping("products")
    public Object products(Model model){

        List<Product> list = feignService.listProducts();
//        model.addAttribute("version" , version);
        model.addAttribute("ps" , list);
        return model;
    }

}
