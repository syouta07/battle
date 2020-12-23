package 主人公;

import java.util.Random;

public class Damage {

	//****////****////****////****////****////****////****////****//
	//****//				スピードタイプ					//****//
	//****//			  攻撃力Min(599) Max(698)  			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**ダメージUp量をランダム生成**//
	public static int rand() {
		int b = new Random().nextInt(2);
		return b;
	}

	//**レベル10まで1～2Up**//
	public static int damageSpeed10(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+1);
		return a+1;
	}

	//**レベル20まで2～3Up**//
	public static int damageSpeed20(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+2);
		return a+2;
	}

	//**レベル30まで3～4Up**//
	public static int damageSpeed30(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+3);
		return a+3;
	}

	//**レベル40まで4～5Up**//
	public static int damageSpeed40(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+4);
		return a+4;
	}

	//**レベル50まで5～6Up**//
	public static int damageSpeed50(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+5);
		return a+5;
	}

	//**レベル60まで6～7Up**//
	public static int damageSpeed60(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+6);
		return a+6;
	}

	//**レベル70まで8～9Up**//
	public static int damageSpeed70(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+8);
		return a+8;
	}

	//**レベル80まで9～10Up**//
	public static int damageSpeed80(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+9);
		return a+9;
	}

	//**レベル90まで10～11Up**//
	public static int damageSpeed90(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+10);
		return a+10;
	}

	//**レベル100まで11～12Up**//
	public static int damageSpeed100(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+11);
		return a+11;
	}


	//****////****////****////****////****////****////****////****//
	//****//				パワータイプ					//****//
	//****//			  攻撃力Min(648) Max(747)  			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//


	//**レベル10まで2～3Up**//
	public static int damagePower10(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+2);
		return a+1;
	}

	//**レベル20まで3～4Up**//
	public static int damagePower20(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+3);
		return a+2;
	}

	//**レベル30まで4～5Up**//
	public static int damagePower30(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+4);
		return a+3;
	}

	//**レベル40まで5～6Up**//
	public static int damagePower40(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+5);
		return a+4;
	}

	//**レベル50まで6～7Up**//
	public static int damagePower50(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+6);
		return a+5;
	}

	//**レベル60まで7～8Up**//
	public static int damagePower60(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+7);
		return a+6;
	}

	//**レベル70まで8～9Up**//
	public static int damagePower70(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+8);
		return a+8;
	}

	//**レベル80まで9～10Up**//
	public static int damagePower80(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+9);
		return a+9;
	}

	//**レベル90まで10～11Up**//
	public static int damagePower90(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+10);
		return a+10;
	}

	//**レベル100まで11～12Up**//
	public static int damagePower100(Player p){
		int a = rand();
		p.setDamage(p.getDamage()+a+11);
		return a+11;
	}


}
