package 主人公;

import モンスター.Monster;
import 機能.Time;

public class Hero extends Player{
	private int hp;    private int mp;
	private int maxHp; private int maxMp;
	private int level; private int hpMax;
	private int EXP;
	int maxLevel = 99;
	private String name;



	public Hero(String name) {
		this.name = name;
		this.hp=100;
		this.mp=10;
		this.setLevel(1);
	}

	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name=name;
	}

	public int getHpMax() {
		return this.hpMax;
	}

	public void setHpMax(int hpMax) {
		this.hpMax = this.hpMax;
	}

	public int getEXP() {
		return this.EXP;
	}

	public void setEXP(int exp) {
		this.EXP = exp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}


	//**////**////**////**////**////**////**////**////**//
	//**//    	    								//**//
	//**//			  名前を決めるメゾット		    //**//
	//**//											//**//
	//**////**////**////**////**////**////**////**////**//


	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	//** MaxHpの取得**//
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	//** mpの取得 **//
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	//** maxMpの取得 **//
	public int getMaxMp() {
		return maxMp;
	}
	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	//**////**////**////**////**////**////**////**////**//
	//**//    	    								//**//
	//**//		ノーマル攻撃判定クリーンヒット2%	//**//
	//**//											//**//
	//**////**////**////**////**////**////**////**////**//

	public Monster damage(Monster m) {
		for (int i=0; i<1; i++) {
		int no = new java.util.Random().nextInt(5)+2;
		m.hp -= no;
		Time.TLDA80(this.name+"は"+m.name+"に"+no+"を与えた\n\n",this.getName()+"の残りHPは"+this.getHp()+"\n\n");
		}
		return m;
	}

			/*逃げられる確率*/

	public void run() {
		int probability1 = new java.util.Random().nextInt(3);
		int probability2 = new java.util.Random().nextInt(3);
		if(probability1==probability2) {
			Time.TLDA80(this.name+"は逃げ切れた！");
		}else {
		Time.TLDA80("逃げ切れなかった");///***///バトルに引き戻される場合
		}
	}


	//**////**////**////**////**////**////**////**////**//
	//**//    	    								//**//
	//**//			  主人公が死んだとき		    //**//
	//**//											//**//
	//**////**////**////**////**////**////**////**////**//

	public void die(Player p) {
		Time.TLDA50(this.name+"のHPがなくなった");
		Time.TLDA100("・・・・・\n\n");
		Time.TLDA50("ゲームオーバー");
	}

	//**////**////**////**////**////**////**////**////**//
	//**//    	    								//**//
	//**//			  	   回復魔法 		 	    //**//
	//**//											//**//
	//**////**////**////**////**////**////**////**////**//

	@Override
	public Player heel(Player p) {
		if(this.hp+this.hp/10<this.maxHp) {
			this.hp+=this.hp+this.hp/10;
			Time.TLDA50(this.name+"は、"+this.hp+"まで回復した‼");
		}else {
			this.hp+=this.maxHp;
			Time.TLDA50(this.name+"は、"+this.hp+"まで回復した‼");
		}
		return p;
	}








}
