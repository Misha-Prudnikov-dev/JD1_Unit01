package by.htp.hometask.main;

/*Вычислить периметр и площадь прямоугольного треугольника по длинам a и b 
 * двух катетов.
 */
public class Task11 {

	public static void main(String[] args) {
	
		double a = 9;
		double b = 7;
		
		double c = a * a + b * b; 
		double c1 = Math.sqrt(c);
		
		double p = a + b + c1;
		System.out.println("Периметр прямоугольного треугольника = "+p);
		
		double s = a * b / 2;
		System.out.println("Площадь прямоугольного треугольника = "+s);
		
	}

}
