package ex2;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void manageEvents() {
        Event event = new Event() {
            @Override
            public void organize() {
                System.out.println("Організація події: конференція або семінар.");
            }
        };
        event.organize();
    }

    public void displayInfo() {
        System.out.println("Університет: " + name);
        for (Department department : departments) {
            department.displayInfo();
        }
    }

    interface Event {
        void organize();
    }
}


