package com.fngeno.demoforspringjdbc.dao;

import com.fngeno.demoforspringjdbc.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Frank Ngeno
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}
