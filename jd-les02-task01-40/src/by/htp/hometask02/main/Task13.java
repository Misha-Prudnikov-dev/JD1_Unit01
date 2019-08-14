package by.htp.hometask02.main;

/*Даны две точки A(x1,y1)и B(x2,y2) . Составить алгоритм, определяющий, которая из точек
 * находится ближе к началу координат.
 */
public class Task13 {

	public static void main(String[] args) {

		double a1 = 3;
		double a2 = 2;

		double b1 = 4;
		double b2 = 2;

		double d1;
		double d2;

		d1 = Math.sqrt(Math.pow(b1, 2)) + Math.pow(a1, 2);
		d2 = Math.sqrt(Math.pow(b2, 2)) + Math.pow(a2, 2);

		if (d1 < d2) {

			System.out.println("Точка A ближе" + d1);

		}
		if (d1 > d2) {

			System.out.println("Точка B  ближе " + d2);

		} else {
			System.out.println("Одинаково");
		}
	}

}
