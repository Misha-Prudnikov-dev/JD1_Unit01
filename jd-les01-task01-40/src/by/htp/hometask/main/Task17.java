package by.htp.hometask.main;
/*Даны два числа.Найти среднее арифметическое кубов этих чисел
 * и среднее геометрическое модулей этих чисел.
 */
public class Task17 {

	public static void main(String[] args) {

		double a;
		double b;
		double x;
		double y;

		a = 3;
		b = 7;

		x = Math.pow((a + b), 3) / 2;
		y = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое кубов "+x);
		System.out.println("Среднее геометрическое модулей "+y);

	}

}
