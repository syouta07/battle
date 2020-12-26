package テストコード;

import java.util.ArrayList;

import アイテム.HpRecovery;
import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;

public class HpAllRecoveryTest {

	public static void main(String[] args) {
		Player p1 = new Hero("1"); p1.setType("speed"); //p1の生成
		Player p2 = new Hero("2"); p2.setType("speed"); //p2の生成
		Player p3 = new Hero("3"); p3.setType("speed"); //p3の生成

		//** p1のLevel90まで成長させる **//
		p1.setEXP(11225);Level.levelCheck(p1);
		p2.setEXP(11225);Level.levelCheck(p2);
		p3.setEXP(11225);Level.levelCheck(p3);

		//** 仲間を入れる配列を作成 **//
		ArrayList<Player> list = new ArrayList<Player>();

		//** 生成した仲間を配列に入れる **//
		list.add(p1);
		list.add(p2);
		list.add(p3);

		//** テスト前に 配列に入れた仲間の初期値を確認する **//
		for(int i=0; i<3; i++) {
			System.out.println(list.get(i).getName()+" :level: "+list.get(i).getLevel()+" HP: "+list.get(i).getHp()+" MaxHP: "+list.get(i).getMaxHp());
			System.out.println();
		}
		//** 各インスタンスの体力を削る **//
		for(int i=0; i<3; i++) {
			list.get(i).setHp(list.get(i).getHp()-(i+1)*361);
			System.out.println(list.get(i).getName()+" :level: "+list.get(i).getLevel()+" HP: "+list.get(i).getHp()+" MaxHP: "+list.get(i).getMaxHp());
			System.out.println();
		}

		//粉塵の回復最大HPの 1/2が適用されているか確認する
		HpRecovery.AllRecoveryAgents(list);
		for(int i=0; i<3; i++) {
			System.out.println(list.get(i).getName()+" :level: "+list.get(i).getLevel()+" HP: "+list.get(i).getHp()+" MaxHP: "+list.get(i).getMaxHp());
			System.out.println();
		}
	}


}
