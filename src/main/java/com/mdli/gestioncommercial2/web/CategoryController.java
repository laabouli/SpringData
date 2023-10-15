package com.mdli.gestioncommercial2.web;

import com.mdli.gestioncommercial2.model.Category;
import com.mdli.gestioncommercial2.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public Iterable<Category> getCategories(){
        return categoryService.getCategories();
    }

    @GetMapping("categories/{id}")
    public Category getCategory(@PathVariable("id")int id){
        return categoryService.getCategory(id);
    }

    @DeleteMapping("/categories/{id}")
    public void  deleteCategory(@PathVariable("id") int id){
        categoryService.deleteCategory(id);
    }

    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @PutMapping("/categories")
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCaregory(category);
    }



}
