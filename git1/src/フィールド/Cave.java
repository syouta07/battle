package フィールド;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;
import 町_ギルド_家_協会_銀行.Guild;

public class Cave {
static String [] monsterList;
static String name;
						//ギルドから洞窟に来た

	public static void fastAction(ArrayList<Player>people,String [] monster,int no,int finMany) {
		int a = Num.or1234();
		if(a==1) {
			System.out.println("何もないようだ");
			fastAction(people,monster,no,finMany);
		}else if(a==2){
			System.out.println("何もないようだ");
			fastAction(people,monster,no,finMany);
		}else if(a==3) {
			System.out.println("何もないようだ");
			Guild.Retired(people);
		}
	}


	public static void action(ArrayList<Player>people,String [] monster,int no,int finMany) {
		name= people.get(0).getName()+":";
		monsterList = monster;
		Time.TLDB50(name+"洞窟についた\n");
		Time.TLDB50(name+"さて何をしようか\n\n");
		Time.TLDB50(name+"[1]:薬草を探す [2]:モンスターを探す [3]:リタイア\n");
		fastAction(people,monster,no,finMany);

	}

	}
