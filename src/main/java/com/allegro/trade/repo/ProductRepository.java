package com.allegro.trade.repo;

import com.allegro.trade.domain.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    Iterable<Product> findByDescriptionContaining(String description);

}
