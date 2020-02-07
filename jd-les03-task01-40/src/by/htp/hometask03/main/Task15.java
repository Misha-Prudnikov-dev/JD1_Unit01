package by.htp.hometask03.main;

/*15.Вычислить : 1+2+4+8+...+ 2 в 10 степени.*/

public class Task15 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 2; i <= 1024; i = i + 2) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
