package lesson2;

public class Home2 {
    public static void main(String[] args) {
        // Сумму четных от 40 до 80

        int summa = 0;
        for (int i = 40; i <= 80; i = i + 2) {
            summa = summa + i;
        }
        System.out.println(summa);
    }
}

