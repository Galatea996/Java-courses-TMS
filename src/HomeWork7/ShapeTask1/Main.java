package HomeWork7.ShapeTask1;

public class Main {
    public static void main(String[] args) {

        double summa = 0;

        Shape[] shapes = new Shape[5];
        for (int i = 0; i < shapes.length; i++) {
            if (i == 0 || i == 4) {
                System.out.println("Enter the sides of the triangle: ");
                shapes[i] = new Triangle();
            } else if (i == 2) {
                System.out.println("Enter the sides of the rectangle: ");
                shapes[i] = new Rectangle();
            } else {
                System.out.println("Enter the radius of the circle: ");
                shapes[i] = new Circle();
            }
            summa = summa + shapes[i].perimeter();
        }
        System.out.println("Total Perimeter: " + summa);
    }
}
