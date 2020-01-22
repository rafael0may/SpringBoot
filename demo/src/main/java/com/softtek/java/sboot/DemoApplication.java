package com.softtek.java.sboot;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.softtek.java.sboot.entity.User;
import com.softtek.java.sboot.service.UserService;

import com.softtek.java.sboot.entity.Product;
import com.softtek.java.sboot.service.ProductService;

 

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    
    @Autowired
    UserService userService;
    
    @Autowired
    ProductService productService;

 

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

 

    @Override
    public void run(String... args) throws Exception {
        
        User harry = new User();
        harry.setFirstName("Harry");
        harry.setLastName("Potter");
        harry.setUserName("harry.potter");
        
        User hermionie = new User();
        hermionie.setFirstName("Hermionie");
        hermionie.setLastName("Granger");
        hermionie.setUserName("hermionie.granger");
        
        User ron = new User();
        ron.setFirstName("Ron");
        ron.setLastName("Weasley");
        ron.setUserName("ron.weasley");
        
        Optional<User> user = userService.findByUserName("harry.potter");
        if(!user.isPresent()) {
        	userService.createUser(harry);
        }
        
        user = userService.findByUserName("hermionie.granger");
        if(!user.isPresent()) {
        	userService.createUser(hermionie);
        }
        
        user = userService.findByUserName("ron.weasley");
        if(!user.isPresent()) {
        	userService.createUser(ron);
        }
        
        
        Product producto1 = new Product();
        producto1.setName("RobotoX12");
        producto1.setDescription("RobotoX12 es un robot creativo");
        
        Product producto2 = new Product();
        producto2.setName("Roboto360");
        producto2.setDescription("RobotoX19 es un robot de alto aprendizaje");

        Product producto3 = new Product();
        producto3.setName("RobotoZ32");
        producto3.setDescription("RobotoX19 es un robot de trabajo duro");
        
        Product producto4 = new Product();
        producto4.setName("Roboto01");
        producto4.setDescription("RobotoX19 es un robot para meditar");
        
        Product producto5 = new Product();
        producto5.setName("Robotin86");
        producto5.setDescription("RobotoX19 es un robot cariñoso");
        
        Product producto6 = new Product();
        producto6.setName("RobotoA24");
        producto6.setDescription("RobotoX19 es un robot deportista");
        
        Product producto7 = new Product();
        producto7.setName("RobotoS6");
        producto7.setDescription("RobotoX19 es un robot super inteligente");
        
        Product producto8 = new Product();
        producto8.setName("RobotoE64");
        producto8.setDescription("RobotoX19 es un robot para juegos");
        
       
        
        Optional<Product> producto = productService.findByName("RobotoX12");
        if(!producto.isPresent()) {
        	productService.createProduct(producto1);
        }
        
        producto = productService.findByName("Roboto360");
        if(!producto.isPresent()) {
        	productService.createProduct(producto2);
        }
        
        producto = productService.findByName("RobotoZ32");
        if(!producto.isPresent()) {
        	productService.createProduct(producto3);
        }
        
        producto = productService.findByName("Roboto01");
        if(!producto.isPresent()) {
        	productService.createProduct(producto4);
        }
        
        producto = productService.findByName("Robotin86");
        if(!producto.isPresent()) {
        	productService.createProduct(producto5);
        }
        
        producto = productService.findByName("RobotoA24");
        if(!producto.isPresent()) {
        	productService.createProduct(producto6);
        }
        
        producto = productService.findByName("RobotoS6");
        if(!producto.isPresent()) {
        	productService.createProduct(producto7);
        }
        
        producto = productService.findByName("RobotoE64");
        if(!producto.isPresent()) {
        	productService.createProduct(producto8);
        }
        
        
        
        
        
        
         
        
    }

 

}