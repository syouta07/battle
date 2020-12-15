package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Time;

public class WeaponShop {
	public static void weapons(Player p,int LuckyNumber){
		System.out.print("武器屋:");
		Time.TLDB80("いらっしゃい！");
		Time.TLDB80("\t\t今日はなにをお求めで？\n");
		Time.TLDB80("1:武器リスト 2:店を出る\n\n＝＝＞");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			ownHandSword(p,LuckyNumber);
		}else if(a==1) {
			Town.choose(p,LuckyNumber);
		}else {
			weapons(p,LuckyNumber);
		}
	}

	public static void ownHandSword(Player p,int LuckyNumber) {
		Time.TLDB100("今の"+p.getName()+"のレベルで買える武器一覧だ");

		if(p.getLevel()<10) {
			System.out.println(p.getLevel());
			Time.TLDB80("");
		}
	}
	public static void list(Player p) {

	}
}
