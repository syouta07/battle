package モンスター;

import バトル11_26.Time;
import 主人公.Hero;
import 主人公.Player;

public class Matango extends Monster {
	int damage = new java.util.Random().nextInt(9)+4;
	int heel = new java.util.Random().nextInt(3)+4;
	String name;
	int hp = 30; int MaxHp = 30;
	int mp = 10; int MaxMp = 10;

	public Hero action(Hero h){
		String [] action = {"様子をうかがっている","急に襲ってきた","眠っている"};
		int mata= new java.util.Random().nextInt(4);
		String comment= "キノコが現れたキノコ"+action[mata];

		switch(mata) {
		case 0:
			Time.TLDA50(comment+"は"+action[0]+"\n\n");
			break;
		case 1:
			Time.TLDA50(comment+"が"+action[1]+"\n\n");
			attack1(h);
			break;
		case 2:
			Time.TLDA50(comment+"が"+action[2]+"\n\n");
			break;
		}
		return h;
	}


	public Hero attack1(Hero h){
		int at=new java.util.Random().nextInt(9)+2;
		h.setHp(h.getHp() - at);
		Time.TLDA50(this.name+"は"+h.getName()+"に"+at+"ダメージ与えた");
		if(h.getHp()>0) {
			attack1(h);
		}else {
			Player.die(h);
		}
		return h;
	}


	public Matango heel(Matango a) {
		Time.TLDA50(this.name+"はヒールを使った。\n\n");
		if(this.hp==this.MaxHp || this.mp<0) {
			Time.TLDA50("何も起こらなかった。\n\n");
		}else if(heel+this.hp>=this.MaxHp) {
			this.mp -=2;
			this.hp = this.MaxHp;
			Time.TLDA50(this.name+"は"+(this.MaxHp-this.hp)+"回復し,HP"+this.hp+",MP"+this.mp+"。\n\n");
		}else {
			Time.TLDA50(this.name+"は"+this.heel+"回復し,HP"+this.hp+",MP"+this.mp+"になった。");
		}
		return a;
	}

	public void poison(Player h) {
		h.setHp(h.getHp() - 2);
		Time.TLDA80(this.name+"の毒で2ポイントダメージを受け残り"+h.getHp());
	}


	public void die(Matango a) {
		Time.TLDA50(this.name+"は力尽きた");
	}

	public void select(Monster m) {
		int s = new java.util.Random().nextInt(4);
		if(m.hp>(m.hp/2)) {
			if(s==0 || s==1) {
//				attack1();
			}
		}
	}


	private void run() {
		Time.TLDA50(this.name+"は逃げ出した。");
	}
}
