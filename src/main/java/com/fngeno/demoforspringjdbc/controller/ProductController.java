package com.fngeno.demoforspringjdbc.controller;

import com.fngeno.demoforspringjdbc.dto.ProductDTO;
import com.fngeno.demoforspringjdbc.entity.Product;
import com.fngeno.demoforspringjdbc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Frank Ngeno
 */

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody ProductDTO productDto) {
        return service.saveProduct(productDto);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<ProductDTO> products) {
        return service.saveProducts(products);
    }

    @GetMapping("/allProducts")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody ProductDTO productDTO) {
        return service.updateProduct(productDTO);//updating the whole object,remember to put id on the json to update it
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProductById(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
