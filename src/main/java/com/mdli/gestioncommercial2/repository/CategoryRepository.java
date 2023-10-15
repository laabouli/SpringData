package com.mdli.gestioncommercial2.repository;

import com.mdli.gestioncommercial2.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
