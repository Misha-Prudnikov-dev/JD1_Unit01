package by.htp.hometask.main;

/*Дана величина А, выражающая объем информации в байтах.
 * Перевести  А в более крупные единицы измерения  информации.
 */
public class Task34 {

	public static void main(String[] args) {

		double x1 = 8;

		x1 = x1 / 1024;
		System.out.println(x1 + " Килобайт");

		x1 = x1 / 1024;
		System.out.println(x1 + " Мегабайт");

		x1 = x1 / 1024;
		System.out.println(x1 + " Гигабайт");

		x1 = x1 / 1024;
		System.out.println(x1 + " Терабайт");

	}

}
