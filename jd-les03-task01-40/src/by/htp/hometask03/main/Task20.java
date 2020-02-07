package by.htp.hometask03.main;
/*
 * 20. Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: 
 * an = 1 / ((3n-2)(3n+1))
 */

public class Task20 {

	public static void main(String[] args) {

		double e = 0.01;

		double a = 0; 
		double sum = 0;

		for (double n = 1; n <= 10; n++) {
			a = 1 / ((3 * n - 2) * (3 * n + 1));
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}

		System.out.println(sum);

	}

}
