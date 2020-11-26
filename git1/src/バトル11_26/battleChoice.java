package バトル11_26;

public class battleChoice {

	public static void choice(String x, int y) {														//攻撃選択
		System.out.println("敵が現れた‼ 1:戦う 2:回復する 3:逃げる");//	行動の選択
		int ac = new java.util.Scanner(System.in).nextInt()+1;
		String [] action = {"戦う","防御する","回復する","逃げる"};


									//戦う選択をした

		switch(ac) {
		case 0:
			int at = new java.util.Scanner(System.in).nextInt();
			if(at == 0) {
				batll(x,y);
			}else if (at==1) {

			}else if(at ==2) {

			}

			break;
			case 1:

									//防御を選んだ
	public static void batll(String x,int y) {
		Time.TLDA50("");
	}


}
