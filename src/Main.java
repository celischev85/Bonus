public class Main {
    public static void main(String[] args) {

        int Balance = 300;
        int AmountUp = 1500;


        int Bonus = 0;
        int Totalbalance;

        if (AmountUp > 1000) {
            Bonus = (AmountUp / 100);
        }
        Totalbalance = Balance + Bonus + AmountUp;

        if (Bonus > 0) {
            System.out.println("Начислено " + Bonus + " бонусных руб.");
            System.out.println("Итоговый баланс: " + Totalbalance + " руб.");
        } else {
            System.out.println("Бонусные рубли отсутствуют.");
            System.out.println("Итоговый баланс: " + Totalbalance + " руб.");
        }
    }
}