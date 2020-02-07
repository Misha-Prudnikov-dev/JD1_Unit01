package by.htp.hometask.main;

/*39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
сложения и вычитания, вычислите за минимальное число операций: 2x^4 -3х^3 + 4х^2-5х + 6;
 */

public class Task39 {

	public static void main(String[] args) {

		int x = 7;

		int n;

		n = x * x;

		int result;

		result = 2 * n * n - 3 * n * x + 4 * n - 5 * x + 6;

		System.out.println(result);

	}

}
