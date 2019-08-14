package by.htp.hometask.main;

/*Составить программу для вычисления пути,
 *пройденного лодкой, если её скорость в стоячей воде V км./ч, 
 *скорость течения реки v1 и км./ч, время движения по озеру t1ч 
 *а против течения реки - t2 ч. 
 */
public class Task31 {

	public static void main(String[] args) {

		double v = 10;
		double v1 = 3;
		double t1 = 2;
		double t2 = 3;

		double s;

		s = v * t1;
		System.out.println("По озеру " + s);

		s = (v - v1) * t2;
		System.out.println("Против реки " + s);

	}

}
