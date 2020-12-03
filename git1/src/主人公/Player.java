package 主人公;

import バトル11_26.Time;
import モンスター.Monster;

public abstract class  Player {			//勇者アカウント
						//**//戦う{素手、剣、槍、銃}
						//**//防御{素手、盾}
						//**//回復{眠る、魔法}
						//**//アイテム{回復薬、薬、解毒薬}
	protected String name;
	public int many;
	private int hp;    int mp;
	int maxHp; int maxMp;
	int damage;			boolean abnormalPoison;
	int hit; int level=1;
	int EXP; int speed;
	int maxLevel = 99;
	String job;


	//**名前を決める際に使用**//

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//** hpの取得 **//

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



	public void PoisonAbnormal() {
		this.abnormalPoison = true;
		Time.TLDA80("毒におかされている\n\n");

	}

	public void PoisonHeal() {
		this.abnormalPoison = false;
		Time.TLDA80("毒状態から回復した‼\n\n");

	}



			//**////**////**////**////**////**////**////**////**//
			//**//    	    								//**//
			//**//		ノーマル攻撃判定クリーンヒット2%	//**//
			//**//											//**//
			//**////**////**////**////**////**////**////**////**//
	public void damage(Monster m) {
		for (int i=0; i<1; i++) {
		int no = new java.util.Random().nextInt(5)+2;
		m.hp -= no;
		Time.TLDA80(this.getName()+"は"+this.getName()+"に"+no+"を与えた\n\n",this.getName()+"の残りHPは"+this.getHp()+"\n\n");
		}
	}



	public Hero sleep(Hero h) {
		h.setHp(h.getHp() + this.getHp() * (2/3));
		Time.TLDA80(this.getName()+"は眠った。HPが"+h.getHp()+"になった");
		return h;
	}
		//**////**////**////**////**////**////**////**////**//
		//**//    	    								//**//
		//**//		       逃げる場合確率16%			//**//
		//**//											//**//
		//**////**////**////**////**////**////**////**////**//

	public void run() {
		int probability1 = new java.util.Random().nextInt(3);
		int probability2 = new java.util.Random().nextInt(3);
		if(probability1==probability2) {
			Time.TLDA80(this.getName()+"は逃げ切れた！");
		}else {
		Time.TLDA80("逃げ切れなかった");///***///バトルに引き戻される場合
		}
	}


	public void heel(Player p) {

	}

	public static Player die(Player p) {
		Time.TLDA50(p.getName()+"のHPがなくなった");
		Time.TLDA100("・・・・・\n\n");
		Time.TLDA50("ゲームオーバー");
		return p;

	}
	public abstract void name();



}
