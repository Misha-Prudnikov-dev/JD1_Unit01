package by.htp.hometask03.main;

/*
 * 19. Даны числовой ряд и некоторое число е. 
 * Найти сумму тех членов ряда, модуль которых больше или равен заданному е. 
 * Общий член ряда имеет вид: 
 * an = 1/2^n + 1/3^n
 */
public class Task19 {

	public static void main(String[] args) {

		int e = 1;

		double a = 0;
		double sum = 0;

		for (int n = 0; n <= 10; n++) {
			a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
			if (Math.abs(a) >= e) {
				sum = sum + a;
			}
		}

		System.out.println(sum);

	}

}
