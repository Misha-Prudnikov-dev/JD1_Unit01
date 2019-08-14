package by.htp.hometask02.main;

/*Составить программу модуля a*x*x+b*x+c при заданных значениях a,b,c и x.
 * 
 */
public class Task07 {

	public static void main(String[] args) {

		double a = 4;
		double b = 7;
		double c = 2;
		double x = 3;

		double y;

		y = Math.abs(a * x * x + b * x + c);

		System.out.println("Модуль выражения " + y);

	}

}
