package 町内_店_ギルド_家_協会_銀行;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Town {

					//町にに来た時のイベント

	public static void lottery(ArrayList<Player>people){
		int LuckyNumber = new java.util.Random().nextInt(5);
		 if(LuckyNumber==0){
			 buy(people);
		}else if(LuckyNumber==1 || LuckyNumber==2 || LuckyNumber==3){
			 Time.TLDB80(people.get(0).getName()+": 今日はにぎわっているな‼‼‼‼");
			choose(people);
		}else if(LuckyNumber==4){
			 Time.TLDB80("雨が降っている………");
			choose(people);
		}
	}

				//買い物でどこに行くかの選択

	public static void choose(ArrayList<Player>people){
		System.out.println("どこに行きますか？");
		System.out.println("1:武器屋 2:防具屋 3:雑貨屋 4:戻る");
		int a = Num.or1234();
		switch(a) {
			case 1:
				WeaponShop.weapons(people);
				break;
			case 2:
				ArmorShop.armor(people);
				break;
			case 3:
				Goods.goods1(people);
				break;
			case 4:
				AllAction.moveToAnother(people);
				break;
		}
	}


					//イベントの押し売り業者

	public static void buy(ArrayList<Player>people){
		String [] item = {"薬草","回復薬","パン","剣","靴"};
		System.out.println("お～いあんちゃん何か買っていかねえか？");
		System.out.println("1:何があるんだい？ 2:買わない");
		int a = Num.or12();
		if (a==1) {
			System.out.println("ありがてえや");
			System.out.println("こんなのがあるんだがどうだ？");
			for(int i=0; i<3; i++) {
				int no= new java.util.Random().nextInt(5);
				System.out.print(i+":"+item[no]);
			}
			System.out.println("何かいいのあったかい？");
		}else {
			System.out.println("そうか残念だ…また今度よろしくな！");
			System.out.println("");
			choose(people);
		}
	}
}