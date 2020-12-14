package バトル11_26;

import 主人公.Player;
import 機能.Time;

public class Item {
	boolean i;

		/*	薬草  */
	public void Herbs(Player p) {
		int heelPoint=15;
		if(p.getHp()+heelPoint<=p.getMaxHp()) {
			p.setHp(p.getHp() + heelPoint);
			Time.TLDA80(p.getName() +"は薬草を使った。HPは"+p.getHp()+"まで回復した。");
		}else if(p.getMaxHp()-15<p.getHp()) {
			p.setHp(p.getMaxHp());
			Time.TLDA80(p.getName()+"は薬草を使った");
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

