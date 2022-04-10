package mk.ukim.finki.emt.lab.bookstore.model.exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(Long id) {
        super(String.format("The book with id %d does not exist.", id));
    }
}
