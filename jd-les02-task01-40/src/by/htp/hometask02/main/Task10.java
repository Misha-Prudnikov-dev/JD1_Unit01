package by.htp.hometask02.main;

/*Составить программу , которая определит площадь какого круга меньше.
 * 
 */
public class Task10 {

	public static void main(String[] args) {

		double r1 = 3;
		double s1;
		s1 = Math.pow(r1, 2) * Math.PI;

		double r2 = 3;
		double s2;
		s2 = Math.pow(r2, 2) * Math.PI;

		double xMin;
		xMin = Math.min(s1, s2);

		System.out.println("Площадь круга "+xMin);

	}

}
