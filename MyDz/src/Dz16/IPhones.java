package Dz16;

public class IPhones implements Smartphones, IOs{
    @Override
    public void call() {
        System.out.println("Позвонить с айфон");
    }

    @Override
    public void sms() {
        System.out.println("Отправить смс с айфон");
    }

    @Override
    public void internet() {
        System.out.println("Выход в интернет с айфон");
    }
}
