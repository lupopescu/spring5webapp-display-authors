package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 5/18/17.
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
    	syso();
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }
private void syso() {
	// TODO Auto-generated method stub
System.err.println("!!!!!!!!!!!!!!  @RequestMapping books");
}
}
