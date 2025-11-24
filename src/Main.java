public class Main {
    public static void main(String[] args) {

        int Balance = 300;
        int amountUp = 1500;


        int bonus = 0;
        int totalBalance = 0;

        if (amountUp > 1000) {
            bonus = (amountUp / 100);
        }

        totalBalance = Balance + bonus + amountUp;

        if (bonus > 0) {
            System.out.println("Начислено " + bonus + " бонусных руб.");
            System.out.println("Итоговый баланс: " + totalBalance + " руб.");
        } else {
            System.out.println("Бонусные рубли отсутствуют.");
            System.out.println("Итоговый баланс: " + totalBalance + " руб.");
        }
    }
}