package lesson2;

public class Main {
    public static void main(String[] args) {
        int mark = 4;

        switch (mark) {
            case 5:
                System.out.println("Wonderful");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Not good");
                break;
            case 2:
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not a mark");
        }
    }
}
