package by.htp.hometask03.main;

/*Вывести на экран таблицу умножения на 3.
 * 
 */
public class Task03 {

	public static void main(String[] args) {

		int n = 3;
		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum = n * i;
			System.out.println(n + " * " + i + " = " + sum);

		}
	}

}
