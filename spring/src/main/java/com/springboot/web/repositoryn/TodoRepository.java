package com.springboot.web.repositoryn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.Todoo;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todoo, Integer> {
	 List<Todoo> findByUserContaining(String text);
    
}