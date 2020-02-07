package by.htp.hometask02.main;

/*36. Вычислить значение функции:*/

public class Task36 {

	public static void main(String[] args) {

		double x = 6;
		double y;

		if (x <= 3) {
			y = x * x - 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println(y);

	}

}
