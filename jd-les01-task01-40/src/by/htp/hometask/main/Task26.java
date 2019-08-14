package by.htp.hometask.main;

/*Найти площадь треугольника,две стороны которого равны a и b, а угол 
 * между этими сторонами y.
 */
public class Task26 {

	public static void main(String[] args) {

		double a;
		double b;
		double y;

		double s;

		a = 2;
		b = 4;
		y = 45;

		s = 0.5 * a * b * Math.sin(3.14 * y / 180);
		System.out.println("Площадь треугольника " + s);
	}

}
