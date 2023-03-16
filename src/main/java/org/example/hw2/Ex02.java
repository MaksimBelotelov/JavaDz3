package org.example.hw2;

// Сведения о товаре состоят из наименования, страны-производителя,
// веса, цены, сорта. Получить наименования товаров заданного сорта с наименьшей ценой

import org.example.hw2.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Product product0 = new Product("Хлеб", "Россия", 0.35, 78.0, "второй");
        Product product1 = new Product("Молоко", "Швейцария", 1.0, 200.0, "второй");
        Product product2 = new Product("Масло", "Финляндия", 0.5, 300.0, "первый");
        Product product3 = new Product("Помидоры", "Турция", 1.0, 78.0, "второй");
        Product product4 = new Product("Кефир", "Швеция", 1.0, 150.0, "высший");

        List<Product> productList = new ArrayList<>();
        productList.add(product0);
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товаров для поиска: ");
        String sourceGrade = scanner.nextLine().toLowerCase();
        double minPrice = 1000000;
        for(Product product : productList) {
            if((product.getGrade().equals(sourceGrade)) && product.getPrice() < minPrice)
                minPrice = product.getPrice();
        }
        for(Product product : productList){
            if((product.getGrade().equals(sourceGrade)) && product.getPrice() == minPrice)
                System.out.println(product.getName());
        }
    }
}
