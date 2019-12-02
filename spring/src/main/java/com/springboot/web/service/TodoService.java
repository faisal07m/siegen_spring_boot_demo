package com.springboot.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.model.Todoo;
import com.springboot.web.repositoryn.TodoRepository;

@Service
public class TodoService {
   
    
	@Autowired
	TodoRepository rep;
    public List<Todoo> retrieveTodos() {
        
        return rep.findAll();
    }

    
}