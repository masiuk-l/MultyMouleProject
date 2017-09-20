package by.itacademy;

public class ShapesArea {

    public static double rectArea(final double a, final double b){
        return a*b;
    }

    public static double squareArea(final double a){
        return rectArea(a, a);
    }

    public static double circleArea(final double radius){

        return radius * radius * 3.14;
    }

}
