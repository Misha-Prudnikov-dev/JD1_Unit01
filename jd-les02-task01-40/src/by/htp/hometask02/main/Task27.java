package by.htp.hometask02.main;
/*27. Найти max{min(a, b), min(c, d)}.*/

public class Task27 {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;

		int c = 3;
		int d = 4;

		int max;

		max = Math.max(Math.min(a, b), Math.min(c, d));

		System.out.println(max);
	}

}
