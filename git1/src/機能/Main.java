package 機能;

public class Main {

static int no=0;
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			int no= new java.util.Random().nextInt(5);
			System.out.println(no);
		}
		
	}
}