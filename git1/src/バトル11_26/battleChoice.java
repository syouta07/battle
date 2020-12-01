package バトル11_26;

public class battleChoice {

	static void choice(Player p ,Monster m) {														//攻撃選択
		System.out.println("敵が現れた‼ 1:戦う 2:回復する 3:様子を見る 3:逃げる");//	行動の選択
		int ac = new java.util.Scanner(System.in).nextInt()-1;
		String [] action = {"戦う","防御する","回復する","様子を見る","逃げる"};
		switch(ac) {
		case 0:
			p.damage(m);
			break;
		case 1:
			p.heel(p);
			break;
		case 2:
			Time.TLDA50(p.name+"は"+m.name+"の様子をうかがっている\n\n");
			break;
		case 3:
			Time.TLDA50(p.name+"は逃走を試みた\n\n");
			break;
		default:
			choice(p,m);
		}
	}

	static void monsterChoice(Player p,Monster m) {
		int r = new java.util.Random().nextInt();
		if(m.hp>=m.hp/2) {
			if((int)Math.random()*3/4==0){
				m.attack(p);
			}else if((int)Math.random()*2==0) {

			}
		}

	}
}
