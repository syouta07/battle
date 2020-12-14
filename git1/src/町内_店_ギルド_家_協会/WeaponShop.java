package 町内_店_ギルド_家_協会;

import 機能.Time;

public class WeaponShop {
	public static void weapons(){
		System.out.println("いらっしゃい！");
		System.out.println("今日はどんな防具をお求めで？");
		System.out.println("1:片手剣 2:双剣 3:槍 4:やめる");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			Time.TLDB80("片手剣はこんなのがあるぞ"+"また来てくれよな\n");
			weapons();
		}else if(a==1) {
			Time.TLDB80("双剣はこんなのがあるぞ"+"また来てくれよな\n");
			weapons();
		}else if(a==2) {
			Time.TLDB80("槍はこんなのがあるぞ"+"また来てくれよな\n");
			weapons();
		}else if(a==3) {
			Time.TLDB80("そっか……"+"ありがとうまた来てくれよな\n");
			Town.choose();
		}
	}
}
