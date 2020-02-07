package by.htp.hometask03.main;

/*
 * 40. Получить все числа, не превышающие заданного числа N, 
 * которые делятся без остатка на все свои цифры.
 */

public class Task40 {

	public static void main(String[] args) {

		int n = 17;
		int x = 0;

		int sum;

		for (int i = 1; i <= n; i++) {
			sum = 0;
			for (int j = i; j > 0; j = j / 10) {
				x = j % 10;
				if (x == 0) {
					break;
				} else {
					sum = sum + i % x;
				}
			}

			if (sum == 0) {
				System.out.println(i);

			}
		}

	}

}
