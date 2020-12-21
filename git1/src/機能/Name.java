package 機能;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import 主人公.Player;

public class Name {
static String name;

	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//			パッケージ・チュートリアル			//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	//**主人公の名前を決める**//
	public static void name(Player x) {
		Time.TLDA50("\t※一文字目は数字や記号以外で入力してください\n");
		Name.nameJudge();
		Time.TLDA50("\t"+name+"でよろしいですか？\n\n");
		System.out.println("[1]:はい [2]:いいえ ");
		//パッケージ・(機能)
		int no = Num.or12();

		if(no==1) {
			Time.TLDA50("名前を"+name+"に決定しました！");
			x.setName(name);
		}else {
			Time.TLDA50("\t"+name+"から名前を変更します");
			name(x);
		}
	}

	//**名前の入力判定**//
	public static void nameJudge() {
		System.out.print("==>");
		Scanner scan = new Scanner(System.in);
		String h = scan.next();
		res(h);
	}

	//**入力値を判定する**//
	public static void res(String h) {
		//文字以外が入力されたときの判定
		String mozi = "[一-龠ぁ-んァ-ヶa-zA-Z]";
		Pattern p1 = Pattern.compile(mozi);
		Matcher m1 = p1.matcher(h.substring(0,1));
		boolean result1 = m1.matches();

		if(result1==false) {
			Time.TLDA50("※先頭の文字に記号や数字が含まれています入力しなおしてください\n");
			nameJudge();
		}else {
			name = h;

		}
	}
	//**名前の入力ミスがあった際ループを生み出す**//
	public static void nameJudgeMiss() {
		nameJudge();
	}


	//****////****////****////****////****////****////****////****//
	//****//												//****//
	//****//			名前の入力を求める判定				//****//
	//****//												//****//
	//****////****////****////****////****////****////****////****//

	public static void nameWrite(String a,String b) {
		Time.TLDB80("==>");
		Scanner s = new Scanner(System.in);
		String c = s.next();

		if(!(a.equals(c))) {
			nameWriteMiss(a,b);
		}
	}
	public static void nameWriteMiss(String a,String b) {
		Time.TLDB80(b+": 入力にミスがあります\n入力し直してください");
		nameWrite(a,b);
	}
}
