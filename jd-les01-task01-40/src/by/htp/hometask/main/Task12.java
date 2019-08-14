package by.htp.hometask.main;
/*Вычислить расстояние между двум¤ точками с данными координатами 
 * (x1 y1) и (x2 y2)
 */

public class Task12 {

	public static void main(String[] args) {

		double x1 = 7;
		double x2 = 9;

		double y1 = 4;
		double y2 = 3;

		double distance;
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("Расстояние между двум¤ точками " + distance);

	}

}
