package org.example.hw3;

import org.example.hw3.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        Book book0 = new Book("Тихий Дон", "Шолохов", 2000.0,
                2001, 1600);
        Book book1 = new Book("Война и мир", "Толстой", 2200.0,
                2005, 1250);
        Book book2 = new Book("Мастер и Маргарита", "Булгаков",
                1000.0, 2011, 421);
        Book book3 = new Book("Обломов", "Гончаров",
                800.0, 2013, 641);
        Book book4 = new Book("Евгений Онегин", "Пушкин", 900.0,
                2015, 353);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book0);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);

        for(Book book : bookList){
            if((book.getYear() >= 2010) &&
               (book.getAuthor().toLowerCase().contains("а")) &&
               (isPrime(book.getAmountOfPages())))
                    System.out.println(book.getName());
        }
    }

    /**
     * Метод определяет, является ли число простым
     * @param number число
     * @return true, если число простое
     */
    public static boolean isPrime(int number) {
        if (number > 2) {
            if (number % 2 != 0) {
                for (int i = 3; i <= Math.sqrt(number); i += 2)
                    if (number % i == 0) return false;
            } else return false;
        } else if (number == 1)
            return false;
        return true;
    }
}
