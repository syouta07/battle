package テストコード;

import アイテム.DetoxPoison;
import 主人公.Hero;
import 主人公.Level;
import 主人公.Player;

public class DetoxPoisonTest {

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


		//** 解毒薬のテストコード **//
		//** レベル90・スピードタイプの時 **//
		//** 体力も削るってテスト **//
		while(p.getAbnormal().equals("毒")) {

			p.setHp(p.getHp()-500);//** 体力を削るテスト **//

			DetoxPoison.detoxification(p);//解毒草
			DetoxPoison.normalDetoxification(p);//解毒薬
			DetoxPoison.luxuryDetoxification(p);//高級解毒薬
		}


		//** テスト後の結果を表示 **//
		System.out.println("level: "+p.getLevel()+" hp: "+p.getHp()+" maxhp: "+p.getMaxHp());
	}

}
