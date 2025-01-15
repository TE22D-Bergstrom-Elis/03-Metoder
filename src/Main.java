import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hello32();

        Square();

        Multi();

        RightTriangleArea();

        CircleArea();

        GetNumberInput();

        GetChoice();

    }

    public static void Hello32() {
        for (int i = 0; i < 32; i++) {
            System.out.println("Hello world");
        }
    }

    public static void Square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv in ett nummer: ");
        int input = scanner.nextInt();
        int square = input * input;
        System.out.println(" Ditt tal upphjöt till två är " + square);
    }

    public static void Multi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multiplikation");

        System.out.println("Skriv in det första talet: ");
        double tal1 = scanner.nextDouble();

        System.out.println("Skriv in det andra talet: ");
        double tal2 = scanner.nextDouble();

        double produkt = tal1 * tal2;
        System.out.println("Multiplikationen av dina tal är " + produkt);

    }

    public static void RightTriangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arean av en rätvinklig triangel");

        System.out.println("Skriv in basen av triangeln: ");
        double basen = scanner.nextDouble();
        System.out.println("Skriv in basen av triangeln: ");
        double hojden = scanner.nextDouble();

        double area = basen * hojden;
        System.out.println("Arean på den rätvinkliga triangeln är " + area);

    }

    public static void CircleArea() {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arean av en cirkel");

        System.out.println("Skriv in Radien på cirkeln: ");
        double radien = scanner.nextDouble();

        double area = (radien * radien) * pi;
        System.out.println("Arean av din cirkel är: " + area);
    }

    public static void GetNumberInput() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        boolean braInput = false;

        while (!braInput) {
            System.out.println("Skriv in ett tal");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                braInput = true;
            } else {
                System.out.println("Du skrev inte in ett tal!!");
                scanner.next();
            }
        }
        System.out.println("Du skrev ut " + input);
    }

    public static void GetChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hur många ord vill du välja mellan");
        int antalVal = scanner.nextInt();
        scanner.nextLine();

        String[] ordVal = new String[antalVal];
        for (int i=0; i < antalVal; i++)
        {
            System.out.println("Ange ord för alternativ " + (i+1) + ": " );
            ordVal[i] = scanner.nextLine();
        }


        int val = 0;
        boolean braVal = false;

        while (!braVal) {
            System.out.println("Välj ett av dina följande ord:");
            for (int i = 0; i < ordVal.length; i++) {
                System.out.println((i + 1) + ". " + ordVal[i]);
            }
            System.out.println("Ditt val: ");

            if (scanner.hasNextInt()) {
                val = scanner.nextInt();
                if (val >= 1 && val <= ordVal.length) {
                    braVal = true;
                } else {
                     System.out.println("ogiltigt val, försök igen ");
                }
            }
            else
            {
                System.out.println("ogiltigt val, försök igen");
                scanner.next();
            }

        }
        System.out.println("Du valde " + val);
    }
}