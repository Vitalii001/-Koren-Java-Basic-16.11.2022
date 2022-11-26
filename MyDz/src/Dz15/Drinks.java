package Dz15;

public class Drinks {
    public double value;
    public static final double COFFEE_PRICE = 5.50;
    public static final double TEA_PRICE = 5;
    public static final double LEMONADE_PRICE = 6.50;
    public static final double MOJITO_PRICE = 8;
    public static final double MINERAL_PRICE = 3;
    public static final double COCA_COLA_PRICE = 4.50;
    
    private static int drinkCount = 0;
    private DrinksMachine type;
    public double price;
    public double totalCost;

    public Drinks(DrinksMachine type) {
        this.type = type;
        drinkCount++;
    }
    public static int getDrinkCount (){
    return drinkCount;

    }






}
