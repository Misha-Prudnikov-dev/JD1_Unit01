package by.htp.hometask.main;
/*Дана длина ребра куба.Найти площадь грани,площадь полной поверхности
 *  и объем этого куба.
 */
public class Task18 {

	public static void main(String[] args) {

		double l = 4;
		
		double plg = l * l;
		double plp = 6 * l * l;
		double v = l * l * l;
		
		System.out.println("Площадь грани = "+plg);
		System.out.println("Площадь полной поверхности = "+plp);
		System.out.println("Объем куба = "+v);

	}

}
