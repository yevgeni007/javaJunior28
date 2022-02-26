package lesson3;

public class Main1 {
    public static void main(String[] args) {
                        //write from 1 to 20 with missing interval from 5 to 10
        for ( int i = 1 ; i <= 20 ; i++) {
            if ( i <  5 || i > 10 ){
                System.out.println(i);
            }
        }
    }
}
