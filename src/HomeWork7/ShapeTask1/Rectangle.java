package HomeWork7.ShapeTask1;

import java.util.Scanner;

public class Rectangle extends Shape {
    Scanner scanner = new Scanner(System.in);
    double perimeterRectangle;
    double areaRectangle;

    Rectangle( ){
        this.sideA = scanner.nextDouble();
        this.sideB = scanner.nextDouble();
    }

    @Override
    public double perimeter() {
        perimeterRectangle = 2 * sideA + 2 * sideB;
        return perimeterRectangle;
    }

    @Override
    public double area() {
        areaRectangle = sideA * sideB;
        return areaRectangle;
    }
}
