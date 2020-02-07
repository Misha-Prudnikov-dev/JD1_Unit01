package by.htp.hometask03.main;

/*
 * 24. Вводится натуральное число. 
 * Найти сумму четных цифр, входящих в его состав. 
 * Преобразовать его в другое число, цифры которого будут 
 * следовать в обратном порядке по сравнению с введенным числом. 
 */

public class Task24 {

	public static void main(String[] args) {

		int n = 1258;
		int count = 0;
		int x = n;
		int m = 0;
		int x1 = 0;

		int sum = 0;

		while (x != 0) {
			x = x / 10;
			count++;
		}

		x = n;
		for (int i = 0; i < count; i++) {

			x = n % 10;
			if (x % 2 == 0) {

				sum = sum + x;

			}

			x1 = n % 10;
			m = m * 10 + x1;
			n = n / 10;

		}
		System.out.println("Сумма четных: " + sum);
		System.out.println("Перевернутое число: " + m);
	}

}
