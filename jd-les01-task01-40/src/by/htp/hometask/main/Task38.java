package by.htp.hometask.main;

/*
38. Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class Task38 {

	public static void main(String[] args) {

		int x = 4;
		int y = 2;

		if (y <= (x + 4) && (y <= (-x + 4)) && y >= 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		
		
		
		x = 2;
		y = 3;
		
		boolean ans = false;

		if (y > 0) {
			if (y < 4 && (x > -2 && x < 2)) {
				ans = true;
			}
		} else if (y > -3 && (x > -4 && x < 4)) {
			ans = true;
		}

		System.out.println(ans);

		
		
		x = 2;
		y = -4;

		ans = false;

		if (x > 0) {
			if (y > 0 && (y <= Math.sqrt(16 - x * x))) {
				ans = true;
			} else if (y < 0 && y >= -Math.sqrt(25 - x * x)) {
				ans = true;
			}
		}

		System.out.println(ans);
	}

}
