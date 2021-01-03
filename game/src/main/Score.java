package main;

public class Score {
    private static final Integer UPERSORE=63;
    private Integer aces;
    private Integer twos;
    private Integer threes;
    private Integer fours;
    private Integer fives;
    private Integer sixes;
    private Integer threeOfKind;
    private Integer fourOfKind;
    private Integer fullHouse;
    private Integer smallStraight;
    private Integer largeStraight;
    private Integer yahtzee;
    private Integer chance;
    private Integer upperTotal;
    private Integer upperBonus;
    private Integer upperGrantTotal;
    private Integer lowerTotal;
    private Integer lowerBonus;
    private Integer lowerGrantTotal;
    private Integer hasYahtzee=0;
    private RollTime rollTime;

    public RollTime getRollTime() {
        return rollTime;
    }

    public void setRollTime(RollTime rollTime) {
        this.rollTime = rollTime;
    }

    public static Integer getUPERSORE() {
        return UPERSORE;
    }

    public Integer getHasYahtzee() {
        return hasYahtzee;
    }

    public void setHasYahtzee(Integer hasYahtzee) {
        this.hasYahtzee = hasYahtzee;
    }

    public Integer getAces() {
        return aces;
    }

    public void setAces(Integer aces) {
        this.aces = aces;
    }

    public Integer getTwos() {
        return twos;
    }

    public void setTwos(Integer twos) {
        this.twos = twos;
    }

    public Integer getThrees() {
        return threes;
    }

    public void setThrees(Integer threes) {
        this.threes = threes;
    }

    public Integer getFives() {
        return fives;
    }

    public void setFives(Integer fives) {
        this.fives = fives;
    }

    public Integer getSixes() {
        return sixes;
    }

    public void setSixes(Integer sixes) {
        this.sixes = sixes;
    }

    public Integer getThreeOfKind() {
        return threeOfKind;
    }

    public void setThreeOfKind(Integer threeOfKind) {
        this.threeOfKind = threeOfKind;
    }

    public Integer getFourOfKind() {
        return fourOfKind;
    }

    public void setFourOfKind(Integer fourOfKind) {
        this.fourOfKind = fourOfKind;
    }

    public Integer getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(Integer fullHouse) {
        this.fullHouse = fullHouse;
    }

    public Integer getSmallStraight() {
        return smallStraight;
    }

    public void setSmallStraight(Integer smallStraight) {
        this.smallStraight = smallStraight;
    }

    public Integer getLargeStraight() {
        return largeStraight;
    }

    public void setLargeStraight(Integer largeStraight) {
        this.largeStraight = largeStraight;
    }

    public Integer getYahtzee() {
        return yahtzee;
    }

    public void setYahtzee(Integer yahtzee) {
        this.yahtzee = yahtzee;
    }

    public Integer getUpperTotal() {
        this.upperTotal=this.aces+this.twos+this.threes+this.fours+this.fives+this.sixes;
        return upperTotal;
    }

    public void setUpperTotal(Integer upperTotal) {
        this.upperTotal = upperTotal;
    }

    public Integer getUpperBonus() {
        if(this.upperTotal>=UPERSORE){
            upperBonus=35;
        }else{
            upperBonus=0;
        }
        return upperBonus;
    }

    public void setUpperBonus(Integer upperBonus) {
        this.upperBonus = upperBonus;
    }

    public Integer getUpperGrantTotal() {
        this.upperGrantTotal=this.upperTotal+this.upperBonus;
        return upperGrantTotal;
    }

    public void setUpperGrantTotal(Integer upperGrantTotal) {
        this.upperGrantTotal = upperGrantTotal;
    }

    public Integer getLowerTotal() {
        lowerTotal=this.threeOfKind+this.fourOfKind+this.fullHouse+this.smallStraight+this.largeStraight+this.yahtzee+this.chance;
        return lowerTotal;
    }

    public void setLowerTotal(Integer lowerTotal) {

        this.lowerTotal = lowerTotal;
    }

    public Integer getLowerBonus() {
        lowerBonus=0;
        if(hasYahtzee>=1){
           lowerBonus= 100*(hasYahtzee-1);
        }
        return lowerBonus;
    }

    public void setLowerBonus(Integer lowerBonus) {
        this.lowerBonus = lowerBonus;
    }

    public Integer getLowerGrantTotal() {
        lowerGrantTotal=this.upperGrantTotal+this.lowerTotal;
        return lowerGrantTotal;
    }

    public void setLowerGrantTotal(Integer lowerGrantTotal) {
        this.lowerGrantTotal = lowerGrantTotal;
    }

    public Integer getFours() {
        return fours;
    }

    public void setFours(Integer fours) {
        this.fours = fours;
    }

    public Integer getChance() {
        return chance;
    }

    public void setChance(Integer chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return "Score{" +
                "aces=" + aces +
                ", twos=" + twos +
                ", threes=" + threes +
                ", fours=" + fours +
                ", fives=" + fives +
                ", sixes=" + sixes +
                ", threeOfKind=" + threeOfKind +
                ", fourOfKind=" + fourOfKind +
                ", fullHouse=" + fullHouse +
                ", smallStraight=" + smallStraight +
                ", largeStraight=" + largeStraight +
                ", yahtzee=" + yahtzee +
                ", chance=" + chance +
                ", upperTotal=" + getUpperTotal() +
                ", upperBonus=" + getUpperBonus() +
                ", upperGrantTotal=" + getUpperGrantTotal() +
                ", lowerTotal=" + getLowerTotal() +
                ", lowerBonus=" + getLowerBonus() +
                ", lowerGrantTotal=" + getLowerGrantTotal() +
                ", hasYahtzee=" + hasYahtzee +
                '}';
    }
}
