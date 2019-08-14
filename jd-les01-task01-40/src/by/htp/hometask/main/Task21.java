package by.htp.hometask.main;

/*Дано действительное число R вида nnn.ddd
 *(три цифровых разряда в дробной и целой частях)
 *Поменять местами дробную и целую части числа и вывести полученне значение числа. 
 */
public class Task21 {

	public static void main(String[] args) {

		double num = 357.154;
		double d = 1000;
		double x1;
		double x2;

		int y1;
		int y2;

		x1 = (int) num;
		x1 = x1 / d;

		y1 = (int) (num * d);
		y2 = (int) (y1 % d);

		x2 = y2 + x1;

		System.out.println("Результат " + x2);
	}

}
