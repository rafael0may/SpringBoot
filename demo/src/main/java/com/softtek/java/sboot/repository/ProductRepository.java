package com.softtek.java.sboot.repository;

 

import java.util.Optional;

 

import org.springframework.data.repository.CrudRepository;

 

import com.softtek.java.sboot.entity.Product;

 

 

public interface ProductRepository extends CrudRepository<Product, Long>  {
    public Optional<Product> findByName(String name);    
}