package モンスター;

import java.util.ArrayList;

import 主人公.Player;

public abstract class Monster {
	public String name;
	public int hp; int MaxHp;
	int mp; int MaxMp;
	public abstract void attack(ArrayList<Player> people,String place);
	public abstract void heel(Monster m);
	public abstract void die(Player p,Monster m);

	//** EXP **//
	public abstract int getEXP();
	public abstract void setEXP(int exp);

	//** HP **//
	public abstract int getHp();
	public abstract void setHp(int exp);


}
