package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        University university = new University("Технологічний університет");

        Department csDepartment = new Department("Комп'ютерні науки");
        csDepartment.addProfessor("Проф. Іванов");
        csDepartment.addProfessor("Проф. Петров");
        university.addDepartment(csDepartment);

        Department mathDepartment = new Department("Математика");
        mathDepartment.addProfessor("Проф. Сидоров");
        university.addDepartment(mathDepartment);

        university.displayInfo();

        List<Double> grades = new ArrayList<>();
        grades.add(4.5);
        grades.add(5.0);
        grades.add(3.7);
        double averageGrade = Helper.calculateAverageGrade(grades);
        System.out.println("Середній бал студентів: " + averageGrade);

        university.manageEvents();

        scanner.close();
    }
}


