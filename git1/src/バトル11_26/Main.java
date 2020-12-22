package バトル11_26;

import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;
public class Main {

	public static void main(String[] args) {
		Player p = new Hero("ななし");
		p.setEXP(350);
		Level.levelCheck(p);
		System.out.println(p.getLevel());
		System.out.println(p.getEXP());
		//		StoryTutorial.tutorial(p);
//		Bank.announcement(p);
//		StoryTutorial.tutorial2(p);

//		Bank.bankAction(p);
	}
}
