package Dz15;

import java.math.BigDecimal;

public class Drinks {
    private static int drinksCount;
    private BigDecimal price;
    private String name;
    private DrinksMachine drink;

    private static BigDecimal commonPrice = new BigDecimal("0.00");

    public Drinks(String name, String price, DrinksMachine drink) {
        this.name = name;
        this.price = new BigDecimal(price);
        this.drink = drink;
        drinksCount++;
        BigDecimal tmp = new BigDecimal(price);
        commonPrice = commonPrice.add(tmp);
    }
    public BigDecimal getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public DrinksMachine getDrink() {
        return drink;
    }

    public static int getDrinksCount() {
        return drinksCount;
    }

    public static BigDecimal getCommonPrice() {
        return commonPrice;
    }
    }

