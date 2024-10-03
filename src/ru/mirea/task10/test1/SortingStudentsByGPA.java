package ru.mirea.task10.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {

//    private List<Student> students;
//
//    public SortingStudentsByGPA() {
//        students = new ArrayList<>();
//    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public void sortStudentsByGPA() {
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Double.compare(s2.getGPA(), s1.getGPA());
//            }
//        });
//    }
//
//    public void printSortedStudents() {
//        System.out.println("Отсортированный список студентов по GPA:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
//
//    // Метод для сортировки по имени - убывание
//    public void sortByName() {
//        Collections.sort(students, (s1, s2) -> s2.getName().compareTo(s1.getName()));
//    }
//
//    // Метод для вывода списка студентов
//    public void outArray() {
//        System.out.println("Список студентов:");
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }
private List<Student> students;

    public SortingStudentsByGPA() {
        students = new ArrayList<>();
    }

    // Метод для заполнения списка студентов
    public void setArray(List<Student> studentList) {
        students.clear(); // Очищаем текущий список студентов
        students.addAll(studentList); // Заполняем новый список
    }

//    // Метод для сортировки по среднему баллу студентов (GPA)
//    public void sortByGPA() {
//        Collections.sort(students, (s1, s2) -> Double.compare(s2.getGPA(), s1.getGPA()));
//    }
//
//    // Метод для сортировки по имени
//    public void sortByName() {
//        Collections.sort(students, (s1, s2) -> s2.getName().compareTo(s1.getName()));
//    }

// Метод для сортировки по GPA
    public void sortByGPA() {
        Collections.sort(students, Comparator.comparingDouble(Student::getGPA).reversed());
    }

    // Метод для сортировки по имени
    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName).reversed());
    }

    // Метод для сортировки по выбранному полю
    public void sortByField(Comparator<Student> comparator) {
        Collections.sort(students, comparator.reversed());
    }

    // Метод для вывода списка студентов
    public void outArray() {
        System.out.println("\nСписок студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

