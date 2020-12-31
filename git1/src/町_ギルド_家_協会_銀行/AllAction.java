package 町_ギルド_家_協会_銀行;

import java.util.ArrayList;

import 主人公.Player;
import 店.Town_Buy_Choose;
import 機能.Num;
import 機能.Time;

public class AllAction {
	//今後ランダムで町に入ったときにイベントを発生させるメソッド
	//今は天気等を表示させておく
	public static void lottery(ArrayList<Player>people){
		int LuckyNumber = new java.util.Random().nextInt(5);
		 if(LuckyNumber==0){
			 moveToAnother(people);
		}else if(LuckyNumber==1 || LuckyNumber==2 || LuckyNumber==3){
			 Time.TLDB50(people.get(0).getName()+": 今日はにぎわっているな‼‼‼‼\n");
			 AllAction.moveToAnother(people);
		}else if(LuckyNumber==4){
			 Time.TLDB50("雨が降っている………\n");
			 AllAction.moveToAnother(people);
		}
	}



	//** 町での移動先を選択する **//
	public static void moveToAnother(ArrayList<Player>people){
		String [] place = {"協会","銀行","ギルド","店","家"};
		Time.TLDB50(people.get(0).getName()+": どこに行こうかな？\n");
		Time.TLDB50(people.get(0).getName()+": [1]:協会 [2]:銀行 [3]:ギルド [4]:店 [5]:家\n");
		int Ch =Num.or1234();
		System.out.println(people.get(0).getName()+": "+place[Ch-1]+"へ向かおう!\n");

		switch(Ch) {

		case 1:
			// 協会class
			Association.association1(people);
			break;

		case 2:
			// 銀行class
			Bank.bankAction(people);
			break;

		case 3:
			//ギルドclass
			Guild.fastGreeting(people);
			break;

		case 4:
			//武器、防具、雑貨class
			Town_Buy_Choose.choose(people);
			break;

		case 5:
			//家class
			Home.Action(people);
			break;
		}
	}

}
