public class Player
{
    protected String playerName;
    protected int healthBar;
    protected int silverCoins;


    public Player(String playerName)
    {
        this.playerName = playerName;   //player should only be able to set their name.
        healthBar = 100;
        silverCoins = 25;               //silver coins need to be balanced player can't buy everything

    }
   protected void addSilverCoins(int silverCoins)
   {
       //a method to add silver coins to player after defeating enemy
       this.silverCoins += silverCoins;
   }
   protected void subtractSilverCoins(int silverCoins)
   {
       //a method to subtract silver coins to player after buying from store
       this.silverCoins -= silverCoins;
   }

    public void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setSilverCoins(int silverCoins) {
        this.silverCoins = silverCoins;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public int getSilverCoins() {
        return silverCoins;
    }

    public String getPlayerName() {
        return playerName;
    }
}
