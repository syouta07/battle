package バトル11_26;

public class Home {								/*ヒーローのHPまだ決まってないから
																	食事風呂での回復量が未定*/


	public static void Action(){
		int [] food = new int[50];

		System.out.println("何をしますか？");
		System.out.println("1:ご飯を食べる 2:風呂に入る 3:眠る 4:外へ出かける ");
		int a  =new java.util.Scanner(System.in).nextInt()-1;
		if(a==0) {
			for(int i=0; i<food.length; i++) {
				if(food.equals("null")) {
				}else{
					Time.TLDB80(food[i]+",");
				}
			}
			Action();
		}else if(a==1) {
//			h.hp +=h.hpMax;
			Time.TLDB300("・・・・・・");
			Time.TLDB300("体力がhp回復した\n\n");
			Action();
		}else if(a==2) {
			Time.TLDB80("寝ることにしよう\n\n");
			Time.TLDB300("・・・・・");
			Time.TLDB80("疲れがとれた");
			Action();
		}else {
			Time.TLDB80("暇だからどこか出かけようかな\n\n");
			try {
				Town.lottery();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}


	public void homeSleep() {
//		h.hp +=50;
	}
}
