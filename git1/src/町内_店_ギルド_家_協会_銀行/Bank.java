package 町内_店_ギルド_家_協会_銀行;

import java.util.InputMismatchException;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Bank{
private static int bankMany=0;
private static String pass;
String name;



	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//	チュ-トリアル時の口座開設暗証番号登録		//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**説明後に口座開設に誘導する**//
	private static void fastC(Player p) {
		Time.TLDB80("銀行員:説明は以上になります。口座開設の準備いたします!");
		Open1(p);
	}

/**	//**入力が誤っていた際のパスワード再設定**/
	public static String pass(Player p) {
		Time.TLDB80("銀行員:4桁のパスワードを入力しなおしてください\n");
		System.out.print("==>");
		String no =new java.util.Scanner(System.in).next();
		return passCheck(no,p);
	}

	//**入力された文字が数列か判定する**//
	 private static String passCheck(String noS,Player p) {
		boolean judge=true;
		if(noS.length()==4){
			for(int i = 0; i < noS.length(); i++) {
				 if(Character.isDigit(noS.charAt(i))){
					 continue;
				 }else {
					 Time.TLDA80("銀行員:","数字以外が混じっています\n\n");
					 judge = false;
					 break;
				 }
			}
		}else {
			Time.TLDA50("銀行員:","4桁ではないみたいです\n\n");
			noS=pass(p);
		}
		if(noS.substring(0,1).equals(noS.substring(1,2)) &&
			noS.substring(2,3).equals(noS.substring(3,noS.length()))) {
			Time.TLDA50("銀行員: "+p.getName()+"さん同じ数字が4つ連続していますよ");
			judge=false;
		}
		if(judge==false) {
			noS=pass(p);
		}
		return noS;
	}


	 private static void Open1(Player p) {
		 Time.TLDB80("\n銀行員:では、"	,p.getName()+"さんの口座を開設します");
		 Open(p);
	 }

	//**口座開設の一連の流れ**//
	private static void Open(Player p) {
		Time.TLDB80("\n銀行員: 4桁のパスワードを入力してください\n\t\t※同じ数字を4つ使用することはできませんのでご注意ください\n");
		System.out.print("==>");
		String no =new java.util.Scanner(System.in).nextLine();
		 no = passCheck(no,p);
		 Time.TLDB80("\n銀行員:",no+"でよろしいでしょうか？\n\n");
		 Time.TLDB80(p.getName(),": [1]:はい [2]:いいえ");
		 int no1 = Num.or12();
		 if(no1==1) {
			 int set = Integer.parseInt(no);
			 p.setBankPass(set);
			 Bank.pass=no;
			 Time.TLDB80("銀行員: 登録完了しました。暗証番号は*"+Bank.pass+"なので忘れないでくださいね！\n\t\tこれからよろしくお願いします！",
					 "またのお越しをお待ちしております‼");
		 }else {
			Open(p);
		 }
	}

	//**入力に間違いがあった場合の入力画面**//
	 public static void OpenError(Player p) {				//private
		Time.TLDB80("銀行員:入力に間違いがあります入力しなおしてください\n\n");
		Open(p);
	}

	//**口座作成時の説明**//
	 public static void announcement(Player p) {		//private
		Time.TLDB80("\n銀行員:説明いたしますね!","当銀行では・入金・出金・残高照会などを承っております。\n\t\t");
		Time.TLDB80("銀行員:"+p.getName()+"様はまだ開設されていませんので、口座開設をしていただいたあと\n\t\t当銀行のサービスを受けることができます\n\n");
	}

	//**新規口座開設時のスタート**//
	public static void fast(Player p) {
		Time.TLDB80("銀行員:"+"こんにちは、今日はどういったご用件でしょうか？\n\n");
		Time.TLDB80("1:口座開設", " 2:説明を聞いた後に口座開設\n\n");
		int a = Num.or12();

		if(a==1) {
			Open1(p);
		}else if(a==2){
			announcement(p);
			fastC(p);
		}
	}



	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//				  通常選択					    //****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**最初の挨拶と選択**//
	public static void bankAction(Player p){
		Time.TLDB50("銀行員: 本日のご用件は何でしょうか？\n\n");
		Time.TLDB50(p.getName()+": [1]:入金 [2]:出金 [3]:貯金を確認する [4]:町へ\n");
		int a = Num.or1234();

		switch(a) {
			case 1:
				payment1(p);//入金
				break;
			case 2:
				withdrawal(p);//出金
				break;
			case 3:
				balance(p);//残高
				break;
			case 4:
				back(p);
				break;
		}
	}


	//**銀行の2回目の選択**//
	public static void bankAction2(Player p){
		Time.TLDB50("\n銀行員： ほかにご用件はありますか？\n\n");
		Time.TLDB50("[1]:入金 [2]:出金 [3]:貯金を確認する [4]:村に戻る\n\n");
		int a = Num.or1234();

		switch(a) {
			case 1:
				payment1(p);
				break;
			case 2:
				withdrawal(p);
				break;
			case 3:
				balance(p);
				break;
			case 4:
			back(p);
				break;
		}
	}


	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//					 入金					    //****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//
	private static void payment1(Player p) {
		Time.TLDB80("銀行員:");
		Time.TLDB80("かしこまりました入金ですね。","いくら入金されますか？\n");
		payment2(p);
	}



	//**入金時の確認**//
	private static void payment2(Player p) {

		Time.TLDB80("貯金残高;"+Bank.bankMany+" 所持金： "+p.many);
		Time.TLDB80("入金する額を入力してください\n\n");
		int a = miss(p);
		Time.TLDB80(a+"の入金でお間違いないですか？\n\n");
		Time.TLDB80(p.getName()+": [1]:はい [2]:いいえ\n");
		System.out.print(p.getName());
		int no = Num.or12();
		if(no==1) {
			if(a>p.many) {
				Time.TLDB50("銀行員:","申し訳ございません"+p.getName()+"さんの手持ち額を超えています。\n\t\t"
						+ "金額を指定しなおしますか？\n\n");
				Time.TLDB50(p.getName()+"[1]:はい [2]:いいえ");
				int b = Num.or12();
				if(b ==1) {
					payment2(p);
				}else {
					Time.TLDB50("\n\n銀行員: 入金をキャンセルしますね\n\n");
				}
			}else {
				Bank.bankMany+=a;
				p.many-=a;
				Time.TLDB80("\n銀行員:"+a+"お預かりいたします\n");
				Time.TLDB80("\n貯金残高:"+Bank.bankMany+" 所持金:"+p.many+"\n\n");
			}
		}else {
			Time.TLDB50("銀行員: 入力し直しますか？\n\n"+p.getName()+": [1]:はい [2]:いいえ\n");
			int c = Num.or12();
			if(c==1) {
				payment2(p);
			}
		}
		bankAction2(p);//銀行のアクション選択
	}


	//**出金**//
	private static void withdrawal(Player p) {
		if(Bank.bankMany>0) {
			Time.TLDB50("銀行員: いくら出金しますか？\n\n"+"貯金残高;"+Bank.bankMany+" 所持金： "+p.many+"\n\n");
			int a = miss(p);
			if(Bank.bankMany>=a) {
				Time.TLDB50(p.getName()+": "+a+"引き出しました。\n");
				Bank.bankMany=Bank.bankMany-a;
				p.many+=a;
				Time.TLDB50("貯金残高;"+Bank.bankMany+" 所持金： "+p.many+"\n\n");
				bankAction2(p);
			}else {
				Time.TLDB50("銀行員: "+p.getName()+"さんの残高が足りず引き出せません・・・\n");
				Time.TLDB50("銀行員： 出金額を再入力しますか？\n");
				Time.TLDB50(p.getName()+"[1]:はい [2]:いいえ\n");
				int b = Num.or12();
				if(b==1) {
					withdrawal(p);
				}else {
					Time.TLDB50("銀行員：かしこまりました。出金を中止いたします!");
				}
			}
		}else {
			Time.TLDB50("銀行員: "+p.getName()+"さん残高0なので引き出すことができません申し訳ございません。\n\n");
		}
		bankAction2(p);//銀行のアクション選択
	}


	//**お金の入力ミスの処理**//
	private static int miss(Player p) {
		System.out.print("==>");
		int a =0;
		try {
			a = new java.util.Scanner(System.in).nextInt();
		}catch(InputMismatchException e) {
			Time.TLDA50("\n銀行員: 数字でないものが含まれています入力しなおしてください");
			withdrawal(p);
		}
		return a;
	}


	//**貯金確認**//
	private static void balance(Player p) {
		Time.TLDB50("\n銀行員: "+p.getName()+"さんの貯金残高は"+Bank.bankMany+"です\n\n");
		bankAction2(p);//銀行のアクション選択
	}

	//**村に帰る**//
	public static void back(Player p){
		Time.TLDB50("銀行から出ますか？ [1]:はい [2];いいえ\n");
		System.out.print("==>");
		int a = Num.or12();
		if (a==1) {
			Time.TLDB50("銀行員: ありがとうございました‼\n\t  またのご来店お待ちしております\n\n");
		}else {
			bankAction2(p);
		}
	}

}