package by.htp.hometask.main;

/*Написать код для решения задачи. В n малых бидонах 80 л молока.
 * Сколько литров молока в m больших бидонах,
 * если в каждом большом бидоне на 12 л больше, чем в малом? 
 */

public class Task06 {
	
	public static void main(String [] args) {
		
		int n = 8;
		int ln = 80;
		int m = 8;
		
		int n1 = ln / n;     // в одном малом бидоне 10л.
		
		int m1 = n1 + 12;   //  в одном большом бидоне 22л.
		int m2 = m1 * m;    //  176 литров молока в  больших бидонах.
		
		System.out.println("В одном большом бидоне : "+ m1);
		System.out.println("Всего литров молока в больших бидонах : "+m2);
	}

}
