package mk.ukim.finki.emt.lab.bookstore.model.enumerations;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    LIBRARIAN,
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
