public class Main {
    public static void main(String[] args) {
        System.out.println("\n Первое задание:");
        task1();
        System.out.println("\n Второе задание:");
        task2();
        System.out.println("\n Третье задание:");
        task3();
        System.out.println("\n Четвертое задание:");
        task4();
        System.out.println("\n Пятое задание:");
        task5();
        System.out.println("\n Шестое задание:");
        task6();
        System.out.println("\n Седьмое задание:");
        task7();
    }

    public static void task1() {
        byte clientOS = 1;

        System.out.println(clientOS == 0 ? "Установите версию приложения для iOS по ссылке" : "Установите версию приложения для Android по ссылке");
    }

    public static void task2() {
        byte clientOS = 0;
        short clientDeviceYear = 2013;

        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        short year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) System.out.println(year + " год является високосным");
        else System.out.println(year + " год не является високосным");
    }

    public static void task4() {
        byte deliveryDistance = 95, days = 1;

        if (deliveryDistance > 20) days++;
        if (deliveryDistance > 60) days++;
        System.out.println("Потребуется дней: " + days);
    }

    public static void task5() {
        byte monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "й месяц январь, 2й месяц зимы.");
                break;
            case 2:
                System.out.println(monthNumber + "й месяц февраль, 3й месяц зимы.");
                break;
            case 3:
                System.out.println(monthNumber + "й месяц март, 1й месяц весны.");
                break;
            case 4:
                System.out.println(monthNumber + "й месяц апрель, 2й месяц весны.");
                break;
            case 5:
                System.out.println(monthNumber + "й месяц май, 3й месяц весны.");
                break;
            case 6:
                System.out.println(monthNumber + "й месяц июнь, 1й месяц лета.");
                break;
            case 7:
                System.out.println(monthNumber + "й месяц июль, 2й месяц лета.");
                break;
            case 8:
                System.out.println(monthNumber + "й месяц август, 3й месяц лета.");
                break;
            case 9:
                System.out.println(monthNumber + "й месяц сентябрь, 1й месяц осени.");
                break;
            case 10:
                System.out.println(monthNumber + "й месяц октябрь, 2й месяц осени.");
                break;
            case 11:
                System.out.println(monthNumber + "й месяц ноябрь, 3й месяц осени.");
                break;
            case 12:
                System.out.println(monthNumber + "й месяц декабрь, 1й месяц зимы.");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

    public static void task6() {
        byte age = 19;
        int salary = 58_000;
        float credit = 0;

        if (age < 23) credit = salary * 2;
        else credit = salary * 3;

        if (salary >= 50_000 && salary < 80_000) credit += salary * 1.2;
        else if (salary >= 80_000) credit += salary * 1.5;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + credit + " рублей");
    }

    public static void task7() {
        byte age = 25;
        float percent = 10f;
        int salary = 60_000, wantedSum = 330_000, paymentSalary = 0, paymentMonth = 0;

        if (age < 23) percent++;
        else if (age < 30) percent += 0.5f;
        if (salary > 80000) percent -= 0.7f;

        paymentMonth = (int) ((wantedSum + (wantedSum * percent) / 100) / 12);
        paymentSalary = salary / 2;
        System.out.println("Ставка " + percent + "% годовых");
        if (paymentMonth < paymentSalary)
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + paymentSalary + " рублей. Платеж по кредиту " + paymentMonth + " рублей. Одобрено");
        else
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + paymentSalary + " рублей. Платеж по кредиту " + paymentMonth + " рублей. Отказано");
    }
}