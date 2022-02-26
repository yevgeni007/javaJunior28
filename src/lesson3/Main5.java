package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("choose a figure");
        System.out.println("1 - krug");
        System.out.println("2 - oval");
        System.out.println("3 - kvadrat");
        System.out.println("4 - triugolnik");
        System.out.println("5 - trapezia");

        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();
        if(figura.equalsIgnoreCase("krug") || figura.equals("1")){
            System.out.println("okruzhnost ili ploshad");
            String action = scanner.nextLine();
            System.out.println("vvedite radius kruga");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if(action.equalsIgnoreCase("ploshad")){
                System.out.println("ploshad kruga: " + (Math.PI * (r * r)));

            }else {

                System.out.println("okruzhnost kruga: " + (2 * Math.PI * r));

            }


        }else if(figura.equalsIgnoreCase("oval") || figura.equals("2")){
            System.out.println("okruzhnost ili ploshad");
            String action = scanner.nextLine();
            System.out.println("vvedite radius ovala");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if(action.equalsIgnoreCase("ploshad")){
                System.out.println("ploshad ovala: " + (Math.PI * (r * r)));

            }else {

                System.out.println("okruzhnost kruga: " + (2 * Math.PI * r));

            }

        }else if(figura.equalsIgnoreCase("kvadrat") || figura.equals("3")){
            System.out.println("okruzhnost ili ploshad");
            String action = scanner.nextLine();
            System.out.println("vvedite radius kvadrata");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if(action.equalsIgnoreCase("ploshad")){
                System.out.println("ploshad kvadrata: " + (Math.PI * (r * r)));

            }else {

                System.out.println("okruzhnost kvadrata: " + (2 * Math.PI * r));

            }

        }else if(figura.equalsIgnoreCase("triugolnik") || figura.equals("4")){
            System.out.println("okruzhnost ili ploshad");
            String action = scanner.nextLine();
            System.out.println("vvedite radius triugolnika");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if(action.equalsIgnoreCase("ploshad")){
                System.out.println("ploshad triugolnika: " + (Math.PI * (r * r)));

            }else {

                System.out.println("okruzhnost triugolnika: " + (2 * Math.PI * r));

            }


        }else if(figura.equalsIgnoreCase("trapezia") || figura.equals("5")){
            System.out.println("okruzhnost ili ploshad");
            String action = scanner.nextLine();
            System.out.println("vvedite radius trapezii");
            String radius = scanner.nextLine();
            int r = Integer.parseInt(radius);
            if(action.equalsIgnoreCase("ploshad")){
                System.out.println("ploshad trapezii: " + (Math.PI * (r * r)));

            }else {

                System.out.println("okruzhnost trapezii: " + (2 * Math.PI * r));

            }


        }
    }
}
