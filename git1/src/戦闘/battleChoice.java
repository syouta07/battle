package 戦闘;

import java.util.ArrayList;

import モンスター.Monster;
import 主人公.Player;
import 機能.Time;

public class battleChoice {

	static void choice(Player p ,Monster m) {														//攻撃選択
		int ac = new java.util.Random().nextInt(5);
		String [] action = {"戦う","防御する","回復する","様子を見ている","逃げようとしている"};
		switch(ac) {
		case 0:
			p.damage(m);
			break;
		case 1:
			p.heel(p);
			break;
		case 2:
			Time.TLDA50(p.getName()+"は"+m.name+"は"+action[ac]+"\n\n");
			break;
		case 3:
			Time.TLDA50(p.getName()+"は"+action[ac]+"\n\n");
			break;
		default:
			choice(p,m);
		}
	}

	static void monsterChoice(ArrayList<Player> people,Monster m,String place) {
		if(m.hp>=m.hp/2) {
			if((int)Math.random()*3/4==0){
				m.attack(people.get(),place);
			}else if((int)Math.random()*2==0) {

			}
		}

	}
	public void select(ArrayList<Player> people,String place,ArrayList<Monster> monster,int Mno) {

		int s = new java.util.Random().nextInt(4);
		int no = 0;
		if(people.size()==4) {
			no = new java.util.Random().nextInt(4);
		}else if(people.size()==3){
			no = new java.util.Random().nextInt(3);
		}else if(people.size()==2) {
			no = new java.util.Random().nextInt(2);
		}else {
			no = 1;
		}


		if(monster.get(Mno).getHp()>(monster.get(Mno).getMaxHp/2)) {
			if(s==0 || s==1) {
				attack(people,place,no);
			}else {
				poison(people, place,no);
			}
		}else {
			if(s==0 || s==1) {
				attack(people,place,no);
			}else {
				heel(people, place);
			}
		}
	}
}
