package 町内_店_ギルド_家_協会;

import 機能.Time;

public class Town {

					//町にに来た時のイベント

	public static void lottery(){
		int a = new java.util.Random().nextInt(3);
		 if(a==0){
			 buy();
		}
		 if(a==1){
			System.out.println("今日はにぎわっている");
			choose();
		}
		 if(a==2){
			System.out.println("雨が降っている………");
			choose();
		}
	}

				//買い物でどこに行くかの選択

	public static void choose(){
		System.out.println("どこに行きますか？");
		System.out.println("1:武器屋 2:防具屋 3:雑貨屋 4:戻る");
		int a = new java.util.Scanner(System.in).nextInt();
		switch(a) {
			case 0:
				WeaponShop.weapons();
				break;
			case 1:
				ArmorShop.armor();
				break;
			case 2:
				goods();
				break;
			case 3:
				AllAction.moveToAnother();
				break;
		}
	}


					//イベントの押し売り業者

	public static void buy(){
		String [] item = {"薬草","回復薬","パン","剣","靴"};
		System.out.println("お～いあんちゃん何か買っていかねえか？");
		System.out.println("1:何があるんだい？ 2:買わない");
		int a = new java.util.Scanner(System.in).nextInt()-1;
		if (a==0) {
			System.out.println("ありがてえや");
			System.out.println("こんなのがあるんだがどうだ？");
			for(int i=0; i<3; i++) {
				int no= new java.util.Random().nextInt(5);
				System.out.print(i+":"+item[no]);
			}
			System.out.println("何かいいのあったかい？");
		}else {
			System.out.println("そうか残念だ…また今度よろしくな！");
			System.out.println("");
			choose();
		}
	}
					//防具屋さん


					//雑貨屋さん

	public static void goods(){
		Time.TLDB80("何をお求めで？\n\n");
		System.out.println("1:薬草 2:生肉 3:包帯 4:やめる");
		int b = new java.util.Scanner(System.in).nextInt()-1;
		if(b==0) {
			System.out.println("");
			Time.TLDB80("薬草が今日は安いからな持ってけ"+"ほかにも何かあるかい？");
			goods();
		}else if(b==1) {
			Time.TLDB80("生肉は保存に気をつけな！"+"ありがとうまた来てくれよな\n\n");
			goods();
		}else if(b==2) {
			Time.TLDB80("冒険者は包帯が必需品だな"+"ありがとうまた来てくれよな\n\n");
			goods();
		}else {
			choose();
		}
	}
}