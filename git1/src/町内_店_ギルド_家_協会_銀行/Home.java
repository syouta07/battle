package 町内_店_ギルド_家_協会_銀行;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Home {								/*ヒーローのHPまだ決まってないから
																	食事風呂での回復量が未定*/


	public static void Action(ArrayList<Player> people){
		int [] food = new int[50];
		Time.TLDB50("何をしますか？\n");
		Time.TLDB50("[1]:アイテム管理 2:仲間 3:寝る 4:外へ出かける ");
		int a  =Num.or1234();
		if(a==1) {
			Time.TLDB50("");
		}else if(a==2) {

			Action(people);
		}else if(a==3) {
			//** 眠る 仲間全員のHP全回復 **//
			Time.TLDB50(people.get(0).getName()+": 寝ることにしよう\n\n");
			for(int i=0; i<people.size(); i++) {
				Time.TLDB80(people.get(i).getName()+": HP"+people.get(i).getHp()+" → "+people.get(i).getMaxHp());
				people.get(i).setHp(people.get(i).getMaxHp());
			}
			Action(people);
		}else {
			Time.TLDB80("暇だからどこか出かけようかな\n\n");
			try {
				Town.lottery(people);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


	//**睡眠での回復**//
	public void homeSleep(Player p) {
		int recovery = p.getMaxHp() - p.getHp();
		p.setHp(p.getMaxHp());
		Time.TLDB80(p.getName()+": は"+recovery+"回復しHPが"+p.getMaxHp()+"になった！¥n");
	}


	//**死んだときにリスタート**//
	public static void die(Player p,String place) {
		Time.TLDB80(p.getName()+":"+place+"で瀕死状態になったところを助けてもらえたようだ・・・\n","\t\t手持ちのお金が半分になった");
		Time.TLDB80(p.many+"==>");
		p.many=p.many/2;
		Time.TLDB80(""+p.many);

	}
}
