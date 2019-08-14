package by.htp.hometask.main;

/*Три сопротивление R1,R2,R3 соединены параллельно.
 * Найти сопротивление соединения
 */
public class Task30 {

	public static void main(String[] args) {

		double r1 = 9;
		double r2 = 12;
		double r3 = 14;

		double r;
		double x1;
		double x2;
		double x3;

		x1 = 1 / r1;
		x2 = 1 / r2;
		x3 = 1 / r3;

		r = (1 / (x1 + x2 + x3));

		System.out.println("Сопротивление соединения " + r);

	}

}
