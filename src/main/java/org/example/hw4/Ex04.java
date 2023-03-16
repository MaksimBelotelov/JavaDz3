package org.example.hw4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};

        for(int[] comb : combinations(arr)){
            System.out.println(Arrays.toString(comb));
        }
    }

    /**
     * Метод принимает одномерный массив и возвращает все возможные
     * комбинации его элементов
     * @param inputArray исходный одномерный массив
     * @return массив массивов-комбинаций
     */
    public static List<int[]> combinations(int[] inputArray) {
        int[] tempArray = inputArray.clone();
        List<int[]> outArray = new ArrayList<>();
        int temp = 0;
        for(int i = 0; i < tempArray.length; i++) {
            for(int j = 0; j < tempArray.length-1; j++) {
                outArray.add(tempArray.clone());
                temp = tempArray[j];
                tempArray[j] = tempArray[j+1];
                tempArray[j+1] = temp;
            }
        }
        return outArray;
    }
}
