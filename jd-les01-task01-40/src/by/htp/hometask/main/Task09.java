package by.htp.hometask.main;

/*Вычислить значение выражения по формуле (все переменные принимают 
 * действительные значения)
 */

public class Task09 {

	public static void main(String[] args) {
	
		double a = 13;
		double b = 7;
		double c = 84;
		double d = 3;
		
		double res = (a / c) * (b / d) - (a * b - c) / (c * d);
		
		System.out.println(res);
	}

}
