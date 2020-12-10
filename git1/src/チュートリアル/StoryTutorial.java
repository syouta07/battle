package チュートリアル;

import バトル11_26.Time;
import 主人公.Hero;
import 主人公.Player;
import 町内_店_ギルド_家_協会.Home;

public class StoryTutorial {

	public static void tutorial(Player x){
//		Time.TLDA80("これから冒険をはじめます\n\n");
//		System.out.print(x.getName()+":");
//		Time.rug15();
//		Time.TLDA100(" (ここは"+"・・・・"+"どこだ・・・・)");
//		Time.TLDA100("\t\t(どうやら気を失っていたらしい)\n");
//		System.out.print("おじいさん:");
//		Time.TLDA80(" やっと気が付いたかい？"+"\n\t\t\tお前さん冒険者だろ?"+"その服装ですぐわかったよ\n\n");
//		System.out.print("おじいさん:");
//		Time.TLDA80(" わしはこの村で村長をしておるコードじゃ\n","\t\t\tお前さんは名は何というのかね？\n");
//		Time.rug10();
//		System.out.print(x.getName()+":");
//		Time.TLDB80(" あれ？");
//		Time.TLDB80("名前が思い出せない"+"・・・\n\n");
//		System.out.print("村長:");
//		Time.TLDB80("無理に答えなくてもいいよ\n\t","お前さん帰る場所あるのかい？");
//		System.out.print(x.getName()+":");
//		Time.TLDB300("・・・\n");
//		System.out.print("村長:");
//		Time.TLDB80("君がよければ冒険者としてこの村で働かないか？\n\n");
//		Time.rug10();
//		System.out.print(x.getName()+":");
//		Time.TLDA80(" (今の俺にはいく場所がない・・・ここでお世話になろう)","\tおねがいいします！\n");
//		Time.TLDB80("村長:"+"冒険者になるにはギルドカードが必要になる。"+"\n\tギルドはこの町にあるから行って登録してくるといい。"
//				,"\n\t登録までに名前を考えておくんだぞ、出身地は私のほうで話をつけておくよ","\n\tギルドまで馬車を使ったほうが早く着くぞ、お金を持っているか？");
//		System.out.print("\n"+x.getName()+"[1]:はい [2]:いいえ>");
//		int i = new java.util.Scanner(System.in).nextInt()-1;
//		if(i==1) {
//			System.out.print("\n村長:");
//			Time.TLDA80("少ないがこれだけあれば足りるだろう\n");
//			System.out.print("名無し:");
//			Time.TLDA100("村長から1000ゴールドもらった");
//			x.many=1000;
//		}else {
//			System.out.print(x.getName()+":");
//			Time.TLDA100("これ以上迷惑をかけられないここは歩いて行こう！");
//		}
		Time.TLDA100("\tそういえば名前を決めておかなければいけないな！");
		Time.TLDA100("\tギルドに行く前に名前を決めましょう");
		Hero.name(x);
		Time.TLDA300("\n\nてくてくてくてくてく\n\n・・・・・\n");
		Time.TLDA80(x.name+":"+"ここがギルドか！\n");
		Time.TLDA300("\nガチャ\n");
		Time.TLDA300("…ギー\n");
		System.out.print("\nギルドの受付: ");
		Time.TLDB80("初めて見る顔だね");
		Time.TLDB300("……");
		Time.TLDB80("\t\t冒険者登録かい?\n");
		Time.rug10();
		Time.TLDB80("ギルドの受付:");
		Time.TLDB80(" 名前を思い出せない子だろ?","話は聞いているよ登録するからちょっと待ってな");
		Time.TLDA300("・・・・・・・\n");
		Time.TLDA300("\t\tここに名前を書きな\n");
		boolean ans = false;
		while(!ans) {
			System.out.print("==>");
			String name = new java.util.Scanner(System.in).nextLine();
			if(!(name.equals(x.name))) {
				System.out.print("ギルド受付:");
				Time.TLDA80("名前を間違っているよ正式な手続きだから間違えないようにね","もう一度書き直しな！");
			}else {
				ans= true;
			}
		}


		Time.TLDB80("ギルドの受付:登録終わったよ。\n");
		Time.TLDA80("\nギルドの受付:強いモンスターを倒して早くAランクを目指しな‼");
		Time.TLDA80("\t\t"+"どうださっそくクエストをうけるかい？\n");
		Time.TLDA80(x.name+"今日はやめておこう\n");
		System.out.println("\n\n1:いいえ");
		int c = new java.util.Scanner(System.in).nextInt()-1;
		System.out.print("\nギルドの受付:");
		Time.TLDA80("そうかまだ来たばかりだゆっくり町でも見るといい\n");
		System.out.println("ギルドを出ました。");
		Time.TLDA80("せっかくだから町に行ってみよう");
		tutorial2(x);
	}

	public static void tutorial2(Player x){
		Time.TLDB300("\n\nがやがやがや\n");
		System.out.print(x.name+":");
		Time.TLDB300("(…町はにぎやかだな…)\n");
		System.out.print("村長:");
		Time.TLDB80(x.name+"くん登録が終わったみたいだな!\n");
		System.out.print("\n村長:");
		Time.TLDB80("用事は済んだんだろ？"+"今日はゆっくり町でも見て装備や道具をそろえるといい\n");
		Time.TLDB80("\t\t\tあと伝え忘れていたが、"+x.name+"用に家を準備してある","しばらくの間はそこを拠点にするといい\n");
		Time.rug20();
		tutorialTown(x);
	}
	public static void tutorialTown(Player x){
		System.out.println(x.name+": ");
		Time.TLDB80("どこに行こうかな\n");
		System.out.println("[1]:武器屋 [2]:防具屋 [3]:商店 [4]:帰る\n");
		int a  =new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			Time.TLDB80("\n武器屋に行こう\n");
			tutorialWeapon(x);
		}else if(a==1) {
			Time.TLDB80("\n防具屋に行こう\n");
			tutorialArmor(x);
		}else if(a==2) {
			Time.TLDB80("\n商店に行こう\n");
			tutorialGoods(x);
		}else if(a==3) {
			Time.TLDB80("\n家に帰るとするか\n");
				Home.Action();
		}else {
			tutorialTown(x);
		}
	}
	public static void tutorialWeapon(Player x){
		Time.TLDB80("店主:"+"何をお求めで？\n");
		System.out.println("1:片手剣 2:双剣 3:槍 4:やっぱりやめておくよ");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			Time.TLDB80("片手剣はこんなのがあるぞ"+"また来てくれよな\n");
			tutorialWeapon(x);
		}else if(b==1) {
			Time.TLDB80("双剣はこんなのがあるぞ"+"また来てくれよな\n");
			tutorialWeapon(x);
		}else if(b==2) {
			Time.TLDB80("槍はこんなのがあるぞ"+"また来てくれよな\n");
			tutorialWeapon(x);
		}else {
			tutorialTown(x);
		}
	}
	public static void tutorialArmor(Player x) {
		Time.TLDB80("どんな防具をお求めで？\n\n");
		System.out.println("1:頭 2:胴体 3:腕 4:脚 5:やめる");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			Time.TLDB80("頭の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor(x);
		}else if(b==1) {
			Time.TLDB80("胴体の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor(x);
		}else if(b==2) {
			Time.TLDB80("腕の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor(x);
		}else if(b==3) {
			Time.TLDB80("腕の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor(x);
		}else {
			tutorialTown(x);
		}
	}
	public static void tutorialGoods(Player x) {
		Time.TLDB80("何をお求めで？\n");
		System.out.println("1:薬草 2:生肉 3:包帯 4:やめる");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			System.out.println("");
			Time.TLDB80("薬草が今日は安いからな持ってけ","ほかにも何かあるかい？");
			tutorialGoods(x);
		}else if(b==1) {
			Time.TLDB80("生肉は保存に気をつけな！","ありがとうまた来てくれよな\n");
			tutorialGoods(x);
		}else if(b==2) {
			Time.TLDB80("冒険者は包帯が必需品だな","ありがとうまた来てくれよな\n");
			tutorialGoods(x);
		}else {
			tutorialTown(x);
		}
	}
}
