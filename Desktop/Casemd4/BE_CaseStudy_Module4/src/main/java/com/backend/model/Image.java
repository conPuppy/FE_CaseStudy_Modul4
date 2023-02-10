package com.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private boolean isAvatar;
    @ManyToOne
    private Product product;

    // Getters and setters
}