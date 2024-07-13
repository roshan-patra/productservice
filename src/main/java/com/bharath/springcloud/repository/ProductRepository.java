package com.bharath.springcloud.repository;

import com.bharath.springcloud.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
