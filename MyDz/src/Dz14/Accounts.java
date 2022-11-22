package Dz14;

public class Accounts {
    private String firstName;
    private String secondName;
    private int yearOfBirth;
    private int monthOfBird;
    private int birthday;
    private String email;
    private  String phoneNumber;
    private int theWeight;
    private int pressure;
    private int amountSteps;
    private int age;

    public Accounts (String firstName , String secondName , int yearOfBirth , int monthOfBird , int birthday , String email , String phoneNumber , int theWeight , int pressure , int amountSteps){
        this.firstName = firstName;
        this.secondName = secondName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBird = monthOfBird;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.theWeight = theWeight;
        this.pressure = pressure;
        this.amountSteps = amountSteps;
        this.age = 2022 - yearOfBirth;// Я исходил из условия задачи, не усложнять с выщитыванием возраста
    }
    public int getAge(){
        return age;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getSecondName (){
        return secondName;
    }
    public void setSecondName (String secondName){
        this.secondName = secondName;
    }
    public int getYearOfBirth(){
        this.age = 2022 - yearOfBirth;
        return yearOfBirth;
    }
    public int getMonthOfBird(){
        return monthOfBird;
    }
    public int getBirthday(){
        return birthday;
    }
    public String getEmail(){
        return email;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getTheWeight(){
        return theWeight;
    }
    public void setTheWeight (int theWeight){
        this.theWeight = theWeight;
    }
    public int getPressure(){
        return pressure;
    }
    public void setPressure (int pressure){
        this.pressure = pressure;
    }
    public int getAmountSteps(){
        return  amountSteps;
    }
    public void setAmountSteps (int amountSteps){
        this.amountSteps = amountSteps;
    }


    public void printAccountInfo(){
        System.out.println("Имя " + firstName + "; Фамилия " + secondName + "; Дата рождения "+ yearOfBirth + "," + monthOfBird + "," + birthday + "; Возраст " + age + "; email " + email + "; Номер телефона " + phoneNumber + "; Вес " + theWeight + "; Давление " + pressure + "; Количевство проденых шагов " + amountSteps);
    }
}
