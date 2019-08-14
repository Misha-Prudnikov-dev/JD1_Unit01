package by.htp.hometask02.main;

/*На плоскости XOY  задана своими координатами точка А.Указать,где она расположена 
 * (на какой оси или в каком координатном угле).
 */
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {

		double x;
		double y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");
		x = sc.nextDouble();

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Введите число");
		y = sc2.nextDouble();

		if (x == 0 && y == 0) {

			System.out.println("Это начало координат");
		}
		if (x == 0 && y != 0) {

			System.out.println("На оси y");

		}
		if (x != 0 && y == 0) {

			System.out.println("На оси x");

		}
		if (x > 0 && y > 0) {

			System.out.println("1 четверть");

		}
		if (x < 0 && y > 0) {

			System.out.println("2 четверть");

		}
		if (y < 0 && x < 0) {

			System.out.println("3 четверть");
		}
		if (y < 0 && x > 0) {

			System.out.println("4 четверть");

		}

	}

}
