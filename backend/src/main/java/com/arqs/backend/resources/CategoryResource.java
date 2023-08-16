package com.arqs.backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.arqs.backend.entities.Category;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping(value = "/categorias")
public class CategoryResource {

    @GetMapping
    public ResponseEntity<List<Category>> buscarTodos(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Livros"));
        list.add(new Category(2L, "Eletronicos"));
        //retorna a lista de categorias
        return ResponseEntity.ok().body(list);
    }
    
}
