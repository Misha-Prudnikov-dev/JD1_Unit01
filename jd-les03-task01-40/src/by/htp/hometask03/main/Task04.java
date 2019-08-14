package by.htp.hometask03.main;

/*С помощью оператора while напишите программу вывода всех четных чисел 
 * в диапазоне от 2 до 100 включительно.
 */
public class Task04 {

	public static void main(String[] args) {

		int n = 0;
		
		while (n <= 100) {
			
			if (n % 2 == 0) {
				System.out.println(n);

			}
			
			n++;
		}

	}

}
