package com.example.lab6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.lab6.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer> {

}
