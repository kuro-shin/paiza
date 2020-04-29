package paiza;

import java.util.Scanner;

public class C016 {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		int length = N.length();
		String str = N.replace("A", "4");
		String str2 = str.replace("E", "3");
		String str3 = str2.replace("G", "6");
		String str4 = str3.replace("I", "1");
		String str5 = str4.replace("O", "0");
		String str6 = str5.replace("S", "5");
		String str7 = str6.replace("Z", "2");


		System.out.println(str7);

	}
}
