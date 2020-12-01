package バトル11_26;

public class Player {			//勇者アカウント
						//**//戦う{素手、剣、槍、銃}
						//**//防御{素手、盾}
						//**//回復{眠る、魔法}
						//**//アイテム{回復薬、薬、解毒薬}
	String name;
	public int many =100;
	int hp;    int mp;
	int MaxHp; int MaxMp;
	int damage;			boolean abnormalPoison;
	int hit; int Level;
	int EXP; int speed;


	public void PoisonAbnormal() {
		this.abnormalPoison = true;
		Time.TLDA80("毒におかされている\n\n");

	}

	public void PoisonHeal() {
		this.abnormalPoison = false;
		Time.TLDA80("毒状態から回復した‼\n\n");

	}



			//**////**////**////**////**////**////**////**////**//
			//**//    	    								//**//
			//**//		ノーマル攻撃判定クリーンヒット2%	//**//
			//**//											//**//
			//**////**////**////**////**////**////**////**////**//
	public void damage(Monster m) {
		for (int i=0; i<1; i++) {
		int no = new java.util.Random().nextInt(5)+2;
		int no2= new java.util.Random().nextInt(4)+3;
		m.hp -= no;
		Time.TLDA80(this.name+"は"+this.name+"に"+no+"を与えた\n\n",this.name+"の残りHPは"+this.hp+"\n\n");
		}
	}



	public Hero sleep(Hero h) {
		h.hp += this.hp * (2/3);
		Time.TLDA80(this.name+"は眠った。HPが"+h.hp+"になった");
		return h;
	}
		//**////**////**////**////**////**////**////**////**//
		//**//    	    								//**//
		//**//		       逃げる場合確率16%			//**//
		//**//											//**//
		//**////**////**////**////**////**////**////**////**//

	public void run() {
		int probability1 = new java.util.Random().nextInt(3);
		int probability2 = new java.util.Random().nextInt(3);
		if(probability1==probability2) {
			Time.TLDA80(this.name+"は逃げ切れた！");
		}else {
		Time.TLDA80("逃げ切れなかった");///***///バトルに引き戻される場合
		}
	}


	static void heel(Player p) {
		
	}

	public static Player die(Player p) {
		Time.TLDA50(p.name+"のHPがなくなった");
		Time.TLDA100("・・・・・\n\n");
		Time.TLDA50("ゲームオーバー");
		return p;

	}
}
