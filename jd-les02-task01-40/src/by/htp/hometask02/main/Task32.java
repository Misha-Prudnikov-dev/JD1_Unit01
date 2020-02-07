package by.htp.hometask02.main;

/*32. Написать программу, которая по заданным трем числам определяет, 
 *является ли сумма каких-либо двух из них
положительной.*/

public class Task32 {

	public static void main(String[] args) {

		int a = 10;
		int b = 4;
		int c = 7;

		int sum;

		sum = a + b;

		if (sum > 0) {
			System.out.println("Сумма a+b положительна");

		}
		sum = a + c;

		if (sum > 0) {
			System.out.println("Сумма a+c положительна");

		}
		sum = b + c;

		if (sum > 0) {
			System.out.println("Сумма b+c положительна");

		}
	}

}
