package ex2;

import java.util.List;

public class Helper {

    public static double calculateAverageGrade(List<Double> grades) {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return grades.isEmpty() ? 0 : sum / grades.size();
    }
}


