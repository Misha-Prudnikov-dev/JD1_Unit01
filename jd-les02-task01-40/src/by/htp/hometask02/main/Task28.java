package by.htp.hometask02.main;

/* Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d — c).
*/

public class Task28 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		int c = 4;

		int d = 7;

		int max;

		if (a == d) {
			System.out.println("a=d");
		}
		if (b == d) {
			System.out.println("b=d");
		}
		if (c == d) {
			System.out.println("c=d");
		} else {
			max = Math.max(d, a);
			System.out.println(max + " d-a");

			max = Math.max(d, b);
			System.out.println(max + " d-b");

			max = Math.max(d, c);
			System.out.println(max + " d-c");

		}

	}

}
