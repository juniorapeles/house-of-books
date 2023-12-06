package com.techlibrary.houseofbooks.entities;

import com.techlibrary.houseofbooks.dto.CategorieDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_categories")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String deascription;

    public Categorie() {
    }

    public Categorie(CategorieDTO categorieDTO) {
        this.id = categorieDTO.getId();
        this.name = categorieDTO.getName();
        this.deascription = categorieDTO.getDeascription();
    }

    public Categorie(Long id, String name, String deascription) {
        this.id = id;
        this.name = name;
        this.deascription = deascription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeascription() {
        return deascription;
    }

    public void setDeascription(String deascription) {
        this.deascription = deascription;
    }
}
