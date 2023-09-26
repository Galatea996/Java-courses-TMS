package HomeWork7.ShapeTask1;

import java.util.Scanner;

public class Circle extends Shape {
    Scanner scanner = new Scanner(System.in);


    double circleRadius;
    double perimeterCircle;
    double areaCircle;

    Circle(){

        circleRadius = scanner.nextDouble();
    }


    @Override
    public double perimeter() {
        perimeterCircle = 2 * p * circleRadius;
        return perimeterCircle;
    }

    @Override
    public double area() {
        areaCircle = p * Math.pow(circleRadius, 2);
        return areaCircle;
    }
}


