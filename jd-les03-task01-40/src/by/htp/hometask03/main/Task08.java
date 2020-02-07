package by.htp.hometask03.main;

/* 8. Вычислить значения функции на отрезке [а,b] c шагом h*/

public class Task08 {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		int c = 3;

		int h = 1;

		int y;

		for (int x = a; x <= b; x = x + h) {
			if (x != 15) {

				y = (x + c) * 2;
				System.out.println("y = " + y);
			} else {
				y = (x - c) + 6;
				System.out.println("y = " + y);
			}
		}
	}

}
