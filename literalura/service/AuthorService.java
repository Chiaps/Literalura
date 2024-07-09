package com.literalura.service;

import com.literalura.model.Author;
import com.literalura.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    // Método para obtener todos los autores
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // Método para obtener autores vivos en un año determinado
    public List<Author> getAliveAuthorsInYear(int year) {
        LocalDate startOfYear = LocalDate.of(year, Month.JANUARY, 1);
        LocalDate endOfYear = LocalDate.of(year, Month.DECEMBER, 31);

        Date startDate = Date.from(startOfYear.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date endDate = Date.from(endOfYear.atStartOfDay(ZoneId.systemDefault()).toInstant());

        return authorRepository.findByBirthDateBeforeAndDeathDateAfter(startDate, endDate);
    }

    // Método para encontrar o crear un autor
    public Author findOrCreateAuthor(String name) {
        Optional<Author> existingAuthor = authorRepository.findByName(name);
        if (existingAuthor.isPresent()) {
            return existingAuthor.get();
        } else {
            Author newAuthor = new Author(name);
            return authorRepository.save(newAuthor);
        }
    }
}