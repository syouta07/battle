package 機能;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

static int no=0;
	public static void main(String[] args) {
		
		int a = num();
		System.out.println(a);
		num1();
		num2();
	}
	
	public static void num1() {
		int a = num();
		System.out.println(a);
		if(a==1) {
			num1();
		}
		num();
	}
		
	public static void num2() {
		int a = num();
		System.out.println(a);
	}
	


	public static int num() {
		try {
			@SuppressWarnings("resource")
			Scanner n = new Scanner(System.in);
			int ans = n.nextInt();
			if(ans==1 || ans==2) {
				no = ans;
				return no;
			}else {
				System.out.println("1or2で入力してください");
				System.out.print("-->");
				num();
			}

		}catch (InputMismatchException e) {
			System.out.println("数字ではありませんもう一度入力直してください");
			System.out.println("-->");
			num();
		}
		return no;

	}
	
}
