package com.literalura.service;

import com.literalura.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class BookService {

    public void searchBookByTitle(String title) {
        // Implementa la lógica de búsqueda aquí
    }

    public List<Book> listAllBooks() {
        // Implementa la lógica para obtener todos los libros aquí
        return new ArrayList<>();
    }

    public List<Book> listBooksByLanguage(String language) {
        // Implementa la lógica para obtener libros por idioma aquí
        return new ArrayList<>();
    }
}