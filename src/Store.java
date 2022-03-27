import java.util.Scanner;

public class Store extends Player
{
    private int price;

    public Store(String playerName) {
        super(playerName);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public void storeChoices(int selector)
    {

        Scanner kb = new Scanner(System.in);
        //Prompts user the choices for the store
        System.out.println("Type the number for the a choice: "+ "\n" +
                            "0: To exit store" + "\n" +
                            "1: To buy Attack stat Increase" + "\n" +
                            "2: To buy Dmg reduction stat Increase" + "\n" +
                            "3: To buy Health Restore stat Increase");
        boolean flag = true; //Flag for the loop
        do {
            //Do while loop should catch any int that is not 0-3
            try {
                selector = kb.nextInt();
                if (selector == 0) {
                    //This should exit the User out of the store
                    System.out.println(getPlayerName() + "You have chosen to leave the store. Too poor to buy anything?");
                    flag = false;
                } else if (selector == 1) {
                    //This should go to buy ATTACK Stat. It will direct the User to the method to see if USer can buy stat
                    buyAttackIncrease();
                    flag = false;
                } else if (selector == 2) {
                    //This should go to buy DMG REDUCTION Stat. It will direct the User to the method to see if USer can buy stat
                    buyDmgReducedIncrease();
                    flag = false;
                } else if (selector == 3) {
                    //This should go to buy HEALTH RESTORE Stat. It will direct the User to the method to see if USer can buy stat
                    buyHealthRestoreIncrease();
                    flag = false;
                }
            } catch (Exception exception) {
                //It should catch any exception that is not an int.
                System.out.println(getPlayerName() + ", that is the wrong input. Can you not read? Try again");
            }
        }
        while(flag);
    }
    public void buyAttackIncrease()
    {
        /*
            -Can have a parameter that takes an integer or just an IF statement, and take silver coins away from player
            -This method increases the dmg output of the players move
            -this method should have a set price and an IF statement whether the player has enough to buy
        */

    }
    public void buyDmgReducedIncrease()
    {
        /*
            -Can have a parameter that takes an integer or just an IF statement, and take silver coins away from player
            -This method increases the damage reduction for the shield move
            -this method should have a set price and an IF statement whether the player has enough to buy
         */
    }
    public void buyHealthRestoreIncrease()
    {
        /*
            -Can have a parameter that takes an integer or just an IF statement, and take silver coins away from player
            -This method increases the health restored for the health restore move
            -this method should have a set price and an IF statement whether the player has enough to buy
         */
    }
}
