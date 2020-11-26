package バトル11_26;

public class StoryTutorial {

	public static void tutorial(String x){
		Time.TLDA80("これから冒険をはじめます\n\n");
		Time.TLDA80("村長:"+x+"くん君冒険者になるにはギルドに登録してくれ。"+"\n\t\t\tギルドは町にあるから行ってみてくれ。");
		Time.TLDA300("\n\nてくてくてくてくてく\n\n・・・・・");
		Time.TLDA80("ここがギルドか！\n");
		Time.TLDA300("\nガチャ\t\t");
		Time.TLDA300("…ギー\n");
		System.out.print("\nギルドの受付: ");
		Time.TLDB80("初めて見る顔だね");
		Time.TLDB300("……");
		Time.TLDB80("冒険者登録かい?\n\n");
		Time.TLDB80("ギルドの受付:");
		Time.TLDB80(x+"だろ話は聞いているよ登録するからちょっと待ってな");
		Time.TLDA300("・・・・・・・\n\n");
		System.out.println();
		Time.TLDB80("ギルドの受付:登録終わったよ。\n\n");
		Time.TLDA80("\nギルドの受付:強いモンスターを倒して早くAランクを目指しな‼");
		Time.TLDA80("どうださっそくクエストをうけるかい？");
		System.out.println("\n\n1:いいえ");
		int c = new java.util.Scanner(System.in).nextInt()-1;
		System.out.print("\n\nギルドの受付:");
		Time.TLDA80("そうかまだ来たばかりだゆっくり町でも見るといい\n");
		System.out.println("ギルドを出ました。");
		Time.TLDA80("せっかくだから町に行ってみよう");
		tutorial2(x);
	}

	public static void tutorial2(String x){
		Time.TLDB300("\n\nがやがやがや\n\n");
		System.out.print("name:");
		Time.TLDB300("(…町はにぎやかだな…)\n\n");
		System.out.println("村長:");
		Time.TLDB80(x+"くん登録が終わったみたいだな!\n","\t\t\tこれから冒険者としてのきみの活躍を楽しみにしているよ\n");
		System.out.println("\n村長:");
		Time.TLDB80("用事は済んだんだろ？"+"今日はゆっくり町でも回って装備や道具をそろえるといい\n");
		tutorialTown();
	}
	public static void tutorialTown(){

		Time.TLDB80("\nどこに行こうかな\n\n");
		System.out.println("1:武器屋 2:防具屋 3:商店 4:帰る\n");
		int a  =new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			Time.TLDB80("\n武器屋に行こう\n\n");
			tutorialWeapon();
		}else if(a==1) {
			Time.TLDB80("\n防具屋に行こう\n\n");
			tutorialArmor();
		}else if(a==2) {
			Time.TLDB80("\n商店に行こう\n\n");
			tutorialGoods();
		}else {
			Time.TLDB80("\n家に帰るとするか\n\n");
				Home.Action();
		}
	}
	public static void tutorialWeapon(){
		Time.TLDB80("店主:"+"何をお求めで？\n\n");
		System.out.println("1:片手剣 2:双剣 3:槍 4:やっぱりやめておくよ");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			Time.TLDB80("片手剣はこんなのがあるぞ"+"また来てくれよな\n");
			tutorialWeapon();
		}else if(b==1) {
			Time.TLDB80("双剣はこんなのがあるぞ"+"また来てくれよな\n");
			tutorialWeapon();
		}else if(b==2) {
			Time.TLDB80("槍はこんなのがあるぞ"+"また来てくれよな\n");
			tutorialWeapon();
		}else {
			tutorialTown();
		}
	}
	public static void tutorialArmor() {
		Time.TLDB80("どんな防具をお求めで？\n\n");
		System.out.println("1:頭 2:胴体 3:腕 4:脚 5:やめる");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			Time.TLDB80("頭の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor();
		}else if(b==1) {
			Time.TLDB80("胴体の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor();
		}else if(b==2) {
			Time.TLDB80("腕の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor();
		}else if(b==3) {
			Time.TLDB80("腕の防具はこんなのがあるぞ","ありがとうまた来てくれよな\n");
			tutorialArmor();
		}else {
			tutorialTown();
		}
	}
	public static void tutorialGoods() {
		Time.TLDB80("何をお求めで？\n\n");
		System.out.println("1:薬草 2:生肉 3:包帯 4:やめる");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			System.out.println("");
			Time.TLDB80("薬草が今日は安いからな持ってけ","ほかにも何かあるかい？");
			tutorialGoods();
		}else if(b==1) {
			Time.TLDB80("生肉は保存に気をつけな！","ありがとうまた来てくれよな\n\n");
			tutorialGoods();
		}else if(b==2) {
			Time.TLDB80("冒険者は包帯が必需品だな","ありがとうまた来てくれよな\n\n");
			tutorialGoods();
		}else {
			tutorialTown();
		}
	}
}
