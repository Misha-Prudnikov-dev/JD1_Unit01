package by.htp.hometask02.main;

/*Составить программу сравнения введенного числа а и цифры 3.
 * Вывести на экран слово "yes", если число а меньше 3, если больше,то вывести слово
 * "no"
 */
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");
		a = sc.nextInt();

		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}

}
