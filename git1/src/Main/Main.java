package Main;

import java.util.ArrayList;

import モンスター.Matango;
import モンスター.Monster;
import 主人公.Hero;
import 主人公.Player;
import 町_ギルド_家_協会_銀行.Guild;

public class Main {

	public static void main(String[] args) {
		Player p = new Hero("石原");
		Player a = new Hero("原田");
		Player b = new Hero("花田");
		ArrayList<Player> people = new ArrayList<Player> ();
		people.add(p);
		people.add(a);
		people.add(b);
		people.get(2).setHp(people.get(2).getHp()-100);
		people.get(1).setHp(people.get(1).getHp()-100);
		people.get(0).setAbnormal("毒");

		ArrayList<Monster> MonsterList =new ArrayList<Monster>();

		for(int i=0; i<4; i++) {
			Monster m = new Matango("naem"+i);
			MonsterList.add(m);
		}

		for(int i=0; i<4; i++) {
			System.out.println(MonsterList.get(i).getName());
		}

		Guild.guildFastAction(people);
//		Goods.goods1(people);
//		町_ギルド_家_協会_銀行.Home.Friend.add(a);
//		Home.Action(people);

//メインの流れ↓↓↓↓↓↓↓↓
//		StoryTutorial.tutoria
//		AllAction.moveToAnother(people);
//		Bank.announcement(p);
//		StoryTutorial.tutorial2(p);
//		Bank.bankAction(p);
	}
}
