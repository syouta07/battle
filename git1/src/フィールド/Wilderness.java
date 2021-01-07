package フィールド;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;
import 町_ギルド_家_協会_銀行.Guild;

public class Wilderness {
	//[1]:スライム\t[2]:ゴーレム\t[3]:犬
	private static int killCount=0;
	static String [] monsterList;
	static String name;

	//薬草の最大獲得数を判定するための変数
	static int HerbsSearch=0;

	//ギルドから最初に呼び出すメソッド
	public static void fast(ArrayList<Player>people,String [] monster,int no){
		Time.TLDB50(name+"荒野についた!\n");
		select(people,monster,no);
	}


	//引数で主人公のパーティーをArrayLisstで受け取り,Guildで作成したモンスターリスト(String)を更新
	//intで討伐するモンスターの番号を受け取る
	public static void select(ArrayList<Player>people,String [] monster,int no){
		monsterList = monster;

			//生きているキャラクターの名前を表示する
		nameAlive(people);


		Time.TLDB50(name+"さて何をしようか\n");
		Time.TLDB50("[1]:素材を探す [2]:モンスターを探す [3]:リタイヤ\n");

			//入力を受け取る
		int a = Num.or123();

			//1を選択すると薬草を探しに行く
		if(a==1) {
			//ランダムで数を生成
			int b=Num.random3();

			HerbsSearch(people,b);//ランダムで生成した数を引数として渡す

			//荒野の選択に戻る
			select(people,monster,no);

			//討伐目的のモンスターを探す
		}else if(a==2){
			int b=Num.random3();
			if(b>=1) {
				hantMonster(people);
			}else {
				System.out.println("何もないようだ\n");
			}
				//荒野の選択に戻る
			select(people,monster,no);

			//リタイヤをする
		}else if(a==3) {
			Guild.comeBackGreetin(people);
		}
	}

	public static void hantMonster(ArrayList<Player>people){

	}

		//先頭のキャラクターが死亡した場合生きているメンバーの名前を表示する
	public static void nameAlive(ArrayList<Player>people){
			//1人目が生きている場合
		if(people.get(0).getLevel()>=1) {
			name= people.get(0).getName()+":";
			//2人目が生きている場合
		}else if(people.get(1).getLevel()>=1) {
			name= people.get(1).getName()+":";
			//3人目が生きている場合
		}else if(people.get(2).getLevel()>=1) {
			name= people.get(2).getName()+":";
			//4人目だけが生きている場合
		}else if(people.get(3).getLevel()>=1) {
			name= people.get(3).getName()+":";
		}
	}


	//ランダムで生成した数字を引数で受け取る採取確率66％
	//最大採取5回
	public static void HerbsSearch(ArrayList<Player>people,int a){

		//もしaが0だった場合薬草を1つ追加
		if(a==0 && HerbsSearch<=5) {
			Time.TLDB50(name+"薬草を見つけた!\n");
			Time.TLDB50(name+"薬草を採取しますか？\n");
			int b=Num.or12();
			if(b>=1) {
				//薬草の所持数上限99より少ない場合のみ追加
				if(Player.itemMany[0]<99) {
					Player.itemMany[0]+=1;
					//所持数と増加後の所持数を表示
					Time.TLDB50(name+"薬草を採取した!"+(Player.itemMany[0]-1)+"→"+Player.itemMany[0]+"\n");
					HerbsSearch++;
				}else {
					Time.TLDB50(name+"これ以上は所持できない用だ....\n\n");
					HerbsSearch++;
				}
			}else {
				Time.TLDB50(name+"何も見当たらなかった.....\n\n");
			}

		//0以外は何も起こらない
		}else {
			Time.TLDB50(name+"何も見当たらなかった.....\n\n");
		}
		if(HerbsSearch<=5) {
			Time.TLDB50(name+"これ以上は何もないようだ.....\n\n");
		}
	}
}
