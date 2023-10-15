package com.mdli.gestioncommercial2.service;

import com.mdli.gestioncommercial2.model.Category;
import com.mdli.gestioncommercial2.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> getCategories(){
        return categoryRepository.findAll();
    }

    public void deleteCategory(int id){
        categoryRepository.deleteById(id);
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public Category updateCaregory(Category category){
        return categoryRepository.save(category);
    }

    public Category getCategory(int id){
        return categoryRepository.findById(id).get();
    }



}
