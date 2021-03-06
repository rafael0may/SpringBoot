package com.softtek.java.sboot.service;

 

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.softtek.java.sboot.entity.Product;
import com.softtek.java.sboot.repository.ProductRepository;

 

@Service
public class ProductService {
    private ProductRepository productRepository;
    
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    
    
    public List<Product> getAllProduct(){
        List<Product> list = new ArrayList<Product>();
        productRepository.findAll().forEach(e -> list.add(e));
        return list;
    }
    
    public Optional<Product> findByName(String name){
    	return productRepository.findByName(name);
    }
    
    

 

}