package by.htp.hometask.main;

/*Найти (в радианах в градусах ) все углы треугольника со сторонами a,b,c.
 * 
 */
public class Task29 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		double a1;
		double b1;
		double c1;

		a = 12;
		b = 5;
		c = 8;

		a1 = (Math.acos((a * a + c * c - b * b) / (2 * a * c)));
		b1 = (Math.acos((a * a + b * b - c * c) / (2 * a * b)));
		c1 = (Math.acos((b * b + c * c - a * a) / (2 * c * b)));

		System.out.println("”гол а в радианах " + a1);
		System.out.println("”гол b в радианах " + b1);
		System.out.println("”гол c в радианах " + c1);

		a1 = a1 * (180 / Math.PI);
		b1 = b1 * (180 / Math.PI);
		c1 = c1 * (180 / Math.PI);

		System.out.println("”гол а в градусах " + a1);
		System.out.println("”гол b в градусах " + b1);
		System.out.println("”гол c в градусах " + c1);

	}

}
