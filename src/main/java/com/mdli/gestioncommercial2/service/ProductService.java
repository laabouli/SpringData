package com.mdli.gestioncommercial2.service;

import com.mdli.gestioncommercial2.model.Product;
import com.mdli.gestioncommercial2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public  Iterable<Product> getProducts(){
        return productRepository.findAll();
    }
    public void deleteProduct(int id){
        productRepository.deleteById(id);
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product getProduct(int id){
        return productRepository.findById(id).get();
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }
}
