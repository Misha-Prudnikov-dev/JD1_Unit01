package by.htp.hometask03.main;

import java.util.Scanner;

/*Напишите программу, где пользователь вводит любое целое положительное  число
 * А программа суммирует все числа от 1 до введенного пользователем числа.А
 */
public class Task06 {

	public static void main(String[] args) {

		int a;
		int n = 1;
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите целое число ");
		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("Введите целое число ");
		}
		a = sc.nextInt();

		while (n <= a) {

			sum = sum + n;

			n++;
		}
		System.out.println("Сумма от 1 до  " + a + " = " + sum);
	}

}
