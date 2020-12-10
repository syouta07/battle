package 主人公;

import モンスター.Monster;

public abstract class  Player {
	public int many;
	String job;
	public String name;
	int hp;

	public abstract Monster damage(Monster m);

	public abstract Player heel(Player p);
}
