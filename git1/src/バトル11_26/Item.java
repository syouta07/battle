package バトル11_26;

import 主人公.Player;
import 機能.Time;

public class Item {

	//*	薬草  *//
	//level30まで最大HPの1/3回復
	//30～50			 1/6
	//50～80			 1/8
	//80～100			 1/10
	public static void Herbs(Player p) {
		int heelPoint = 0;
		if(p.getLevel()<=30) {
			heelPoint=p.getMaxHp()/6;
			System.out.println(heelPoint);
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
			}else {
				p.setHp(p.getMaxHp());
			}
		}else if(p.getLevel()<=50) {
			heelPoint=p.getMaxHp()/8;
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
			}else {
				p.setHp(p.getMaxHp());
			}
		}else if (p.getLevel()<=80) {
			heelPoint=p.getMaxHp()/10;
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
			}else {
				p.setHp(p.getMaxHp());
			}
		}else if(p.getLevel()<=100) {
			heelPoint=p.getMaxHp()/13;
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
			}else {
				p.setHp(p.getMaxHp());

			}
		}

		Time.TLDA50(p.getName() +"は薬草を使った! ",heelPoint+"回復! HP: "+p.getHp()+"\n");
	}


	//** 回復薬 **// 最大HP 1/5
	public static void recoveryAgents(Player p) {
		int heelPoint = 0;
		heelPoint = p.getMaxHp()/5;
		if(heelPoint+p.getHp()<=p.getMaxHp()) {
			p.setHp(p.getHp()+heelPoint);
		}else {
			p.setHp(p.getMaxHp());
		}
		
		Time.TLDA50(p.getName() +": 回復薬を使った! ",heelPoint+"回復! HP: "+p.getHp()+"\n");
	}
	//** 高級回復薬 **// 最大HP 1/3
	public static void highRecoveryAgents(Player p) {
		int heelPoint = 0;
		heelPoint = p.getMaxHp()/3;
		if(heelPoint+p.getHp()<=p.getMaxHp()) {
			p.setHp(p.getHp()+heelPoint);
		}else {
			p.setHp(p.getMaxHp());
		}
		
		Time.TLDA50(p.getName() +": 回復薬を使った! ",heelPoint+"回復! HP: "+p.getHp()+"\n");
	}

		/** 解毒草 50% **/
	public boolean detoxification(Player p) {
		int probability = (int) (Math.random()*100);
		if(probability<=50) {
			return true;
		}else {
			return false;
		}
	}


	//** 解毒薬 70% **//
	public boolean normalDetoxification() {
		int probability = (int) (Math.random()*100);
		if(probability<=70) {
			return true;
		}else {
			return false;
		}
	}


		/* 高級解毒薬 100% */
	public boolean luxuryDetoxification() {
		int probability = (int) (Math.random()*100);
		if(probability<=100) {
			return true;
		}else {
			return false;
		}
	}
}

