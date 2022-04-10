package mk.ukim.finki.emt.lab.bookstore.service;

import mk.ukim.finki.emt.lab.bookstore.model.Author;
import mk.ukim.finki.emt.lab.bookstore.model.Book;
import mk.ukim.finki.emt.lab.bookstore.model.dto.BookDto;
import mk.ukim.finki.emt.lab.bookstore.model.enumerations.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findAll();

    Optional<Book> findById(Long id);

    Optional<Book> findByName(String name);

    Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies);

    Optional<Book> edit(Long id, BookDto bookDto);

    void deleteById(Long id);
}
