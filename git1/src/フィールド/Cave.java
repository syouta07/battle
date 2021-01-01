package フィールド;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 町_ギルド_家_協会_銀行.Guild;

public class Cave {

						//ギルドから洞窟に来た

	public static void fastAction(ArrayList<Player>people) {
		action(people);
		int a = Num.or1234();
		if(a==1) {
			System.out.println("何もないようだ");
			fastAction(people);
		}else if(a==2){
			System.out.println("何もないようだ");
			fastAction(people);
		}else if(a==3) {
			System.out.println("何もないようだ");
			fastAction(people);
		}else if (a==4) {
			System.out.println("ギルドに戻ります");
			Guild.comeBackGreetin(people);
		}
	}


	public static void action(ArrayList<Player>people) {
		System.out.println("洞窟についた");
		System.out.println("さて何をしようか");
		System.out.println("1:うろうろする 2:薬草を探す 3:モンスターを探す 4:戻る");

	}

	}
