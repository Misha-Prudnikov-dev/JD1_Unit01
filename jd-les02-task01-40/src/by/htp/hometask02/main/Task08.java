package by.htp.hometask02.main;

/*—оставить программу нахождени¤ наименьшего из квадратов двух чисел a и b.
 */
public class Task08 {

	public static void main(String[] args) {

		int a = 7;
		int b = 5;

		a = (int) Math.pow(a, 2);
		b = (int) Math.pow(b, 2);

		if (a < b) {
			System.out.println(a);

		} else {
			System.out.println(b);
		}
	}

}
