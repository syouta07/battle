package チュートリアル;

import 主人公.Player;
import 機能.Num;
import 機能.Time;
import 町内_店_ギルド_家_協会_銀行.Bank;
import 町内_店_ギルド_家_協会_銀行.Home;
public class StoryTutorial {

	//**主人公の名前を決める**//
static String G="ギルド受付: ";
static int no =0;

	//**チュートリアルの大まかな流れを作る場所**//
	public static void tutorial(Player p){
		Time.TLDA80("これから冒険をはじめます\n\n");
		System.out.print(p.getName()+":");
		Time.rug15();
		Time.TLDA100(" (ここは"+"・・・・"+"どこだ・・・・)");
		Time.TLDA100("\t\t(どうやら気を失っていたらしい)\n");
		System.out.print("おじいさん:");
		Time.TLDA80(" やっと気が付いたかい？"+"\n\t\t\tお前さん冒険者だろ?"+"その服装ですぐわかったよ\n\n");
		System.out.print("おじいさん:");
		Time.TLDA80(" わしはこの村で村長をしておるコードじゃ\n","\t\t\tお前さんは名は何というのかね？\n");
		Time.rug10();
		System.out.print(p.getName()+":");
		Time.TLDB80(" あれ？");
		Time.TLDB80("名前が思い出せない"+"・・・\n\n");
		System.out.print("村長:");
		Time.TLDB80("無理に答えなくてもいいよ\n\t","お前さん帰る場所あるのかい？");
		System.out.print(p.getName()+":");
		Time.TLDB300("・・・\n");
		System.out.print("村長:");
		Time.TLDB80("君がよければ冒険者としてこの村で働かないか？\n\n");
		Time.rug10();
		System.out.print(p.getName()+":");
		Time.TLDA80(" (今の俺にはいく場所がない・・・ここでお世話になろう)","\tおねがいいします！\n");
		Time.TLDB80("村長:"+"冒険者になるにはギルドカードが必要になる。"+"\n\tギルドはこの町にあるから行って登録してくるといい。"
				,"\n\t登録までに名前を考えておくんだぞ、出身地は私のほうで話をつけておくよ","\n\tギルドまで馬車を使ったほうが早く着くぞ、お金を持っているか？");
		System.out.print("\n"+p.getName()+"[1]:はい [2]:いいえ\n");
		int i = Num.or12();
		if(i==2) {
			System.out.print("\n村長:");
			Time.TLDA80("少ないがこれだけあれば足りるだろう\n");
			System.out.print("名無し:");
			Time.TLDA100("村長から1000ゴールドもらった");
			p.many=1000;
		}else {
			System.out.print(p.getName()+":");
			Time.TLDA100("(・・・これ以上迷惑をかけられないここは歩いて行こう！・・・)");
		}
		Time.TLDA100("\t そういえば名前を決めておかなければいけないな！\n");
		Time.TLDA100("\tギルドに行く前に名前を決めましょう");

		機能.Name.name(p);
		Time.TLDA300("\n\nてくてくてくてくてく\n\n・・・・・\n");
		Time.TLDA80(p.getName()+": "+"ここがギルドか！\n");
		Time.TLDA300("\nガチャ\n");
		Time.TLDA300("…ギー\n");
		System.out.print("\n"+G);
		Time.TLDB80("初めて見る顔だね");
		Time.TLDB300("……");
		Time.rug10();
		Time.TLDB80(G);
		Time.TLDB80("君が村長さんに拾われた子かい？");
		System.out.println("\n[1]:はい [2]:いいえ");
		int ans =Num.or12();
		if(!(ans==1)) {
			System.out.print(G);
			Time.TLDB80("つまらないウソをつくもんじゃないよ");
		}

		Time.TLDA300("・・・・・・・\n");
		Time.TLDB80(G+"話は聞いているよ登録するからちょっと待ってな");
		Time.TLDA80("\n\t\tここに名前を書きな");

		機能.Name.nameWrite(p.getName(),G);

		Time.TLDB80(G+"登録終わったよ。\n");
		Time.TLDA80(G+"強いモンスターを倒して早くAランクを目指しな‼");
		Time.TLDA80("\t\t"+"さっそくクエストをうけるかい？\n");
		Time.TLDA80(p.getName()+":(・・・今日は町に行きたいからクエストはやめておこう・・・）\n");

		Time.TLDA80("\n"+G+"そうかまあゆっくりやっていきな！","まだ銀行口座を開いていないだろ今日行ってきたらどうだい？\n\n");
		Time.TLDA80(p.getName()+"ありがとう！今から行ってみます！");
		Time.TLDA80(p.getName()+":ギルドを出た。\n");
		Time.TLDA100("・・・・・・\n");
		Time.TLDA80( p.getName()+": 銀行についた！");

		Bank.fast(p);//Bankの口座開設へ
	}

	//**町に初めて行って村長に会う**//
	public static void tutorial2(Player p){
		Time.TLDB100("\n\nがやがやがや\n");
		System.out.print(p.getName()+":");
		Time.TLDB100("(…町はにぎやかだな…)\n");
		System.out.print("村長:");
		Time.TLDB80(p.getName()+"くん登録が終わったみたいだな!\n");
		System.out.print("\n村長:");
		Time.TLDB80("用事は済んだんだろ？"+"今日はゆっくり町でも見て装備や道具をそろえるといい\n");
		Time.TLDB80("\t\t\tあと伝え忘れていたが、"+p.getName()+"用に家を準備してある","しばらくの間はそこを拠点にするといい\n");
		Time.rug20();

		tutorialTown(p);//町内の移動先の選択
	}

	//**町内の移動先の選択**//
	public static void tutorialTown(Player p){
		System.out.print(p.getName()+": ");
		Time.TLDB80("どこに行こうかな\n");
		System.out.println("[1]:武器屋 [2]:防具屋 [3]:商店 [4]:家に行く");
		int a = Num.or1234();
		if(a==1) {
			Time.TLDB80("\n武器屋に行こう!\n\n");
			tutorialWeapon(p);
		}else if(a==2) {
			Time.TLDB80("\n防具屋に行こう!\n\n");
			tutorialArmor(p);
		}else if(a==3) {
			Time.TLDB80("\n商店に行こう!\n\n");
			tutorialGoods2(p);
		}else if(a==4) {
			Time.TLDB80("\n家に帰るとするか!\n\n");
				Home.Action(p);
		}else {
			tutorialTown(p);
		}
	}

	//**武器屋の選択**//
	public static void tutorialWeapon(Player p){
		Time.rug15();
		Time.TLDB80("店主:"+"何をお求めで？\n\n");
		Time.TLDB50("1:武器一覧を見る 2:店をでる\n");
		int b = Num.or12();
		if(b==1) {
			Time.TLDB80("武器屋: 今"+p.getName()+"の買える武器はこれだ\n");
			tutorialWeapon(p);
		}else{
			Time.TLDB80("武器屋: またよろしくな！\n");
			tutorialTown(p);
		}
	}

	//**防具屋の選択**//
	public static void tutorialArmor(Player p) {
		Time.rug15();
		Time.TLDB80("いらっしゃい！"+p.getName()+"どんな防具が欲しいんだい？\n\n");
		Time.TLDB50("1:防具一覧を見る 2:店をでる");
		int b = Num.or12();
		if(b==1) {
			Time.TLDB80("一覧表を閲覧\n");//防具のつらんひょうを表示する
			tutorialArmor(p);
		}else{
			Time.TLDB80("ありがとうな\n");
			tutorialTown(p);
		}
	}

	//**雑貨屋の選択**//
	public static void tutorialGoods2(Player p) {
		Time.rug15();
		Time.TLDB80("1:薬草 2:生肉 3:包帯 4:やめる\n");
		int a = Num.or1234();
		if(a==1) {
			System.out.println("");
			Time.TLDB80("薬草が今日は安いからな持ってけ");
			tutorialGoods3(p);
		}else if(a==2) {
			Time.TLDB80("生肉は保存に気をつけな！","ありがとうまた来てくれよな\n");
			tutorialGoods3(p);
		}else if(a==3) {
			Time.TLDB80("冒険者は包帯が必需品だな","ありがとうまた来てくれよな\n");
			tutorialGoods3(p);
		}else {
			tutorialTown(p);
		}

	}
	//**雑貨屋の最初の挨拶**//
	public static void tutorialGoods1(Player p) {
		Time.TLDB80("商店: "+"いらっしゃい！何をお求めですか？\n\n");
		tutorialGoods2(p);
	}

	//**雑貨屋の2回目以降の挨拶**//
	public static void tutorialGoods3(Player p) {
		Time.TLDB80("商店: "+"ほかにも必要なものあるかい？\n\n");
		tutorialGoods2(p);
	}
}
