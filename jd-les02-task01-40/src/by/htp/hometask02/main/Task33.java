package by.htp.hometask02.main;

import java.util.Scanner;

/*
 * 33. Написать программу, которая по паролю будет 
 * определять уровень доступа сотрудника к 
 * секретной информации в базе данных. 
 * Доступ к базе имеют только шесть человек, 
 * разбитых на три группы по степени доступа. 
 * Они имеют следующие пароли: 
 * 9583, 1747 —доступны модули баз А, В, С; 
 * 3331, 7922 —доступны модули баз В, С; 
 * 9455, 8997 —доступен модуль базы С.
 * */

public class Task33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите пароль");
		
		int user = sc.nextInt();
		
		int a = 9583;
		int a1 = 1747;

		int b = 3331;
		int b1 = 7922;

		int c = 9455;
		int c1 = 8997;
		
		if(user==a || user==a1) {
			System.out.println("Доступны модули баз А, В, С");
		}
		else if(user==b || user==b1) {
			System.out.println("Доступны модули баз В, С");
		}
		else if(user==c || user==c1) {
			System.out.println("Доступны модули базы С");
		}
		

	}

}
