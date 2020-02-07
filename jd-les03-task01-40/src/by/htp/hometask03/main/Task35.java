package by.htp.hometask03.main;

/* 35. Найдите количество четных цифр данного натурального числа*/

public class Task35 {

	public static void main(String[] args) {

		int a = 48520;
		int countChet = 0;

		while (a > 0) {
			if ((a % 10) % 2 == 0) {
				countChet++;
			}

			a = a / 10;
		}

		System.out.println("Количество чётных цифр: " + countChet);

	}

}
