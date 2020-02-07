package by.htp.hometask.main;

/*Составить программу перевода радианной меры угла в градусы,минуты и секунды. 
 */
public class Task28 {

	public static void main(String[] args) {

		double r = 5;

		double gr;
		double min;
		double sec;
		
		int gr1;
		int min1;
		int sec1;

		gr = (r * 180) / Math.PI;
		gr1 = (int) gr;
		min = (gr - gr1) * 60;
		min1 = (int) min;
		sec = (min - min1) * 60;
		sec1 = (int) sec;

		System.out.println(gr1 + " градусов " + min1 + " минут " + sec1 + " секунд");
	}

}
