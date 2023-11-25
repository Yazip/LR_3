package com.github.Yazip.LR3;
import java.util.Scanner;
// Класс жанр
public class Genre {
    private String name;
    private String description;
    // Конструктор без параметров
    public Genre() {
        name = "";
        description = "";
    }
    // Конструктор с 1 параметром
    public Genre(String name) {
        this.name = name;
    }
    // Конструктор со всеми параметрами
    public Genre(String name, String description) {
        setGenreData(name, description);
    }
    // Сеттер
    public void setGenreData(String name, String description) {
        this.name = name;
        this.description = description;
    }
    // Метод для пользовательского ввода данных
    public void enterGenreData() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println();
        System.out.println("Введите название жанра:");
        name = scanner.nextLine();
        System.out.println("Введите описание жанра:");
        description = scanner.nextLine();
        System.out.println();
        System.out.println("Жанр " + name + " был успешно создан!");
    }
    // Геттер
    public void getGenreData() {
        System.out.println();
        System.out.println("Информация о жанре:");
        System.out.println("Название: " + name);
        System.out.println("Описание: " + description);
    }
}
