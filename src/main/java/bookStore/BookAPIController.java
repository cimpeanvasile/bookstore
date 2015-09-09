package bookStore;

import bookStore.dto.BookDto;
import bookStore.entity.Book;
import bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Catalysts on 8/9/2015.
 */
@RestController
public class BookAPIController {
    @Autowired
    BookService service;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public Book create(@RequestBody BookDto book) {
        return service.create(book);
    }
}
