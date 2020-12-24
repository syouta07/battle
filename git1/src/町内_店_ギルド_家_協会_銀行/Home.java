package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Home {								/*ヒーローのHPまだ決まってないから
																	食事風呂での回復量が未定*/


	public static void Action(Player p){
		int [] food = new int[50];

		System.out.println("何をしますか？");
		System.out.println("1:ご飯を食べる 2:風呂に入る 3:眠る 4:外へ出かける ");
		int a  =Num.or1234();
		if(a==0) {
			for(int i=0; i<food.length; i++) {
				if(food.equals("null")) {
				}else{
					Time.TLDB80(food[i]+",");
				}
			}
			Action(p);
		}else if(a==1) {
			p.setHp(p.getHp() + p.getMaxHp());
			Time.TLDB300("・・・・・・");
			Time.TLDB300("体力がhp回復した\n\n");
			Action(p);
		}else if(a==2) {
			Time.TLDB80("寝ることにしよう\n\n");
			Time.TLDB300("・・・・・");
			Time.TLDB80("疲れがとれた");
			Action(p);
		}else {
			Time.TLDB80("暇だからどこか出かけようかな\n\n");
			try {
				Town.lottery(p);
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
