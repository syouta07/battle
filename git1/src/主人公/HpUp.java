package 主人公;

public class HpUp {
	//****////****////****////****////****////****////****////****//
	//****//				スピードタイプ					//****//
	//****//			  HP Min(916) Max(1045)  			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**HPUp量をランダム生成**//
	public static int rand() {
		int b = 3;/*new Random().nextInt(2);*/
		return b;
	}

	//**レベル10まで4～5Up**//
	public static int hpSpeed10(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+4);
		p.setHp(p.getMaxHp());
		return a+4;
	}

	//**レベル20まで5～6Up**//
	public static int hpSpeed20(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+5);
		p.setHp(p.getMaxHp());
		return a+5;
	}

	//**レベル30まで6～7Up**//
	public static int hpSpeed30(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+6);
		p.setHp(p.getMaxHp());
		return a+6;
	}

	//**レベル40まで7～8Up**/
	public static int hpSpeed40(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+7);
		p.setHp(p.getMaxHp());
		return a+7;
	}

	//**レベル50まで8～9Up**//
	public static int hpSpeed50(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+8);
		p.setHp(p.getMaxHp());
		return a+8;
	}

	//**レベル60まで9～10Up**//
	public static int hpSpeed60(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+9);
		p.setHp(p.getMaxHp());
		return a+9;
	}

	//**レベル70まで10～11Up**//
	public static int hpSpeed70(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+10);
		p.setHp(p.getMaxHp());
		return a+10;
	}

	//**レベル80まで11～12Up**//
	public static int hpSpeed80(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+11);
		p.setHp(p.getMaxHp());
		return a+11;
	}

	//**レベル90まで12～13Up**//
	public static int hpSpeed90(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+12);
		p.setHp(p.getMaxHp());
		return a+12;
	}

	//**レベル100まで13～14Up**//
	public static int hpSpeed100(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+13);
		p.setHp(p.getMaxHp());
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
		p.setMaxHp(p.getMaxHp()+a+5);
		p.setHp(p.getMaxHp());
		return a+5;
	}

	//**レベル20まで6～7Up**//
	public static int hpPower20(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+6);
		p.setHp(p.getMaxHp());
		return a+6;
	}

	//**レベル30まで7～8Up**//
	public static int hpPower30(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+7);
		p.setHp(p.getMaxHp());
		return a+7;
	}

	//**レベル40まで8～9Up**//
	public static int hpPower40(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+8);
		p.setHp(p.getMaxHp());
		return a+8;
	}

	//**レベル50まで9～10Up**//
	public static int hpPower50(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+9);
		p.setHp(p.getMaxHp());
		return a+9;
	}

	//**レベル60まで10～11Up**//
	public static int hpPower60(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+10);
		p.setHp(p.getMaxHp());
		return a+10;
	}

	//**レベル70まで11～12Up**//
	public static int hpPower70(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+11);
		p.setHp(p.getMaxHp());
		return a+11;
	}

	//**レベル80まで12～13Up**//
	public static int hpPower80(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+12);
		p.setHp(p.getMaxHp());
		return a+12;
	}

	//**レベル90まで13～14Up**//
	public static int hpPower90(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+13);
		p.setHp(p.getMaxHp());
		return a+13;
	}

	//**レベル100まで14～15Up**//
	public static int hpPower100(Player p){
		int a = rand();
		p.setMaxHp(p.getMaxHp()+a+14);
		p.setHp(p.getMaxHp());
		return a+14;
	}

}
