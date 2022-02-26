package lesson5;

import java.util.Random;
import java.util.Scanner;

public class StringUtils<area> {
    public static int countVowel(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' || text.charAt(i) == 'y') {
                count++;
            }
        }
        return count;
    }

    public static int punctuationMarks(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ',' || text.charAt(i) == '.' || text.charAt(i) == ';' || text.charAt(i) == ':' || text.charAt(i) == '?' || text.charAt(i) == '!' || text.charAt(i) == '-' || text.charAt(i) == '"' || text.charAt(i) == '/') {
                count++;
            }
        }
        return count;
    }

    public static int trianleArea() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Side 1: ");
        int a = scan.nextInt();
        System.out.print("Enter Side 2: ");
        int b = scan.nextInt();
        System.out.print("Enter Side 3: ");
        int c = scan.nextInt();
        double s = (0.5) * (a + b + c);
        double area = (double) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of triangle is: " + area);
        return (int) area;


    }

    public static void arrayPrint(int[][] array) {
            for(int i = 0; i < array.length; i++) {
                for(int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();

            }

    }

    public static int[][] arrayRandom(int[][] arrayRandomNumbers){
        Random randomFill = new Random();
        for (int i = 0; 1 < arrayRandomNumbers.length; i++){
            for (int j = 0; j < arrayRandomNumbers[i].length; j++){
                arrayRandomNumbers[i][j] = randomFill.nextInt();

            }

        }
        return arrayRandomNumbers;
    }

}