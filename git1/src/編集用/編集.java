package 編集用;

import 主人公.Hero;
import 主人公.Player;

public class 編集 {

	public static void main(String[] args) {
		Player p = new Hero("ななし");
		boolean a = true;

		p.setType("power");


		do {
			p.setEXP(p.getEXP()+1);
			主人公.Level.levelCheck(p);

			if(p.getLevel()==1&& p.getEXP()==1) {
				System.out.println("level: "+p.getLevel()+" HP: "+p.getHp());

			}else if(p.getLevel()<10 &&  p.getEXP()%25==0) {
				if(p.getLevel()==12) {
					System.out.println("1");
				}
				System.out.println("level: "+p.getLevel()+" HP: "+p.getHp());

				if(p.getLevel()==5 && p.getEXP()%25==0) {
					System.out.println();
				}

			}else if(p.getLevel()<20 && (p.getEXP()-225)%50==0) {
				if(p.getLevel()==12) {
					System.out.println("2");
				}
				System.out.println("level: "+p.getLevel()+" HP: "+p.getHp());

				if(p.getLevel()%5==0 && (p.getEXP()-225)%50==0) {
					System.out.println();
				}

				
				
			}else if(p.getLevel()<30 && (p.getEXP()-725)%75==0) {
				if(p.getLevel()==12) {
					System.out.println("3");
				}
				System.out.println("level: "+p.getLevel()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-725)%75==0) {
					System.out.println();
				}
			}
		}while(a);

	}

}
