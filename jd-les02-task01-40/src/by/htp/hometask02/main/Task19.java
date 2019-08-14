package by.htp.hometask02.main;

/*Подсчитать количество положительных среди чисел a,b,c.
 * 
 */
public class Task19 {

	public static void main(String[] args) {

		int a = -29;
		int b = -6;
		int c = 14;

		int sum = 0;

		if (a > 0) {

			sum = sum + 1;

		}
		if (b > 0) {

			sum = sum + 1;

		}
		if (c > 0) {

			sum = sum + 1;
		}

		System.out.println("Количество положительных чисел " + sum);

	}

}
