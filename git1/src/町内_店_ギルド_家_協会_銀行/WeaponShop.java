package 町内_店_ギルド_家_協会_銀行;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class WeaponShop {
	public static void weapons(ArrayList<Player>people){
		System.out.print("武器屋:");
		Time.TLDB80("いらっしゃい！");
		Time.TLDB80("\t\t今日はなにをお求めで？\n");
		Time.TLDB80("1:武器リスト 2:店を出る\n\n");
		System.out.print("=->");
		int a = Num.or12();
		if(a==1) {
			ownHandSword(people);
		}else if(a==2) {
			Town.choose(people);
		}
	}

	public static void ownHandSword(Player p) {
		Time.TLDB100("今の"+p.getName()+"のレベルで買える武器一覧だ");

		if(p.getLevel()<10) {
			System.out.println(p.getLevel());
			Time.TLDB80("");
		}
	}
	public static void list(Player p) {

	}
}
