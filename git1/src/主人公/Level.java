package 主人公;

public class Level {

	public void levelCheck(Player p) {
		if(p.getLevel()<=10){
			level10(p);

		}else if(p.getLevel()<=20){
			level20(p);

		}else if(p.getLevel()<=30){
			level30(p);

		}else if(p.getLevel()<=40){
			level40(p);

		}else if(p.getLevel()<=50){
			level50(p);

		}else if(p.getLevel()<=60){
			level60(p);

		}else if(p.getLevel()<=70){
			level70(p);

		}else if(p.getLevel()<=80){
			level80(p);

		}else if(p.getLevel()<=90){
			level90(p);
		}else if(p.getLevel()<=100){
			level100(p);
		}
	}
	public void level10(Player p) {
		int comparison =(p.getEXP()-p.getLevel()*25);

		//レベル1の時のみかつEXP25以上でlevelプラス
		if(p.getLevel()==1 && p.getEXP()>25) {
			p.setLevel(p.getLevel()+1);
		}

		//レベル10レベル以下の時のループ
		if(p.getLevel()<=10 && comparison/25>=1) {
			for(int j=0; j<comparison/25; j++) {
				if(p.getLevel()>=10) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=10 && p.getEXP()>=275) {
			level20(p);
		}
	}
	public void level20(Player p) {
		int comparison =(p.getEXP()-225-p.getLevel()*50);


		//レベル20レベル以下の時のループ
		if(p.getLevel()<=20 && comparison/50>=1) {
			for(int j=0; j<comparison/50; j++) {
				if(p.getLevel()>=20) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=20 && p.getEXP()>=725) {
			level30(p);
		}
	}
	public void level30(Player p) {
		int comparison =(p.getEXP()-725-p.getLevel()*75);


		//レベル30レベル以下の時のループ
		if(p.getLevel()<=30 && comparison/75>=1) {
			for(int j=0; j<comparison/75; j++) {
				if(p.getLevel()>=30) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=30 && p.getEXP()>=1450) {
			level40(p);
		}
	}
	public void level40(Player p) {
		int comparison =(p.getEXP()-1450-p.getLevel()*100);


		//レベル40レベル以下の時のループ
		if(p.getLevel()<=40 && comparison/100>=1) {
			for(int j=0; j<comparison/100; j++) {
				if(p.getLevel()>=40) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=40 && p.getEXP()>=2450) {
			level50(p);
		}
	}
	public void level50(Player p) {
		int comparison =(p.EXP-2450-p.getLevel()*125);


		//レベル50レベル以下の時のループ
		if(p.getLevel()<=50 && comparison/125>=1) {
			for(int j=0; j<comparison/125; j++) {
				if(p.getLevel()>=50) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=50 && p.getEXP()>=3700) {
			level60(p);
		}
	}
	public void level60(Player p) {
		int comparison =(p.getEXP()-3700-p.getLevel()*150);


		//レベル60レベル以下の時のループ
		if(p.getLevel()<=60 && comparison/150>=1) {
			for(int j=0; j<comparison/150; j++) {
				if(p.getLevel()>=60) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=60 && p.getEXP()>=5200) {
			level70(p);
		}
	}

	public void level70(Player p) {
		int comparison =(p.getEXP()-5200-p.getLevel()*150);

		//レベル70レベル以下の時のループ
		if(p.getLevel()<=70 && comparison/175>=1) {
			for(int j=0; j<comparison/175; j++) {
				if(p.getLevel()>=70) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=70 && p.getEXP()>=6950) {
			level80(p);
		}
	}
	public void level80(Player p) {
		int comparison =(p.getEXP()-6950-p.getLevel()*200);


		//レベル80レベル以下の時のループ
		if(p.getLevel()<=80 && comparison/200>=1) {
			for(int j=0; j<comparison/200; j++) {
				if(p.getLevel()>=80) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=80 && p.getEXP()>=8950) {
			level90(p);
		}
	}
	public void level90(Player p) {
		int comparison =(p.getEXP()-8950-p.getLevel()*250);


		//レベル90レベル以下の時のループ
		if(p.getLevel()<=90 && comparison/250>=1) {
			for(int j=0; j<comparison/250; j++) {
				if(p.getLevel()>=90) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
		if(p.getLevel()>=90 && p.getEXP()>=11450) {
			level100(p);
		}
	}
	public void level100(Player p) {
		int comparison =(p.getEXP()-11450-p.getLevel()*275);


		//レベル90レベル以下の時のループ
		if(p.getLevel()<=90 && comparison/275>=1) {
			for(int j=0; j<comparison/275; j++) {
				if(p.getLevel()>=100) {
					break;
				}
				p.setLevel(p.getLevel()+1);
			}
		}
	}
}
