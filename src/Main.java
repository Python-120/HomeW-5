/*
1. Створити клас User, у якого будуть:
- поля userName, age, email, password, isActive(boolean), amountSpentMoney. password та age повинні мати модифікатор доступу private. Зробити геттери і сеттери з валідацією для private полів(валідація довільна).
- методи: makePurchase, який приймає параметр purchasePrice(вартість покупки) типу double, і виводить на яку суму була здійснена покупка та додає цю вартість до глобальної змінної amountSpentMoney.
 printTotalAmountOfSpentMoney, який виводить загальну суму витрачених грошей.
-конструктори: дефолтний; конструктор який приймає userName та контруктор який приймає userName та password.

Створити додатковий клас для перевірки функціональності класса User, де треба створити декілька екземплярів класса User з різними значеннями, повикликати методи, в кінці програми вивести суму витрачених грошей, кожного юзера та інформацію про нього

2.Створити класс Calculator, який буде мати статичні методи для базових арифметичних обчислень. В классі Main, викликати методи классу Calculator, для перевірки
 */
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int sum = Calculator.plus(a, b);
        System.out.println("Сума: " + sum);

        int difference = Calculator.minus(a, b);
        System.out.println("Різниця: " + difference);

        int product = Calculator.multiply(a, b);
        System.out.println("Добуток: " + product);

        double quotient = Calculator.divide(a, b);
        System.out.println("Частка: " + quotient);

        // Створення екземплярів класу User з різними значеннями
        User user1 = new User("John");
        user1.setAge(25);
        user1.setEmail("john@example.com");
        user1.setActive(true);
        user1.makePurchase(50.0);

        User user2 = new User("Alice", "3214");
        user2.setAge(30);
        user2.setEmail("alice@example.com");
        user2.setActive(true);
        user2.makePurchase(100.0);
        user2.makePurchase(150.0);


        // Виведення інформації про користувачів
        System.out.println("Інформація про користувача 1:");
        System.out.println("Ім'я користувача: " + user1.getUserName());
        System.out.println("Вік: " + user1.getAge());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Активний: " + user1.isActive());
        user1.printTotalAmountOfSpentMoney();

        System.out.println();

        System.out.println("Інформація про користувача 2:");
        System.out.println("Ім'я користувача: " + user2.getUserName());
        System.out.println("Вік: " + user2.getAge());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("Активний: " + user2.isActive());
        user2.printTotalAmountOfSpentMoney();

        // Виведення загальної суми витрачених грошей
        double totalSpentMoney = user1.getAmountSpentMoney() + user2.getAmountSpentMoney();
        System.out.println("\nЗагальна сума витрачених грошей: " + totalSpentMoney);
    }

}
