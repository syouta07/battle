package バトル11_26;

import チュートリアル.StoryTutorial;
import モンスター.Matango;
import 主人公.Hero;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero("ななし");
		StoryTutorial.tutorial(h);
		h.setEXP(1000);
		System.out.println(h.getLevel());
		Matango a = new Matango();
		h.damage(a);
	}
}
