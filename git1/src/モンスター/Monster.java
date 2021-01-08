package モンスター;

import java.util.ArrayList;

import 主人公.Player;

public abstract class Monster {
	public String name;
	public int hp; int MaxHp;
	int mp; int MaxMp;
	public abstract void attack(ArrayList<Player> people,String fieldName);
	public abstract void heel(Monster m);
	public abstract void die(ArrayList<Player> people,Monster m);

	//** EXP **//
	public abstract int getEXP();
	public abstract void setEXP(int exp);

	//** HP **//
	public abstract int getHp();
	public abstract void setHp(int hp);

	public abstract String getName();
	public abstract void setName(String name);

	//モンスターが主人公と鉢合わせた時にとる行動
	public abstract void action(ArrayList<Player> people);

}
