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
