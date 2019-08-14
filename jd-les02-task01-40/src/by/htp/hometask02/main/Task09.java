package by.htp.hometask02.main;

/*Составить программу,которая определит по трем введенным сторонам,
 * является ли данный треугольник равносторонним.
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите сторону треугольника а");

		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("Введите сторону треугольника a");
		}
		a = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Введите сторону треугольника b");

		while (sc2.hasNextInt() == false) {
			sc2.next();
			System.out.println("Введите сторону треугольника b");
		}
		b = sc2.nextInt();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Введите сторону треугольника c");

		while (sc3.hasNextInt() == false) {
			sc3.next();
			System.out.println("Введите сторону треугольника c");
		}
		c = sc3.nextInt();

		if (a == b & c == b) {
			System.out.println("Треугольник равносторонний ");

		} else {
			System.out.println("Треугольник не равносторонний ");
		}

	}

}
