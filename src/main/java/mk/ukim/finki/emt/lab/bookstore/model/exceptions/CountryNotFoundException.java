package mk.ukim.finki.emt.lab.bookstore.model.exceptions;

public class CountryNotFoundException extends RuntimeException{
    public CountryNotFoundException(Long id) {
        super(String.format("The country with id %d does not exist.", id));
    }
}
