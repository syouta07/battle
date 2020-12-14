package 武器;

import 主人公.Player;

public abstract class Sword extends Weapon{
	int damage;
	int price;
	String name;

	public void damage(Player p,String name) {

		if(name.equals("名無しの剣")) {
			this.name="名無しの剣";
			p.setDamage(p.getDamage() + this.damage);
			this.price=1000;
		}else if(name.equals("炎の剣")) {
			this.name="炎の剣";
			
		}else if(name.equals("氷の剣")) {
			this.name="氷の剣";
		}
	}
	public void price(Player p) {

	}
}
