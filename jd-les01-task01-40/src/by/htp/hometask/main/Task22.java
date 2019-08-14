package by.htp.hometask.main;

/*Дано натуральное число “ - длительность прошедшего времени в 
секундах. вывести данное значение длительности 
в часах (HH), минутах (MM) и секундах (SS) 
в следующей форме: HH ч MM мин SS с. 
 */
public class Task22 {

	public static void main(String[] args) {

		int t = 7569;
		int h;
		int min;
		int sec;

		h = t / 3600;
		min = (t - h * 3600) / 60;
		sec = (t - h * 3600) - min * 60;

		System.out.println(h + " час " + min + " минут " + sec + " секунд");

	}

}
