//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int clientOS = 0;
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
        if (phoneYear >= 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
        } else {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }
        System.out.println("Task3");
        int year = 2024;
        int yearDelFour = year % 4;
        int yearDelHand = year % 100;
        int yearDelFourHand = year % 400;
        int sum = yearDelFour + yearDelHand + yearDelFourHand;
        if (year > 1584) {
            if ((yearDelFour == 0 && yearDelHand != 0) || yearDelFourHand == 0) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год является не високосным.");
            }
        } else System.out.println("Високосный год ещё не придумали в "+year+" году.");
        System.out.println("Task4");
        int deliveryDistance=101;
        int deliveryDays=1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: "+deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays=deliveryDays+1;
            System.out.println("Потребуется дней: "+deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Потребуется дней: доставки нет.");
        }
        System.out.println("Task5");
        int monthNumber=13;
        if (monthNumber <= 12 && monthNumber > 0) {
            switch (monthNumber) {
                case 1:
                    System.out.println("Январь это зимний месяц.");
                    break;
                case 2:
                    System.out.println("Февраль это зимний месяц.");
                    break;
                case 3:
                    System.out.println("Март это весенний месяц.");
                    break;
                case 4:
                    System.out.println("Апрель это весенний месяц.");
                    break;
                case 5:
                    System.out.println("Май это весенний месяц.");
                    break;
                case 6:
                    System.out.println("Июнь это летний месяц.");
                    break;
                case 7:
                    System.out.println("Июль это летний месяц.");
                    break;
                case 8:
                    System.out.println("Август это летний месяц.");
                    break;
                case 9:
                    System.out.println("Сентябрь это осенний месяц.");
                    break;
                case 10:
                    System.out.println("Октябрь это осенний месяц.");
                    break;
                case 11:
                    System.out.println("Ноябрь это осенний месяц.");
                    break;
                case 12:
                    System.out.println("Декабрь это зимний месяц.");
                    break;
            } /* else System.out.println("Такого месяца не бывает."); */
        } else System.out.println("Такого месяца не бывает.");
}
}
