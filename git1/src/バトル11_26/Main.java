package バトル11_26;

import java.util.ArrayList;

import 主人公.Hero;
import 主人公.Player;
import 町_ギルド_家_協会_銀行.AllAction;

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
		
//メインの流れ↓↓↓↓↓↓↓↓
//		StoryTutorial.tutoria
		AllAction.moveToAnother(people);
//		Bank.announcement(p);
//		StoryTutorial.tutorial2(p);
//		Bank.bankAction(p);
	}
}
