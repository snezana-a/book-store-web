package mk.ukim.finki.emt.lab.bookstore.model.exceptions;

public class AuthorNotFoundException extends RuntimeException{
    public AuthorNotFoundException(Long id) {
        super(String.format("The author with id %d does not exist.", id));
    }
}
