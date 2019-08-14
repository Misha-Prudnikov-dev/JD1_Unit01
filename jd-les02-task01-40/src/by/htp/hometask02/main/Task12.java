package by.htp.hometask02.main;

import java.util.Scanner;

/*Даны три действительных числа.Возвести в квадрат те из них,
 * которые неотрицательые, и в четвертую степень-отрицательные.
 */
public class Task12 {

	public static void main(String[] args) {

		double x;
		double x2;
		double x3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");

		while (sc.hasNextDouble() == false) {

			sc.next();
			System.out.println("Введите число");

		}
		x = sc.nextDouble();

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Введите число");

		while (sc2.hasNextDouble() == false) {

			sc2.next();
			System.out.println("Введите число");

		}
		x2 = sc2.nextDouble();

		Scanner sc3 = new Scanner(System.in);

		System.out.println("Введите число");

		while (sc3.hasNextDouble() == false) {

			sc3.next();
			System.out.println("Введите число");

		}
		x3 = sc3.nextDouble();

		if (x > 0) {

			x = Math.pow(x, 2);
			System.out.println(x);

		}
		if (x2 > 0) {

			x2 = Math.pow(x2, 2);
			System.out.println(x2);

		}
		if (x3 > 0) {

			x3 = Math.pow(x3, 2);
			System.out.println(x3);
		}

		if (x < 0) {

			x = Math.pow(x, 4);
			System.out.println(x);

		}
		if (x2 < 0) {

			x2 = Math.pow(x2, 4);
			System.out.println(x2);
		}
		if (x3 < 0) {

			x3 = Math.pow(x3, 4);
			System.out.println(x3);

		}

	}

}
