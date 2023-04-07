package com.management.bookAuthor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookAuthorService {
    @Autowired
    BookAuthorRepository bookAuthorRepository;
    public void addBook(Book book) {
        bookAuthorRepository.addBook(book);
    }

    public void addAuthor(Author author) {
        bookAuthorRepository.addAuthor(author);
    }

    public Author getAuthorByAge(int age,int rating) throws Exception {
        return bookAuthorRepository.getAuthorByAge(age,rating);
    }

    public void updateBook(String bookName,int noOfPages) {
        bookAuthorRepository.updateBook(bookName,noOfPages);
    }

    public int  findBooks(int x) {
        return bookAuthorRepository.findBooks(x);
    }
}
