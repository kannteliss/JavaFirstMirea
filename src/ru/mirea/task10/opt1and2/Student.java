package ru.mirea.task10.opt1and2;

public class Student {

    private String name;
    private String surname;
    private String spec;
    private int course;
    private String group;
    private int IDNumber;
    private double GPA;

    public Student(String name, String surname, String spec, int course, String group, int IDNumber, double GPA) {
        this.name = name;
        this.surname = surname;
        this.spec = spec;
        this.course = course;
        this.group = group;
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.IDNumber = iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + surname +
                ", специальность: " + spec +
                ", курс: " + course +
                ", группа: " + group +
                ", IDNumber: " + IDNumber +
                ", GPA: " + GPA;
    }
}
