package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Town {

					//町にに来た時のイベント

	public static void lottery(Player p){
		int LuckyNumber = new java.util.Random().nextInt(5);
		 if(LuckyNumber==0){
			 buy(p);
		}else if(LuckyNumber==1 || LuckyNumber==2 || LuckyNumber==3){
			 Time.TLDB80(p.getName()+": 今日はにぎわっているな‼‼‼‼");
			choose(p);
		}else if(LuckyNumber==4){
			 Time.TLDB80("雨が降っている………");
			choose(p);
		}
	}

				//買い物でどこに行くかの選択

	public static void choose(Player p){
		System.out.println("どこに行きますか？");
		System.out.println("1:武器屋 2:防具屋 3:雑貨屋 4:戻る");
		int a = Num.or1234();
		switch(a) {
			case 1:
				WeaponShop.weapons(p);
				break;
			case 2:
				ArmorShop.armor(p);
				break;
			case 3:
				Goods.goods1(p);
				break;
			case 4:
				AllAction.moveToAnother(p);
				break;
		}
	}


					//イベントの押し売り業者

	public static void buy(Player p){
		String [] item = {"薬草","回復薬","パン","剣","靴"};
		System.out.println("お～いあんちゃん何か買っていかねえか？");
		System.out.println("1:何があるんだい？ 2:買わない");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if (a==0) {
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
			choose(p);
		}
	}
}