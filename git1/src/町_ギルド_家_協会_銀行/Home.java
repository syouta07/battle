package 町_ギルド_家_協会_銀行;

import java.util.ArrayList;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Home {

//** アイテム管理ボックス **//
//[0]:薬草 [1]:回復薬 [2]:高級回復薬 [3]:粉塵 [4]:解毒草 [5]:解毒薬 [6]:高級解毒薬 [7]:鬼力の種 [8]:硬化の種 [9]:鬼力薬 [10]:硬化薬
 private static String []  item = {"薬草","回復薬","高級回復薬","粉塵","解毒草","解毒薬","高級解毒薬","鬼力の種","硬化の種","鬼力薬"
 		+ "","硬化薬"};
 private static int []  itemMany= new int [11];
 public static ArrayList<Player> Friend = new ArrayList<Player>();


	public static void Action(ArrayList<Player> people){
		Time.TLDB50(people.get(0).getName()+": 何をしますか？\n");
		Time.TLDB50("[1]:アイテム管理 [2]:仲間 [3]:寝る [4]:町へ行く\n");
		int a  =Num.or1234();
		if(a==1) {
			//アイテム管理選択画面
			item(people);
		}else if(a==2) {
			//バトルのメンバーを選択
			FriendAction(people);
		}else if(a==3) {
			//** 眠る 仲間全員のHP全回復 **//
			homeSleep(people);
			Action(people);
		}else {
			AllAction.lottery(people);
		}
	}

	//** 仲間を選択する **//
	public static void FriendAction(ArrayList<Player> people){
		Time.TLDB50(people.get(0).getName()+": 何をしますか？\n");
		Time.TLDB50(people.get(0).getName()+": [1]:仲間を置いていく [2]:仲間を連れていく [3]:戻る\n");
		int a = Num.or123();
		if(a==1) {
			FriendPutOn(people);
		}else if(a==2) {
			FriendPicUp(people);
		}else {
			Action(people);
		}
	}

	//仲間を連れていく
	public static void FriendPicUp(ArrayList<Player> people) {
		if(Friend.size()==0) {
			Time.TLDB50(people.get(0).getName()+": 待機している仲間がいません\n\n");
			FriendAction(people);
		}else {
			Time.TLDB50(people.get(0).getName()+": 誰を連れていきますか？\n");
			for(int i=0; i<Friend.size(); i++) {
				Time.TLDB50("["+(i+1)+"]:"+Friend.get(i).getName()+" level "+Friend.get(i).getLevel()+" ");
			}
			Time.TLDB50("["+(Friend.size()+1)+"]: "+"戻る\n");
		}
		try {
			int a =Num.or1234();
			if(Friend.size()+1==a) {
				FriendAction(people);
			}else {
				//パーティーメンバーが3人以下の時
				if(people.size()<4) {
					people.add(Friend.get(a-1));
					Friend.remove(a-1);
					System.out.println();
					Time.TLDB50(people.get(0).getName()+": チーム編成をしました!\n\n");
					Time.TLDB50("現在のメンバー  → ");
					for(int i=0; i<people.size(); i++) {
						Time.TLDB50(people.get(i).getName()+" ");
					}

					System.out.println();
					//編成終了後仲間の選択画面に戻る
					FriendAction(people);

					//パーティーメンバーが上限に達しているとき
				}else {
					Time.TLDB50(people.get(0).getName()+": パーティー人数が上限なので仲間を選択することができません\n");
					FriendAction(people);
				}
			}
		}catch(IndexOutOfBoundsException e) {
			FriendAction(people);
		}

	}

	//仲間を置いていく
	public static void FriendPutOn(ArrayList<Player> people){
		if(people.size()==1) {
			Time.TLDB50(people.get(0).getName()+": チームは一人以上いなければなりません!\n");
		}else {
			Time.TLDB50(people.get(0).getName()+": 誰を置いていきますか?\n");
			for(int i=0; i<people.size(); i++) {
				Time.TLDB50("["+(i+1)+"]:"+people.get(i).getName());
			}
			Time.TLDB50("["+(people.size()+1)+"]:戻る\n");
			try {
				int a = Num.or1234();
				Time.TLDB50(people.get(0).getName()+": "+people.get(a-1).getName()+"を置いていきますか?\n\n");
				Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ\n\n");
				int b = Num.or12();
				if(b==1) {
					Time.TLDB50(people.get(0).getName()+": "+people.get(a-1).getName()+"をパーティーから外しました!\n");
					Friend.add(people.get(a-1));
					people.remove(a-1);
					FriendAction(people);
				}else {
					FriendAction(people);
				}
			}catch(IndexOutOfBoundsException e){
				FriendAction(people);
			}
		}
	}

	//**睡眠での回復**//  //死者は回復しない
	public static void homeSleep(ArrayList<Player> people) {
		int count =0;
		for(int i=0; i<people.size(); i++) {
			if(people.get(i).getHp()==people.get(i).getMaxHp() && people.get(i).getAbnormal().equals("なし")) {
				count++;
			}
		}
		if(count==people.size()) {
			Time.TLDB50(people.get(0).getName()+": 全員健康状態が良い!他のことをしよう!\n\n");
		}else {
			Time.TLDB50(people.get(0).getName()+": 寝ることにしよう\n\n");
			for(int i=0; i<people.size(); i++) {
				if(people.get(i).getHp()>=1) {
					Time.TLDB50(people.get(i).getName()+": HP "+people.get(i).getHp()+" → "+people.get(i).getMaxHp()+"\n");
					Time.TLDB50(people.get(i).getName()+": 状態異常 "+people.get(i).getAbnormal()+" → "+"なし\n\n");
					people.get(i).setHp(people.get(i).getMaxHp());
					people.get(i).setAbnormal("なし");
				}else {
					Time.TLDB50(people.get(i).getName()+": は死亡しているため回復できません・・・\n\n");
				}
			}
			for(int i=0; i<people.size(); i++) {
				Time.TLDAL50(people.get(0).getName()+" ");
			}
			Time.TLDB50("全員の体力を回復しました。\n");
			Action(people);
		}

	}


	//**死んだときにリスタート**//
	public static void die(ArrayList<Player> people,String place) {
		Time.TLDB50(people.get(0).getName()+":"+place+"で瀕死状態になったところを助けてもらえたようだ・・・\n","\t\t手持ちのお金が半分になった");
		Time.TLDB50(people.get(0).many+"==>");
		people.get(0).many=people.get(0).many/2;
		Time.TLDB50(""+people.get(0).many);
		Action(people);
	}


	//** アイテム管理 **//
	public static void item(ArrayList<Player> people) {
		Time.TLDB50(people.get(0).getName()+": [1]:アイテムをしまう [2]:取り出す [3]:持ち物を確認する [4]:戻る\n");
		int a = Num.or1234();
		if(a==1) {
			itemPut(people);
		}else if(a==2) {
			itemPickUp(people);
		}else if(a==3){
			check(people);
		}else {
			Action(people);
		}
	}


	//** アイテムをしまう **//
	public static void itemPut(ArrayList<Player> people) {
		int count=0;
		//アイテム表示
		for(int i=0; i<getItem().length; i++) {
			count++;
			if(people.get(0).getItemMany(i)>=1) {


				//所有数が1～9
				if(people.get(0).getItemMany(i)<=9) {

					//かつアイテム表示番号が1～9
					if(count<=9) {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"] : \t  "+getItem()[i]+"\t\t *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" *  "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"] : "+getItem()[i]+" *  "+people.get(0).getItemMany(i));
						}
					//かつアイテム表示番号が10以上
					}else {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"]: \t  "+getItem()[i]+" \t *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" *  "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"]: "+getItem()[i]+" *  "+people.get(0).getItemMany(i));
						}
					}

				//所有数が10以上
				}else {
					//かつ表示番号が1～9
					if(count<=9){
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"] : \t  "+getItem()[i]+" \t * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"] : "+getItem()[i]+" * "+people.get(0).getItemMany(i));
						}
					//かつ表示番号が10以上
					}else {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"]: \t  "+getItem()[i]+" \t * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"]: "+getItem()[i]+" * "+people.get(0).getItemMany(i));
						}
					}
				}
			}else {
				//所有数が0でアイテム表示番号が9以下
				if(count<=9) {
					if(getItem()[i].length()==1) {
						System.out.println("["+count+"] : \t  "+getItem()[i]+"\t\t * "+"--");
					}else if(getItem()[i].length()==2) {
						System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+"--");
					}else if(getItem()[i].length()==3){
						System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+"--");
					}else if(getItem()[i].length()==4){
						System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+"--");
					}else {
						System.out.println("["+count+"] : "+getItem()[i]+" * "+"--");
					}
				//所有数が0でアイテム表示番号が10以上
				}else {
					if(getItem()[i].length()==1) {
						System.out.println("["+count+"]: \t  "+getItem()[i]+" \t * "+"--");
					}else if(getItem()[i].length()==2) {
						System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+"--");
					}else if(getItem()[i].length()==3){
						System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+"--");
					}else if(getItem()[i].length()==4){
						System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+"--");
					}else {
						System.out.println("["+count+"]: "+getItem()[i]+" * "+"--");
					}
				}
			}
		}
		System.out.println("\n["+(count+1)+"]: "+"   戻る\n");
		Time.TLDB50(people.get(0).getName()+": 何をしまいますか？\n");
		int a = Num.or1To12();
		if(a==12) {
			//戻るを選択
			Action(people);
		}else {
			//取り出すアイテムを選択
			putMany(people,a);
		}
	}

	//取り出す個数を確定する
	public static void putMany(ArrayList<Player> people,int no) {
		if(people.get(0).getItemMany(no-1)==0) {
			Time.TLDB50(people.get(0).getName()+": "+getItem()[no-1]+"を持っていないためしまうことができません!\n");
			Time.TLDB50(people.get(0).getName()+": しまうアイテムを選択しなおしますか?\n");
			Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ\n");
			int ans = Num.or12();
			if(ans==1) {
				itemPut(people);
			}else {
				item(people);
			}
		}else {
			Time.TLDB50(people.get(0).getName()+": "+getItem()[no-1]+"を何個しまいますか？\n");
			int a = Num.HowMany();
			if(a<=people.get(0).getItemMany(no-1)) {
				itemMany[no-1]+=a;
				people.get(0).setItemMany(no-1,people.get(0).getItemMany(no-1)-a);
				Time.TLDB50(people.get(0).getName()+": "+getItem()[no-1]+"を "+a+" 個しまいました!\n");
				Time.TLDB50(people.get(0).getName()+": 所持数→"+people.get(0).getItemMany(no-1)+"個\n");
			}else {
				Time.TLDB50(people.get(0).getName()+": 所持数を超えています。再入力しなおしますか?\n\n");
				Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ\n");
				int ans = Num.or12();
				if(ans==1) {
					picMany(people,no);
				}else {
					item(people);
				}
			}
			System.out.println();
			item(people);
		}
	}




	//** アイテムを取り出す **//
	public static void itemPickUp(ArrayList<Player> people) {

		//[0]:薬草 [1]:回復薬 [2]:高級回復薬 [3]:粉塵 [4]:解毒草 [5]:解毒薬
		//[6]:高級解毒薬 [7]:鬼人種 [8]:鬼人薬 [9]:忍耐の種 [10]:硬化薬

		int count =0;

		System.out.println("\nアイテBOX");
		System.out.println("------------------------------------");

		//アイテム表示
		for(int i=0; i<getItem().length; i++) {
			count++;
			if(getItemMany(i)>=1) {


				//所有数が1～9
				if(getItemMany(i)<=9) {

					//かつアイテム表示番号が1～9
					if(count<=9) {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"] : \t  "+getItem()[i]+"\t\t *  "+getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" *  "+getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" *  "+getItemMany(i));
						}else {
							System.out.println("["+count+"] : "+getItem()[i]+" *  "+getItemMany(i));
						}
					//かつアイテム表示番号が10以上
					}else {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"]: \t  "+getItem()[i]+" \t *  "+getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" *  "+getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" *  "+getItemMany(i));
						}else {
							System.out.println("["+count+"]: "+getItem()[i]+" *  "+getItemMany(i));
						}
					}

				//所有数が10以上
				}else {
					//かつ表示番号が1～9
					if(count<=9){
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"] : \t  "+getItem()[i]+" \t * "+getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+getItemMany(i));
						}else {
							System.out.println("["+count+"] : "+getItem()[i]+" * "+getItemMany(i));
						}
					//かつ表示番号が10以上
					}else {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"]: \t  "+getItem()[i]+" \t * "+getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+getItemMany(i));
						}else {
							System.out.println("["+count+"]: "+getItem()[i]+" * "+getItemMany(i));
						}
					}
				}
			}else {
				//所有数が0でアイテム表示番号が9以下
				if(count<=9) {
					if(getItem()[i].length()==1) {
						System.out.println("["+count+"] : \t  "+getItem()[i]+"\t\t * "+"--");
					}else if(getItem()[i].length()==2) {
						System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+"--");
					}else if(getItem()[i].length()==3){
						System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+"--");
					}else if(getItem()[i].length()==4){
						System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+"--");
					}else {
						System.out.println("["+count+"] : "+getItem()[i]+" * "+"--");
					}
				//所有数が0でアイテム表示番号が10以上
				}else {
					if(getItem()[i].length()==1) {
						System.out.println("["+count+"]: \t  "+getItem()[i]+" \t * "+"--");
					}else if(getItem()[i].length()==2) {
						System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+"--");
					}else if(getItem()[i].length()==3){
						System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+"--");
					}else if(getItem()[i].length()==4){
						System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+"--");
					}else {
						System.out.println("["+count+"]: "+getItem()[i]+" * "+"--");
					}
				}
			}
		}


		System.out.println("\n["+(count+1)+"]: "+"   戻る\n");
		Time.TLDB50(people.get(0).getName()+": 何を取り出しますか？\n");
		int a = Num.or1To12();
		if(a==12) {
			//戻るを選択
			Action(people);
		}else {
			//しまうアイテムを選択
			picMany(people,a);
		}
	}


	//** アイテムを取り出す個数を決める **//
	public static void picMany(ArrayList<Player> people,int no) {
		System.out.println(itemMany[no-1]);
		if(itemMany[no-1]==0) {
			Time.TLDB50(people.get(0).getName()+": "+getItem()[no-1]+"があいてむBOXにないため取り出すことができません!\n");
			Time.TLDB50(people.get(0).getName()+": 取り出すアイテムを選択しなおしますか?\n");
			Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ\n");
			int ans = Num.or12();
			if(ans==1) {
				itemPickUp(people);
			}else {
				item(people);
			}
		}else {
			Time.TLDB50(people.get(0).getName()+": "+getItem()[no-1]+"を何個取り出しますか？\n");
			int a = Num.HowMany();
			if(a<=itemMany[no-1]) {
				itemMany[no-1]-=a;
				people.get(0).setItemMany(no-1,people.get(0).getItemMany(no-1)+a);
				Time.TLDB50(people.get(0).getName()+": "+getItem()[no-1]+"を "+a+" 個取り出しました!\n");
				Time.TLDB50(people.get(0).getName()+": 所持数→"+people.get(0).getItemMany(no-1)+"個\n");
			}else {
				Time.TLDB50(people.get(0).getName()+": 所持数を超えています。再入力しなおしますか?\n\n");
				Time.TLDB50(people.get(0).getName()+": [1]:はい [2]:いいえ\n");
				int ans = Num.or12();
				if(ans==1) {
					picMany(people,no);
				}else {
					item(people);
				}
			}
		}
	}


	//主人公のアイテムの表示
	public static void check(ArrayList<Player> people) {
		int count=0;
		//アイテム表示
		for(int i=0; i<getItem().length; i++) {
			count++;
			if(people.get(0).getItemMany(i)>=1) {


				//所有数が1～9
				if(people.get(0).getItemMany(i)<=9) {

					//かつアイテム表示番号が1～9
					if(count<=9) {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"] : \t  "+getItem()[i]+"\t\t *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" *  "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"] : "+getItem()[i]+" *  "+people.get(0).getItemMany(i));
						}
					//かつアイテム表示番号が10以上
					}else {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"]: \t  "+getItem()[i]+" \t *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" *  "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" *  "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"]: "+getItem()[i]+" *  "+people.get(0).getItemMany(i));
						}
					}

				//所有数が10以上
				}else {
					//かつ表示番号が1～9
					if(count<=9){
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"] : \t  "+getItem()[i]+" \t * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"] : "+getItem()[i]+" * "+people.get(0).getItemMany(i));
						}
					//かつ表示番号が10以上
					}else {
						if(getItem()[i].length()==1) {
							System.out.println("["+count+"]: \t  "+getItem()[i]+" \t * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==2) {
							System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==3){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+people.get(0).getItemMany(i));
						}else if(getItem()[i].length()==4){
							System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+people.get(0).getItemMany(i));
						}else {
							System.out.println("["+count+"]: "+getItem()[i]+" * "+people.get(0).getItemMany(i));
						}
					}
				}
			}else {
				//所有数が0でアイテム表示番号が9以下
				if(count<=9) {
					if(getItem()[i].length()==1) {
						System.out.println("["+count+"] : \t  "+getItem()[i]+"\t\t * "+"--");
					}else if(getItem()[i].length()==2) {
						System.out.println("["+count+"] :   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   * "+"--");
					}else if(getItem()[i].length()==3){
						System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+"--");
					}else if(getItem()[i].length()==4){
						System.out.println("["+count+"] : "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+"--");
					}else {
						System.out.println("["+count+"] : "+getItem()[i]+" * "+"--");
					}
				//所有数が0でアイテム表示番号が10以上
				}else {
					if(getItem()[i].length()==1) {
						System.out.println("["+count+"]: \t  "+getItem()[i]+" \t * "+"--");
					}else if(getItem()[i].length()==2) {
						System.out.println("["+count+"]:   "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"   *  "+"--");
					}else if(getItem()[i].length()==3){
						System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+"  "+getItem()[i].substring(1,2)+"  "+getItem()[i].substring(2,3)+" * "+"--");
					}else if(getItem()[i].length()==4){
						System.out.println("["+count+"]: "+getItem()[i].substring(0,1)+" "+getItem()[i].substring(1,3)+" "+getItem()[i].substring(3,4)+" * "+"--");
					}else {
						System.out.println("["+count+"]: "+getItem()[i]+" * "+"--");
					}
				}
			}
		}
		System.out.println();
		item(people);
	}

	public static int getItemMany(int no) {
		return itemMany[no];
	}


	public static void setItemMany(int no,int many) {
		itemMany[no] = many;
	}

	public static String [] getItem() {
		return item;
	}

	public static void setItem(String [] item) {
		Home.item = item;
	}

}
