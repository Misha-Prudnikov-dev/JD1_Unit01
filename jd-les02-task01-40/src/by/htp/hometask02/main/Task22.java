package by.htp.hometask02.main;

/*Перераспределить значения переменных x и y так , чтобы в x оказалось большее из 
 * этих значений,а в y - меньшее.
 */
public class Task22 {

	public static void main(String[] args) {

		int x = 5;
		int y = 7;

		int n;

		if (y > x) {

			n = x;
			x = y;
			y = n;

			System.out.println("x = " + x + "\n" + "y = " + y);

		} else {
			System.out.println("x = " + x + "\n" + "y = " + y);
		}

	}

}
