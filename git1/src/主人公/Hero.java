package 主人公;

import バトル11_26.Time;

public class Hero extends Player{

	public Hero(String a,String b){
		this.name= a;
		String job = b;
	}

	//ヒーローの名前を決める
	public void name() {
		Time.TLDA50("名前を何にしますか？\n");
		System.out.print("=>");
		String h = new java.util.Scanner(System.in).nextLine();
		Time.TLDA50(h+"でよろしいですか？\n\n");
		System.out.println("1:はい 2:いいえ ");
		int no = new java.util.Scanner(System.in).nextInt()-1;
		if(no==0) {
			this.name = h;
			Time.TLDA50(h+"に決定しました！");
		}else {
			name();
		}

	}
}
