package 町_ギルド_家_協会_銀行;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Home {

//** アイテム管理ボックス **//
//[0]:薬草 [1]:回復薬 [2]:高級回復薬 [3]:粉塵 [4]:解毒草 [5]:解毒薬 [6]:高級解毒薬 [7]:鬼人種 [8]:鬼人薬 [9]:忍耐の種 [10]:硬化薬
 private static int [] item = new int [11];

	public static void Action(ArrayList<Player> people){
		Time.TLDB50(people.get(0).getName()+": 何をしますか？\n");
		Time.TLDB50("[1]:アイテム管理 [2]:仲間 [3]:寝る [4]:町へ行く\n");
		int a  =Num.or1234();
		if(a==1) {
			//アイテム管理選択画面
			item(people);
		}else if(a==2) {
			//バトルのメンバーを選択
			Action(people);
		}else if(a==3) {
			//** 眠る 仲間全員のHP全回復 **//
			homeSleep(people);
			Action(people);
		}else {
			AllAction.lottery(people);
		}

	}


	//**睡眠での回復**//  //死者は回復しない
	public static void homeSleep(ArrayList<Player> people) {
		int count =0;
		for(int i=0; i<people.size(); i++) {
			if(people.get(i).getHp()==people.get(i).getMaxHp() && people.get(i).getAbnormal().equals("なし")) {
				count++;
			}
		}
		if(count==people.size()) {
			Time.TLDB50(people.get(0).getName()+": 全員健康状態が良い!他のことをしよう!\n\n");
		}else {
			Time.TLDB50(people.get(0).getName()+": 寝ることにしよう\n\n");
			for(int i=0; i<people.size(); i++) {
				if(people.get(i).getHp()>=1) {
					Time.TLDB50(people.get(i).getName()+": HP "+people.get(i).getHp()+" → "+people.get(i).getMaxHp()+"\n");
					Time.TLDB50(people.get(i).getName()+": 状態異常 "+people.get(i).getAbnormal()+" → "+"なし\n\n");
					people.get(i).setHp(people.get(i).getMaxHp());
					people.get(i).setAbnormal("なし");
				}else {
					Time.TLDB50(people.get(i).getName()+": は死亡しているため回復できません・・・\n\n");
				}
			}
			for(int i=0; i<people.size(); i++) {
				Time.TLDAL50(people.get(0).getName()+" ");
			}
			Time.TLDB50("全員の体力を回復しました。\n");
			Action(people);
		}

	}


	//**死んだときにリスタート**//
	public static void die(Player p,String place) {
		Time.TLDB50(p.getName()+":"+place+"で瀕死状態になったところを助けてもらえたようだ・・・\n","\t\t手持ちのお金が半分になった");
		Time.TLDB50(p.many+"==>");
		p.many=p.many/2;
		Time.TLDB50(""+p.many);
	}


	//** アイテム管理 **//
	public static void item(ArrayList<Player> people) {
		Time.TLDB50(people.get(0).getName()+": [1]:しまう [2]:取り出す [3]:戻る\n");
		int a = Num.or123();
		if(a==1) {
			itemPut(people);
		}else if(a==2) {
			itemPickUp(people);
		}else {
			Action(people);
		}
	}


	//** アイテムをしまう **//
	public static void itemPut(ArrayList<Player> people) {
		Time.TLDB50(people.get(0).getName()+": 何をしまいますか?\n");

		for(int i=0; i<item.length; i++) {

		}
		item(people);
	}

	//** アイテムを取り出す **//
	public static void itemPickUp(ArrayList<Player> people) {

		//[0]:薬草 [1]:回復薬 [2]:高級回復薬 [3]:粉塵 [4]:解毒草 [5]:解毒薬
		//[6]:高級解毒薬 [7]:鬼人種 [8]:鬼人薬 [9]:忍耐の種 [10]:硬化薬

		int count =0;
		System.out.println("\nアイテBOX");
		System.out.println("------------------------------------");

		//アイテム数が1以上のモノだけ表示
		for(int i=0; i<item.length; i++) {
			if(getItem(i)>=1) {
				count++;
				switch(i+1) {
				case 1:
					System.out.println("["+count+"]:薬草 * "+getItem(i));
					break;
				case 2:
					System.out.println("["+count+"]:回復薬 * "+getItem(i));
					break;
				case 3:
					System.out.println("["+count+"]:高級回復薬 * "+getItem(i));
					break;
				case 4:
					System.out.println("["+count+"]:解毒草 * "+getItem(i));
					break;
				case 5:
					System.out.println("["+count+"]:解毒薬 * "+getItem(i));
					break;
				case 6:
					System.out.println("["+count+"]:高級解毒薬 * "+getItem(i));
					break;
				case 7:
					System.out.println("["+count+"]:粉塵 * "+getItem(i));
					break;
				case 8:
					System.out.println("["+count+"]:鬼人の種 * "+getItem(i));
					break;
				case 9:
					System.out.println("["+count+"]:鬼人薬 * "+getItem(i));
					break;
				case 10:
					System.out.println("["+count+"]:忍耐の種 * "+getItem(i));
					break;
				case 11:
					System.out.println("["+count+"]:硬化薬 * "+getItem(i));
					break;
				}

				Time.TLDB50(people.get(0).getName()+": 何を取り出しますか？");

			}
		}
		item(people);
	}

	//** アイテムを取り出す個数を決める **//
	public static void picMany(int no) {
		if(no==0) {

		}

	}

	public static int getItem(int no) {
		return item[no];
	}


	public static void setItem(int no,int many) {
		Home.item[no] = many;
	}

}
