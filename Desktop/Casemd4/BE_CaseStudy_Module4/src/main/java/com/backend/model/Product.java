package com.backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Product {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String description;
   private ProductStatus productStatus;
   private Double price;
   @ManyToOne
   private Category category;
   @OneToMany()
   private List<Image> images = new ArrayList<>();

}
