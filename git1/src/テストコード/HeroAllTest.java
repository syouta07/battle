package テストコード;

import 主人公.Hero;
import 主人公.Player;

public class HeroAllTest {

	public static void main(String[] args) {
		Player p = new Hero("ななし");
		boolean a = true;
		p.setType("speed");

		//**レベルが上がったときとその前の検査を行える**//
		//** level EXP Damege HP **//
		do{
			p.setEXP(p.getEXP()+1);
			主人公.Level.levelCheck(p);

			if(p.getLevel()<10 && (p.getEXP()%25==24 || p.getEXP()%25==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()==5 && p.getEXP()%25==0) {
					System.out.println();
				}
			}else if(10<=p.getLevel() && p.getLevel()<20 && ((p.getEXP()-225)%50==49 || (p.getEXP()-225)%50==0)){
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-225)%50==0) {
					System.out.println();
				}
			}else if(20<=p.getLevel() && p.getLevel()<30 && ((p.getEXP()-725)%75==74 || (p.getEXP()-725)%75==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-725)%75==0) {
					System.out.println();
				}
			}else if(30<=p.getLevel() && p.getLevel()<40 && ((p.getEXP()-1475)%100==99 || (p.getEXP()-1475)%100==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-1475)%100==0) {
					System.out.println();
				}
			}else if(40<=p.getLevel() && p.getLevel()<50 && ((p.getEXP()-2475)%125==124 || (p.getEXP()-2475)%125==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-2475)%125==0) {
					System.out.println();
				}
			}else if(50<=p.getLevel() && p.getLevel()<60 && ((p.getEXP()-3725)%150==149 || (p.getEXP()-3725)%150==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-3725)%150==0) {
					System.out.println();
				}
			}else if(60<=p.getLevel() && p.getLevel()<70 && ((p.getEXP()-5225)%175==24 || (p.getEXP()-5225)%175==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-5225)%175==0) {
					System.out.println();
				}
			}else if(70<=p.getLevel() && p.getLevel()<80 && ((p.getEXP()-6975)%200==199 || (p.getEXP()-6975)%200==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-6975)%200==0) {
					System.out.println();
				}
			}else if(80<=p.getLevel() && p.getLevel()<90 && ((p.getEXP()-8975)%225==224 || (p.getEXP()-8975)%225==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-8975)%225==0) {
					System.out.println();
				}
			}else if(90<=p.getLevel() && p.getLevel()<=100 && ((p.getEXP()-11225)%250==249 || (p.getEXP()-11225)%250==0)) {
				System.out.println("level: "+p.getLevel()+"  EXP: "+p.getEXP()+" damage: "+p.getDamage()+" HP: "+p.getHp());
				if(p.getLevel()%5==0 && (p.getEXP()-11225)%250==0) {
					System.out.println();
				}
			}
			if(p.getLevel()==100) {
				a = false;
			}

		}while(a);
	}

}
