package バトル11_26;

public class Bank{

						//銀行

	public static void bankAction(){
		System.out.println("本日のご用件は何でしょう");
		System.out.println("1:入金 2:出金 3:貯金を確認する 4:町へ");
		int a = new java.util.Scanner(System.in).nextInt()-1;

						//一回目の作業
		switch(a) {
			case 0:
				payment();
				break;
			case 1:
				withdrawal();
				break;
			case 2:
				balance();
				break;
			case 3:
				back();
				break;
		}				//二回目以降の作業
	}
	public static void bankAction2(){
		System.out.println("ほかにご用件はありますか？");
		System.out.println("1:入金 2:出金 3:貯金を確認する 4:やめる");
		int a = new java.util.Scanner(System.in).nextInt()-1;

		switch(a) {
			case 0:
				payment();
				break;
			case 1:
				withdrawal();
				break;
			case 2:
				balance();
				break;
			case 3:
			back();
				break;
		}
	}

					//入金

	private static void payment() {
		System.out.println("入金ですね。いくら入金しますか？");
		int a = new java.util.Scanner(System.in).nextInt();
		bankAction2();
		System.out.println(a+"円入金しました");
	}

					//出金
	private static void withdrawal() {
		System.out.println("いくら出金しますか？");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.println("\\#a"+"円引き出しました");
		bankAction2();
	}

					//貯金確認
	private static void balance() {
		System.out.print("貯金残高は");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.println("かしこまりました。"+"\\"+"円の入金ですね");
		bankAction2();
	}
					//村に帰る
	private static void back(){
		System.out.println("銀行から出ますか？ 1:はい 2;いいえ");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if (a==0) {
			System.out.println("ありがとうございました");
			try {
				AllAction.moveToAnother();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			bankAction2();
		}
	}
}