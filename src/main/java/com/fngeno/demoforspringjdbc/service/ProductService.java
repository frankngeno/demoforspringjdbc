package com.fngeno.demoforspringjdbc.service;

import com.fngeno.demoforspringjdbc.dto.ProductDTO;
import com.fngeno.demoforspringjdbc.entity.Product;

import java.util.List;

/**
 * @author Frank Ngeno
 */
public interface ProductService {

    Product saveProduct(ProductDTO productDTO);

    public List<Product> saveProducts(List<ProductDTO> products);

    public List<Product> getProducts();
    public Product getProductById(int id);

    public Product getProductByName(String name);

    public String deleteProduct(int id);

    public Product updateProduct(ProductDTO productDTO);
}
