package by.htp.hometask02.main;

/*
 * 30. Даны действительные числа а,b,с. 
 * Удвоить эти числа, если а > b > с, 
 *и заменить их абсолютными значениями, если это не так.*/
public class Task30 {

	public static void main(String[] args) {

		double a = 1;
		double b = 4;
		double c = 7;

		if (a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}

}
