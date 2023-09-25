package edu.monmouth.MathOperations;

public class MathOps {

    // Triangle Area Method
    public double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Circle Area Method
    public double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Circle Circumference Method
    public double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Powers of Two Method
    public String powersOfTwo() {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= 20; i++) {
            double power = Math.pow(2, i);
            result.append(i).append(" ").append(power).append("\n");
        }

        return result.toString();
    }
}
