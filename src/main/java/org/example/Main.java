package org.example;

public class Main {
    public static void main(String[] args) {
        // Работа с книгами
        Book book = new Book("Капитал", "Карл Маркс", 1867);
        book.display();

        System.out.println();

        // Работа со студентами
        Student student = new Student("Гари Поттер", "12345", 4.5);
        student.print();

        // Пример работы с точкой
        Point point = new Point(5, 5);
        point.displayPosition();
        point.moveUp();
        point.moveRight();
        point.displayPosition();

        System.out.println();

        // Пример работы с часами
        Clock clock = new Clock(23, 59, 58);
        clock.readTime();
        clock.tick();
        clock.readTime();
        clock.tick();
        clock.readTime();

        // Пример работы с машиной
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.drive(10);
        myCar.start();
        myCar.drive(50);
        myCar.stop();

    }
}
