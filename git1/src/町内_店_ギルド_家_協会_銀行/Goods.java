package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Goods {
	static String n="雑貨屋: ";
	public static void goods1(Player p){
		Time.TLDB50("雑貨屋: 今日は何をお買い求めで？\n\n");
		goods2(p);
	}

	private static void goods3(Player p){
		Time.TLDB50("雑貨屋: ほかにも見て行くかい？\n\n");
		goods2(p);
	}
	public static void goods2(Player p){
		System.out.println("1:薬草 2:生肉 3:包帯 4:やめる");
		int b = Num.or1234();
		System.out.print("==>");
		if(b==1) {
			Time.TLDB50(n+"薬草だね？");
			HowMany(p);
			goods3(p);
		}else if(b==2) {
			Time.TLDB50(n+"生肉は保存に気をつけな！"+"ありがとうまた来てくれよな\n\n");
			HowMany(p);
			goods3(p);
		}else if(b==3) {
			Time.TLDB50(n+"冒険者は包帯が必需品だな"+"ありがとうまた来てくれよな\n\n");
			HowMany(p);
			goods3(p);
		}else {
			Time.TLDB50(n+"またのご来店をお待ちしております！\n\n");
			Town.choose(p);
		}
	}
	private static int HowMany(Player p){
		Time.TLDB50(n+"いくつ買いますか？\n\n");
		int a =Num.HowMany();
		return a;
	}

}
