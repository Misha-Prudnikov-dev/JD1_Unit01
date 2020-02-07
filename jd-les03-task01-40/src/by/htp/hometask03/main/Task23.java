package by.htp.hometask03.main;

/*23.Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции:*/

public class Task23 {

	public static void main(String[] args) {

		double a = -3;
		double b = 3;
		double h = 1.5;

		double y;
		for (double x = a; x <= b; x = x + h) {
			y = (1 / Math.tan(x / 3)) + 0.5 * Math.sin(x);

			System.out.println("|" + (1 / Math.tan(x / 3)) + 0.5 * Math.asin(x) + "||" + y + "|");

		}
	}

}
