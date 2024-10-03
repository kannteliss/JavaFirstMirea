package ru.mirea.task10.opt1and2;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class mainStudents {
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Иван", "Петров", "Информатика", 3, "ИТ-321", 123456789, 5.0));
        studentList.add(new Student("Мария", "Иванова", "Экономика", 4, "ЭК-101", 456926493, 3.2));
        studentList.add(new Student("Алексей", "Сидоров", "Физика", 2, "ФЗ-202", 316302547, 4.2));

        sorter.setArray(studentList);

        sorter.sortByGPA();
        sorter.outArray();

        sorter.sortByName();
        sorter.outArray();

        sorter.sortByField(Comparator.comparing(Student::getSpec).reversed());
        sorter.outArray();
    }
}

