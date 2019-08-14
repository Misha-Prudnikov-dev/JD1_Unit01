package by.htp.hometask.main;
/*Даны натуральные числа M и N.Вывести старшую цифру дробной части
 * и младшую цифру целой части числа M/N.
 */
public class Task35 {

	public static void main(String[] args) {
		
		int i;
		int i1;
		
		float m = 121;
		float n = 16;
		
		float x;
		float y;
		
		x=m/n;
		System.out.println(x);

		y=x*10;
		y=y%10;
		
		i=(int)x;
		System.out.println("Младшая цифра целой части "+i);
		
		i1=(int)y;
		System.out.println("Старшая цифра дробной части "+i1);
		
		
		
		
	}

}
