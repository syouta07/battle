package 店;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;
import 町_ギルド_家_協会_銀行.Home;

public class Goods {
	static String n="雑貨屋: ";
	public static void goods1(ArrayList<Player>people){
		Time.TLDB50("雑貨屋: 今日は何をお買い求めで？\n\n");
		goods2(people);
	}

	private static void goods3(ArrayList<Player>people){
		Time.TLDB50("雑貨屋: ほかにも見て行くかい？\n\n");
		Time.TLDB50(people.get(0).getName()+"; [1]:はい [2]:いいえ\n\n");
		int a = Num.or12();
		if(a==1) {
			goods2(people);
		}else {
			Time.TLDB50(n+"またのご来店をお待ちしております！\n\n");
			Town_Buy_Choose.choose(people);
		}

	}
	public static void goods2(ArrayList<Player>people){
		System.out.println("[1]:回復系 [2]:解毒 [3]:戦闘系 [4]:やめる\n");
		int b = Num.or1234();

		//回復系
		if(b==1) {
			for(int i=0; i<4; i++) {
				Time.TLDB50("["+(i+1)+"]:"+Home.getItem()[i]+" * "+((i+1)*10)+" ");
			}
			Time.TLDB50("[5]:やめる\n");
			Time.TLDB50(people.get(0).getName()+": 何を購入しますか?\n");
			int a = Num.or12345();
			if(a==1) {
				//薬草
				HowMany(10,Home.getItem()[0],people,0);
			}else if(a==2){
				//回復薬
				HowMany(20,Home.getItem()[1],people,1);
			}else if(a==3){
				//高級回復薬
				HowMany(30,Home.getItem()[2],people,2);
			}else if(a==4){
				//粉塵
				HowMany(40,Home.getItem()[3],people,3);
			}else {
				goods3(people);
			}


		//解毒系
		}else if(b==2) {
			for(int i=0; i<3; i++) {
				Time.TLDB50("["+(i+1)+"]"+Home.getItem()[i+4]+" * "+((i+1)*15)+" ");
			}
			Time.TLDB50("[4]:やめる\n");
			Time.TLDB50(people.get(0).getName()+": 購入しますか?\n");
			int a = Num.or1234();
			if(a==1) {
				//解毒草
				HowMany(15,Home.getItem()[4],people,3);
			}else if(a==2){
				//解毒薬
				HowMany(30,Home.getItem()[5],people,4);
			}else if(a==3) {
				//高級解毒薬
				HowMany(45,Home.getItem()[6],people,5);
			}else {
				goods3(people);
			}
			//戦闘系
		}else if(b==3){
			for(int i=0; i<4; i++) {
				Time.TLDB50("["+(i+1)+"]"+Home.getItem()[i+7]+" * "+((i+1)*30)+" ");
			}
			Time.TLDB50("[4]:やめる\n");
			Time.TLDB50(people.get(0).getName()+": 購入しますか?\n");
			int a = Num.or1234();
			if(a==1) {
				//
				HowMany(15,Home.getItem()[7],people,6);
			}else if(a==2){
				//回復薬
				HowMany(30,Home.getItem()[8],people,7);
			}else if(a==3) {
				//高級回復薬
				HowMany(45,Home.getItem()[9],people,8);
			}else {
				goods3(people);
			}

		//戻る
		}else {
			Time.TLDB50(n+"ありがとうまた来てくれよな\n\n");
			goods3(people);
		}
	}

	private static void HowMany(int a,String b,ArrayList<Player> people,int c){
		Time.TLDB50(n+b+"をいくつ買いますか？\n\n");
		int d =Num.HowMany();
		if(a*d<=Player.many) {
			Time.TLDB50(n+(a*d)+"円です!\n");
			Time.TLDB50(people.get(0).getName()+":購入しますか？\n\n[1]:はい[2]:いいえ\n\n");

			int ans = Num.or12();
			if(ans==1) {
				Player.many-=a*d;
				Player.itemMany[c]+=d;
				Time.TLDB50(people.get(0).getName()+":"+b+"を"+d+"個購入しました!\n\n");
				Time.TLDB50(people.get(0).getName()+":残金"+Player.many+"円 "+b+"*"+Player.itemMany[c]+"個\n\n");
			}else {
				goods3(people);
			}
		}else {
			Time.TLDB50(people.get(0).getName()+":手持ちが足りないようだ・・・狩りに行くか銀行に行ってお金を引き出そう!\n\n");
		}
	}

}
