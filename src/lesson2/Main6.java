package lesson2;

public class Main6 {
    public static void main(String[] args) {
        int money = 1000000;
        int year = 5;
        int procent = 7;

        for (int months = 0; months < 12 * year; months++) {
            money = money + ((money / 100 * procent) / 12);
        }
        System.out.println(money);
    }

}