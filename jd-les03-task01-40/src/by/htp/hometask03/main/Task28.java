package by.htp.hometask03.main;

import java.util.Scanner;

/*28. Написать программу, в которой вводятся два операнда Х и Y и знак операции (+, –, /, *). Вычислить
результат Z в зависимости от знака. Предусмотреть реакции на возможный неверный знак операции, а
также на ввод Y=0 при делении. Организовать возможность многократных вычислений без
перезагрузки программа (т.е. построить цикл). В качестве символа прекращения вычислений принять
‘0’.*/

public class Task28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 1;

		while (n != 0) {

			System.out.println("Введите число x : ");

			while (sc.hasNextDouble() == false ) {

				System.out.println("Введите число x : ");

				sc.next();

			}

			double x = sc.nextDouble();
			System.out.println("Введите число y (не 0) : ");

			while (sc.hasNextDouble() == false) {

				System.out.println("Введите число y (не 0) : ");

				sc.next();

			}
			double y = sc.nextDouble();

			Scanner scan = new Scanner(System.in);

			System.out.println("Введите знак операции (*,/,+,-) : ");

			String s = scan.nextLine();
			if ((s.charAt(0) == '*') || (s.charAt(0) == '/') || (s.charAt(0) == '+') || (s.charAt(0) == '-')) {
				if (s.charAt(0) == '*') {
					double z = x * y;

					System.out.println("Результат x * y " + z);
				} else if (s.charAt(0) == '/'&& y!=0) {
					double z = x / y;

					System.out.println("Результат x / y " + z);
				} else if (s.charAt(0) == '+') {
					double z = x + y;

					System.out.println("Результат x + y " + z);
				} else if (s.charAt(0) == '-') {
					double z = x - y;

					System.out.println("Результат x - y " + z);
				}

			} else {
				System.out.println("Неверный знак");
			}
			System.out.println("Введите 0 для выхода");
			
			while (scan.hasNextInt() == false) {

				System.out.println("Введите число  : ");

				scan.next();
			}

			n = scan.nextInt();
		}
	}

}
