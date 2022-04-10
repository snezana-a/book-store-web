package mk.ukim.finki.emt.lab.bookstore.service.impl;

import mk.ukim.finki.emt.lab.bookstore.model.Author;
import mk.ukim.finki.emt.lab.bookstore.model.Book;
import mk.ukim.finki.emt.lab.bookstore.model.dto.BookDto;
import mk.ukim.finki.emt.lab.bookstore.model.enumerations.Category;
import mk.ukim.finki.emt.lab.bookstore.model.exceptions.AuthorNotFoundException;
import mk.ukim.finki.emt.lab.bookstore.model.exceptions.BookNotFoundException;
import mk.ukim.finki.emt.lab.bookstore.repository.AuthorRepository;
import mk.ukim.finki.emt.lab.bookstore.repository.BookRepository;
import mk.ukim.finki.emt.lab.bookstore.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return this.bookRepository.findById(id);
    }

    @Override
    public Optional<Book> findByName(String name) {
        return this.bookRepository.findByName(name);
    }

    @Override
    @Transactional
    public Optional<Book> save(String name, Category category, Long authorId, Integer availableCopies) {
        Author author = this.authorRepository.findById(authorId)
                .orElseThrow(() -> new AuthorNotFoundException(authorId));

        this.bookRepository.deleteByName(name);

        Book book = new Book(name, category, author, availableCopies);
        this.bookRepository.save(book);

        return Optional.of(book);
    }

    @Override
    public Optional<Book> edit(Long id, BookDto bookDto) {
        Book book = this.bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
        Author author = this.authorRepository.findById(bookDto.getAuthor().getId())
                .orElseThrow(() -> new AuthorNotFoundException(bookDto.getAuthor().getId()));


        book.setName(bookDto.getName());
        book.setCategory(bookDto.getCategory());
        book.setAuthor(author);
        book.setAvailableCopies(bookDto.getAvailableCopies());

        this.bookRepository.save(book);
        return Optional.of(book);
    }

    @Override
    public void deleteById(Long id) {
        this.bookRepository.deleteById(id);
    }
}
