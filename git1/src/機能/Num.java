package 機能;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Num {
	static int no =0;
	//** 1or2を選択するときに使用 **//
	public static int or12() {
		System.out.print("==>");

		try {
			Scanner n = new Scanner(System.in);
			int ans = n.nextInt();
			if(ans==1 || ans==2) {
				no = ans;
				return no;
			}else {
				System.out.println("1or2で入力してください");
				or12();
			}

		}catch (InputMismatchException e) {
			System.out.println("数字ではありませんもう一度入力直してください");
			System.out.println("-->");
			or12();
		}
		return no;
	}

	//** 文字列だった場合ループ**//
	public static void num1or2Miss() {
		Time.TLDA50("\n※数字を入力してください\n");
		or12();
	}

	//**1or2でなかった場合**//
	public static void num1or2Miss2() {
		Time.TLDA50("\n※1か2で入力しなおしてください\n");
		or12();
	}


	public static int or1234() {
		System.out.print("==>");
		try {
			int ans = new java.util.Scanner(System.in).nextInt();
			if(!(ans==1 || ans==2 || ans==3 || ans==4)) {
				num1234Miss2();
			}else {
				no=ans;
				return ans;
			}
		}catch (InputMismatchException e) {
			num1234Miss();
		}
		return no;
	}

	//** 文字列だった場合ループ**//
	public static void num1234Miss() {
		Time.TLDA50("\n※数字を入力してください\n");
		or1234();
	}

	//**1or2でなかった場合**//
	public static void num1234Miss2() {
		Time.TLDA50("\n※1,2,3,4で入力しなおしてください\n");
		or1234();
	}



	//**数の入力があった場合**//
	public static int HowMany() {
		int ans = 0;
		try {
			Scanner a = new Scanner(System.in);
			ans = a.nextInt();
		}catch(InputMismatchException e) {
			Time.TLDA50("数字で入力してください！\n\n");
			HowMany();
		}
		return ans;
	}
}
