package by.itacademy;


public class ShapesArea {
    public static double squareArea(double a) {
        return Math.pow(a, 2);
    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}
