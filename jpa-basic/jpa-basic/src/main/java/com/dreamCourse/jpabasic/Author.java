package com.dreamCourse.jpabasic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  authorId;

   private  String name;

   private  String numOfBooks;

    public Author(){

    }

    public Author(int authorId, String name, String numOfBooks) {
        this.authorId = authorId;
        this.name = name;
        this.numOfBooks = numOfBooks;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumOfBooks() {
        return numOfBooks;
    }

    public void setNumOfBooks(String numOfBooks) {
        this.numOfBooks = numOfBooks;
    }
}
