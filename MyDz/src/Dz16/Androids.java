package Dz16;

public class Androids implements Smartphones, LinuxOS{

    @Override
    public void call() {
        System.out.println("Позвонить с андроид");
    }

    @Override
    public void sms() {
        System.out.println("Отправить смс с андроид");
    }

    @Override
    public void internet() {
        System.out.println("Выход в интернет с андроид");
    }
}
