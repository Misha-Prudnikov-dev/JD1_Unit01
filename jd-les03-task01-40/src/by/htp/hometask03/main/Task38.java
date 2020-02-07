package by.htp.hometask03.main;

/*
38.Для заданного натурального числа определить, образуют ли его цифры арифметическую
прогрессию. Предполагается, что в числе не менее трёх цифр. Например: 1357, 963.
*/

public class Task38 {

	public static void main(String[] args) {

		int num = 1367;
		
		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = num; i > 0; i = i / 10) {

			a = i % 10;
			b = (i / 10) % 10;
			c = (i / 100) % 10;

			if (c - b == b - a) {
				System.out.println("да");
			} else {
				System.out.println("да");
			}
		}

	}

}
