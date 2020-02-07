package by.htp.hometask03.main;

/*33. Найдите наибольшую цифру данного натурального числа.*/

public class Task33 {

	public static void main(String[] args) {

		int a = 1459;
		int max = 0; 

		for (int i = a; i > 0; i = i / 10) {
			int x = i % 10;
			if (x > max) {
				max = x;
			}
		}

		System.out.println("Наибольшая цифра числа: " + max);
	}

}
