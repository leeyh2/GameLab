import java.util.Random;
public class Enemy extends Player
{
    public  String enemyName;
    public  int enemyHealthBar;
    public  int enemyDmg;

    Random ranNum = new Random();

    public Enemy(String playerName)
    {
        super(playerName);
        enemyName = "Kalel";
        enemyHealthBar = 100;
        silverCoins = 15;
        enemyDmg = ranNum.nextInt(100);

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
    public int getEnemyDmg()
    {
        return enemyDmg;
    }
    public void displayEnemy()
    {
        System.out.println("-----Enemy-----");
        System.out.println("Enemy Name: " + enemyName);
        System.out.println("Enemy Health: " + healthBar);
        System.out.println("---------------\n");
    }
}
