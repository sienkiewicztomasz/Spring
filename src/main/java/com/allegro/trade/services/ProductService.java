package com.allegro.trade.services;

import com.allegro.trade.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(Integer id);

    List <Product> listAllProductsWithDescription (String description);
}
