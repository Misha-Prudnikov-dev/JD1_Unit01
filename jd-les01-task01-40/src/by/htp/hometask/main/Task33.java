package by.htp.hometask.main;

/*Ввести любой символ и определить его порядковый номер,а также 
 * указать предыдущий и последующий символ.
 */
public class Task33 {

	public static void main(String[] args) {

		char ch = 'f';
		char chP;
		char chN;

		int chCode;

		chCode = (int) ch;

		int charNext = chCode + 1;
		int chPrev = chCode - 1;

		chP = (char) chPrev;
		chN = (char) charNext;

		System.out.println(chP + "-" + chPrev);
		System.out.println(ch + "-" + chCode);
		System.out.println(chN + "-" + charNext);

	}

}
