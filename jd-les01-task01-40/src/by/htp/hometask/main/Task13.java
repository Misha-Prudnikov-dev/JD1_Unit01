package by.htp.hometask.main;
/*Заданы координаты трех вершин треугольника (x1 y1),(x2 y2),(x3 y3).
 * Найти его периметр и площадь.
 */
public class Task13 {

	public static void main(String[] args) {

		double x1 = 2;
		double y1 = 3;

		double x2 = 5;
		double y2 = 7;

		double x3 = 9;
		double y3 = 2;

		double a;
		double b;
		double c;

		double p;
		double pl;

		a = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		c = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));

		p = a + b + c;
		
		System.out.println("Периметр треугольника "+p);
		
		p = p / 2;

		pl = Math.sqrt((p * (p - a) * (p - b) * (p - c)));

		System.out.println("Площадь треугольника "+pl);

	}

}
