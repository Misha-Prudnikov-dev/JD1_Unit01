package by.htp.hometask02.main;

import java.util.Scanner;

/*34. Составить программу, реализующую эпизод применения 
 * компьютера в книжном магазине. Компьютер запрашивает 
 * стоимость книг, сумму денег, внесенную покупателем; 
 * если сдачи не требуется, печатает на экране «спасибо»; 
 * если денег внесено больше, чем необходимо, 
 * то печатает «возьмите сдачу» и указывает сумму 
 * сдачи; если денег недостаточно, то печатает сообщение 
 * об этом и указывает размер недостающей суммы.
 * */

public class Task34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите цену книги");
		int bookPrice = sc.nextInt();

		System.out.println("Введите оплату за книгу");
		int userCash = sc.nextInt();

		if (userCash == bookPrice) {
			System.out.println("Спасибо");
		} else if (userCash > bookPrice) {
			System.out.println("Сдача : " + (userCash - bookPrice));
		} else if (userCash < bookPrice) {
			System.out.println("Недостаточно средств : " + (bookPrice - userCash));
		}
	}

}
