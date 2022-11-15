package Dz13;

public class Burgers {
    String bun;
    String meat;
    String meat1;
    String cheese;
    String greens;
    String mayonnaise;

    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Обычный бургер : " + bun + " , " + meat + " , " + cheese + " , " + greens + " , " + mayonnaise);
    }

    public Burgers(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Диетический бургер : " + bun + " , " + meat + " , " + cheese + " , " + greens);
    }
    public Burgers(String bun, String meat,String meat1, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat1 = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер с двоным мясом : " + bun + " , " + meat + " , " + meat1 + " , " + cheese + " , " + greens + " , " + mayonnaise);
    }


}