package by.htp.hometask03.main;

/*36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число, которое
делится на их произведение. Найти эти числа.*/

public class Task36 {

	public static void main(String[] args) {

		int pr = 1;

		for (int i = 10; i < 100; i++) {

			for (int j = 10; j < 100; j++) {
				pr = i * j;
				if ((i * 100 + j) % pr == 0) {
					System.out.println("Числа : " + i + " " + j);
				}
			}
		}
	}

}
