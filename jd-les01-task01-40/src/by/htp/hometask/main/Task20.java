package by.htp.hometask.main;
/*Известна длина окружности.Найти площадь круга,ограниченного этой окружностью.
 */
public class Task20 {

	public static void main(String[] args) {

		double l = 8;
		double r;
		double pl;

		r = l / 2 * Math.PI;
		pl = Math.PI * r * r;

		System.out.println("Площадь круга = "+pl);
	}

}
