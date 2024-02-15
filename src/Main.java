//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
        System.out.println("Task2");
        int phoneYear = 2014;
        if (phoneYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (phoneYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (phoneYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (phoneYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("Task3");
        int year = 1582;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год является не високосным.");
        }

        System.out.println("Task4");
        int deliveryDistance = 101;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Потребуется дней: доставки нет.");
        }
        System.out.println("Task5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " это зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " это весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " это летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " это осенний месяц.");
                break;
            default:
                System.out.println("Некорректный номер месяца. Номер месяца должен быть в диапазоне от 1 до 12.");


        }
    }
}

