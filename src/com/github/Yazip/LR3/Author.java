package com.github.Yazip.LR3;
import java.util.Scanner;
// Класс автор
public class Author {
    private String last_name;
    private String initials;
    private String biography;
    // Конструктор без параметров
    public Author() {
        last_name = "";
        initials = "";
        biography = "";
    }
    // Конструктор с 1 параметром
    public Author(String last_name) {
        this.last_name = last_name;
    }
    // Конструктор со всеми параметрами
    public Author(String last_name, String initials, String biography) {
        setAuthorData(last_name, initials, biography);
    }
    // Сеттер
    public void setAuthorData(String last_name, String initials, String biography) {
        this.last_name = last_name;
        this.initials = initials;
        this.biography = biography;
    }
    // Метод для пользовательского ввода данных
    public void enterAuthorData() {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println();
        System.out.println("Введите фамилию автора:");
        last_name = scanner.nextLine();
        System.out.println("Введите инициалы автора:");
        initials = scanner.nextLine();
        System.out.println("Введите биографию автора:");
        biography = scanner.nextLine();
        System.out.println();
        System.out.println("Автор " + last_name + " " + initials + " был успешно создан!");
    }
    // Геттер
    public void getAuthorData() {
        System.out.println();
        System.out.println("Информация об авторе:");
        System.out.println("Фамилия: " + last_name);
        System.out.println("Инициалы: " + initials);
        System.out.println("Биография: " + biography);
    }
}
