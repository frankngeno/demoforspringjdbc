package com.fngeno.demoforspringjdbc.utils;

import com.fngeno.demoforspringjdbc.dto.ProductDTO;
import com.fngeno.demoforspringjdbc.entity.Product;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Frank Ngeno
 */

public class AppUtils {

    private AppUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static ProductDTO entityToDto(Product product) {
        ProductDTO productDto = new ProductDTO();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }

    public static Product dtoToEntity(ProductDTO productDto) {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }

    public static List<Product> dtoToEntity(List<ProductDTO> productDto) {
        List<Product> product = new ArrayList<>();

        for (ProductDTO dto : productDto) {
            Product productEntity = new Product(
                    dto.getId(),
                    dto.getName(), dto.getQuantity(),
                    dto.getPrice()
            );
            product.add(productEntity);
        }
        return product;
    }

    public static List<ProductDTO> entityToDto(List<Product> product) {
        List<ProductDTO> productDTOList = new ArrayList<>();

        for (Product productEntity : product) {
            ProductDTO productDto = new ProductDTO(
                    productEntity.getId(),
                    productEntity.getName(),
                    productEntity.getQuantity(),
                    productEntity.getPrice()
            );
            productDTOList.add(productDto);
        }
        return productDTOList;
    }

}
