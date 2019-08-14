package by.htp.hometask03.main;

import java.math.BigInteger;

/*Составить программу нахождения произведения квадратов первых двухсот чисел.
 * 
 */
public class Task10 {

	public static void main(String[] args) {

		BigInteger x1 = BigInteger.valueOf(1);

		for (int i = 1; i <= 200; i++) {

			x1 = x1.multiply(BigInteger.valueOf(i * i));

		}
		System.out.println(x1);
	}

}
