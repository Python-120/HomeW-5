/*
1. Створити клас User, у якого будуть:
- поля userName, age, email, password, isActive(boolean), amountSpentMoney. password та age повинні мати модифікатор доступу private. Зробити геттери і сеттери з валідацією для private полів(валідація довільна).
- методи: makePurchase, який приймає параметр purchasePrice(вартість покупки) типу double, і виводить на яку суму була здійснена покупка та додає цю вартість до глобальної змінної amountSpentMoney.
 printTotalAmountOfSpentMoney, який виводить загальну суму витрачених грошей.
-конструктори: дефолтний; конструктор який приймає userName та контруктор який приймає userName та password.
 */

public class User {
    private String userName;
    private int age;
    private String email;
    private String password;
    private boolean isActive;
    private double amountSpentMoney;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Вік користувача повинен бути не менше 18 років.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public double getAmountSpentMoney() {
        return amountSpentMoney;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Покупка на суму: " + purchasePrice + " здійснена.");
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Загальна сума витрачених грошей: " + amountSpentMoney);
    }
    
    public void addDiscount(int percent) {
        double discount = amountSpentMoney * percent / 100;
        amountSpentMoney -= discount;
        System.out.println("Застосовано знижку " + percent + "%");
    }
}
