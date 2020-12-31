package フィールド;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 町_ギルド_家_協会_銀行.AllAction;
import 町_ギルド_家_協会_銀行.Guild;

public class Wilderness {		/*ギルド以外から来た時の
											帰り方の設定がまだ*/


				//ギルドから来た場合

	public static void select(ArrayList<Player>people){
		System.out.println("荒野についた");
		System.out.println("さて何をしようか");
		System.out.println("1:うろうろする 2:薬草を探す 3:モンスターを探す 4:戻る");
		int a = Num.or1234();
		if(a==1) {
			System.out.println("何もないようだ");
			select(people);
		}else if(a==2){
			System.out.println("何もないようだ");
			select(people);
		}else if(a==3) {
			System.out.println("何もないようだ");
			select(people);
		}else if (a==4) {
			System.out.println("ギルドに戻ります");
			Guild.comeBackGreetin(people);
		}
	}

				//ギルド以外から荒野に来た時


	public static void selectGuild(ArrayList<Player>people){
		System.out.println("荒野についた");
		System.out.println("さて何をしようか");
		System.out.println("1:うろうろする 2:薬草を探す 3:モンスターを探す 4:戻る");
		int a = Num.or1234();
		if(a==1) {
			System.out.println("何もないようだ");
			select(people);
		}else if(a==2){
			System.out.println("何もないようだ");
			select(people);
		}else if(a==3) {
			System.out.println("何もないようだ");
			select(people);
		}else if (a==4) {
			System.out.println("ギルドに戻ります");
			AllAction.moveToAnother(people);
		}
	}

}
