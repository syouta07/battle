package モンスター;

import 主人公.Player;

public abstract class Monster {
	public String name;
	public int hp; int MaxHp;
	int mp; int MaxMp;
	public abstract void attack(Player p);
	public abstract Monster heel (Monster m);
}
