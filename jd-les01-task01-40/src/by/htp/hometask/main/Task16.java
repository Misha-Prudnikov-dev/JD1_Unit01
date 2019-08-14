package by.htp.hometask.main;
/*Найти произведение цифр заданного четырехзначного числа.
 */
public class Task16 {

	public static void main(String[] args) {

		int number = 1425;
		int sum = 1;
		int x;

		x = number % 10;
		sum = sum * x;
		number = number / 10;
		x = number % 10;
		sum = sum * x;
		number = number / 10;
		x = number % 10;
		sum = sum * x;
		number = number / 10;
		sum = sum * number;

		System.out.println("Произведение цифр четырехзначного числа = " + sum);

	}

}
