package バトル11_26;

public class Hero extends Player{

	//ヒーローの名前を決める
	public void name(Player p) {
		Time.TLDA50("冒険する勇者の名前を決めたください\n\n==>");
		String h = new java.util.Scanner(System.in).nextLine();
		Time.TLDA50(h+"でよろしいですか？\n\n");
		System.out.println("1:はい 2:いいえ ");
		p.name=h;
		int no = new java.util.Scanner(System.in).nextInt()-1;
		if(no==0) {
			System.out.println();
		}else {
			name(p);
		}
	}
}
