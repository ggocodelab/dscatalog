package com.ggocodelab.backend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ggocodelab.backend.dtos.ProductDTO;
import com.ggocodelab.backend.entities.Product;
import com.ggocodelab.backend.exceptions.ResourceNotFoundException;
import com.ggocodelab.backend.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ProductDTO> findAllPaged(PageRequest pageRequest){		
		Page<Product> list = repository.findAll(pageRequest);		
		return list.map(x -> new ProductDTO(x));		
	}
	
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		Product entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ProductDTO(entity);
	}

}
