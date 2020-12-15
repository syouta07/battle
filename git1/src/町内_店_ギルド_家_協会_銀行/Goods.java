package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Time;

public class Goods {
	public static void goods(Player p,int LuckyNumber){
		Time.TLDB80("何をお求めで？\n\n");
		System.out.println("1:薬草 2:生肉 3:包帯 4:やめる");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			System.out.println("");
			Time.TLDB80("薬草が今日は安いからな持ってけ"+"ほかにも何かあるかい？");
			goods(p,LuckyNumber);
		}else if(b==1) {
			Time.TLDB80("生肉は保存に気をつけな！"+"ありがとうまた来てくれよな\n\n");
			goods(p,LuckyNumber);
		}else if(b==2) {
			Time.TLDB80("冒険者は包帯が必需品だな"+"ありがとうまた来てくれよな\n\n");
			goods(p,LuckyNumber);
		}else {
			Town.choose(p,LuckyNumber);
		}
	}
}
