package by.htp.hometask03.main;

/* 7. Вычислить значения функции на отрезке [а,b] c шагом h:*/

public class Task07 {

	public static void main(String[] args) {

		int a = -4;
		int b = 7;
		int h = 2;

		for (int x = a; x <= b; x = x + h) {
			if (x > 2) {
				System.out.println("y(" + x + ") = " + x);
			} else {
				System.out.println("y(" + x + ") = " + (-x));
			}
		}

	}

}
