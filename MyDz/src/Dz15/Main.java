package Dz15;

import static Dz15.DrinksMachine.COFFEE;

public class Main {
    public static void main(String[] args){

        Drinks drink = new Drinks(COFFEE);
        System.out.println(drink.getDrinkCount());

    }
}
