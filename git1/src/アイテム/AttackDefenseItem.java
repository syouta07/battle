package アイテム;

import 主人公.Player;

public class AttackDefenseItem {

	//** 鬼人薬 **//
	//** アイテム使用時攻撃力UP **//
	public static void attackUpTime(Player p) {
		p.setDamage(p.getDamage()+12);
	}

	//** 鬼人薬の効果がなくなった時 **//
	public static void attacUpTimeFinish(Player p) {
		p.setDamage(p.getDamage()-12);
	}

	public static void defenseUpTime(Player p) {
		p.setDamage(p.getDamage()+12);
	}

	//** 鬼人薬の効果がなくなった時 **//
	public static void defenseUpTimeFinish(Player p) {
		p.setDamage(p.getDamage()-12);
	}
}
