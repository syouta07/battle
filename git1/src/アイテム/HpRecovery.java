package アイテム;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Time;

public class HpRecovery {

	/*	薬草  */
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


	//** 回復薬 **//  /* 最大HP 1/5 */
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

	//** 高級回復薬 **// /* 最大HP 1/2 */
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


	//** 全体回復の粉塵を使用した場合 **//
	public static void AllRecoveryAgents(ArrayList<Player> list) {
		Time.TLDA50(list.get(0).getName()+": 粉塵を使用した!");

		//** 格納した人数分の配列を回す **//
		for(int i=0; i<list.size(); i++) {

			//** 配列から一人ずつとりだして回復値を計算し最大値を超えないように調整する **//

			int befor = list.get(i).getHp();
			int after 	= list.get(i).getMaxHp()/2+list.get(i).getHp();
			int Max = list.get(i).getMaxHp();
			//もともとHPが最大であるとき
			if(Max==befor) {
				Time.TLDA50(list.get(i).getName()+": HPがMaxのため何も起こらなかった...");

				//死亡している場合
			}else if(befor==0){
				Time.TLDA50(list.get(i).getName()+": 何も起こらなかった...\n");

				//回復をしても最大HPを超えない場合
			}else if(after<=Max) {
				Time.TLDA50(list.get(i).getName()+": "+befor+" → "+after+"  "+(after-befor)+"回復した‼\n");
				list.get(i).setHp(after);//回復量を上書きする

				//** 回復すると最大HPを超える **//
			}else if(after>Max){
				Time.TLDA50(list.get(i).getName()+": "+befor+" → "+list.get(i).getMaxHp()+"  "+(list.get(i).getMaxHp()-befor)+"回復した‼");
				list.get(i).setHp(list.get(i).getMaxHp());//最大HPに上書きする
			}
		}
	}
}

