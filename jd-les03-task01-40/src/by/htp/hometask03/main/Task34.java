package by.htp.hometask03.main;

/*34. Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.*/

public class Task34 {

	public static void main(String[] args) {

		int n = 1000;
		int x = 0;

		int sum;

		while (n < 10000) {
			sum = 0;
			for (int i = n; i > 0; i = i / 10) {
				x = i % 10;
				sum = sum + x;
			}
			if (sum == 15) {
				System.out.println(n);
			}
			n++;
		}
	}

}
