package com.github.Yazip.LR3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Author author = new Author();
        Genre genre = new Genre();
        Publisher publisher = new Publisher("EKSMO", "123308, Moscow, Sorge str., 1, p.1.", "+7 (495) 411-68-86", "info@eksmo.ru");
        Book[] books = new Book[4];
        Magazine[] magazines = new Magazine[4];
        String title = "War and peace", author_last_name = "Tolstoy", genre_name = "Novel", publisher_name = "AST";
        // Работа с объектом автора
        author.enterAuthorData();
        author.getAuthorData();
        // Работа с объектом жанра
        genre.setGenreData("The Story", "A prose genre that occupies an intermediate place between a novel and a short story in terms of the volume of the text, tending to a chronicle plot that reproduces the natural course of life.");
        genre.getGenreData();
        // Работа с объектом издателя
        publisher.getPublisherData();
        // Работа с массивом объектов книг
        for (int i = 0; i < 4; i++) {
            books[i] = new Book();
            books[i].enterBookData();
        }
        Book.findBooksByTitleAndAuthor(books, title, author_last_name);
        Book.findBooksByAuthor(books, author_last_name);
        Book.findBooksByGenre(books, genre_name);
        // Работа с массивом объектов журналов
        for (int i = 0; i < 4; i++) {
            magazines[i] = new Magazine();
            magazines[i].enterMagazineData();
        }
        Magazine.findMagazinesByPublisher(magazines, publisher_name);
        new Scanner(System.in).nextLine();
    }
}