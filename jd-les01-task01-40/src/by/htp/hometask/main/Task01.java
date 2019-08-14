package by.htp.hometask.main;

// Даны два действительных числа x и y.
 //Вычислить их сумму,разность,произведение и частное.

public class Task01 {
	public static void main(String[] args) {
		double x = 24;
		double y = 17;
		
		double t1 = x - y;
		double t2 = x + y;
		
		double t3 = x * y;
		double t4 = x / y;
		
		System.out.println("x - y = "+t1);
		System.out.println("x + y = "+t2);
		System.out.println("x * y = "+t3);
		System.out.println("x / y = "+t4);
	}

}
