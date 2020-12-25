package テストコード;

import バトル11_26.Item;
import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;

public class ItemTest {

	public static void main(String[] args) {

		//主人公のインスタンス
		Player p = new Hero("ななし");
		boolean a =true;

		//** 毒を受けている状態を作る **//
		p.setAbnormal("毒");

		//** 主人公の属性 **//
		p.setType("speed");

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

			Item.Herbs(p);//薬草
			Item.recoveryAgents(p);//回復薬
			Item.highRecoveryAgents(p);//高級回復薬
		}

		//** 解毒薬のテストコード **//
		//** レベル90・スピードタイプの時 **//
		//** 体力も削るってテスト **//
		while(p.getAbnormal().equals("毒")) {

			p.setHp(p.getHp()-500);//** 体力を削るテスト **//

			Item.detoxification(p);//解毒草
			Item.normalDetoxification(p);//解毒薬
			Item.luxuryDetoxification(p);//高級解毒薬
		}


		//** テスト後の結果を表示 **//
		System.out.println("level: "+p.getLevel()+" hp: "+p.getHp()+" maxhp: "+p.getMaxHp());
	}

}
