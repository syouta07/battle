package 編集用;

import java.util.ArrayList;

import 主人公.Hero;
import 主人公.Player;

public class 編集 {

	public static void main(String[] args) {
		Player p = new Hero("ななし1");
		Player a = new Hero("ななし2");
		Player b = new Hero("ななし3");
		ArrayList<Player> people = new ArrayList<Player> ();
		people.add(p);
		people.add(a);
		people.add(b);
		Friend(people);
	}
	public static void Friend(ArrayList<Player> people){
		for(int i =0; i<people.size(); i++) {
			System.out.print("["+(i+1)+"]:"+people.get(i).getName());
		}
		
	}
}
