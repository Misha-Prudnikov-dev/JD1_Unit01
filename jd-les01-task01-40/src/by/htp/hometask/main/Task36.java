package by.htp.hometask.main;

/* 36. Найти частное произведений четных и нечетных цифр четырехзначного числа.
 */

public class Task36 {

	public static void main(String[] args) {

		int number = 1258;
		int x;

		double proizvedenieChet = 1;
		double proizvedenieNeChet = 1;

		for (int i = 0; i < 4; i++) {

			x = (number % 10);

			if (x % 2 == 0) {

				proizvedenieChet = proizvedenieChet * x;
			} else {

				proizvedenieNeChet = proizvedenieNeChet * x;
			}

			number = number / 10;
		}

		double result = proizvedenieChet / proizvedenieNeChet;

		System.out.println(result);

	}

}
