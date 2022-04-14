import java.util.Scanner;

public class Store extends Cards {
    private int price;
    Scanner kb = new Scanner(System.in);

    public Store(String playerName) {
        super(playerName);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void storeChoices()
    {
        //Prompts user the choices for the store
        System.out.println("Type the number for the a choice: " + "\n" +
                "0: To exit store" + "\n" +
                "1: To buy Attack stat Increase" + "\n" +
                "2: To buy Dmg reduction stat Increase" + "\n" +
                "3: To buy Health Restore stat Increase");
        boolean flag = true; //Flag for the loop
        int selector = -1;
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
        while (flag);
    }

    public void buyAttackIncrease() {
        /*
            -Can have a parameter that takes an integer or just an IF statement, and take silver coins away from player
            -This method increases the dmg output of the players move
            -this method should have a set price and an IF statement whether the player has enough to buy
        */
        System.out.println("Attack Increase Costs 25" + "\n" +
                "Would you like to buy: Type Yes|No");

        String userInput = kb.nextLine();
        while (userInput.toUpperCase().charAt(0) != 'Y' && userInput.toLowerCase().charAt(0) != 'N') {
            if (userInput.toUpperCase().charAt(0) == 'N')        //resets program
            {
                System.out.println(playerName + " ,I guess you can't afford it.");
            } else if (userInput.toUpperCase().charAt(0) == 'Y') {
                if (silverCoins >= 25) {
                    setAttackDmg(getAttackDmg() + 10); //Increase stat by 10
                    subtractSilverCoins(25);            //deletes 25 silverCoins
                } else {
                    System.out.println(getPlayerName() + " ,Get out! You are broke");
                }
            } else {
                System.out.println("Only type (Y|N)");
                userInput = kb.nextLine();
            }

        }
    }
        public void buyDmgReducedIncrease()
        {
        /*
            -Can have a parameter that takes an integer or just an IF statement, and take silver coins away from player
            -This method increases the damage reduction for the shield move
            -this method should have a set price and an IF statement whether the player has enough to buy
         */
            System.out.println("DMG Reduction Increase Costs 10" + "\n" +
                    "Would you like to buy: Type Yes|No");

             String userInput = kb.nextLine();
            while (userInput.toUpperCase().charAt(0) != 'Y' && userInput.toLowerCase().charAt(0) != 'N') {
                if (userInput.toUpperCase().charAt(0) == 'N')
                {
                    System.out.println(playerName + " ,I guess you can't afford it.");
                } else if (userInput.toUpperCase().charAt(0) == 'Y') {
                    if (silverCoins >= 10) {
                        setAttackDmg(getDmgReduced() + 115); //Increase stat by 15
                        subtractSilverCoins(10);            //deletes 10 silverCoins
                    } else {
                        System.out.println(getPlayerName() + " ,Get out! You are broke");
                    }
                } else {
                    System.out.println("Only type (Y|N)");
                    userInput = kb.nextLine();
                }
            }
        }
        public void buyHealthRestoreIncrease ()
        {
        /*
            -Can have a parameter that takes an integer or just an IF statement, and take silver coins away from player
            -This method increases the health restored for the health restore move
            -this method should have a set price and an IF statement whether the player has enough to buy
         */
            System.out.println("Health Restore Increase Costs 30" + "\n" +
                    "Would you like to buy: Type Yes|No");

            String userInput = kb.nextLine();
            while (userInput.toUpperCase().charAt(0) != 'Y' && userInput.toLowerCase().charAt(0) != 'N') {
                if (userInput.toUpperCase().charAt(0) == 'N')
                {
                    System.out.println(playerName + " ,I guess you can't afford it.");
                } else if (userInput.toUpperCase().charAt(0) == 'Y') {
                    if (silverCoins >= 10) {
                        setAttackDmg(getHealthRestore() + 10); //Increase stat by 10
                        subtractSilverCoins(30);            //deletes 30 silverCoins
                    } else {
                        System.out.println(getPlayerName() + " ,Get out! You are broke");
                    }
                } else {
                    System.out.println("Only type (Y|N)");
                    userInput = kb.nextLine();
                }
            }
        }


}