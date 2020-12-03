package 町内_店_ギルド_家_協会;

public class Association {			//*村に戻るが完成していない*//


							//教会でのアクション

		String [] ass = {"祈り","セーブ","懺悔","何もない"};
		String [] Repentance = {"死ぬのが怖い","冒険に飽きた","何をしに来たか忘れた"};


	public static void association() {
		System.out.println("神父が現れた。");
		System.out.println("今日は何をされに来ましたか？");
		System.out.println("1:祈り 2:セーブ 3:懺悔 4:何でもない");
		int select = new java.util.Scanner(System.in).nextInt()-1;

		if(select==0) {
			System.out.println("祈った清らかな気持ちになった。");
			goHome();
		}else if(select==1) {
			System.out.println("セーブしました");
		}else if(select==2) {
			System.out.println("何を懺悔しますか？");
			System.out.println("0:死ぬのが怖い 1:冒険に飽きた 2:何をしに来たか忘れた");
			int zange= new java.util.Scanner(System.in).nextInt();
			if(zange == 0) {
				System.out.println("恥じることはありません。死ぬのは怖いものです。");
				System.out.println("ほかに要件はありますか？");
				association();
			}else if(zange==1) {
				System.out.println("セーブしました");
				goHome();
				System.out.println();
			}else {
				System.out.println("村に帰りますか？");
				System.out.println("1:はい 2:いいえ");
				int a = new java.util.Scanner(System.in).nextInt();
				if(a==0) {
					association();
				}
			}
			}

		System.out.println("村に帰ります");
		System.out.println();
		AllAction.moveToAnother();
		}
	public static void goHome(){
		String goHome="村に帰りますか？";
		System.out.println(goHome+"1:はい 2:いいえ");
		int no = new java.util.Scanner(System.in).nextInt()-1;
		if(no==0) {
			System.out.println("村へ帰ります");
			Town.lottery();
	}
	}
}
