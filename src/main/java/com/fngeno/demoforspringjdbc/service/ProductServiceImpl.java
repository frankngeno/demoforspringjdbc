package com.fngeno.demoforspringjdbc.service;

import com.fngeno.demoforspringjdbc.dao.ProductRepository;
import com.fngeno.demoforspringjdbc.dto.ProductDTO;
import com.fngeno.demoforspringjdbc.entity.Product;
import com.fngeno.demoforspringjdbc.utils.AppUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Frank Ngeno
 */

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository repository;


    @Override
    public Product saveProduct(ProductDTO productDTO) {
        var product = AppUtils.dtoToEntity(productDTO);
        return repository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<ProductDTO> products) {
        var product = AppUtils.dtoToEntity(products);
        return repository.saveAll(product);
    }

    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product Removed " + id;
    }

    @Override
    public Product updateProduct(ProductDTO productDTO) {
        var existingProduct = repository.findById(productDTO.getId()).orElse(null);
        existingProduct.setName(productDTO.getName());
        existingProduct.setPrice(productDTO.getPrice());
        existingProduct.setQuantity(productDTO.getQuantity());

        var product = AppUtils.dtoToEntity(productDTO);


        return repository.save(product);
    }

}
