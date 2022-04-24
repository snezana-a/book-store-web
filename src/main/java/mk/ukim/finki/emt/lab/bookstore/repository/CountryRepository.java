package mk.ukim.finki.emt.lab.bookstore.repository;

import mk.ukim.finki.emt.lab.bookstore.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findByName(String name);

    Optional<Country> findByContinent(String continent);
}
