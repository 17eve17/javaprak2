package ex2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<String> professors;

    public Department(String name) {
        this.name = name;
        this.professors = new ArrayList<>();
    }

    public void addProfessor(String professor) {
        professors.add(professor);
    }

    public void displayInfo() {
        System.out.println("Кафедра: " + name);
        System.out.println("Викладачі:");
        for (String professor : professors) {
            System.out.println("- " + professor);
        }
    }
}


