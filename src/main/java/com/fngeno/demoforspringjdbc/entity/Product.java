package com.fngeno.demoforspringjdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Frank Ngeno
 */
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Builder
@Table(name = "Product_table")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String quantity;
    private String price;
}
