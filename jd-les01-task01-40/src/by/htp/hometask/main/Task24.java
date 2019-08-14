package by.htp.hometask.main;

/*Вычислить площадь равнобедренной трапеции
 * с онованием a и b и углом a при большем основании a. 
 */
public class Task24 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double s;
		double q;

		a = 15;
		b = 13;
		q = 45;

		h = ((a - b) / 2) * Math.tan(q);
		s = ((a + b) / 2) * h;

		System.out.println("Площадь трапеции = " + s);

	}

}
