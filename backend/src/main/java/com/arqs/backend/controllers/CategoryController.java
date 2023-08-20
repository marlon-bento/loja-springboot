package com.arqs.backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.arqs.backend.entities.Category;
import com.arqs.backend.services.CategoryService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping(value = "/categorias")
public class CategoryController {

    @Autowired
	private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> buscarTodos(){
        List<Category> list = service.findAll();
        //retorna a lista de categorias
        return ResponseEntity.ok().body(list);
    }
    
}
