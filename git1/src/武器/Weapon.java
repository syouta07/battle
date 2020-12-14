package 武器;

import 主人公.Player;

public abstract class Weapon {
	int damage;
	int price;
	String name;
	public abstract void damage(Player p,String name);
	public abstract void price(Player p);

}
