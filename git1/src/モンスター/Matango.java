package モンスター;

import java.util.ArrayList;

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

	public void action(ArrayList<Player> people,String place){
		String [] action = {"様子をうかがっている","急に襲ってきた","眠っている"};
		int mata= new java.util.Random().nextInt(4);
		String comment= "キノコが現れたキノコ"+action[mata];

		switch(mata) {
		case 0:
			Time.TLDA50(comment+"は"+action[0]+"\n\n");
			break;
		case 1:
			Time.TLDA50(comment+"が"+action[1]+"\n\n");
			attack(people,place);
			break;
		case 2:
			Time.TLDA50(comment+"が"+action[2]+"\n\n");
			break;
		}
	}

//******//
//** 攻撃を受けた際主人公のHPを削る方法 ****//

	public void attack(ArrayList<Player> people,String place,int no){
		//攻撃力をランダム生成
		int at=new java.util.Random().nextInt(9)+2;
		
		//モンスターの攻撃を受けたキャラの体力を削る
		people.get(no).setHp(people.get(no).getHp() - at);
		Time.TLDA50(this.name+":"+people.get(no).getName()+"に"+at+"ダメージ与えた");
		if(people.get(no).getHp()>0) {
			attack(people,place);
		}else {
			people.get(0).die(people,place);
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

	public void poison(ArrayList<Player> people,String place, int no) {
		people.get(no).setHp(people.get(no).getHp() - 2);
		Time.TLDA80(this.name+"の毒で2ポイントダメージを受け残りHP:"+people.get(no).getHp());
	}

	public void die(ArrayList<Player> people,Monster m) {
		Time.TLDA50(m.name+"は力尽きた\n");
		for(int i=0; i<people.size(); i++) {
			Time.TLDA50(people.get(i).getName()+"は"+(m.getEXP()/people.size())+"得た‼‼"+people.get(i).getLevel());
		}


	}

	


	private void run() {
		Time.TLDA50(this.name+"は逃げ出した。");
	}


}
