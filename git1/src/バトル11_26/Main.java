package バトル11_26;

import チュートリアル.StoryTutorial;
import モンスター.Matango;
import 主人公.Hero;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero("名無し","不明");
		StoryTutorial.tutorial(h);
		Matango a = new Matango();
		h.damage(a);
	}
}
