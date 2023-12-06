package com.techlibrary.houseofbooks.entities;

import com.techlibrary.houseofbooks.dto.AuthorDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String biography;

    public Author() {
    }

    public Author(AuthorDTO authorDTO) {
        this.id = authorDTO.getId();
        this.name = authorDTO.getName();
        this.biography = authorDTO.getBiography();
    }

    public Author(Long id, String name, String biography) {
        this.id = id;
        this.name = name;
        this.biography = biography;
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

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

}
