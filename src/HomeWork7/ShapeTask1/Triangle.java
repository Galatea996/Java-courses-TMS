package HomeWork7.ShapeTask1;

import HomeWork7.ShapeTask1.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    Scanner scanner = new Scanner(System.in);
    double perimeterTriangle;
    double areaTriangle;

    Triangle(){
        this.sideA = scanner.nextDouble();
        this.sideB = scanner.nextDouble();
        this.sideC = scanner.nextDouble();
    }

    @Override
    public double perimeter(){
       perimeterTriangle = sideA + sideB + sideC;
        return perimeterTriangle;
    }

    @Override
    public double area( ) {
        double semiPerimeter = perimeterTriangle / 2;
        areaTriangle = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return areaTriangle;
    }
}
