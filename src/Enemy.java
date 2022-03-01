public class Enemy extends Player
{
    protected String enemyName;
    protected int enemyHealthBar;


    public Enemy(String playerName)
    {
        super(playerName);
        enemyName = "Kalel";
        healthBar = 100;
        silverCoins = 15;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public void setEnemyHealthBar(int enemyHealthBar) {
        this.enemyHealthBar = enemyHealthBar;
    }

    public int getEnemyHealthBar() {
        return enemyHealthBar;
    }

    public String getEnemyName() {
        return enemyName;
    }
}
