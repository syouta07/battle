package バトル11_26;

import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;

public class Main {

	public static void main(String[] args) {
		Player p = new Hero("ななし");
		boolean a =true;
		p.setType("speed");
		p.setEXP(0);
		while(a) {
			p.setEXP(p.getEXP()+1);
			Level.levelCheck(p);
			if(p.getLevel()==90) {
				a =false;
			}
		}

		System.out.println("level: "+p.getLevel()+" hp: "+p.getHp()+" maxhp: "+p.getMaxHp());
		p.setHp(p.getHp()-500);//833
		System.out.println(p.getHp());
		Item.highRecoveryAgents(p);


		//933

//メインの流れ↓↓↓↓↓↓↓↓
//		StoryTutorial.tutorial(p);
//		Bank.announcement(p);
//		StoryTutorial.tutorial2(p);
//		Bank.bankAction(p);
	}
}
