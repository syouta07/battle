package 機能;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import 主人公.Player;

public class Judge {

	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//			パッケージ・チュートリアル			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**主人公の名前を決める**//
	public static void name(Player x) {
		
//		Time.TLDA100("名前を何にしますか？\n");
//		Time.TLDA50("※一文字目は数字や記号以外で入力してください\n");
		String h = Judge.nameJudge();
		Time.TLDA50(h+"でよろしいですか？\n\n");
		System.out.println("[1]:はい [2]:いいえ ");
		//パッケージ・(機能)
		int no = Judge.num1or2();
		if(no==0) {
			Time.TLDA50(h+"に決定しました！");
			x.setName(h);
		}else {
			name(x);
		}
	}

	//**名前の入力判定**//
	public static String nameJudge() {
		System.out.print("==>");
		Scanner name = new Scanner(System.in);
		String h = name.next();
		//文字以外が入力されたときの判定
		
		String noigai = "[a-zA-Z\\p{InHiragana}\\p{InKatakana}"
				+"\\p{InCjkUnifiedIdeographs}\\p{isKanaHalf}]";
		Pattern p1 = Pattern.compile(noigai);
		Matcher m1 = p1.matcher(h.substring(0,1));
		boolean result1 = m1.matches();

		if(result1==false) {
			Time.TLDA50("※先頭の文字に記号や数字が含まれています入力しなおしてください\n");
			nameJudgeMiss();
		}
		name.close();
		return h;
	}

	//**名前の入力ミスがあった際ループを生み出す**//
	public static void nameJudgeMiss() {
		nameJudge();
	}

	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//			1or2で入力を受け取るとき			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//


	//** 1or2を選択するときに使用 **//
	public static int num1or2() {
		System.out.print("==>");
		int no = 0;
		Scanner num = null;
		try {
			num = new Scanner(System.in);
			no = num.nextInt()-1;
			if((no==0 || no==1)) {
				num1or2Miss2();
			}
		}catch (InputMismatchException e) {
			num1or2Miss();
		}
		num.close();
		return no;
	}

	//** 文字列だった場合ループ**//
	public static void num1or2Miss() {
		Time.TLDA50("※\n数字を入力してください\n");
		num1or2();
	}

	//**1or2でなかった場合**//
	public static void num1or2Miss2() {
		Time.TLDA50("※1か2で入力しなおしてください\n");
		num1or2();
	}

}
