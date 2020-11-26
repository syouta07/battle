package バトル11_26;

public class Matango {
	int damage = new java.util.Random().nextInt(9)+4;
	int heel = new java.util.Random().nextInt(3)+4;
	String name;
	int hp = 30; int MaxHp = 30;
	int mp = 10; int MaxMp = 10;

	public int action(String x, int y){
		String [] action = {"様子をうかがっている","急に襲ってきた","眠っている"};
		int mata= new java.util.Random().nextInt(4);
		String comment= "キノコが現れたキノコ"+action[mata];

		switch(mata) {
		case 0:
			Time.TLDA50(comment+"は"+action[0]+"\n\n");
			break;
		case 1:
			Time.TLDA50(comment+"が"+action[1]+"\n\n");
			attack1(x,y);
			break;
		case 2:
			Time.TLDA50(comment+"が"+action[2]+"\n\n");
			break;
		}
		return y;
	}


	public int attack1(String x,int y){
		int at=new java.util.Random().nextInt(9)+2;
		y -= at;
		Time.TLDA50(this.name+"は"+x+"に"+at+"ダメージ与えた");
		if(y>=0) {
			attack1(x,y);
		}else {
			die(x,y);
		}
		return y;
	}


	public int heel(int x) {
		Time.TLDA50(this.name+"はヒールを使った。\n\n");
		if(this.hp==this.MaxHp) {
			Time.TLDA50("何も起こらなかった。\n\n");
		}else if(heel+this.hp>=this.MaxHp) {
			this.mp -=2;
			this.hp = this.MaxHp;
			Time.TLDA50(this.name+"は"+(this.MaxHp-this.hp)+"回復し,HP"+this.hp+",MP"+this.mp+"。\n\n");
		}else {
			Time.TLDA50(this.name+"は"+this.heel+"回復し,HP"+this.hp+",MP"+this.mp+"になった。");
		}
		return x;
	}


	public void die(String x,int y) {
		Time.TLDA50(this.name+"は力尽きた");
	}
}
