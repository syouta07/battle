package 町_ギルド_家_協会_銀行;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Association {			//*村に戻るが完成していない*//


	//教会でのアクション
	public static void association1(ArrayList<Player>people) {
		Time.TLDB50("神父: こんにちは!今日は何をされますか？\n");
		association2(people);
	}

	//2回以上協会で処理を行うとき
	public static void association3(ArrayList<Player>people) {
		Time.TLDB50("神父: 他にありますか？\n");
		association2(people);
	}


	public static void association2(ArrayList<Player>people) {
		String s = "神父: ";
		System.out.println("[1]:祈り [2]:生き返らせる [3]:懺悔 [4]:戻る");
		int select = Num.or1234();

		//祈る
		if(select==1) {
			for(int i=0; i<people.size(); i++) {
				Time.TLDAL50(people.get(i).getName()+" ");
			}
			Time.TLDB50(": 祈ったら清らかな気持ちになった。\n");
			association2(people);

			//生き返らせる
		}else if(select==2) {
			Reborn(people);

			//懺悔
		}else if(select==3) {
			Time.TLDB50("何を懺悔しますか？\n");
			Time.TLDB50("[1]:死ぬのが怖い [2]:冒険を終わる [3]:戻る\n");
			int zange= Num.or123();
			if(zange == 1) {
				Time.TLDB50(s+"恥じることはありません。死ぬのは怖いものです。\n");
				association3(people);
			}else if(zange==2) {
				Time.TLDB300("・・・・・");

				end(people);
//				AllAction.moveToAnother(people);
			}
		}else {
			Time.TLDB50(people.get(0).getName()+": 村に帰りますか？");
			System.out.println("[1]:はい [2]:いいえ");
			int a = Num.or12();
			if(a==1) {
				AllAction.moveToAnother(people);
			}else {
				association3(people);
			}
		}
	}


	public static void end(ArrayList<Player>people) {
		int i = 0;
		String a = people.get(i).getName()+": 職業: "+people.get(i).getType()+": LeveL: "+people.get(i).getLevel()+"\n";
		for(i=0; i<people.size(); i++) {
			if(i<=people.size()-1) {
				Time.TLDB50(a);
			}else {
				Time.TLDB50(a+"many: "+people.get(i).many);
			}

		}
		Time.TLDB50("セーブしました");
		Time.TLDB50("ゲームを終了します!");
	}


	public static void Reborn(ArrayList<Player>people) {
		int count =0;
		Time.TLDAL50("神父: ");
		for(int i=0; i<people.size(); i++) {
			if(people.get(i).getHp()==0) {
				people.get(i).setHp(people.get(i).getMaxHp());
				Time.TLDAL50(people.get(i).getName()+" ");
			}else {
				count++;
				System.out.println("i:"+i);
				System.out.println("count:"+count);
			}
			if(i==people.size()-1 && count<=people.size()-2) {
				Time.TLDB50("を生き返らせることに成功した！\n");
			}
		}
		if(count==people.size()) {
			Time.TLDB50("誰も死んでいないようだぞ!","他に何かあるかね？\n");
		}
		association2(people);
	}
}
