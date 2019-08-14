package by.htp.hometask.main;

/*Вычислить корни квадратного уравнения aх2+bх+С=0,
 * заданными  коэфициентами a,b и c (предполагается, что  a не равен 0
 * и что дискриминант уравнения неотрицателен). 
 */
public class Task25 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		double x1;
		double x2;
		double d;

		a = 8;
		b = -7;
		c = -4;

		d = Math.pow(b, 2) - 4 * a * c;

		if (d < 0) {

			System.out.println("Корней нет");
		}
		if (d > 0) {

			x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);

		}

	}

}
