package by.htp.hometask02.main;

/*
 * 35. Вычислить число и месяц в невисокосном году по номеру дня.
 */

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число");
		int num = sc.nextInt();

		if (num > 0 & num <= 31) {
			System.out.println(num + " Января");
		} else if (num > 31 & num <= 59) {
			System.out.println(num - 31 + " Февраля");
		} else if (num > 59 & num <= 90) {
			System.out.println(num - 59 + " Марта");
		} else if (num > 90 & num <= 120) {
			System.out.println(num - 90 + " Апреля");
		} else if (num > 120 & num <= 151) {
			System.out.println(num - 120 + " Мая");
		} else if (num > 151 & num <= 181) {
			System.out.println(num - 151 + " Июня");
		} else if (num > 181 & num <= 212) {
			System.out.println(num - 181 + " Июля");
		} else if (num > 212 & num <= 243) {
			System.out.println(num - 212 + " Августа");
		} else if (num > 243 & num <= 273) {
			System.out.println(num - 243 + " Сентября");
		} else if (num > 273 & num <= 304) {
			System.out.println(num - 273 + " Октября");
		} else if (num > 304 & num < 334) {
			System.out.println(num - 304 + " Ноября");
		} else if (num > 334 & num <= 365) {
			System.out.println(num - 334 + " Декабря");
		} else {
			System.out.println("Такого дня не существует");
		}

	}

}
