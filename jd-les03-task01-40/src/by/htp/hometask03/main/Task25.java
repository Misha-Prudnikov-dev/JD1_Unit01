package by.htp.hometask03.main;

import java.util.Scanner;

/*25. Требуется определить факториал числа, которое ввел пользователь. */

public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(">>>");
		
		long user = sc.nextLong();
		
		long f = 1;

		for (int i = 1; i <= user; i++) {

			f = f * i;
		}
		System.out.println(f);
	}

}
