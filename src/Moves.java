import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    static Scanner kb = new Scanner(System.in);
    static boolean flag;

    public static void main(String[] args)
    {
        //probably need to make a class to run everything: like set the game up.
        //make the card objects and set every prices and stats.
        //make dialogue and guid the player

        System.out.println("Welcome To The Game!\n" + "Enter your player name: ");
        Player.playerName = "Gray";//kb.nextLine();
        
        
        
        battle(Player.playerName);
            
        
    }
    public static void battle(String playerName)
    {
        Enemy enemy = new Enemy(playerName);
        
        displayPlayerStats(playerName, Cards.attackDmg, Cards.dmgReduced, Cards.healthRestore);
        
        do{   
            enemy.displayEnemy();
            turnOptions();
        }while(enemy.enemyHealthBar > 0);
        
        
    }
    public static int turnOptions()
    {
        Moves moves = new Moves(Cards.playerName);
        System.out.println("-----Choose an option-----");
        System.out.println("1. Attack");
        System.out.println("2. Block");
        System.out.println("3. Heal");
        
        int option = kb.nextInt();

        switch(option)
        {
            case 1:
                moves.useAttack();
                System.out.println("You used Attack!");
                break;
            case 2:
                moves.useShield();
                System.out.println("You used Shiled!");
                break;
            case 3:
                moves.useHealth();
                System.out.println("You used a Health Potion!");
                break;
            default :
                System.out.println("Invalid input");
        }

        return option;
    }
    public static void displayPlayerStats(String playerName, int attackDmg, double dmgReduced, int healthRestore)
    {
        System.out.println("-------------Player Info--------------");
        System.out.println("\tPlayer name: " + playerName);
        System.out.println("\tAttack Damage: " + Cards.attackDmg );
        System.out.println("\tBlock Power: " + Cards.dmgReduced);
        System.out.println("\tHealth Potions: " +Player.healthPotions);
        System.out.println("--------------------------------------\n");

    }
    

}
