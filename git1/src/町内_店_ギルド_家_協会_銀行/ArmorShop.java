package 町内_店_ギルド_家_協会_銀行;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class ArmorShop {
	static String n = "防具屋: ";
	public static void greeting() {

	}


	public static void armor(Player p){
		System.out.println("1:防具の一覧表を見る 2:町に戻る");
		int a = Num.or12();
		if(a==1) {
			System.out.println(n+"今のレベルで買える防具はこれだ\n\n");
			Town.choose(p);
		}else if(a==2) {
			Time.TLDB80(n+"ありがとうまた来てくれよな\n\n");
			Town.choose(p);
		}
	}


}
