public class Cards extends Player
{
    /*
        Class should be an object that makes a card with certain stats
    */
    public static int attackDmg;
    public static int dmgReduced;
    public static int healthRestore;
    public static String cardName;
    protected double successRate = 0.5;// success rate is to make the game for fun and not just see who can do more
    public Cards(String cardName, int attackDmg, int dmgReduced, int healthRestore)
    {
        //We will need to make 3 cards for each move with only 1 stat with actual numbers
        super(playerName);
        this.cardName = cardName;
        this.attackDmg = attackDmg;
        this.dmgReduced = dmgReduced;
        this. healthRestore = healthRestore;
    }

    public Cards(String playerName) {
        super(playerName);
    }

    public void setAttackDmg(int attackDmg) {
        this.attackDmg = attackDmg;
    }

    public void setDmgReduced(int dmgReduced) {
        this.dmgReduced = dmgReduced;
    }

    public void setHealthRestore(int healthRestore) {
        this.healthRestore = healthRestore;
    }

    public void setSuccessRate(double successRate) {
        this.successRate = successRate;
    }
    public void setCardName(String cardName)
    {
        this.cardName = cardName;
    }
    public String getCardName()
    {
        return cardName;
    }

    public int getAttackDmg() {
        return attackDmg;
    }

    public int getDmgReduced() {
        return dmgReduced;
    }

    public int getHealthRestore() {
        return healthRestore;
    }

    public double getSuccessRate() {
        return successRate;
    }

}
