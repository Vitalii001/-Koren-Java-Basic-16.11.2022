package Dz14;

public class MainTracker {
    public static void main(String[] args) {
        System.out.println("Пользователь номер 1: ");
        Accounts account1 = new Accounts("Ivan", "Ivanov", 1990, 11, 10, "ivanov@gmail.com", "+380955555555", 90, 120, 1100);

        account1.printAccountInfo();
        account1.setPressure(130);
        account1.setAmountSteps(2250);
        account1.setTheWeight(87);
        System.out.println("Отредактированый пользователь номер 1: ");
        account1.printAccountInfo();

        System.out.println("__________________________________________________________");
        System.out.println("Пользователь номер 2: ");
        Accounts account2 = new Accounts("Oksana", "Abrikosova", 1994, 4, 25, "abrikosova@gmail.com", "+380963232234", 70, 130, 5000);

        account2.printAccountInfo();
        account2.setPressure(120);
        account2.setAmountSteps(2340);
        account2.setSecondName("Kozlova");
        System.out.println("Отредактированый пользователь номер 2: ");
        account2.printAccountInfo();

        Accounts account3 = new Accounts("Stanislav", "Ponomarev", 1987, 10, 12, "ponomarev@gmail.com", "+380952334234", 89, 120, 4570);

        System.out.println("__________________________________________________________");
        System.out.println("Пользователь номер 3: ");
        account3.printAccountInfo();

    }
}
