package bookStore.service;

import bookStore.entity.Author;
import bookStore.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Catalysts on 9/9/2015.
 */
@Service
public class AuthorServiceImpl implements AuthorService{
    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author findById(int authorId) {
        return authorRepository.findOne(authorId);
    }
}
