package edu.monmouth.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(21, 34);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        Shape shape1 = new Circle(90);
        System.out.println("Shape1 Area (Circle): " + shape1.area());
        System.out.println("Shape1 Perimeter (Circle): " + shape1.perimeter());

        Shape shape2 = new Rectangle(2, 4);
        System.out.println("Shape2 Area (Rectangle): " + shape2.area());
        System.out.println("Shape2 Perimeter (Rectangle): " + shape2.perimeter());
    }
}
