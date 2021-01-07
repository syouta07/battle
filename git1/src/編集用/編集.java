package 編集用;

public class 編集 {

	public static void main(String[] args) {

		for(int i=0; i<10;i++) {
			int ac = new java.util.Random().nextInt(4);

			switch(ac) {
			case 0:
				System.out.println("0");
				break;
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;

			}
			System.out.println("------");
		}
	}
}
