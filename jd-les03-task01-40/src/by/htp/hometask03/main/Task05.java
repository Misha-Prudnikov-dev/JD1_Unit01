package by.htp.hometask03.main;

/*С помощью оператора while напишите программу определения суммы всех 
 * нечетных чисел 
 * в диапазоне от 1 до 99 включительно.
 */
public class Task05 {

	public static void main(String[] args) {

		int n = 0;
		int sum = 0;

		while (n <= 99) {
			if (n % 2 != 0) {

				sum = sum + n;

			}

			n++;

		}

		System.out.print(" Сумма всех нечетных чисел от 1 до 99 = ");
		System.out.println( sum);
	}

}
