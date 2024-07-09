package com.literalura.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String birthYear;
    private String deathYear;

    // Constructor por defecto
    public Author() {
    }

    // Constructor con argumento de tipo String
    public Author(String name) {
        this.name = name;
    }

    // Método para establecer el año de nacimiento que maneje la ausencia de datos
    public void setBirthYear(Integer year) {
        this.birthYear = (year != null) ? year.toString() : "NA";
    }

    // Método para establecer el año de muerte que maneje la ausencia de datos
    public void setDeathYear(Integer year) {
        this.deathYear = (year != null) ? year.toString() : "NA";
    }
}