package 町内_店_ギルド_家_協会;

import 主人公.Player;
import 機能.Time;

public class WeaponShop {
	public static void weapons(Player p){
		System.out.println("いらっしゃい！");
		System.out.println("今日はどんな防具をお求めで？");
		System.out.println("1:片手剣 2:双剣 3:槍 4:やめる");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			ownHandSword(p);
		}else if(a==1) {
			Time.TLDB80("双剣はこんなのがあるぞ"+"また来てくれよな\n");
			weapons(p);
		}else if(a==2) {
			Time.TLDB80("槍はこんなのがあるぞ"+"また来てくれよな\n");
			weapons(p);
		}else if(a==3) {
			Time.TLDB80("そっか……"+"ありがとうまた来てくれよな\n");
			Town.choose();
		}
	}
	
	public static void ownHandSword(Player p) {
		Time.TLDB100("名無しの剣"+"炎の剣"+"氷の剣");
		if(p.getLevel()<10) {
			Time.TLDB80("");
		}
	}
}
