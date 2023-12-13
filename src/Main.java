public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addedBalance = 1100;
        int bonus = addedBalance / 100;
        int finalBalance = balance + addedBalance + bonus;
        if (addedBalance > 1000) {
            System.out.println( "бонус " + bonus + ", итоговый счет: " + finalBalance);
        } else {
            System.out.println("бонусов нет, итоговая сумма " + (balance + addedBalance));
        }
    }
}