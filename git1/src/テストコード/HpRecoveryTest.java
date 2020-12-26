package テストコード;

import アイテム.HpRecovery;
import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;

public class HpRecoveryTest {

	public static void main(String[] args) {
		//主人公のインスタンス
		Player p = new Hero("ななし");
		boolean a =true;

		//** levelを90まで上げる **//
		while(a) {
			p.setEXP(p.getEXP()+1);
			Level.levelCheck(p);
			if(p.getLevel()==90) {
				a =false;
			}
		}

		//** テスト前のHP 確認 **//
		System.out.println("level: "+p.getLevel()+" HP: "+p.getHp()+" MaxHP: "+p.getMaxHp());
		System.out.println();


		//** 回復薬のテストコード 10回 **//
		for(int i=0; i<10; i++) {

			//** 毎回受けるダメージ数 **//
			p.setHp(p.getHp()-300);

			HpRecovery.Herbs(p);//薬草
			HpRecovery.recoveryAgents(p);//回復薬
			HpRecovery.highRecoveryAgents(p);//高級回復薬
		}



		//** テスト後の結果を表示 **//
		System.out.println("level: "+p.getLevel()+" hp: "+p.getHp()+" maxhp: "+p.getMaxHp());

	}

}
