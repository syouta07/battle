package フィールド;

import 主人公.Player;
import 町内_店_ギルド_家_協会_銀行.AllAction;
import 町内_店_ギルド_家_協会_銀行.Guild;

public class Cave {

						//ギルドから洞窟に来た

	public static void fastAction(Player p) {
		action(p);
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			System.out.println("何もないようだ");
			fastAction(p);
		}else if(a==1){
			System.out.println("何もないようだ");
			fastAction(p);
		}else if(a==2) {
			System.out.println("何もないようだ");
			fastAction(p);
		}else if (a==3) {
			System.out.println("ギルドに戻ります");
			Guild.comeBackGreetin();
		}
	}

					//ギルド以外から洞窟に来た時


	public static void selectGuild(Player p) {
		action(p);
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			System.out.println("何もないようだ");
			fastAction(p);
		}else if(a==1){
			System.out.println("何もないようだ");
			fastAction(p);
		}else if(a==2) {
			System.out.println("何もないようだ");
			fastAction(p);
		}else if (a==3) {
			AllAction.moveToAnother(p);
		}
	}
	public static void action(Player p) {
		System.out.println("洞窟についた");
		System.out.println("さて何をしようか");
		System.out.println("1:うろうろする 2:薬草を探す 3:モンスターを探す 4:戻る");

	}

	}
