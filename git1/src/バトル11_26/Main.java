package バトル11_26;

import チュートリアル.StoryTutorial;
import 主人公.Hero;
import 主人公.Player;
public class Main {

	public static void main(String[] args) {

		Player p = new Hero("ななし");
		p.setEXP(100);
		
//		主人公.Level.levelCheck(p);
//		System.out.println("level:"+p.get
//		Level();
//		System.out.println("EXP:"+p.getEXP());
		StoryTutorial.tutorial(p);
//		Bank.bankAction(p);
//		Bank.fast(p);
	}
}
