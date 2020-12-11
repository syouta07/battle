package 主人公;

import モンスター.Monster;

public abstract class  Player {
	int EXP;
	public int many;
	String job;
	private String name;
	int hp;
	private int hpMax;
	int level;

	public abstract Monster damage(Monster m);

	public abstract Player heel(Player p);

	//**名前**//
	public abstract String getName();
	public abstract void setName(String name);

	//**HP**//
	public abstract int getHp();
	public abstract void setHp(int hp);

	//**MaxHP**//
	public abstract int getMaxHp();
	public abstract void setMaxHp(int maxHp);

	//**MP**//
	public abstract int getMp();
	public abstract void setMp(int mp);

	//**MaxMP**//
	public abstract int getMaxMp();
	public abstract void setMaxMp(int maxMp) ;

	//**HpMax**//
	public abstract int getHpMax();
	public abstract void setHpMax(int hpMax);

	//**LeveL**//
	public abstract int getLevel();
	public abstract void setLevel(int level);

	//**EXP**//
	public abstract int getEXP();
	public abstract void setEXP(int EXP);
}
