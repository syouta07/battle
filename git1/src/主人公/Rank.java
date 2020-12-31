package 主人公;

public class Rank {
	public static void rank(Player p){
		int a = p.getLevel();
		if(a>=100) {
			p.setRank('S');
		}else if(a>=80) {
			p.setRank('A');
		}else if(a>=60) {
			p.setRank('B');
		}else if(a>=50) {
			p.setRank('C');
		}else if(a>=30) {
			p.setRank('D');
		}else if(a>=15) {
			p.setRank('E');
		}else {
			p.setRank('F');
		}
	}

}
