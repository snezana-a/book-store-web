package mk.ukim.finki.emt.lab.bookstore.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://emt-lab-bookstore-frontend.herokuapp.com/")
@RequestMapping("/api/categories")
public class CategoryController {
}
