package ru.hse.lab1;

/**
 * Точка входа программы для проверки Person.
 * @author Анастасия
 * @version 1.0
 * @since 2026
 */
import ru.hse.lab1.second.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Иван", 20);
        System.out.println("Имя: " + p.name);
        System.out.println("Возраст: " + p.age);
    }
}