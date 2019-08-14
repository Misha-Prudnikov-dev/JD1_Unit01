package by.htp.hometask.main;

/*Вычислить значение выражения по формуле (все переменные принимают 
 * действительные значения)
 */

public class Task08 {

	public static void main(String[] args) {
		
		double a = 7;
		double b = 9;
		double c = 4;
		
		double b1 = -2;
		
		double z;
	
		z = b + Math.sqrt(b*b+4*a*c)/(2*a)-a*a*a*c+Math.pow(b, b1);
		System.out.println(z);

	}

}
