public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке.");
        }else if (clientOS==0){
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else {
            System.out.println("Ошибка распознавание операционной системы.");
        }
        System.out.println("");

        System.out.println("Task 2");
        int clientDeviceYear = 2015;
        String operationSystem = clientOS == 0 ? "IOS" : "Android";
        String msg = clientDeviceYear <= 2015 ? "облегченную" : "обычную";
        if(clientOS == 0 || clientOS == 1){
            System.out.println("Установите " + msg +" версию для " + operationSystem + " по ссылке." );
        }
        System.out.println("");

        System.out.println("Task 3");
        int year = 2024;
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0))) {
            System.out.println(year + " год является високостным.");
        } else {
            System.out.println(year + " год не является високостным.");
        }
        System.out.println("");

        System.out.println("Task 4");
        int deliveryDistance = 195;
        int days = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней:" + days);
        } else if (deliveryDistance>20 && deliveryDistance<60) {
            System.out.println("Потребуется дней:" + (days+1));
        } else if (deliveryDistance>=60 && deliveryDistance<=100) {
            System.out.println("Потребуется дней:" + (days+2));
        } else {
            System.out.println("Доставки нет.");
        }
        System.out.println("");
        System.out.println("Task 5");
        int monthNumber = 13;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
    }
}