package 主人公;

import java.util.ArrayList;

import モンスター.Monster;
import 機能.Time;
import 町_ギルド_家_協会_銀行.Home;

public class Hero extends Player{
	private int hp;    private int mp;
	private int maxHp; private int maxMp;
	private int level;
	private int defense;
	private int EXP=0;	int damage;
	private int maxExp =13725;
	private final int maxLevel = 100;
	private int speed;//**攻撃速度**//
	private String name;
	private int bankPass;//** 銀行口座の暗証番号 **//
	private String type;//** 属性 **//
	private String Abnormal;//** 状態異常 **//
	private char rank;
	private static String []  item = {"薬草","回復薬","高級回復薬","粉塵","解毒草","解毒薬","高級解毒薬","鬼力の種","硬化の種","鬼力薬","硬化薬"};

	//** 主人公の初期値設定 **//
	public Hero(String name) {
		this.name = name;
		this.hp=100;
		this.mp=10;
		this.setLevel(1);
		this.damage = 10;
		this.maxHp=100;
		many=1000;
		this.rank = 'F';
		this.Abnormal = "なし";
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
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMaxHp() {
		return this.maxHp;
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
	@Override
	public int getMaxEXP() {
		return this.maxExp;
	}

	//** speed **//
	public int getSpped() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed
				;
	}

	//** defense **//
	public int getDefense() {
		return this.defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}

	//**属性**//
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	//** ランク **//
	public char getRank() {
		return this.rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
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

	//** 状態異常 **//
	public String getAbnormal() {
		return this.Abnormal;
	}
	public void setAbnormal(String Abnormal) {
		this.Abnormal = Abnormal;
	}

	//** アイテム **//
	//[0]:薬草 [1]:回復薬 [2]:高級回復薬 [3]:粉塵 [4]:解毒草 [5]:解毒薬
	//[6]:高級解毒薬 [7]:鬼人種 [8]:鬼人薬 [9]:忍耐の種 [10]:硬化薬
	public int getItemMany(int a) {
		return this.itemMany[a];
	}
	public void setItemMany(int a,int b) {
		this.itemMany[a]=b;
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
	public void die(ArrayList<Player> people, String place) {
		Time.TLDA50(people.get(0).getName()+"のHPが0になった・・・\n\n");
		Time.TLDA100("・・・・・・・・\n\n");
		Home.die(people,place);
	}


	public void damage(Monster m) {
		m.hp -= this.damage;
		Time.TLDA80(this.name+"は"+m.name+"に"+this.damage+"を与えた\n\n",m.name+"の残りHPは"+m.hp+"\n\n");
	}



}
