package 主人公;

import java.util.Random;

public class HpUp {
	//****////****////****////****////****////****////****////****//
	//****//				スピードタイプ					//****//
	//****//			  HP Min(916) Max(1045)  			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**HPUp量をランダム生成**//
	public static int rand() {
		int b = new Random().nextInt(2);
		return b;
	}

	//**レベル10まで4～5Up**//
	public static int hpSpeed10(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+4);
		return a+4;
	}

	//**レベル20まで5～6Up**//
	public static int hpSpeed20(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+5);
		return a+5;
	}

	//**レベル30まで6～7Up**//
	public static int hpSpeed30(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+6);
		return a+6;
	}

	//**レベル40まで7～8Up**/
	public static int hpSpeed40(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+7);
		return a+7;
	}

	//**レベル50まで8～9Up**//
	public static int hpSpeed50(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+8);
		return a+8;
	}

	//**レベル60まで9～10Up**//
	public static int hpSpeed60(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+9);
		return a+9;
	}

	//**レベル70まで10～11Up**//
	public static int hpSpeed70(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+10);
		return a+10;
	}

	//**レベル80まで11～12Up**//
	public static int hpSpeed80(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+11);
		return a+11;
	}

	//**レベル90まで12～13Up**//
	public static int hpSpeed90(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+12);
		return a+12;
	}

	//**レベル100まで13～14Up**//
	public static int hpSpeed100(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+13);
		return a+13;
	}


	//****////****////****////****////****////****////****////****//
	//****//				パワータイプ					//****//
	//****//			  HP Min(1045) Max(1144)  			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//


	//**レベル10まで5～6Up**//
	public static int hpPower10(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+5);
		return a+5;
	}

	//**レベル20まで6～7Up**//
	public static int hpPower20(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+6);
		return a+6;
	}

	//**レベル30まで7～8Up**//
	public static int hpPower30(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+7);
		return a+7;
	}

	//**レベル40まで8～9Up**//
	public static int hpPower40(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+8);
		return a+8;
	}

	//**レベル50まで9～10Up**//
	public static int hpPower50(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+9);
		return a+9;
	}

	//**レベル60まで10～11Up**//
	public static int hpPower60(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+10);
		return a+10;
	}

	//**レベル70まで11～12Up**//
	public static int hpPower70(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+11);
		return a+11;
	}

	//**レベル80まで12～13Up**//
	public static int hpPower80(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+12);
		return a+12;
	}

	//**レベル90まで13～14Up**//
	public static int hpPower90(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+13);
		return a+13;
	}

	//**レベル100まで14～15Up**//
	public static int hpPower100(Player p){
		int a = rand();
		p.setMaxHp(p.getHp()+a+14);
		return a+14;
	}

}
