package バトル11_26;

public class Time{


			//**//ラグ時間(1000,1500,2000,3000)

	public static void rug10() {
		try {Thread.sleep(1000);}
		catch (InterruptedException e) {
			e.printStackTrace();}
	}
	public static void rug15() {
		try {Thread.sleep(1500);}
		catch (InterruptedException e) {e.printStackTrace();}
	}
	public static void rug20() {
		try {Thread.sleep(2000);}
		catch (InterruptedException e) {e.printStackTrace();}
	}
	public static void rug30() {
		try {Thread.sleep(3000);}
		catch (InterruptedException e) {e.printStackTrace();}
	}

			///*1-A*/   1行 + 2ラグ(1000)

			///*1-B*/    1行 + ラグなし

			///*2-A*/   2行 + 1ラグ(1000)

			///*2-B*/   2行 + 2ラグ(1000)

			///*3-B*/   3行 + 2ラグ(1000)


		///**/コメントの後に1000のSleep//**//

/*1-A*/public static void TLDA50(String x) {
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}


	public static void TLDA80(String x) {
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}


	public static void TLDA100(String x) {
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		System.out.println("");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	public static void TLDA300(String x) {
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}

			//**//コメントが時間差で一文字づつ表示される
			//**//(コメント後にタイムラグなし)//**//

/*1-B*/public static void TLDB50(String x) {
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
	}


	public static void TLDB80(String x) {
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
	}
	public static void TLDB100(String x) {
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		System.out.println("");
	}

	public static void TLDB300(String x){
		char data[] = x.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {

			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		System.out.println("");
	}
	//**//2コメント2ラグ
	//**//ラグタイム(1000)
/*2-A*/public static void TLDA50(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}


	public static void TLDA80(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}


	public static void TLDA100(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}


	public static void TLDA300(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("");
	}



	//**//2コメント1ラグ
	//**//ラグタイム(1000)
/*2-B*/public static void TLDB50(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		System.out.println("");
	}


	public static void TLDB80(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		System.out.println("");
	}


	public static void TLDB100(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		System.out.println("");
	}


	public static void TLDB300(String x,String y) {
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		int arr_num = data.length;
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		System.out.println("");
	}





			//**//コメントを一文字づつ時間差で出力しつつ、
			//**//3コメント2ラグ

/*3-B*/public static void TLDB50(String x,String y,String z){
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		char data2[] = z.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		int arr_num2 = data2.length;
		for (int i = 0; i <= arr_num2-1; i++) {

			try{
				Thread.sleep(50);
			}
			catch(InterruptedException e){
			}System.out.print(data2[i]);
		}
		System.out.println("");
	}


	public static void TLDB80(String x,String y,String z){
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		char data2[] = z.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		int arr_num2 = data2.length;
		for (int i = 0; i <= arr_num2-1; i++) {

			try{
				Thread.sleep(80);
			}
			catch(InterruptedException e){
			}System.out.print(data2[i]);
		}

		System.out.println("");
	}


	public static void TLDB100(String x,String y,String z){
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		char data2[] = z.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		int arr_num2 = data2.length;
		for (int i = 0; i <= arr_num2-1; i++) {

			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
			}System.out.print(data2[i]);
		}
		System.out.println("");
	}


	public static void TLDB300(String x,String y,String z){
		char data[] = x.toCharArray();
		char data1[] = y.toCharArray();
		char data2[] = z.toCharArray();
		int arr_num = data.length;
		for (int i = 0; i <= arr_num-1; i++) {
			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int arr_num1 = data1.length;
		for (int i = 0; i <= arr_num1-1; i++) {

			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data1[i]);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
		int arr_num2 = data2.length;
		for (int i = 0; i <= arr_num2-1; i++) {

			try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
			}System.out.print(data2[i]);
		}
		System.out.println("");
	}

}
