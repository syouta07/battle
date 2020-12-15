package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Time;

public class ArmorShop {
	public static void greeting() {

	}


	public static void armor(Player p, int LuckyNumber){
		System.out.println("1:頭の防具 2:腕の防具 3:銅の防具 4:脚の防具 5:やっぱり何でもない");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			System.out.println("頭の防具はこんなのがあるぞ");
			System.out.println("また来てくれよな");
			Town.choose(p,LuckyNumber);
		}else if(a==1) {
			Time.TLDB80("頭の防具はこんなのがあるぞ"+"ありがとうまた来てくれよな\n");
			armor(p,LuckyNumber);
		}else if(a==2) {
			Time.TLDB80("腕の防具はこんなのがあるぞ"+"ありがとうまた来てくれよな\n");
			armor(p,LuckyNumber);
		}else if(a==3) {
			Time.TLDB80("銅の防具はこんなのがあるぞ"+"ありがとうまた来てくれよな\n");
			armor(p,LuckyNumber);
		}else if(a==4) {
			Time.TLDB80("脚の防具はこんなのがあるぞ"+"ありがとうまた来てくれよな\n");
		}else {
			Time.TLDB80("ありがとう"+"また来てくれ");
			Town.choose(p,LuckyNumber);
		}
	}


}
