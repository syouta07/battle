package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Time;

public class Town {

					//町にに来た時のイベント

	public static void lottery(Player p){
		int LuckyNumber = new java.util.Random().nextInt(5);
		 if(LuckyNumber==0){
			 buy(p,LuckyNumber);
		}else if(LuckyNumber==1 || LuckyNumber==2 || LuckyNumber==3){
			 Time.TLDB80(p.getName()+": 今日はにぎわっているな‼‼‼‼");
			choose(p,LuckyNumber);
		}else if(LuckyNumber==4){
			 Time.TLDB80("雨が降っている………");
			choose(p,LuckyNumber);
		}
	}

				//買い物でどこに行くかの選択

	public static void choose(Player p, int LuckyNumber){
		System.out.println("どこに行きますか？");
		System.out.println("1:武器屋 2:防具屋 3:雑貨屋 4:戻る");
		int a = new java.util.Scanner(System.in).nextInt();
		switch(a) {
			case 0:
				WeaponShop.weapons(p,LuckyNumber);
				break;
			case 1:
				ArmorShop.armor(p,LuckyNumber);
				break;
			case 2:
				Goods.goods(p,LuckyNumber);
				break;
			case 3:
				AllAction.moveToAnother();
				break;
		}
	}


					//イベントの押し売り業者

	public static void buy(Player p,int LuckyNumber){
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
			choose(p,LuckyNumber);
		}
	}
}