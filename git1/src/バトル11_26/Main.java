package バトル11_26;

import java.util.ArrayList;

import アイテム.HpRecovery;
import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;

public class Main {

	public static void main(String[] args) {
		Player p1 = new Hero("1"); boolean a =true; p1.setType("speed");
		Player p2 = new Hero("2"); boolean b =true; p2.setType("speed");
		Player p3 = new Hero("3"); boolean c =true; p3.setType("speed");

		while(a) {
			p1.setEXP(p1.getEXP()+1);
			Level.levelCheck(p1);
			if(p1.getLevel()==90) {
				a =false;
			}
		}

		while(b) {
			p2.setEXP(p2.getEXP()+1);
			Level.levelCheck(p2);
			if(p2.getLevel()==90) {
				b =false;
			}
		}

		while(c) {
			p3.setEXP(p3.getEXP()+1);
			Level.levelCheck(p3);
			if(p3.getLevel()==90) {
				c =false;
			}
		}

		ArrayList<Player> list = new ArrayList<Player>();

		list.add(p1);
		list.add(p2);
		list.add(p3);


		for(int i=0; i<3; i++) {
			list.get(i).setHp(list.get(i).getHp()-(i+1)*361);
			System.out.println(list.get(i).getName()+" :level: "+list.get(i).getLevel()+" HP: "+list.get(i).getHp()+" MaxHP: "+list.get(i).getMaxHp());
			System.out.println();
		}

		HpRecovery.AllRecoveryAgents(list);
		for(int i=0; i<3; i++) {
			System.out.println(list.get(i).getName()+" :level: "+list.get(i).getLevel()+" HP: "+list.get(i).getHp()+" MaxHP: "+list.get(i).getMaxHp());
			System.out.println();
		}

		//933

//メインの流れ↓↓↓↓↓↓↓↓
//		StoryTutorial.tutorial(p);
//		Bank.announcement(p);
//		StoryTutorial.tutorial2(p);
//		Bank.bankAction(p);
	}
}
