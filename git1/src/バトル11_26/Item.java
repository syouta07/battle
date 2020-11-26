package バトル11_26;

public class Item {
	boolean i;

		/*	薬草  */
	public void Herbs(Player a) {
		int heelPoint=15;
		if(a.hp-a.MaxHp)
		a.hp +=heelPoint;
		Time.TLDA80(a.name +"は薬草を使った。HPは"+a.hp+"まで回復した。");
	}

	public void recoveryAgents(Player a) {
		a.hp += 30;

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

