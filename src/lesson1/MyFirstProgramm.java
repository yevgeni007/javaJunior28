package lesson1;

public class MyFirstProgramm {
    public static void main(String[] args) {
        int money = 1000;
        System.out.println("money you have: " + money);

        int pizzaCost = 230;
        int gumCost = 26;
        double candyCost = 2.5;


        int pizzaCount =(int) (money / pizzaCost);
        System.out.println("pizza you can buy: " + pizzaCount) ;

        int changeFromPizza = (int) (money - pizzaCost*4) ;

        int gumCount = (int) (changeFromPizza / gumCost);
        System.out.println("gum you can buy: " + gumCount);

        int changeFromGum = (int) (money - pizzaCost*4 - gumCost*3);

        int candyCount = (int) (changeFromGum / candyCost);
        System.out.println("candy you can buy: " + candyCount);

        int moneyLeft = (int) (money - pizzaCost*4 - gumCost*3 - candyCost*0);
        System.out.println("money left: " + moneyLeft);





    }
}