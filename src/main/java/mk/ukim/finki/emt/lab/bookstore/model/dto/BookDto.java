package mk.ukim.finki.emt.lab.bookstore.model.dto;

import lombok.Data;
import mk.ukim.finki.emt.lab.bookstore.model.Author;
import mk.ukim.finki.emt.lab.bookstore.model.enumerations.Category;

@Data
public class BookDto {

    private String name;

    private Category category;

    private Author author;

    private Integer availableCopies;

    public BookDto() {
    }

    public BookDto(String name, Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
