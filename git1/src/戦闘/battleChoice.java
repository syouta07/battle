package 戦闘;

import java.util.ArrayList;

import モンスター.Monster;
import 主人公.Player;
import 機能.Time;

public class battleChoice {
static String name;
static String fieldName;
	//戦いになったときの選択
	public static void choice(ArrayList<Player> people,ArrayList<Monster> MonserList,String fieldName) {

		MonserList.get(0).action(people,fieldName);
		int ac = new java.util.Random().nextInt(5);
		String [] action = {"戦う","防御する","回復する","様子を見ている","逃げようとしている"};
		switch(ac) {
		case 0:
			p.damage(m);
			break;
		case 1:
			p.heel(p);
			break;
		case 2:
			Time.TLDA50(p.getName()+"は"+m.name+"は"+action[ac]+"\n\n");
			break;
		case 3:
			Time.TLDA50(p.getName()+"は"+action[ac]+"\n\n");
			break;
		}
	}

	static void monsterChoice(ArrayList<Player> people,Monster m,String place) {
		if(m.hp>=m.hp/2) {
			if((int)Math.random()*3/4==0){
				m.attack(people,place);
			}else if((int)Math.random()*2==0) {

			}
		}

	}
	public void select(ArrayList<Player> people,String place, ArrayList<Monster> monster,int Mno) {

		int s = new java.util.Random().nextInt(4);
		int no = 0;
		if(people.size()==4) {
			no = new java.util.Random().nextInt(4);
		}else if(people.size()==3){
			no = new java.util.Random().nextInt(3);
		}else if(people.size()==2) {
			no = new java.util.Random().nextInt(2);
		}else {
			no = 1;
		}


		if(monster.get(Mno).getHp()>(monster.get(Mno).getMaxHp/2)) {
			if(s==0 || s==1) {
				m.attack(people,place,no);
			}else {
				poison(people, place,no);
			}
		}else {
			if(s==0 || s==1) {
				attack(people,place,no);
			}else {
				heel(monster);
			}
		}
	}

	//先頭のキャラクターが死亡した場合生きているメンバーの名前を表示する
public static void nameAlive(ArrayList<Player>people){
		//1人目が生きている場合
	if(people.get(0).getLevel()>=1) {
		name= people.get(0).getName()+":";
		//2人目が生きている場合
	}else if(people.get(1).getLevel()>=1) {
		name= people.get(1).getName()+":";
		//3人目が生きている場合
	}else if(people.get(2).getLevel()>=1) {
		name= people.get(2).getName()+":";
		//4人目だけが生きている場合
	}else if(people.get(3).getLevel()>=1) {
		name= people.get(3).getName()+":";
	}
}
}
