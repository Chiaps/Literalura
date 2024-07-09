package com.literalura.dto;


public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String language;

    // Constructor por defecto
    public BookDTO() {
    }

    // Constructor parametrizado
    public BookDTO(Long id, String title, String author, String language) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.language = language;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
