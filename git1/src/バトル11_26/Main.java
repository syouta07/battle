package バトル11_26;

import チュートリアル.StoryTutorial;
import 主人公.Hero;
import 主人公.Player;
import 町内_店_ギルド_家_協会_銀行.Bank;
public class Main {

	public static void main(String[] args) {
		Player p = new Hero("ななし");
		
			
//メインの流れ↓↓↓↓↓↓↓↓↓
		StoryTutorial.tutorial(p);
		Bank.announcement(p);
		StoryTutorial.tutorial2(p);
		Bank.bankAction(p);
	}
}
