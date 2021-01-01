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
		Time.TLDA50("\n※1,2で入力しなおしてください\n");
		or12();
	}

	//** 1,2,3で選択する際**//
	public static int or123() {
		System.out.print("==>");

		try {
			Scanner n = new Scanner(System.in);
			int ans = n.nextInt();
			if(ans==1 || ans==2 || ans==3) {
				no = ans;
				return no;
			}else {
				System.out.println("1,2,3で入力してください");
				or123();
			}

		}catch (InputMismatchException e) {
			System.out.println("数字ではありませんもう一度入力直してください");
			or123();
		}
		return no;
	}

	//** 文字列だった場合ループ**//
	public static void num1or2or3Miss() {
		Time.TLDA50("\n※数字を入力してください\n");
		or123();
	}

	//**1,2,3でなかった場合**//
	public static void num1or2or3Miss2() {
		Time.TLDA50("\n※1,2,3で入力しなおしてください\n");
		or123();
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




	public static int or12345() {
		System.out.print("==>");
		try {
			int ans = new java.util.Scanner(System.in).nextInt();
			if(!(ans==1 || ans==2 || ans==3 || ans==4 || ans==5)) {
				num12345Miss2();
			}else {
				no=ans;
				return ans;
			}
		}catch (InputMismatchException e) {
			num12345Miss();
		}
		return no;
	}

	//** 文字列だった場合ループ**//
	public static void num12345Miss() {
		Time.TLDA50("\n※数字を入力してください\n");
		or1234();
	}

	//**1or2でなかった場合**//
	public static void num12345Miss2() {
		Time.TLDA50("\n※1,2,3,4,5で入力しなおしてください\n");
		or1234();
	}



	public static int or123456() {
		System.out.print("==>");
		try {
			int ans = new java.util.Scanner(System.in).nextInt();
			if(!(ans==1 || ans==2 || ans==3 || ans==4 || ans==5 || ans==6)) {
				num123456Miss2();
			}else {
				no=ans;
				return ans;
			}
		}catch (InputMismatchException e) {
			num123456Miss();
		}
		return no;
	}

	//** 文字列だった場合ループ**//
	public static void num123456Miss() {
		Time.TLDA50("\n※数字を入力してください\n");
		or123456();
	}

	//**1to6でなかった場合**//
	public static void num123456Miss2() {
		Time.TLDA50("\n※1,2,3,4,5で入力しなおしてください\n");
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

	public static int or1To11() {
		System.out.print("==>");
		try {
			int ans = new java.util.Scanner(System.in).nextInt();
			if(!(ans==1 || ans==2 || ans==3 || ans==4 || ans==5 || ans==6 || ans==7 || ans==8 || ans==9 || ans==10 || ans==11)) {
				num1To11Miss2();
			}else {
				no=ans;
				return ans;
			}
		}catch (InputMismatchException e) {
			num1To11Miss();
		}
		return no;
	}

	//** 文字列だった場合ループ**//
	public static void num1To11Miss() {
		Time.TLDA50("\n※数字を入力してください\n");
		or123456();
	}

	//**1or2でなかった場合**//
	public static void num1To11Miss2() {
		Time.TLDA50("\n※1,2,3,4,5で入力しなおしてください\n");
		or1234();
	}

}
