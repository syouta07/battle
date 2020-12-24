package バトル11_26;

import 主人公.Player;
import 機能.Time;

public class Item {
	boolean i;

		/*	薬草  */
	public void Herbs(Player p) {
		int heelPoint = 0;
		if(p.getLevel()<=30) {
			heelPoint=p.getMaxHp();
		}else if(p.getLevel()<=50) {
			heelPoint=p.getMaxHp()/6;
		}else if (p.getLevel()<=80) {
			heelPoint=p.getMaxHp()/8;
		}else if(p.getLevel()<=100) {
			heelPoint=p.getMaxHp()/10;
		}
		if(p.getHp()+heelPoint<=p.getMaxHp()) {
			p.setHp(p.getHp() + heelPoint);
		}else if(p.getMaxHp()-15<p.getHp()) {
			p.setHp(p.getMaxHp());
			Time.TLDA80(p.getName()+"は薬草を使った");
		}
		Time.TLDA80(p.getName() +"は薬草を使った。HPは"+p.getHp()+"まで回復した。");
	}


	public void recoveryAgents(Player p) {
		p.setHp(p.getHp() + 30);

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


	//** 解毒草 70% **//
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

