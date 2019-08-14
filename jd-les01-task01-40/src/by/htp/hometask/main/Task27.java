package by.htp.hometask.main;

/*Дано значение а.Не используя никаких функций и никаких операций, кроме умножения,
 * получить а в 8 степени за три операции и а в 10 степени за четыре операции.
 */
public class Task27 {

	public static void main(String[] args) {

		double a;
		double a1;
		double a2;
		double a3;
		double a4;

		a = 2;
		a1 = a * a;
		a2 = a1 * a1;
		a3 = a2 * a2;

		System.out.println("a в 8 степени " + a3);

		a4 = a3 * a1;

		System.out.println("a в 10 степени " + a4);
	}

}
