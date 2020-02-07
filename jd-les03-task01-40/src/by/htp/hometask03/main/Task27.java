package by.htp.hometask03.main;

/*27. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и
самого числа. m и n вводятся с клавиатуры.*/

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {

		int m;
		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("> ");

		m = sc.nextInt();

		System.out.println("> ");

		n = sc.nextInt();

		for (int i = m; i <= n; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					System.out.println(j + " является делителем " + i);
				}
			}
		}
	}

}
