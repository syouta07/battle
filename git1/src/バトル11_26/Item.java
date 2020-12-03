package バトル11_26;

import 主人公.Player;

public class Item {
	boolean i;

		/*	薬草  */
	public void Herbs(Player a) {
		int heelPoint=15;
		if(a.getHp()+heelPoint<=a.MaxHp) {
			a.setHp(a.getHp() + heelPoint);
			Time.TLDA80(a.getName() +"は薬草を使った。HPは"+a.getHp()+"まで回復した。");
		}else if(a.MaxHp-15<a.getHp()) {
			a.setHp(a.MaxHp);
			Time.TLDA80(a.getName()+"は薬草を使った");
		}
	}


	public void recoveryAgents(Player a) {
		a.setHp(a.getHp() + 30);

	}

		/*　解毒草　*/
	public boolean detoxification(Player p) {
		int probability = (int) (Math.random()*100);
		if(probability<=50) {
			return true;
		}else {
			return false;
		}
	}
	public boolean normalDetoxification() {
		int probability = (int) (Math.random()*100);
		if(probability<=70) {
			return true;
		}else {
			return false;
		}
	}


		/*　高級解毒薬　*/
	public boolean luxuryDetoxification() {
		int probability = (int) (Math.random()*100);
		if(probability<=100) {
			return true;
		}else {
			return false;
		}
	}
}

