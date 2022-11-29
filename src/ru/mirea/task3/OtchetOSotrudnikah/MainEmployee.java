package ru.mirea.task3.OtchetOSotrudnikah;

public class MainEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Петрова Александра Сергеевна", 65000),
                new Employee("Смирнов Дмитрий Александрович", 12000),
                new Employee("Сидоров Алексей Николаевич", 33000)
        };

        ReportEmployee.generateReport(employees);
    }
}