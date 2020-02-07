package by.htp.hometask03.main;

/* 13. Составить таблицу значений функции y= 5 -x2/2 
 * на отрезке [-5; 5] с шагом 0.5.
 */

public class Task13 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;

		double y;

		a = -5;
		b = 5;
		h = 0.5;

		for (double x = a; x <= b; x = x + h) {
			if (x > 2) {
				y = (5 - Math.pow(x, 2)) / 2;
				System.out.println(y);
			}
		}
	}

}
