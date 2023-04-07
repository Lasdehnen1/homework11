public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void defineYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void checkDevice(int year, int clientOS) {
        if (clientOS == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static int calculateTimeToDeliver(int deliveryDistance) {
        int counter = 1;
        if (deliveryDistance > 20) {
            counter++;
        }
        if (deliveryDistance > 60) {
            counter++;
        }
        if (deliveryDistance > 100) {
            return -1;
        }
        return counter;

    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2024;
        defineYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int year = 2014;
        checkDevice(year, clientOS);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 77;
        System.out.println("Потребуется дней: " + calculateTimeToDeliver(deliveryDistance));

    }

}
