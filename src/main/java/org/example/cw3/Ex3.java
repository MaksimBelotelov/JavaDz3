package org.example.cw3;

import org.example.cw3.model.Cube;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        Cube cube1 = new Cube(13, "зеленый", "дерево");
        Cube cube2 = new Cube(73, "желтый", "металл");
        Cube cube3 = new Cube(13, "красный", "дерево");
        Cube cube4 = new Cube(3, "желтый", "дерево");

        List<Cube> listCube = new ArrayList<>();
        listCube.add(cube1);
        listCube.add(cube2);
        listCube.add(cube3);
        listCube.add(cube4);

        int countYellow = 0;
        int sumVolume = 0;
        int countWoodThree = 0;

        for(Cube cube : listCube){
            if(cube.getColor().equals("желтый")) {
                countYellow++;
                sumVolume += (int)Math.pow(cube.getSize(), 3);
            }
            if(cube.getMaterial().equals("дерево") && cube.getSize() == 3) {
                countWoodThree++;
            }
        }
        System.out.println();
    }
}
