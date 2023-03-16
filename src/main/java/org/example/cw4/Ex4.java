package org.example.cw4;

import java.util.ArrayList;
import org.example.cw1.model.Items;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Items items = new Items("qwe", "zxc", 3.0);
        Items items1 = new Items("qwe1", "asd", 4.0);
        Items items2 = new Items("qwe2", "ert", 5.0);
        Items items3 = new Items("qwe3", "dfg", 6.0);

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items1);
        itemsList.add(items2);
        itemsList.add(items3);

//        System.out.println("уникальная коллекция: " + unicumCollection(List<Items> listItems));
    }

  //  private static List unicumCollection(List<Items> listItems) {
//}


}
