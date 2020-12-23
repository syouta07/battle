package 主人公;

import モンスター.Monster;
import 機能.Time;

public class Level {

	//**モンスターを倒した時に得られるEXP**//
	public static void MonsterDie(Player p,Monster m) {
		p.setEXP(p.getEXP()+m.getEXP());
	}


	public static  void levelCheck(Player p) {
		if(p.getLevel()<=10){
			level1(p);

		}else if(p.getLevel()<=20){
			level10(p);

		}else if(p.getLevel()<=30){
			level20(p);

		}else if(p.getLevel()<=40){
			level30(p);

		}else if(p.getLevel()<=50){
			level40(p);

		}else if(p.getLevel()<=60){
			level50(p);

		}else if(p.getLevel()<=70){
			level60(p);

		}else if(p.getLevel()<=80){
			level70(p);

		}else if(p.getLevel()<=90){
			level80(p);
		}else if(p.getLevel()<=100){
			level90(p);
		}
	}


	public static void level1(Player p) {
		int comparison =(p.getEXP()-(p.getLevel()-1)*25); //**計算式消去検討**//

		//レベル10レベル以下の時のループ
		if(p.getLevel()<10 && comparison/25>=1) {
			for(int j=0; j<comparison/25; j++) {
				if(p.getLevel()>=10) {
					break;
				}
		//**レベルが2つ以上上がる可能性があるためループ**//
				p.setLevel(p.getLevel()+1);

				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed10(p);
				}else {
					Damage.damagePower10(p);
				}
				if(p.getLevel()==10) {
					level10(p);
				}
			}
		}
		if(p.getLevel()>=10 && p.getEXP()>=225) {
			level10(p);
		}
	}



	//レベル10以下の時の計算
	public static void level10(Player p) {
		int comparison =((p.getEXP()-225)-(p.getLevel()-10)*50);

		//レベル20レベル以下の時のループ
		if(p.getLevel()>=10 && p.getLevel()<=20 && comparison/50>=1) {
			for(int j=0; j<comparison/50; j++) {
				if(p.getLevel()>=20) {
					break;
				}
		//レベルが2つ以上上がる可能性があるためループ
				p.setLevel(p.getLevel()+1);

				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed20(p);
				}else {
					Damage.damagePower20(p);
				}
			}
		}
		if(p.getLevel()>=20 && p.getEXP()>=725) {
			level20(p);
		}
	}


	public static void level20(Player p) {
		int comparison =(p.getEXP()-725-(p.getLevel()-20)*75);

		//レベル30レベル以下の時のループ
		if(p.getLevel()<=30 && comparison/75>=1) {
			for(int j=0; j<comparison/75; j++) {
				if(p.getLevel()>=30) {
					break;
				}
				//**レベルUP**//
				p.setLevel(p.getLevel()+1);

				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed30(p);
				}else {
					Damage.damagePower30(p);
				}
			}
		}
		if(p.getLevel()>=30 && p.getEXP()>=1475) {
			level30(p);
		}
	}

	public static void level30(Player p) {
		int comparison =(p.getEXP()-1475-(p.getLevel()-30)*100);


		//レベル40レベル以下の時のループ
		if(p.getLevel()<=40 && comparison/100>=1) {
			for(int j=0; j<comparison/100; j++) {
				if(p.getLevel()>=40) {
					break;
				}
				p.setLevel(p.getLevel()+1);
				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed40(p);
				}else {
					Damage.damagePower40(p);
				}
			}
		}
		if(p.getLevel()>=40 && p.getEXP()>=2475) {
			level40(p);
		}
	}
	public static void level40(Player p) {
		int comparison =(p.getEXP()-2475-(p.getLevel()-40)*125);


		//レベル50レベル以下の時のループ
		if(p.getLevel()<=50 && comparison/125>=1) {
			for(int j=0; j<comparison/125; j++) {
				if(p.getLevel()>=50) {
					break;
				}
				p.setLevel(p.getLevel()+1);
				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed50(p);
				}else {
					Damage.damagePower50(p);
				}
			}
		}
		if(p.getLevel()>=50 && p.getEXP()>=3725) {
			level50(p);
		}
	}
	public static void level50(Player p) {
		int comparison =(p.getEXP()-3725-(p.getLevel()-50)*150);


		//レベル60レベル以下の時のループ
		if(p.getLevel()<=60 && comparison/150>=1) {
			for(int j=0; j<comparison/150; j++) {
				if(p.getLevel()>=60) {
					break;
				}
				p.setLevel(p.getLevel()+1);
				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed60(p);
				}else {
					Damage.damagePower60(p);
				}
			}
		}
		if(p.getLevel()>=60 && p.getEXP()>=5225) {
			level60(p);
		}
	}

	public static void level60(Player p) {
		int comparison =(p.getEXP()-5225-(p.getLevel()-60)*175);

		//レベル70レベル以下の時のループ
		if(p.getLevel()<=70 && comparison/175>=1) {
			for(int j=0; j<comparison/175; j++) {
				if(p.getLevel()>=70) {
					break;
				}
				p.setLevel(p.getLevel()+1);
				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed70(p);
				}else {
					Damage.damagePower70(p);
				}
			}
		}
		if(p.getLevel()>=70 && p.getEXP()>=6975) {
			level70(p);
		}
	}
	public static void level70(Player p) {
		int comparison =(p.getEXP()-6975-(p.getLevel()-70)*200);


		//レベル80レベル以下の時のループ
		if(p.getLevel()<=80 && comparison/200>=1) {
			for(int j=0; j<comparison/200; j++) {
				if(p.getLevel()>=80) {
					break;
				}
				p.setLevel(p.getLevel()+1);
				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed80(p);
				}else {
					Damage.damagePower80(p);
				}
			}
		}
		if(p.getLevel()>=80 && p.getEXP()>=8975) {
			level80(p);
		}
	}


	public static void level80(Player p) {
		int comparison =(p.getEXP()-8975-(p.getLevel()-80)*225);


		//レベル90レベル以下の時のループ
		if(p.getLevel()<=90 && comparison/225>=1) {
			for(int j=0; j<comparison/225; j++) {
				if(p.getLevel()>=90) {
					break;
				}
				p.setLevel(p.getLevel()+1);
				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed90(p);
				}else {
					Damage.damagePower90(p);
				}
			}
		}
		if(p.getLevel()>=90 && p.getEXP()>=11225) {
			level90(p);
		}
	}


	public static void level90(Player p) {
		int comparison =(p.getEXP()-11225-(p.getLevel()-90)*250);

		//レベル90レベル以下の時のループ
		if(p.getLevel()<=100 && comparison/250>=1) {
			for(int j=0; j<comparison/250; j++) {
				if(p.getLevel()>=100) {
					break;
				}
				p.setLevel(p.getLevel()+1);
				//**タイプ別のダメージUP**//
				if(p.getType().equals("speed")) {
					Damage.damageSpeed100(p);
				}else {
					Damage.damagePower100(p);
				}
			}
		}
		if(p.getLevel()==100) {
			level100(p);
		}
	}
	public static void level100(Player p) {
		p.setEXP(p.getMaxEXP());
		p.setLevel(p.getMaxLevel());
		Time.TLDA50("レベルが上が上限に達しました！\nこれ以上はレベルが上がりません");
	}

}
