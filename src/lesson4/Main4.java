package lesson4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String[][] tours = {{"1", "italy", "5 days", "plane", "10000", "5 stars", "yes"},
                {"2", "france", "4 days", "777", "20000", "4 stars", "no"},
                {"3", "turkey", "6 days", "747", "30000", "3 stars", "yes"},
                {"4", "russia", "7 days", "727", "30000", "2 stars", "no"},
                {"5", "japan", "8 days", "733", "30000", "1 stars", "yes"},
                {"6", "usa", "9 days", "756", "30000", "7 stars", "no"},
                {"7", "ukraine", "10 days", "776", "70000", "3 stars", "yes"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("select country");
        String country = scanner.nextLine();
               // 100000
        System.out.println("witch budget");
        String moneyStr = scanner.nextLine();
        int money = Integer.parseInt(moneyStr);

        System.out.println("you can go to");
        for (int i = 0; i < tours.length; i++) {
            int costTour = Integer.parseInt(tours[i][4]);
            if (country.equals(tours[i][1]) && costTour > money - 30000 && costTour < money + 20000) {
                System.out.printf("%s. %s: %s, %s, %s, %s, %s, transfer - %s \n",
                        tours[i][0], tours[i][1], tours[i][2], tours[i][3],
                        tours[i][4], tours[i][5], tours[i][6], tours[i][7]);
            }

        }


    }
}
