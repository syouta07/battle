package バトル11_26;

public class AllAction {

	public static void moveToAnother(){
		String [] place = {"協会","銀行","ギルド","町","荒野","洞窟","何もしない","家"};
		System.out.print("どこに行こうかな > ");
		System.out.println("1:協会 2:銀行 3:ギルド 4:町 5:旅 6:洞窟 7:何もしない 8:家");
		int Ch =new java.util.Scanner(System.in).nextInt()-1;
		if(Ch==0 || Ch==1 || Ch==2 || Ch==3 || Ch==4 || Ch==5) {
			System.out.println("勇者は、"+place[Ch]+"へ向かった");
			switch(Ch) {
			case 0:
				Place.association();
				break;
			case 1:
				Bank.bankAction();
				break;
			case 2:
				Guild.guildFastAction();
				break;
			case 3:
				Town.lottery();
				break;
			case 4:
				Wilderness.select();
				break;
			case 5:
				Cave.fastAction();
				break;
			case 6:
				System.out.println("暇だな…");
				AllAction.moveToAnother();
				break;
			case 7:
				System.out.println("");
			}
		}else {

		}
	}

}
