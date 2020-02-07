package by.htp.hometask03.main;

/* 21. Составить программу для вычисления значений функции F(x) 
 * на отрезке [а, b] с шагом h. Результат представить в виде 
 * таблицы, первый столбец которой – значения  аргумента, 
 * второй - соответствующие значения функции: 
 * F(x) = x-sin(x)
 */

public class Task21 {

	public static void main(String[] args) {

		double a = 7;
		double b = 9;
		double h = 1;

		double y;

		System.out.println(" _____________________________________________");
		System.out.println("|    x - sin(x)          ||       F(x)       |");

		for (double x = a; x <= b; x = x + h) {
			y = x - Math.sin(x);

			System.out.println("|" + x + Math.sin(x) + " || " + y + " |");

		}
		System.out.println("____________________________________________");
	}

}
