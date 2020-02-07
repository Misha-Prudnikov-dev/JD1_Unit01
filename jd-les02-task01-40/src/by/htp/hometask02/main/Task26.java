package by.htp.hometask02.main;

/* 26. Написать программу нахождения суммы большего и меньшего из трех чисел. */

public class Task26 {

	public static void main(String[] args) {

		int a = 3;
		int b = 1;
		int c = 2;

		int max;
		int min;
		int sum;

		if (a > b && a > c) {
			max = a;

			if (b < c) {
				min = b;
			} else {
				min = c;
			}
		} else if (b > a && b > c) {

			max = b;
			if (a < c) {
				min = a;
			} else {
				min = c;
			}
		} else {
			max = c;
			if (a < b) {
				min = a;
			} else {
				min = b;
			}

		}
		sum = min + max;

		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
	}

}
