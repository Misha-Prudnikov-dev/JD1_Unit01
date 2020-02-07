package by.htp.hometask02.main;

/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Task31 {

	public static void main(String[] args) {

		int a = 120;
		int b = 60;

		int x = 150;
		int y = 100;
		int z = 80;
		
		if (a > y && b > x || a > x && b > y) {
			System.out.println("Кирпич проходит в отверстие");
		}
		else if (a > z && b > x || a > x && b > z) {
			System.out.println("Кирпич проходит в отверстие");
		}
		else if (a > y && b > z || a > z && b > y) {
			System.out.println("Кирпич проходит в отверстие");
		} else {
			System.out.println("Кирпич НЕ проходит в отверстие");
		}
	}

}
