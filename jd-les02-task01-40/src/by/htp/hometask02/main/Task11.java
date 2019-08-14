package by.htp.hometask02.main;

/*Составить программу , которая определит площадь какого треугольника больше.
 * 
 */
public class Task11 {

	public static void main(String[] args) {

		double a = 3;
		double b = 4;
		double c = 5;

		double s;

		double a1 = 13;
		double b1 = 14;
		double c1 = 15;

		double s1;

		s = 0.50 * (a + b + c);
		s1 = 0.50 * (a1 + b1 + c1);

		if (s > s1) {
			System.out.println(s);

		} else {
			System.out.println(s1);
		}

	}

}
