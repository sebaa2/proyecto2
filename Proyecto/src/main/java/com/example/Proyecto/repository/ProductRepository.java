package com.example.Proyecto.repository;

import com.example.Proyecto.model.product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository  extends CrudRepository<product, Long>{
}

