package by.htp.hometask03.main;

import java.util.Random;
import java.util.Scanner;

/*31. Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек пытается их
угадать. Программа должна выводить угаданные и неугаданные числа из тех, что сгенерировала
программа, а также ошибочные числа пользователя.*/

public class Task31 {

	public static void main(String[] args) {

		int n = 15;
		int x;

		Random rand = new Random();

		int[] mas = new int[5];
		int[] user = new int[5];

		for (int i = 0; i < 5; i++) {
			mas[i] = rand.nextInt(16);
			System.out.print(mas[i] + " ");
		}

		System.out.println();

		System.out.println("Введите 5 чисел от 1 до 15 включительно");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			user[i] = sc.nextInt();

		}

		System.out.println("Угаданные числа: ");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (mas[i] == user[j]) {
					System.out.print(mas[i] + " ");
				}
			}

		}

	}
}
