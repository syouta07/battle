package バトル11_26;

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

	static void monsterChoice(Player p,Monster m,String place) {
		if(m.hp>=m.hp/2) {
			if((int)Math.random()*3/4==0){
				m.attack(p,place);
			}else if((int)Math.random()*2==0) {

			}
		}

	}
}
