package bookStore.service;

import bookStore.dto.BookDto;
import bookStore.entity.Author;
import bookStore.entity.Book;
import bookStore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Catalysts on 8/9/2015.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorService authorService;

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book create(BookDto bookDto) {
        Author a = authorService.findById(bookDto.authorId);
        Book b = new Book(bookDto.name, a, bookDto.isbn);
        return bookRepository.save(b);
    }

}
