package by.htp.hometask02.main;

/*Программа - льстец.На экране высвечивается вопрос
 * "Кто ты : мальчик или девочка? Введи Д или М".
 * В зависимости от ответа на экране должно появиться текст
 * "Мне нравятся девочки!" или "Мне нравятся мальчики!"
 */

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {

		String girl = "д";
		String boy = "м";

		String s1;
		String s2;

		String girl2 = "Мне нравятся мальчики!";
		String boy2 = "Мне нравятся девочки!";

		Scanner sc = new Scanner(System.in);

		System.out.println("Кто ты : мальчик или девочка? Введи Д или М");
		s1 = sc.nextLine();

		if (s1.equals(girl)) {

			System.out.println(girl2);

		} else if (s1.equals(boy)) {

			System.out.println(boy2);
		}

	}

}
