package com.softtek.java.sboot.rest;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

import com.softtek.java.sboot.entity.Product;
import com.softtek.java.sboot.repository.ProductRepository;
import com.softtek.java.sboot.service.ProductService;

 

@RestController
public class ProductRest {
    
    private ProductRepository productRepository;
    
    @Autowired
    public ProductRest(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @RequestMapping("/productlist")
    public  List<Product> getAll(){
        ProductService product = new ProductService(productRepository);
        return product.getAllProduct();
    }

 

}