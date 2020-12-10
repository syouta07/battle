package 主人公;

import バトル11_26.Time;
import モンスター.Monster;

public class Hero extends Player{
	int hp;    int mp;
	int maxHp; int maxMp;
	int level=1;
	int EXP;
	int maxLevel = 99;
	String name;

//	public String getName() {
//		return this.getName();
//	}
//	public static void setName(String name) {
//		this.name = name;
//	}

	//ヒーローの名前を決める
	public static void name(Player p) {
		Time.TLDA50("名前を何にしますか？\n");
		System.out.print("=>");
		String h = new java.util.Scanner(System.in).nextLine();
		Time.TLDA50(h+"でよろしいですか？\n\n");
		System.out.println("1:はい 2:いいえ ");
		int no = new java.util.Scanner(System.in).nextInt()-1;
		if(no==0) {
			 p.name=h;
			Time.TLDA50(h+"に決定しました！");
		}else {
			name(p);
		}

	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	//** MaxHpの取得**//
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	//** mpの取得 **//
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	//** maxMpの取得 **//
	public int getMaxMp() {
		return maxMp;
	}
	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	//**////**////**////**////**////**////**////**////**//
	//**//    	    								//**//
	//**//		ノーマル攻撃判定クリーンヒット2%	//**//
	//**//											//**//
	//**////**////**////**////**////**////**////**////**//

	public Monster damage(Monster m) {
		for (int i=0; i<1; i++) {
		int no = new java.util.Random().nextInt(5)+2;
		m.hp -= no;
		Time.TLDA80(this.name+"は"+m.name+"に"+no+"を与えた\n\n",this.getName()+"の残りHPは"+this.getHp()+"\n\n");
		}
		return m;
	}

			/*逃げられる確率*/

	public void run() {
		int probability1 = new java.util.Random().nextInt(3);
		int probability2 = new java.util.Random().nextInt(3);
		if(probability1==probability2) {
			Time.TLDA80(this.name+"は逃げ切れた！");
		}else {
		Time.TLDA80("逃げ切れなかった");///***///バトルに引き戻される場合
		}
	}
	public void die(Player p) {
		Time.TLDA50(this.name+"のHPがなくなった");
		Time.TLDA100("・・・・・\n\n");
		Time.TLDA50("ゲームオーバー");
	}

	@Override
	public Player heel(Player p) {
		if(this.hp+this.hp/10<this.maxHp) {
			this.hp+=this.hp+this.hp/10;
			Time.TLDA50(this.name+"は、"+this.hp+"まで回復した‼");
		}else {
			this.hp+=this.maxHp;
			Time.TLDA50(this.name+"は、"+this.hp+"まで回復した‼");

		}
		return p;
	}



}
