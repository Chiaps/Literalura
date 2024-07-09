package com.literalura.repository;

import com.literalura.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Buscar autores que no han fallecido (la fecha de muerte es nula)
    List<Author> findByDeathDateIsNull();

    // Buscar autores que nacieron antes de una fecha dada y fallecieron después de otra fecha dada
    List<Author> findByBirthDateBeforeAndDeathDateAfter(Date before, Date after);

    // Buscar autor por nombre
    Optional<Author> findByName(String name);
}
