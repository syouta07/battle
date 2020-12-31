package テストコード;

import java.util.ArrayList;

import 主人公.Hero;
import 主人公.Player;
import 主人公.Rank;


public class RankTest {

	public static void main(String[] args) {
		Player a = new Hero("ななし1");

		ArrayList<Player> people = new ArrayList<Player> ();
		people.add(a);

		//D-Eランク判定境目
		a.setEXP(425);a.setType("speed");
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		a.setEXP(475);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		System.out.println();

		//C-Dランク判定境目
		a.setEXP(1400);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		a.setEXP(1475);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		System.out.println();


		//B-Cランク判定境目
		a.setEXP(3600);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		a.setEXP(3725);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		System.out.println();

		//A-Bランク判定境目
		a.setEXP(5075);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		a.setEXP(5225);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		System.out.println();

		//A-Bランク判定境目
		a.setEXP(8775);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		a.setEXP(8975);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		System.out.println();


		//S-Aランク判定境目
		a.setEXP(13475);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		a.setEXP(13725);
		主人公.Level.levelCheck(a);
		Rank.rank(a);
		System.out.println(people.get(0).getName()+" :level: "+people.get(0).getLevel()+" Rank: "+people.get(0).getRank());
		System.out.println();
	}

}
