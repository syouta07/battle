package モンスター;

import 主人公.Player;
import 機能.Time;

public class Matango extends Monster {
	int damage = new java.util.Random().nextInt(9)+4;
	int heel = new java.util.Random().nextInt(3)+4;
	String name;
	int EXP=10;
	int hp = 30; int MaxHp = 30;
	int mp = 10; int MaxMp = 10;

	//** EXP **//
	public int getEXP() {
		return this.EXP;
	}
	public void setEXP(int exp) {
		this.EXP = exp;
	}

	public Player action(Player p,String place){
		String [] action = {"様子をうかがっている","急に襲ってきた","眠っている"};
		int mata= new java.util.Random().nextInt(4);
		String comment= "キノコが現れたキノコ"+action[mata];

		switch(mata) {
		case 0:
			Time.TLDA50(comment+"は"+action[0]+"\n\n");
			break;
		case 1:
			Time.TLDA50(comment+"が"+action[1]+"\n\n");
			attack(p,place);
			break;
		case 2:
			Time.TLDA50(comment+"が"+action[2]+"\n\n");
			break;
		}
		return p;
	}


	public void attack(Player p,String place){
		int at=new java.util.Random().nextInt(9)+2;
		p.setHp(p.getHp() - at);
		Time.TLDA50(this.name+"は"+p.getName()+"に"+at+"ダメージ与えた");
		if(p.getHp()>0) {
			attack(p,place);
		}else {
			p.die(p,place);
		}
	}


	public void heel(Monster a) {
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
	}

	public void poison(Player h,String place) {
		h.setHp(h.getHp() - 2);
		Time.TLDA80(this.name+"の毒で2ポイントダメージを受け残り"+h.getHp());
	}

	@Override
	public void die(Player p,Monster m) {
		Time.TLDA50(m.name+"は力尽きた\n");
		Time.TLDA50(p.getName()+"は"+m.getEXP()+"得た‼‼"+p.getLevel()+1);

	}

	public void select(Player p,String place) {
		int s = new java.util.Random().nextInt(4);
		if(this.hp>(this.MaxHp/2)) {
			if(s==0 || s==1) {
				attack(p,place);
			}else {
				poison(p, place);
			}
		}
	}

	private void run() {
		Time.TLDA50(this.name+"は逃げ出した。");
	}







}
