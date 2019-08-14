package by.htp.hometask.main;

/*Вычислить значение выражения по формуле (все переменные принимают 
 * действительные значения)
 */
public class Task10 {

	public static void main(String[] args) {

		double x = 30;
		double y = 60;
		
		double z = Math.sin(x) + Math.cos(y);
		double z1 = Math.cos(x)- Math.sin(y);
		double z2 = z / z1;
		double z3 = z2 * Math.tan(x*y);
		
		System.out.println(z3);
	}

}
