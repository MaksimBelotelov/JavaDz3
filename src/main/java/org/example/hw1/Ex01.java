package org.example.hw1;

import org.example.hw1.model.Cake;

import java.util.ArrayList;
import java.util.List;
// Наибольшая цена среди товаров 1 и 2 сорта, в названии которых есть "Высший".

public class Ex01 {
    public static void main(String[] args) {
        Cake cake0 = new Cake("Хрустинки", 15.3, "второй");
        Cake cake1 = new Cake("Высший хруст", 32.1, "высший");
        Cake cake2 = new Cake("Лухари печенька", 75.5, "высший");
        Cake cake3 = new Cake("Дикий крекер", 40.6, "второй");
        Cake cake4 = new Cake("Съешь меня, высший", 30.0, "первый");
        Cake cake5 = new Cake("Высший печ", 15.1, "второй");

        List<Cake> cakeList = new ArrayList<>();
        cakeList.add(cake0);
        cakeList.add(cake1);
        cakeList.add(cake2);
        cakeList.add(cake3);
        cakeList.add(cake4);
        cakeList.add(cake5);

        double maxPrice = 0;
        for (Cake cake : cakeList) {
            if (((cake.getGrade().equals("первый")) || (cake.getGrade().equals("второй"))) &&
                    (cake.getName().toLowerCase().contains("высший"))) {
                if (cake.getPrice() > maxPrice)
                    maxPrice = cake.getPrice();
            }
        }
        System.out.println("Наибольшая цена среди товаров 1 и 2 сорта, в названии которых есть \"Высший\": "+ maxPrice);
    }
}
