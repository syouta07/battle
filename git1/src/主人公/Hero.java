package 主人公;

import モンスター.Monster;
import 機能.Time;
import 町内_店_ギルド_家_協会_銀行.Home;

public class Hero extends Player{
	private int hp;    private int mp;
	private int maxHp; private int maxMp;
	private int level;
	private int EXP;	int damage;
	private int maxExp =	13725;
	private final int maxLevel = 100;
	private String name;
	private int bankPass;

	//** 主人公の初期値設定 **//
	public Hero(String name) {
		this.name = name;
		this.hp=100;
		this.mp=10;
		this.setLevel(1);
		this.damage = 10;
		many=1000;
	}


	//** 名前 **//
	public String getName() {
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name=name;
	}

	//** HP **//
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	//** EXP **//
	public int getEXP() {
		return this.EXP;
	}
	public void setEXP(int exp) {
		this.EXP = exp;
	}

	public int getMaxEXP() {
		return this.maxExp;
	}

	//** 回復 **//
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

	//** 銀行の暗証番号 **//
	public int getBankPass() {
		return this.bankPass;
	}
	public void setBankPass(int bankPass) {
		this.bankPass= bankPass;
	}

	//** レベル **//
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLevel() {
		return maxLevel;
	}

	//** ダメージ **//
	public int getDamage() {
		return this.damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}


	//** mp **//
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getMaxMp() {
		return maxMp;
	}
	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}


	//**逃亡**//
	public void run() {
		int probability1 = new java.util.Random().nextInt(3);
		int probability2 = new java.util.Random().nextInt(3);
		if(probability1==probability2) {
			Time.TLDA80(this.name+"は逃げ切れた！");
		}else {
		Time.TLDA80("逃げ切れなかった");///***///バトルに引き戻される場合
		}
	}

	//**主人公が死んだとき**//
	public void die(Player p, String place) {
		Time.TLDA50(p.getName()+"のHPが0になった・・・\n\n");
		Time.TLDA100("・・・・・・・・\n\n");
		Home.die(p,place);
	}


	public void damage(Monster m) {
		m.hp -= this.damage;
		Time.TLDA80(this.name+"は"+m.name+"に"+this.damage+"を与えた\n\n",m.name+"の残りHPは"+m.hp+"\n\n");
	}

}
