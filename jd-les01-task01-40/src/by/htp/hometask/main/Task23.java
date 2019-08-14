package by.htp.hometask.main;

/*Ќайти площадь кольца, 
 * внутренний радиус которого равен r,
 *  а внешний Ц заданному числу R(R>20).
 */
public class Task23 {

	public static void main(String[] args) {

		double r;
		double r1;

		double s1;
		double s2;
		double s3;

		r1 = 4;
		r = 2;

		s1 = Math.PI * r1 * r1;
		s2 = Math.PI * r * r;

		s3 = Math.PI * (Math.pow(r1, 2) - Math.pow(r, 2));

		System.out.println("ѕлощадь кольца " + s3);

	}

}
