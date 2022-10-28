package ru.alishev.springcourse.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    private Person owner;

    @NotEmpty(message = "Название книги не может быть пустым")
    @Size(min = 1, max = 100, message = "Название книги должно содержать от 1 до 100 символов")
    private String title;

    @NotEmpty(message = "Поле Автор не может быть пустым")
    @Size(min = 3, max = 100, message = "Название книги должно содержать от 3 до 100 символов")
    private String author;

    @Min(value = 1500, message = "Год должен быть больше 1500")
    private int year;

    public Book() {
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
