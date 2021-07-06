package com.shopping.springbootecommerce.dao;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository <ProductCategory, Long>{
    // Nothing just testing something....
}
