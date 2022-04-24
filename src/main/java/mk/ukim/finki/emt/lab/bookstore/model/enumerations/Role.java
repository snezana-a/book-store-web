package mk.ukim.finki.emt.lab.bookstore.model.enumerations;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    LIBRARIAN;

    @Override
    public String getAuthority() {
        return name();
    }
}
