package バトル11_26;

import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;

public class Main {

	public static void main(String[] args) {
		Player p = new Hero("ななし");
		boolean a =true;
		p.setAbnormal("毒");
		p.setType("speed");

		while(a) {
			p.setEXP(p.getEXP()+1);
			Level.levelCheck(p);
			if(p.getLevel()==90) {
				a =false;
			}
		}
		System.out.println("level: "+p.getLevel()+" hp: "+p.getHp()+" maxhp: "+p.getMaxHp());
		System.out.println();
		while(p.getAbnormal().equals("毒")) {
			p.setHp(p.getHp()-500);

			Item.normalDetoxification(p);
		}



		System.out.println("level: "+p.getLevel()+" hp: "+p.getHp()+" maxhp: "+p.getMaxHp());



		//933

//メインの流れ↓↓↓↓↓↓↓↓
//		StoryTutorial.tutorial(p);
//		Bank.announcement(p);
//		StoryTutorial.tutorial2(p);
//		Bank.bankAction(p);
	}
}
