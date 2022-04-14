public class Moves extends Player
{

    Scanner kb = new Scanner(System.in);
    public Moves(String playerName) {
        super(playerName);
    }
    public void useAttack()
    {
        //a method for a move attacks for player
        //subtracts health from enemy
        enemyHealthBar=-getAttackDmg;
        System.out.println(getPlayerName " , has used Attack dealing this much damage: " getAttackDmg);
    }
    public void useShield()
    {
        //a method for a move reducing incoming dmg from enemy
        //should reduce attack dmg from enemy

    }
    public void useHealth()
    {
        //a method for a move that heals the player
        //should gain an ammount of health
        if(getHealthBar <100)
        {
            healthBar+= getHealthRestore;
            System.out.println(getPlayerName "has been healed by this much: " getHealthRestore);
        }
        else
        {
            System.out.Println(getPlayerName ", You can not heal over 100hp. You have messed up and screwed up your turn!");
        }
    }
    public void moveChoice()
    {
        //a method should be created with IF statements for using the different cards/moves
        //Prompts user the choices for the move choice
        System.out.println("Type the number for the a choice: " + "\n" +
                "0: To Run away from Life" + "\n" +
                "1: To use Attack move" + "\n" +
                "2: To use Shield move" + "\n" +
                "3: To use Health move");
        boolean flag = true; //Flag for the loop
        do {
            //Do while loop should catch any int that is not 0-3
            try {
                selector = kb.nextInt();
                if (selector == 0) {
                    //This should exit the User out of the game for being a coward
                    System.out.println("Coward has fled...")
                    System.exit(0);
                    flag = false;
                } else if (selector == 1) {
                    //This should go to useAttack method and use it
                    useAttack();
                    flag = false;
                } else if (selector == 2) {
                    //This should go to useShield method and use it
                    useShield();
                    flag = false;
                } else if (selector == 3) {
                    //This should go to useHealth method and use it
                    useHealth();
                    flag = false;
                }
            } catch (Exception exception) {
                //It should catch any exception that is not an int.
                System.out.println(getPlayerName() + ", that is the wrong input. Can you not read? Try again");
            }
        }
        while (flag);

    }
}
