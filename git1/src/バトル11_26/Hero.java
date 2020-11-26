package バトル11_26;

public class Hero extends Player{

	
	public static String name() {
		Time.TLDA50("冒険する勇者の名前を決めたください\n\n==>");
		String h1 = new java.util.Scanner(System.in).nextLine();
		Time.TLDA50(h1+"でよろしいですか？\n\n");
		System.out.println("1:はい 2:いいえ ");
		int no = new java.util.Scanner(System.in).nextInt()-1;
		if(no==0) {
			System.out.println();
		}else {
			name();
		}
		return h1;
	}
}
