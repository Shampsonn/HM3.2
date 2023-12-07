public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addedBalance = 1100;
        int bonus = addedBalance / 100;
        int finalBonus = balance + addedBalance + bonus;
        if (addedBalance > 1000) {
            System.out.println(finalBonus);
        } else {
            System.out.println(balance + addedBalance);
        }
    }
}