public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int x = 1100;
        int bonus = x / 100;
        int finalBonus = balance + x + bonus;
        if (x > 1000){
            System.out.println(finalBonus);
        } else {
            System.out.println(balance + x);
        }
    }
}