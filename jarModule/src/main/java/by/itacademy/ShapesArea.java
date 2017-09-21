package by.itacademy;
//eyunets useless clas
public class ShapesArea {
	double calculateSquare (double a) {
		return a*a ;
	}

	double calculateRectangle (double a , double b) {
		return a*b;
	}

	double calculateCircle(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}
