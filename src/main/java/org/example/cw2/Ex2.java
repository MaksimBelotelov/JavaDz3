package org.example.cw2;

// Дан массив объектов: фамилия студента, номер группы, размер
// стипендии, баллы по 3 предметам. Определить стипендии студентов,
// фамилии которых заканчиваются на «ова», при четной сумме баллов.

import org.example.cw2.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        Student student1 = new Student("Иванова", 2, 234, List.of(3, 4, 5));
        Student student2 = new Student("Машков", 3, 234, List.of(3, 4, 5));
        Student student3 = new Student("Котлова", 2, 234, List.of(3, 4, 5));
        Student student4 = new Student("Михин", 5, 234, List.of(3, 4, 5));

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);

        for(Student el: listStudent) {
            if(el.getSurname().endsWith("ова")) {
                int sumOfMarks = 0;
                for(Integer mark: el.getEvaluations())
                    sumOfMarks += mark;
                if((sumOfMarks % 2) == 0)
                    System.out.println(el.getMoney());
            }
        }
    }
}
