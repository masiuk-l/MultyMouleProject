package by.itacademy;
import java.lang.Math;

public class ShapesArea {
	double calculateSquare (double a) {
		return a*a ;
	}
	
	double calculateRectangle (double a , double b) {
		return a*b;
	}
	
	double calculateCircle(int radius) {
		double square;
		square = Math.PI * Math.pow(radius, 2);
		return square;
	}

}
