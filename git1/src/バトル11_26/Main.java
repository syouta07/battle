package バトル11_26;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = Hero.name();
//		StoryTutorial.tutorial(h.name);
		Matango a = new Matango();
		Matango b = new Matango();
		h.damage(a,b);

	}
}
