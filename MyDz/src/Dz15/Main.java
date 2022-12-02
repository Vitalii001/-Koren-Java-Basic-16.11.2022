package Dz15;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String[] drinks = new String[]{DrinksMachine.COFFEE.toString(), DrinksMachine.MOJITO.toString(), DrinksMachine.LEMONADE.toString(), DrinksMachine.TEA.toString(), DrinksMachine.COCA_COLA.toString(), DrinksMachine.MINERAL_WATER.toString()};

    private static void cookTheDrink() {
        String drinksChoice = inputDrinks();
        switch (drinksChoice) {
            case ("MOJITO"):
                Drinks mojito = new Drinks("mojito", "80.30", DrinksMachine.MOJITO);
                System.out.println("Приготовление мохито");
                break;

            case ("COFFEE"):
                Drinks coffee = new Drinks("coffee", "20.55", DrinksMachine.COFFEE);
                System.out.println("Приготовление кофе");
                break;

            case ("LEMONADE"):
                Drinks lemonade = new Drinks("lemonade", "40.20", DrinksMachine.LEMONADE);
                System.out.println("Приготовление лимонада");
                break;

            case ("TEA"):
                Drinks tea = new Drinks("tea", "18.05", DrinksMachine.TEA);
                System.out.println("Приготовление чая");
                break;

            case ("COCA_COLA"):
                Drinks cocaCola = new Drinks("coca cola", "25.80", DrinksMachine.COCA_COLA);
                System.out.println("Приготовление колы");
                break;

            case ("MINERAL_WATER"):
                Drinks mineralWater = new Drinks("mineral water", "18.40", DrinksMachine.MINERAL_WATER);
                System.out.println("Приготовление минеральной воды");
                break;

            default:
                System.out.println("Такого напитка не существует");

        }
        choiceOneMoreDrinks();
    }

    private static void choiceOneMoreDrinks() {
        System.out.println("Хотите выбрать ещё один напиток ?");
        System.out.println("yes/no: ");
        while (true) {
            Scanner input = new Scanner(System.in);
            String drinksChoice = input.nextLine();
            if (drinksChoice.equals("yes")) {
                cookTheDrink();
                break;

            } else if (!drinksChoice.equals("no")) {
                System.out.println("Введите ответ да или нет : ");

            } else {
                break;
            }

        }
    }

    private static String inputDrinks() {
        System.out.println("Выберите один из предложеных напитков:" + Arrays.toString(drinks));
        while (true) {
            Scanner input = new Scanner(System.in);
            String drinksChoice = input.nextLine();
            for (String i : drinks) {
                if (i.equals(drinksChoice.toUpperCase())) {
                    drinksChoice = i;
                    return i;
                }

            }
            System.out.println("Этого напитка нет в списке предложеных!");
            System.out.println("попробуйте снова:");
        }
    }


    public static void main(String[] args) {
        cookTheDrink();
        System.out.printf("Количество выбраных напитков равно " +Drinks.getDrinksCount());
        System.out.println();
        System.out.printf("К оплате " + Drinks.getCommonPrice() + " гривен.");
    }
}

