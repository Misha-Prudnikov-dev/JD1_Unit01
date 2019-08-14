package by.htp.hometask02.main;

/*Подсчитать количество отрицательных среди чисел a,b,c.
 * 
 */
public class Task18 {

	public static void main(String[] args) {

		int a = 7;
		int b = -9;
		int c = -5;

		int sum = 0;

		if (a < 0) {

			sum = sum + 1;

		}
		if (b < 0) {

			sum = sum + 1;

		}
		if (c < 0) {

			sum = sum + 1;
		}

		System.out.println("Количество отрицательных чисел " + sum);

	}
}
