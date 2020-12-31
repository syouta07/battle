package 店;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class ArmorShop {
	static String n = "防具屋: ";
	public static void greeting() {
		Time.TLDB50(n+": いらっしゃい!\n\n");
		Time.TLDB50(n+": 今日は何をお求めで？\n\n");
	}


	public static void armor(ArrayList<Player>people){
		Time.TLDB50(people.get(0).getName()+": [1]:防具の一覧表を見る [2]:町に戻る");
		int a = Num.or12();
		if(a==1) {
			Time.TLDB50(n+"今のレベルで買える防具はこれだ\n\n");
			list(people);
			Time.TLDB50(n+"他にも何かあるかい？\n\n");
			Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ？\n\n");
			int b = Num.or12();
			if(b==1) {
				armor(people);
			}else {
				Town_Buy_Choose.choose(people);
			}
		}else if(a==2) {
			Time.TLDB50(n+"ありがとうまた来てくれよな\n\n");
			Town_Buy_Choose.choose(people);
		}
	}


	public static void list(ArrayList<Player>people){
		System.out.println("list");
	}

}
