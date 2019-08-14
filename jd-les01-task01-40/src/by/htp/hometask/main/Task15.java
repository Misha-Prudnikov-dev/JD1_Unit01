package by.htp.hometask.main;
/*Написать программу, которая выводит на экран первые четыре степени числа pi. 
 */
public class Task15 {

	public static void main(String[] args) {

		double x = 1;
		double pi = 3.14;

		for (int i = 0; i < 4; i++) {

			x = x * pi;
			System.out.println(x);
		}

	}

}
