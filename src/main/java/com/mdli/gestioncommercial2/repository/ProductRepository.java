package com.mdli.gestioncommercial2.repository;

import com.mdli.gestioncommercial2.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
