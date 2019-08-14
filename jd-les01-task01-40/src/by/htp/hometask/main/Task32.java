package by.htp.hometask.main;

/*Дано текущее показание электронных часов
 *:m часов n минут k секунд,какое время будут показывать часы
 *через p часов q минут r секунд? 
 */
public class Task32 {

	public static void main(String[] args) {

		double m = 10;
		double n = 24;
		double k = 45;

		double p = 17;
		double q = 30;
		double r = 29;

		double timeSec1;
		double timeSec2;
		double timeSecSum;
		double x;

		int h;
		int min;
		int sec;

		timeSec1 = m * 3600 + n * 60 + k;
		timeSec2 = p * 3600 + n * 60 + r;

		timeSecSum = timeSec1 + timeSec2;
		h = (int) timeSecSum / 3600;

		x = timeSecSum % 3600;
		min = (int) x / 60;
		sec = (int) x % 60;

		while (h > 24) {
			h = h - 24;
		}

		System.out.println(h + " час " + min + " мин " + sec + " сек");
	}

}
