package by.htp.hometask03.main;

/*16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).*/

public class Task16 {

	public static void main(String[] args) {

		long result = 1;
		long n = 0;

		for (int i = 2; i <= 10; i++) {

			for (int j = 1; j < i + 1; j++) {
				n = n + j;
			}

			result = result * n;
		}

		System.out.println(result);
	}

}
