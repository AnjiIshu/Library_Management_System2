package com.example.library.repository;

import com.example.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);  //Finds books whose titles contain the search term, case-insensitive.
    List<Book> findByAuthorContainingIgnoreCase(String author);  //Finds books whose authors contain the search term, case-insensitive.
}

