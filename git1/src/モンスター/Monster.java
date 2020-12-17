package モンスター;

import 主人公.Player;

public abstract class Monster {
	public String name;
	public int hp; int MaxHp;
	int mp; int MaxMp;
	public abstract void attack(Player p,String place);
	public abstract void heel(Monster m);
	public abstract void die(Player p,Monster m);

	//** EXP **//
	public abstract int getEXP();
	public abstract void setEXP(int exp);

}
