package 町内_店_ギルド_家_協会_銀行;

import フィールド.Wilderness;
import 主人公.Player;

public class Guild {			//ギルド商会
							/*ヒーローランクの定義*/


	public static void greeting(Player p){
		System.out.println("何の用だい？");
		System.out.println("1:討伐に行く 2:ランクを確認する 3:討伐報酬を確認する 4:戻る");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			guildFastAction(p);
		}else if(a==1) {
			System.out.println("あんたのランクはまだ~~ランクだよ");	/*勇者のランク生成*/
			greeting(p);
		}else if(a==2){
			back();

		}
	}
	public static void comeBackGreetin(){
		System.out.println("クエストはどうだった？");
		System.out.println("さて何をしていくかい？");
	}
				//*モンスター討伐選択作成スライム、ゴーレム、犬*//

	public static void guildFastAction(Player p){
				System.out.println("ギイルドボード・Fランカー案件");
				System.out.println("----------------------------------");
				System.out.println("1:スライム\n2:ゴーレム\n3:犬\n4:戻る");
				String [] no= {"スライム","ゴーレム","犬"};
				int a = new java.util.Scanner(System.in).nextInt()-1;
				System.out.println(no[a]+"を討伐しに行きますか？");
				System.out.println("1:はい 2:いいえ");
				int b = new java.util.Scanner(System.in).nextInt()-1;

				if(b==1 && a==0 || a==1 ||a==2) {
					System.out.println(no[a]+"を討伐に行きます");
					Wilderness.selectGuild(p);

				}else if(a==3){
					greeting(p);
				}else {
					guildFastAction(p);
				}
	}
	public static void reward(Player p){
		System.out.println("討伐報酬の確認だねちょっと待ちな");

		System.out.println("ほらよ");
		System.out.println("なんの報酬が見たいんだい？");
		System.out.println("1:スライム\n2:ゴーレム\n3:犬\n4:戻る");
		String [] no= {"スライム","ゴーレム","犬","戻る"};
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if(a==0 || a==1 || a==2) {
			System.out.println(no[a]+"はこれだよ。ほかに用はあるかい");
			greeting(p);
		}else {
			greeting(p);
		}
	}
	public static void back(){

	}


}