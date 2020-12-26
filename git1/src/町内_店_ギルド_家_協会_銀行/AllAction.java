package 町内_店_ギルド_家_協会_銀行;

import java.util.ArrayList;

import フィールド.Cave;
import フィールド.Wilderness;
import 主人公.Player;

public class AllAction {

	public static void moveToAnother(ArrayList<Player>people){
		String [] place = {"協会","銀行","ギルド","町","荒野","洞窟","何もしない","家"};
		System.out.println("1:協会 2:銀行 3:ギルド 4:町 6:洞窟 7:何もしない 8:家");
		int Ch =new java.util.Scanner(System.in).nextInt();
		if(Ch==0 || Ch==1 || Ch==2 || Ch==3 || Ch==4 || Ch==5) {
			System.out.println("勇者は、"+place[Ch]+"へ向かった");
			switch(Ch) {
			case 0:
				Association.association(p);
				break;
			case 1:
				Bank.bankAction(p);
				break;
			case 2:
				Guild.guildFastAction(p);
				break;
			case 3:
				Town.lottery(p);
				break;
			case 4:
				Wilderness.select(p);
				break;
			case 5:
				Cave.fastAction(p);
				break;
			case 6:
				System.out.println("暇だな…");
				AllAction.moveToAnother(p);
				break;
			case 7:
				System.out.println("");
			}
		}else {

		}
	}

}
