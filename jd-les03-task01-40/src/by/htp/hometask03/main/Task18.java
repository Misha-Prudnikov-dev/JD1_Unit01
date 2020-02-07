package by.htp.hometask03.main;

/*
 * 18. Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше 
 * или равен заданному е. Общий член ряда имеет вид: 
 * an = (-1)^n-1 / n
 * */

public class Task18 {

	public static void main(String[] args) {

		int e = 1;

		double a = 0; 
		double sum = 0; 

		for (int n = 1; n <= 10; n++) {
			a = Math.pow(-1, (n - 1)) / n;
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}

		System.out.println(sum);
	}

}
