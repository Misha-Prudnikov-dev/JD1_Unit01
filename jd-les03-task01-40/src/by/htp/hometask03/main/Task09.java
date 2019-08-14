package by.htp.hometask03.main;

/*Найти сумму квадратов первых ста чисел.
 * 
 */
public class Task09 {

	public static void main(String[] args) {

		int a = 1;
		int sum = 0;

		for (int i = 0; i <= 100; i++) {

			a = a * a;
			sum = sum + a;
			a++;
		}
		System.out.println(sum);

	}

}
