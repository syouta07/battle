package バトル11_26;

import java.util.ArrayList;

import 主人公.Hero;
import 主人公.Player;
import 町_ギルド_家_協会_銀行.Home;

public class Main {

	public static void main(String[] args) {
		Player p = new Hero("ななし1");
		Player a = new Hero("ななし2");
		Player b = new Hero("ななし3");
		ArrayList<Player> people = new ArrayList<Player> ();
		people.add(p);
		people.add(a);
		people.add(b);
		people.get(2).setHp(people.get(2).getHp()-100);
		people.get(1).setHp(people.get(1).getHp()-100);
		people.get(0).setAbnormal("毒");
		町_ギルド_家_協会_銀行.Home.setItemMany(0,10);
		町_ギルド_家_協会_銀行.Home.setItemMany(1,9);
		町_ギルド_家_協会_銀行.Home.setItemMany(2,0);
		町_ギルド_家_協会_銀行.Home.setItemMany(3,7);
		町_ギルド_家_協会_銀行.Home.setItemMany(4,6);
		町_ギルド_家_協会_銀行.Home.setItemMany(5,5);
		町_ギルド_家_協会_銀行.Home.setItemMany(6,4);
		町_ギルド_家_協会_銀行.Home.setItemMany(7,3);
		町_ギルド_家_協会_銀行.Home.setItemMany(8,2);
		町_ギルド_家_協会_銀行.Home.setItemMany(9,0);
		町_ギルド_家_協会_銀行.Home.setItemMany(10,11);
		Home.Action(people);

//メインの流れ↓↓↓↓↓↓↓↓
//		StoryTutorial.tutoria
//		AllAction.moveToAnother(people);
//		Bank.announcement(p);
//		StoryTutorial.tutorial2(p);
//		Bank.bankAction(p);
	}
}
