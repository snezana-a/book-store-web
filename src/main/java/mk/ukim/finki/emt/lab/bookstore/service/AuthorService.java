package mk.ukim.finki.emt.lab.bookstore.service;

import mk.ukim.finki.emt.lab.bookstore.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    List<Author> findAll();

    Optional<Author> findById(Long id);

    Optional<Author> findByName(String name);

    Optional<Author> findByCountry(String country);

    Optional<Author> save(String name, String surname, Long countryId);

    Optional<Author> edit(Long id, String name, String surname, Long countryId);

    void deleteById(Long id);
}
