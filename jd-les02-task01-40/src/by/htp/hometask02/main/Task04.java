package by.htp.hometask02.main;

/*Составить программу равны ли два числа a и b.
*/
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		int a;
		int b;

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число");
		a = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("¬ведите число");
		b = sc2.nextInt();

		if (a == b) {
			System.out.println(a + " = " + b);

		} else {
			System.out.println(a + " не равно " + b);
		}

	}

}
