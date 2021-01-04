package 主人公;

import java.util.ArrayList;

import モンスター.Monster;

public abstract class  Player {
	int EXP;
	public static int many;
	String job;
	public static int [] itemMany = new int [11];
	//private String name;
	int hp;
	//private int hpMax;
	int level;
	//private int damage;
	//private int bankPass;
	private static String []  item = {"薬草","回復薬","高級回復薬","粉塵","解毒草","解毒薬","高級解毒薬","鬼力の種","鬼力薬","硬化の種","薬"};

	//** 攻撃 **//
	public abstract void damage(Monster m);

	//** 回復 **//
	public abstract Player heel(Player p);

	//** 名前 **//
	public abstract String getName();
	public abstract void setName(String name);

	//** HP **//
	public abstract int getHp();
	public abstract void setHp(int hp);
	public abstract int getMaxHp();
	public abstract void setMaxHp(int maxHp);

	//** MP **//
	public abstract int getMp();
	public abstract void setMp(int mp);
	public abstract int getMaxMp();
	public abstract void setMaxMp(int maxMp) ;

	//** LeveL **//
	public abstract int getLevel();
	public abstract void setLevel(int level);
	public abstract int getMaxLevel();

	//**EXP**//
	public abstract int getEXP();
	public abstract void setEXP(int EXP);
	public abstract int getMaxEXP();
	//**死亡時**//
	public abstract void die(ArrayList<Player> people,String place);

	//**剣を装備させたときの攻撃力**//
	public abstract int getDamage();
	public abstract void setDamage(int damage);

	//**銀行の暗証番号**//
	public abstract int getBankPass();
	public abstract void setBankPass(int bankPass);

	//**属性**//
	public abstract String getType();
	public abstract void setType(String type);

	//** 状態異常 **//
	public abstract String getAbnormal();
	public abstract void setAbnormal(String Abnormal);

	//** 防御力 **//
	public abstract int getDefense();
	public abstract void setDefense(int defense) ;

	//** ランク **//
	public abstract char getRank();
	public abstract void setRank(char rank) ;

	//** アイテム数管理 **//
	public abstract int getItemMany(int a) ;
	public abstract void setItemMany(int a,int b) ;

}
