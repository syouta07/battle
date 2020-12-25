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
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-heelPoint)+" → "+p.getHp()+"  "+heelPoint+"回復した!\n");
			}else {
				int a = p.getMaxHp()-p.getHp();
				p.setHp(p.getMaxHp());
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-a)+" → "+p.getMaxHp()+"  "+a+"回復した!\n");
			}
		}else if(p.getLevel()<=50) {
			heelPoint=p.getMaxHp()/8;
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-heelPoint)+" → "+p.getHp()+"  "+heelPoint+"回復した!\n");
			}else {
				int a = p.getMaxHp()-p.getHp();
				p.setHp(p.getMaxHp());
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-a)+" → "+p.getMaxHp()+"  "+a+"回復した!\n");
			}
		}else if (p.getLevel()<=80) {
			heelPoint=p.getMaxHp()/10;
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-heelPoint)+" → "+p.getHp()+"  "+heelPoint+"回復した!\n");
			}else {
				int a = p.getMaxHp()-p.getHp();
				p.setHp(p.getMaxHp());
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-a)+" → "+p.getMaxHp()+"  "+a+"回復した!\n");
			}
		}else if(p.getLevel()<=100) {
			heelPoint=p.getMaxHp()/13;
			if(heelPoint+p.getHp()<=p.getMaxHp()) {
				p.setHp(p.getHp()+heelPoint);
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-heelPoint)+" → "+p.getHp()+"  "+heelPoint+"回復した!\n");
			}else {
				int a = p.getMaxHp()-p.getHp();
				p.setHp(p.getMaxHp());
				Time.TLDA50(p.getName() +": 薬草を使った!\n",p.getName()+" HP: "+(p.getHp()-a)+" → "+p.getMaxHp()+"  "+a+"回復した!\n");
			}
		}


	}


	//** 回復薬 **// 最大HP 1/5
	public static void recoveryAgents(Player p) {
		int heelPoint = p.getMaxHp()/5;
		if(heelPoint+p.getHp()<=p.getMaxHp()) {
			p.setHp(p.getHp()+heelPoint);
			Time.TLDA50(p.getName() +": 回復薬を使った!\n",p.getName()+": HP: "+(p.getHp()-heelPoint)+" → "+p.getHp()+"  "+heelPoint+"回復した!\n");
		}else {
			int a = p.getMaxHp()-p.getHp();
			p.setHp(p.getMaxHp());
			Time.TLDA50(p.getName() +": 回復薬を使った!\n",p.getName()+": HP: "+(p.getHp()-a)+" → "+p.getMaxHp()+"  "+a+"回復した!\n");
		}


	}

	//** 高級回復薬 **// 最大HP 1/2
	public static void highRecoveryAgents(Player p) {
		int heelPoint = 0;
		heelPoint = p.getMaxHp()/2;
		if(heelPoint+p.getHp()<=p.getMaxHp()) {
			p.setHp(p.getHp()+heelPoint);
			Time.TLDA50(p.getName() +": 高級回復薬を使った!\n",p.getName()+" HP: "+(p.getHp()-heelPoint)+" → "+p.getHp()+"  "+heelPoint+"回復した!\n");
		}else {
			int a = p.getMaxHp()-p.getHp();
			p.setHp(p.getMaxHp());
			Time.TLDA50(p.getName() +": 高級回復薬を使った!\n",p.getName()+" HP: "+(p.getHp()-a)+" → "+p.getMaxHp()+"  "+a+"回復した!\n");
		}


	}


	/** 解毒草 50% **/
	public static void detoxification(Player p) {
		int probability = (int) (Math.random()*100);
		if(probability<=50) {
			p.setAbnormal("なし");
			if(p.getHp()==p.getMaxHp()) {
				Time.TLDA50(p.getName()+": 解毒成功‼");

			}else if(p.getHp()+p.getMaxHp()/20<=p.getMaxHp()) {
				p.setHp(p.getHp()+p.getMaxHp()/20);
				Time.TLDA50(p.getName()+": 解毒成功!"," 状態異常:"+p.getAbnormal());
				Time.TLDA50(p.getName()+": HP:"+(p.getHp()-p.getMaxHp()/20)+" → "+p.getHp()+" "+p.getMaxHp()/20+"回復!\n");

			}else {
				int a = p.getMaxHp()-p.getHp();
				p.setHp(p.getMaxHp());
				Time.TLDA50(p.getName()+": 解毒成功!","状態異常:"+p.getAbnormal());
				Time.TLDA50(p.getName()+": HP:"+(p.getHp()-a)+" → "+p.getHp()+"\n");
			}

		}else {
			p.setHp(p.getHp()-p.getMaxHp()/25);
			if(p.getHp()-p.getMaxHp()/25<=0) {
				p.setHp(1);
			}else {
				Time.TLDA50(p.getName()+": 解毒失敗....."+p.getMaxHp()/25+"ダメージを受けた");
				Time.TLDA50(p.getName()+": "+" HP: "+(p.getHp()+p.getMaxHp()/25)+" → "+p.getHp()+"\n");
			}
		}
	}


	/** 解毒薬 70% **/
	public static void normalDetoxification(Player p) {
		int probability = (int) (Math.random()*100);
		if(probability<=70) {
			p.setAbnormal("なし");


			//** 回復に成功し かつ HP＋回復量 <= 最大HP以下 **//
			if(p.getHp()+p.getMaxHp()/25<=p.getMaxHp()) {
				p.setHp(p.getHp()+p.getMaxHp()/15);
				Time.TLDA50(p.getName()+": 解毒成功!","状態異常:"+p.getAbnormal());
				Time.TLDA50(p.getName()+": "+p.getMaxHp()/15+"回復した! HP: "+(p.getHp()-p.getMaxHp()/15)+" → "+p.getHp()+"\n");

			//** 体力が最大の時 **//
			}else if(p.getHp()==p.getMaxHp()){
				Time.TLDA50(p.getName()+": 解毒成功‼\n");

			//** HP + 回復量 >= 最大HP **//
			}else {
				int a = p.getMaxHp()-p.getHp();
				p.setHp(p.getMaxHp());
				Time.TLDA50(p.getName()+": 解毒成功!","状態異常:"+p.getAbnormal());
				Time.TLDA50(p.getName()+": "+a+"回復した! HP: "+(p.getHp()-a)+" → "+p.getHp()+"\n");
			}
		}else {

			if(p.getHp()-p.getMaxHp()/30>=1) {
				p.setHp(p.getHp()-p.getMaxHp()/30);
				Time.TLDA50(p.getName()+": 解毒に失敗した.....");
				Time.TLDA50(p.getName()+": "+p.getMaxHp()/30+"ダメージを受けた! HP:"+(p.getHp()+p.getMaxHp()/30)+" → "+p.getHp()+"\n");
			}else {
				p.setHp(1);
			}
		}
	}

	/** 高級解毒薬 100% **/
	public static void luxuryDetoxification(Player p) {
		p.setAbnormal("なし");
		if(p.getHp()+p.getMaxHp()/10<=p.getMaxHp()) {
			p.setHp(p.getHp()+p.getMaxHp()/10);
			Time.TLDA50(p.getName()+": 解毒成功!","状態異常:"+p.getAbnormal());
			Time.TLDA50(p.getName()+": "+p.getMaxHp()/10+"回復した!"+(p.getHp()-p.getMaxHp()/10)+" → "+p.getHp()+"\n");
		}else if(p.getHp()==p.getMaxHp()){
			p.setHp(p.getMaxHp());
			Time.TLDA50(p.getName()+": 解毒成功‼\n");
		}else {
			p.setHp(p.getHp()+p.getMaxHp()/10);
		}
	}

}

