package 町内_店_ギルド_家_協会;

import 機能.Time;

public class Goods {
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
			Town.choose();
		}
	}
}
