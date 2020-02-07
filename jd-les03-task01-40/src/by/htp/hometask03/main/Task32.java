package by.htp.hometask03.main;

import java.util.Scanner;

/*32. Проверить введенную пользователем строку на наличие недопустимых символов. В качестве
первого символа допустимы только буквы и знак подчеркивания. Остальные символы могут быть
буквами, цифрами и знаком подчеркивания.
*/
//1040   1103
public class Task32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите строку кириллицей");
		String str = sc.nextLine();

		if ((str.charAt(0) >= 1040) && (str.charAt(0) <= 1103) || (str.charAt(0) == '_')) {

			for (int i = 1; i < str.length(); i++) {

				if ((str.charAt(i) >= 1040) && (str.charAt(i) <= 1103) || (str.charAt(i) == '_')
						|| (str.charAt(i) >= '0') && (str.charAt(i) <= 9)) {

				} else {
					System.out.println("Ошибка");
				}
			}
		} else {
			System.out.println("Ошибка");
		}

	}

}
