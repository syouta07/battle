package バトル11_26;

import 主人公.Hero;
import 主人公.Player;
import 町内_店_ギルド_家_協会_銀行.Bank;

public class Main {

	public static void main(String[] args) {

		Player p = new Hero("ななし");
//		StoryTutorial.tutorial(p);
		Bank.bankAction(p);
		Bank.fast(p);
	}
}
