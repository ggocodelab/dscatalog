package com.ggocodelab.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ggocodelab.backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
