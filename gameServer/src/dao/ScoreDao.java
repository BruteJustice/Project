package dao;

import entity.ScorePojo;
import utils.JdbcDb;

public class ScoreDao {
	
	public static ScorePojo getByName(String name) {
		return JdbcDb.excuteQuery(ScorePojo.class, " select * from scores where username=?", name);
	}
	
	public static long addOne(ScorePojo scorePojo) {
		return JdbcDb.executeAdd(" insert into scores ( username,gamename,aces,threes,fours,fives,sixes,threeOfKind,"
				+ "fourOfKind,fullHouse,smallStraight,largeStraight,yahtzee,chance,upperTotal,"
				+ "upperBonus,upperGrantTotal,lowerTotal,lowerBonus,lowerGrantTotal,yahtzeeBonus,turn,"
				+ "roll,createTime,twos) values ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ",
				scorePojo.getUsername(),
				scorePojo.getGamename(),
				scorePojo.getAces(),
				scorePojo.getThrees(),
				scorePojo.getFours(),
				
				scorePojo.getFives(),
				scorePojo.getSixes(),
				scorePojo.getThreeOfKind(),
				scorePojo.getFourOfKind(),
				scorePojo.getFullHouse(),
				
				scorePojo.getSmallStraight(),
				scorePojo.getLargeStraight(),
				scorePojo.getYahtzee(),
				scorePojo.getChance(),
				scorePojo.getUpperTotal(),
				
				scorePojo.getUpperBonus(),
				scorePojo.getUpperGrantTotal(),
				scorePojo.getLowerTotal(),
				scorePojo.getLowerBonus(),
				scorePojo.getLowerGrantTotal(),
				
				scorePojo.getYahtzeeBonus(),
				scorePojo.getTurn(),
				scorePojo.getRoll(),
				scorePojo.getCreateTime(),
				scorePojo.getTwos()
				
				
				
				);
	}
	
	public static int updateOne(ScorePojo scorePojo) {
		return JdbcDb.executeUpdate(" update scores set gamename=? ,aces=?,threes=?,fours=?,fives=?,sixes=?,threeOfKind=?,fourOfKind=?,"
				+ "fullHouse=?,smallStraight=?,largeStraight=?,yahtzee=?,chance=?,upperTotal=?,"
				+ "upperBonus=?,upperGrantTotal=?,lowerTotal=?,lowerBonus=?,lowerGrantTotal=?,yahtzeeBonus=?,"
				+ "turn=?,roll=?,createTime=?,twos=? where username=? ", 
				
				scorePojo.getGamename(),
				scorePojo.getAces(),
				scorePojo.getThrees(),
				scorePojo.getFours(),
				
				scorePojo.getFives(),
				scorePojo.getSixes(),
				scorePojo.getThreeOfKind(),
				scorePojo.getFourOfKind(),
				scorePojo.getFullHouse(),
				
				scorePojo.getSmallStraight(),
				scorePojo.getLargeStraight(),
				scorePojo.getYahtzee(),
				scorePojo.getChance(),
				scorePojo.getUpperTotal(),
				
				scorePojo.getUpperBonus(),
				scorePojo.getUpperGrantTotal(),
				scorePojo.getLowerTotal(),
				scorePojo.getLowerBonus(),
				scorePojo.getLowerGrantTotal(),
				
				scorePojo.getYahtzeeBonus(),
				scorePojo.getTurn(),
				scorePojo.getRoll(),
				scorePojo.getCreateTime(),
				scorePojo.getTwos(),
				scorePojo.getUsername()
				);
	}

}
