package by.htp.hometask.main;
/*Вычислить длину окружности и площадь круга
 *одного и того же заданного радиоса R.
 */
public class Task14 {

	public static void main(String[] args) {

		double r = 10;
		double pi = 3.14;

		double s;
		double l;

		s = pi * r * r;
		l = 2 * pi * r;
		
		System.out.println("Площадь круга = "+s);
		System.out.println("Длина окружности = "+l);

	}

}
