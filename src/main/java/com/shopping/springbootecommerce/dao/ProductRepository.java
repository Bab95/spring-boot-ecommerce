package com.shopping.springbootecommerce.dao;

import com.shopping.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "products", path = "product")
public interface ProductRepository extends JpaRepository<Product, Long> {
    // test commit
}
