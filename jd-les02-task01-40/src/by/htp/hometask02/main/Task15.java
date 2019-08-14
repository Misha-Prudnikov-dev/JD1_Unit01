package by.htp.hometask02.main;

/*Даны действительные числа x и y , не равные друг другу.Меньшее из этих чисел заменить
 * половиной их суммы, а большее-их удвоенным произведением.
 */
public class Task15 {

	public static void main(String[] args) {

		double x = 10.5;
		double y = 4.5;

		double nMin;
		double nMax;

		if (x < y) {

			nMin = (x + y) / 2;

			nMax = x * y * 2;

			x = nMin;
			y = nMax;

			System.out.println("Min "+x);
			System.out.println("Max "+y);

		}
		if (y < x) {

			nMin = (x + y) / 2;

			nMax = x * y * 2;
			
			x = nMax;
			y = nMin;

			System.out.println("Min "+y);
			System.out.println("Max "+x);


		}

	}

}
