package lesson4;

public class Main1 {
    public static void main(String[] args) {
        int money = 100000;
        int prosent = 7;
        int year = 5;

        for (int i = 0; i < year; i++) {
            for (int months = 0; months < 12; months++) {
                money = money + (money / 100 * prosent) / 12;
            }
        }
        System.out.println(money);
    }
}
