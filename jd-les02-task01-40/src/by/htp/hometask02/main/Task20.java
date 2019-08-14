package by.htp.hometask02.main;

/*Определить ,делителем каких чисел a,b,c является число k.
 * 
 */
public class Task20 {

	public static void main(String[] args) {

		double a = 4;
		double b = 9;
		double c = 18;

		double k = 2;

		if (a != 0 && b != 0 && c != 0 && k != 0) {

			if (a % k == 0) {
				System.out.println("k является делителем a");
			}
			if (b % k == 0) {

				System.out.println("k является делителем b");
			}
			if (c % k == 0) {

				System.out.println("k является делителем c");
			}
		}
	}

}
