package com.shopping.springbootecommerce.dao;

import com.shopping.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Product", path = "product")
public interface ProductRepository extends JpaRepository<Product, Long> {
}
