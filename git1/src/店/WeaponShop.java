package 店;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class WeaponShop {
	public static void weapons(ArrayList<Player>people){
		Time.TLDB80("武器屋: いらっしゃい！\n");
		Time.TLDB80("武器屋: 今日はなにをお求めで？\n");
		Time.TLDB80(people.get(0).getName()+": [1]:武器リスト [2]:店を出る\n\n");
		int a = Num.or12();
		if(a==1) {
			Sword(people);
		}else if(a==2) {
			Town_Buy_Choose.choose(people);
		}
	}

	public static void Sword(ArrayList<Player> people) {
		Time.TLDB100("今の"+people.get(0).getName()+"のレベルで買える武器一覧だ");

		if(people.get(0).getLevel()<20) {
			System.out.println(people.get(0).getLevel());
			Time.TLDB80("");
		}
	}
	public static void list(Player p) {

	}
}
