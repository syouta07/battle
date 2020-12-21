package 町内_店_ギルド_家_協会_銀行;

import java.util.InputMismatchException;
import java.util.Scanner;

import 主人公.Player;
import 機能.Num;
import 機能.Time;

public class Bank{
private static int bankMany=0;
private static String pass;
private static int no;
String name;


	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//	チュ-トリアル時の口座開設暗証番号登録		//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**説明後に口座開設に誘導する**//
	private static void fastC(Player p) {
		Time.TLDB80("銀行員:説明は以上になります。口座開設の準備いたします!");
		Open(p);
	}

	//**入力が誤っていた際のパスワード再設定**//
	private static String pass(Player p) {
		Time.TLDB80("銀行員:4桁のパスワードを入力しなおしてください");
		System.out.println("==>");
		String St =new java.util.Scanner(System.in).next();
		return passCheck(St,p);
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

	//**口座開設の一連の流れ**//
	private static void Open(Player p) {

		Time.TLDB80("\n銀行員:では、"	,p.getName()+"さんの口座を開設しますので4桁のパスワードを入力してください\n\t\t※同じ数字を4つ使用することはできませんのでご注意ください\n==>");
		String no =new java.util.Scanner(System.in).nextLine();
		 no = passCheck(no,p);
		 Time.TLDB80("銀行員:",no+"でよろしいでしょうか？\n\n");
		 Time.TLDB80(p.getName(),": [1]:はい [2]:いいえ");
		 int no1 = Num.or12();
		 if(no1==1) {
			 int set = Integer.parseInt(no);
			 p.setBankPass(set);
			 Bank.pass=no;
			 Time.TLDB80("銀行員:","登録完了しました。暗証番号は*"+Bank.pass+"なので忘れないでくださいね！\n\t\tこれからよろしくお願いします！",
					 "またのお越しをお待ちしております‼");
		 }else {
			 pass(p);
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
			Open(p);
		}else if(a==2){
			announcement(p);
			fastC(p);
		}
	}

	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//					 選択					    //****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**最初の挨拶と選択**//
	public static void bankAction(Player p){
		System.out.println("本日のご用件は何でしょう");
		System.out.println("1:入金 2:出金 3:貯金を確認する 4:町へ");
		int a = new java.util.Scanner(System.in).nextInt()-1;

		switch(a) {
			case 0:
				payment(p);//入金
				break;
			case 1:
				withdrawal(p);//出金
				break;
			case 2:
				balance(p);//残高
				break;
//			case 3:
//				back(p);
//				break;
		}
	}
	//**銀行の2回目の選択**//
	public static void bankAction2(Player p){
		System.out.println("ほかにご用件はありますか？");
		System.out.println("1:入金 2:出金 3:貯金を確認する 4:やめる");
		int a = new java.util.Scanner(System.in).nextInt()-1;

		switch(a) {
			case 0:
				payment(p);
				break;
			case 1:
				withdrawal(p);
				break;
			case 2:
				balance(p);
				break;
			case 3:
			back(p);
				break;
		}
	}


	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//					 入金					    //****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	private static void payment(Player p) {
		Time.TLDB80("銀行員:");
		Time.TLDB80("かしこまりました入金ですね。","いくら入金されますか？\n\n");
		Time.TLDB80("入金する額を入力してください");
		System.out.println("==>");
		int a = new java.util.Scanner(System.in).nextInt();
		Time.TLDB80(a+"の入金でお間違いないですか？\n\n");
		Time.TLDB80(p.getName()+": [1]:はい [2]:いいえ");
		System.out.print(p.getName()+"==>");
		int no = new java.util.Scanner(System.in).nextInt();
		if(no==1) {
			if(a>p.many) {
				Time.TLDB80("銀行員:","申し訳ございません"+p.getName()+"さんがお預けいしたい金額が手持ち額を超えているようですので、\n\t\t"
						+ "金額を指定しなおしますか？");
			}else {
				Bank.bankMany+=a;
				p.many-=a;
				Time.TLDB80("銀行員:"+a+"お預かりいたします\n\n");
				Time.TLDB80("\n貯金残高:"+Bank.bankMany+" 所持金:"+p.many);
			}
		}

		bankAction2(p);//銀行のアクション選択
	}

	//**出金**//
	private static void withdrawal(Player p) {
		Time.TLDB80("銀行員: いくら出金しますか？\n\n==>");
		int a = new java.util.Scanner(System.in).nextInt();
		if(Bank.bankMany>=a) {
			Time.TLDB80(p.getName()+": "+a+"引き出しました。\n"+"\t\t貯金残高");
		}else {
			Time.TLDB80("銀行員: "+p.getName()+"さんの残高が足りず引き出せません・・・");
		}
//		bankAction2(p);//銀行のアクション選択
	}

	//**貯金確認**//
	private static void balance(Player p) {
		Time.TLDB80("銀行員: "+p.getName()+"さんの貯金残高は"+Bank.bankMany+"です");
		bankAction2(p);//銀行のアクション選択
	}

	//**村に帰る**//
	public static void back(Player p){
		System.out.println("銀行から出ますか？ 1:はい 2;いいえ");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if (a==0) {
			System.out.println("ありがとうございました");
			try {
				AllAction.moveToAnother(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			bankAction2(p);
		}
	}

	public static void or12() {
		System.out.print("==>");

		try {
			Scanner n = new Scanner(System.in);
			int ans = n.nextInt();
			if(ans==1 || ans==2) {
				no = ans;
			}else {
				System.out.println("1or2で入力してください");
				or12();
			}

		}catch (InputMismatchException e) {
			System.out.println("数字ではありませんもう一度入力直してください");
			System.out.println("-->");
			or12();
		}
	}


	public static void num1or2Miss() {
		Time.TLDA50("\n※数字を入力してください\n");
		or12();
	}

	//**1or2でなかった場合**//
	public static void num1or2Miss2() {
		Time.TLDA50("\n※1か2で入力しなおしてください\n");
		or12();
	}
}