package aula69.ex03.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double sum () {
        return grade1 + grade2 + grade3;
    }

    public String test() {
        if (sum() > 60.0) { // if the student are over the passing score
            return "PASS";
        } else {
            double calc = 60.0 - sum();
            return "FAILED\nMISSING " + String.format("%.2f", calc) + " POINTS";
        }
    }

}
