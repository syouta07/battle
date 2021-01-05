package 町_ギルド_家_協会_銀行;

import java.util.ArrayList;

import フィールド.Cave;
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
		Time.TLDB50(people.get(0).getName()+": [1]:討伐に行く [2]:ランクを確認する [3]:町に戻る\n");
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
		//引数はヒーローインスタンスの配列
	public static void guildFastAction(ArrayList<Player> people){
		Time.TLDB50("ギイルドボード・Fランカー案件\n");
		Time.TLDB50("----------------------------------\n");
		Time.TLDB50("[1]:荒野\t");
		Time.TLDB50("\t出現モンスター\n\t\t\t\t・スライム\n\t\t\t\t・ゴーレム\n\t\t\t\t・犬\n");
		Time.TLDB50("[2]:洞窟\t");
		Time.TLDB50("\t出現モンスター\n\t\t\t\t・スライム\n\t\t\t\t・ゴーレム\n\t\t\t\t・犬\n");
		Time.TLDB50("[3]:戻る");
		String [] monster= {"スライム","ゴーレム","犬"};
		int a = Num.or12();

		if(a==1) {
			Time.TLDB50(people.get(0).getName()+": 荒野に行きますか？\n");
			int no = Num.random3();
			Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ\n");
			int b = Num.or12();
			if(b==1) {
				int finMany = Num.random200To250();
				Time.TLDB50(people.get(0).getName()+": 討伐に向かいます!\n");
				Time.TLDB50(g+": 今回のクリア条件は"+monster[no]+"の3体の討伐だよ!\n");
				Time.TLDB50(g+": 報酬は"+finMany+"\n");
				Wilderness.selectGuild(people,monster,no,finMany);
			}else {
				greeting(people);
			}
		}else if(a==2){
			Time.TLDB50(people.get(0).getName()+": 洞窟に行きますか？\n");
			//討伐目標のモンスターをランダムで生成
			int no = Num.random3();
			Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ\n");
			int b = Num.or12();
			if(b==1) {
				int finMany = Num.random200To250();
				Time.TLDB50(people.get(0).getName()+": 討伐に向かいます!\n");
				Time.TLDB50(g+": 今回のクリア条件は"+monster[no]+"の3体の討伐です!\n");
				Time.TLDB50(g+": 成功報酬は"+finMany+"だよ!\n\n");
				Cave.action(people,monster,no,finMany);
			}else {
				greeting(people);
			}
		}else {
			greeting(people);
		}
	}


	public static void clear(ArrayList<Player> people){

	}


	//リタイヤした時に戻ってくるメソッド
	public static void Retired(ArrayList<Player> people){
		Time.TLDB50(g+"リタイヤかい?\n");
		Time.TLDB50(g+"次から失敗しないように頑張るんだよ!\n");
		comeBackGreetin(people);
	}
}