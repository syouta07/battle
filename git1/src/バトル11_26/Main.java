package バトル11_26;

import java.util.ArrayList;

import 主人公.Hero;
import 主人公.Player;
import 店.Goods;

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
		Goods.goods1(people);;
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
