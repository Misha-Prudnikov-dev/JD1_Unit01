package by.htp.hometask02.main;

import java.util.Scanner;

/*Даны два угла треугольника(в градусах).Определить,существует ли такой треугольник,
 * и если да,то будет ли он прямоугольным.
 */
public class Task14 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		// sum = 180 - (a + c);

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите угол треугольника (в градусах)");

		while (sc.hasNextDouble() == false) {

			sc.next();
			System.out.println("Введите угол треугольника (в градусах)");
		}

		a = sc.nextDouble();

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Введите угол треугольника (в градусах)");

		while (sc2.hasNextDouble() == false) {

			sc2.next();
			System.out.println("Введите угол треугольника (в градусах)");
		}

		b = sc2.nextDouble();

		c = 180 - (a + b);

		if (a + b >= 180) {

			System.out.println("Такого треугольника не существует");

		} else if (a == 90 | b == 90 | c == 90) {

			System.out.println("Прямоугольный треугольник");

		} else {
			System.out.println("Треугольник");
		}

	}

}
