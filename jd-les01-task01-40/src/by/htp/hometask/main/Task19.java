package by.htp.hometask.main;
/*Дана сторона равностороннего треугольнака.
 * Найти площадь этого треугольника , его высоту,радиусы вписанной и описанной
 * окружностей.
 */
public class Task19 {

	public static void main(String[] args) {

		double a = 17;
		double pl;
		double h;
		double r1;  // радиус вписанной окружности.
		double r;

		pl = a * a * Math.sqrt(3) / 4;
		h = a * Math.sqrt(3) / 2;
		r1 = a * Math.sqrt(3) / 6;
		r = a * Math.sqrt(3) / 3;
		
		System.out.println("Площадь = "+ pl);
		System.out.println("Высота = "+h);
		System.out.println("Радиус вписанной окружности = "+r1);
		System.out.println("Радиус Описанной окружности = "+r);

	}

}
