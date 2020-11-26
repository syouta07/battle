package バトル11_26;

public class Player {			//勇者アカウント
						//**//戦う{素手、剣、槍、銃}
						//**//防御{素手、盾}
						//**//回復{眠る、魔法}
						//**//アイテム{回復薬、薬、解毒薬}
	public String name;
	int hp;  int mp;	public int many =100;
	int damage;
	int hit; int Level;
	int EXP; int speed;
			//**////**////**////**////**////**////**////**////**//
			//**//    	    								//**//
			//**//		ノーマル攻撃判定クリーンヒット2%	//**//
			//**//											//**//
			//**////**////**////**////**////**////**////**////**//
	public Object damage(Monster m) {
		for (int i=0; i<1; i++) {
		int no = new java.util.Random().nextInt(5)+2;
		int no2= new java.util.Random().nextInt(4)+3;
		m.hp -= no;
		Time.TLDA80(this.name+"は"+this.name+"に"+no+"を与えた\n\n",this.name+"の残りHPは"+this.hp+"\n\n");
		}
		return m;
	}


	public Object damage(Monster a, Monster b) {
		Time.TLDA80("どちらに攻撃しますか？\n\n1:"+a+"2:"+b);
		int  choose =new java.util.Scanner(System.in).nextInt()-1;
		if(choose==0) {
			a.hp -=this.damage;
			Time.TLDA80(this.name+"は"+a+"に"+this.damage+"を与えた\n\n",a+"の残りHPは"+b+"です\n\n");
			return a;
		}else {
			b.hp -=this.damage;
			Time.TLDA80(this.name+"は"+c+"に"+this.damage+"を与えた\n\n",c+"の残りHPは"+d+"です\n\n");
		}return b;
	}
	public Object damage(Monster a,Monster b,Monster c) {
		Time.TLDA80("どちらに攻撃しますか？\n\n1:"+a+"2:"+b);
		int  choose =new java.util.Scanner(System.in).nextInt()-1;
		if(choose==0) {
			a.hp -=this.damage;
			Time.TLDA80(this.name+"は"++"に"+this.damage+"を与えた\n\n",a+"の残りHPは"+b+"です\n\n");
			return a;
		}else if(choose==1){
			b.hp-=this.damage;
			Time.TLDA80(this.name+"は"+c+"に"+this.damage+"を与えた\n\n",c+"の残りHPは"+d+"です\n\n");
			return b;
		}else {
			c.hp-=this.damage;
			Time.TLDA80(this.name+"は"+e+"に"+this.damage+"を与えた\n\n",e+"の残りHPは"+f+"です\n\n");
			return c;
		}
	}


	public int damage(Monster a,Monster b,Monster c,Monster d) {
		Time.TLDA80("どちらに攻撃しますか？\n\n1:"+a+"2:"+b);
		int  choose =new java.util.Scanner(System.in).nextInt()-1;
		if(choose==0) {
			b -=this.damage;
			Time.TLDA80(this.name+"は"+a+"に"+this.damage+"を与えた\n\n",a+"の残りHPは"+b+"です\n\n");
			return d;
		}else if(choose==1){
			d-=this.damage;
			Time.TLDA80(this.name+"は"+c+"に"+this.damage+"を与えた\n\n",c+"の残りHPは"+d+"です\n\n");
			return d;
		}else if(choose==2){
			f-=this.damage;
			Time.TLDA80(this.name+"は"+e+"に"+this.damage+"を与えた\n\n",e+"の残りHPは"+f+"です\n\n");
			return f;
		}else {
			h-=this.damage;
			Time.TLDA80(this.name+"は"+g+"に"+this.damage+"を与えた\n\n",g+"の残りHPは"+h+"です\n\n");
			return h;
		}
	}


	public int sleep(String a,int b) {
		b += this.hp * (2/3);
		Time.TLDA80(this.name+"は眠った。HPが"+b+"になった");
		return b;
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


	public int heel(int x) {

		return x;

	}
}
