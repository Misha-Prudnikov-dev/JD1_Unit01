package by.htp.hometask02.main;

/*24. Составить программу, определяющую результат 
 * гадания на ромашке — «любит—не любит», 
 * взяв за исходное данное количество лепестков n. 
 */

public class Task24 {

	public static void main(String[] args) {

		int n = 7;

		for (int i = 1; i < n; i++) {

			if (i % 2 == 0) {
				System.out.println("Любит");
			} else {
				System.out.println("Не любит");
			}

		}
	}

}
