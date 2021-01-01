package 店;

import java.util.ArrayList;
import java.util.Collections;

import 主人公.Player;
import 機能.Num;
import 機能.Time;
import 町_ギルド_家_協会_銀行.AllAction;

public class Town_Buy_Choose {

					//町にに来た時のイベント


				//買い物でどこに行くかの選択

	public static void choose(ArrayList<Player>people){
		Time.TLDB50(people.get(0).getName()+": どのお店に行こうかな？\n");
		Time.TLDB50(people.get(0).getName()+"[1]:武器屋 [2]:防具屋 [3]:雑貨屋 [4]:戻る\n");
		int a = Num.or1234();

		switch(a) {

			//武器
			case 1:
				WeaponShop.weapons(people);
				break;

			//防具
			case 2:
				ArmorShop.armor(people);
				break;

			//雑貨
			case 3:
				Goods.goods1(people);
				break;

			//町での選択に戻る
			case 4:
				AllAction.moveToAnother(people);
				break;
		}
	}


					//イベントの押し売り業者

	public static void buy(ArrayList<Player>people){
		String [] item = {"薬草","回復薬","高級回復薬","解毒薬"};
		Time.TLDB50("移動販売: お～いあんちゃん何か買っていかねえか？\n");
		Time.TLDB50("[1]:見てみる [2]:買わない\n");
		int a = Num.or12();
		if (a==1) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0 ; i <= 4 ; i++) {
	            list.add(i);
			}
			Collections.shuffle(list);
			for(int i = 0 ; i <= 4 ; i++) {
				item[i] = item[list.get(i)];
			}
			Time.TLDB50("移動販売: ありがてえや");
			Time.TLDB50("移動販売: こんなのがあるんだがどうだ？");
			for(int i=0; i<3; i++) {
				System.out.print(i+":"+item[list.get(i)]+" ");
			}
			Time.TLDB50("移動販売: 何かいいのあったかい？");
			int b = Num.or12();
			if(b==1) {
				buy2(people,item);
			}else {
				Time.TLDB50("移動販売: そうか残念だ…また今度よろしくな！");
				choose(people);
			}
		}else {
			Time.TLDB50("移動販売: そうか残念だ…また今度よろしくな！");
			choose(people);
		}
	}

	//移動販売の商品を購入する際

	//今後の追加 アイテムを購入したときの判定
	public static void buy2(ArrayList<Player>people,String[] item){
		Time.TLDB50("移動販売: 何を買うかい？");
		Time.TLDB50(people.get(0).getName()+": [1]"+item[0]+" [2]"+item[1]+" [3]"+item[2]);
		int a= Num.or1234();
		if(a==1) {

		}else if(a==2) {

		}else if(a==3) {

		}else {

		}
	}
}