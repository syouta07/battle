package 町_ギルド_家_協会_銀行;

import java.util.ArrayList;

import フィールド.Wilderness;
import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Guild {			//ギルド商会
							/*ヒーローランクの定義*/
	static String g = "ギルド: ";
	public static void fastGreeting(ArrayList<Player> people){
		Time.TLDB50(g+"こんにちは!\n");
		greeting(people);
	}

	public static void greeting(ArrayList<Player> people){
		Time.TLDB50(people.get(0).getName()+": [1]:討伐に行く [2]:ランクを確認する [3]:町に戻る");
		int a = Num.or1234();
		if(a==1) {
			guildFastAction(people);
		}else if(a==2) {
			char ch = rank(people);
			/*勇者のランク判定*/
			Time.TLDB50(g+"あんたのランクはまだ"+ch+"ランクだよ!\n");
			greeting(people);
		}else {
			Time.TLDB50(people.get(0).getName()+": 町に戻ろう！\n");
			AllAction.moveToAnother(people);
		}
	}

	//チームの中で一番高いキャラを判定する
	public static char rank(ArrayList<Player> people){
		char ch ='F';
		int a = 0;
		for(int i = 0; i<people.size(); i++) {
			if(people.get(i).getLevel()>=a) {
				a = people.get(i).getLevel();
				ch = people.get(i).getRank();
			}
		}
		return ch;
	}

	public static void comeBackGreetin(ArrayList<Player> people){
		Time.TLDB50(g+"クエストお疲れ様!\n");
		Time.TLDB50(g+"次は何をするかい？\n");
		greeting(people);

	}


		//*モンスター討伐選択作成スライム、ゴーレム、犬*//

	public static void guildFastAction(ArrayList<Player> people){
		Time.TLDB50("ギイルドボード・Fランカー案件");
		Time.TLDB50("----------------------------------");
		Time.TLDB50("[1]:スライム\t[2]:ゴーレム\t[3]:犬\t[4]:戻る");
				String [] no= {"スライム","ゴーレム","犬"};
				int a = Num.or1234();
				System.out.println(no[a-1]+"を討伐しに行きますか？");
				System.out.println(people.get(0).getName()+": [1]:はい [2]:いいえ");
				int b = Num.or12();

				if(a==1) {
					System.out.println(no[a-1]+"を討伐に行きます");
					Wilderness.selectGuild(people);

				}else if(a==3){
					greeting(people);
				}else {
					guildFastAction(people);
				}
	}
//	public static void reward(ArrayList<Player> people){
//		Time.TLDB50("討伐報酬の確認だねちょっと待ちな\n");
//
//		Time.TLDB50("なんの報酬が見たいんだい？");
//		Time.TLDB50("1:スライム\n2:ゴーレム\n3:犬\n4:戻る");
//
//		//ギルドの挨拶のところに戻る
//		greeting(people);
//	}
}