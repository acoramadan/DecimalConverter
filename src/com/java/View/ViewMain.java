package com.java.View;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.java.Model.Number;
import com.java.Controller.Formula;

public class ViewMain {
    private static final Scanner scanner = new Scanner(System.in);

    private static void decimalMenu(Number number) {

        System.out.println("=====================* Decimal Converter *=====================");
        System.out.println("1.Decimal to Biner");
        System.out.println("2.Decimal to Octal");
        System.out.println("3.Decimal to HexaDecimal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* Decimal to Biner *=====================");
                System.out.print("Insert a Decimal Number : ");
                number.setDecimal();
                System.out.println("Decimal Number : " + number.getDecimal());
                System.out.println("Biner Number   : " + Formula.decimalToBiner(number.getDecimal()));
                break;

            case 2:
                System.out.println("=====================* Decimal to Octal *=====================");
                System.out.print("Insert a Decimal Number : ");
                number.setDecimal();
                System.out.println("Decimal Number : " + number.getDecimal());
                System.out.println("Octal Number   : " + Formula.decimalToOctal(number.getDecimal()));
                break;

            case 3:
                System.out.println("=====================* Decimal to HexaDecimal *=====================");
                System.out.print("Insert a Decimal Number : ");
                number.setDecimal();
                System.out.println("Decimal Number     : " + number.getDecimal());
                System.out.println("HexaDecimal Number : " + Formula.decimalToHexaDecimal(number.getDecimal()));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid input!");
        }
    }
    public static void octalMenu(Number number) {
        int ans = 0;
        System.out.println("=====================* Octal Converter *=====================");
        System.out.println("1.Octal to Biner");
        System.out.println("2.Octal to Decimal");
        System.out.println("3.Octal to HexaDecimal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* Octal to Biner *=====================");
                System.out.print("Insert a Octal Number : ");
                number.setOctal();
                System.out.println("Octal Number   : " + number.getOctal());
                ans = Formula.octalToDecimal(number.getOctal());

                System.out.println("Biner Number   : " + Formula.decimalToBiner(ans));
                break;

            case 2:
                System.out.println("=====================* Octal to Decimal *=====================");
                System.out.print("Insert a Octal Number : ");
                number.setOctal();
                System.out.println("Octal Number     : " + number.getOctal());
                System.out.println("Decimal Number   : " + Formula.octalToDecimal(number.getOctal()));
                break;

            case 3:
                System.out.println("=====================* Octal to HexaDecimal *=====================");
                System.out.print("Insert a Octal Number : ");
                number.setOctal();
                System.out.println("Octal Number       : " + number.getOctal());
                ans = Formula.octalToDecimal(number.getOctal());

                System.out.println("HexaDecimal Number : " + Formula.decimalToHexaDecimal(ans));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }

    public static void binerMenu(Number number){
        int ans = 0;
        System.out.println("=====================* Biner Converter *=====================");
        System.out.println("1.Biner to Octal");
        System.out.println("2.Biner to Decimal");
        System.out.println("3.Biner to HexaDecimal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* Biner to Octal *=====================");
                System.out.print("Insert a Biner Number : ");
                number.setBiner();
                System.out.println("Biner Number   : " + number.getBiner());
                ans = Formula.binerToDecimal(number.getBiner());

                System.out.println("Octal Number   : " + Formula.decimalToOctal(ans));
                break;

            case 2:
                System.out.println("=====================* Biner to Decimal *=====================");
                System.out.print("Insert a Biner Number : ");
                number.setBiner();
                System.out.println("Biner Number     : " + number.getBiner());
                System.out.println("Decimal Number   : " + Formula.binerToDecimal(number.getOctal()));
                break;

            case 3:
                System.out.println("=====================* Biner to HexaDecimal *=====================");
                System.out.print("Insert a Biner Number : ");
                number.setBiner();
                System.out.println("Biner Number         : " + number.getBiner());
                ans = Formula.binerToDecimal(number.getBiner());

                System.out.println("HexaDecimal Number   : " + Formula.decimalToHexaDecimal(ans));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }
    public static void hexaDecimalMenu(Number number){
        int ans = 0;
        System.out.println("=====================* hexaDecimalMenu Converter *=====================");
        System.out.println("1.HexaDecimal to Biner");
        System.out.println("2.HexaDecimal to Decimal");
        System.out.println("3.HexaDecimal to Octal");
        System.out.println("4.Exit");
        System.out.print("Insert your option : ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {

            case 1:
                System.out.println("=====================* HexaDecimal to Biner *=====================");
                System.out.print("Insert a HexaDecimal Number : ");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number   : " + number.getHexaDecimal());
                ans = Formula.hexadecimalToDecimal(number.getHexaDecimal());

                System.out.println("Biner Number         : " + Formula.decimalToBiner(ans));
                break;

            case 2:
                System.out.println("=====================* HexaDecimal to Decimal *=====================");
                System.out.print("Insert a HexaDecimal Number : ");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number     : " + number.getHexaDecimal());
                System.out.println("Decimal Number         : " + Formula.hexadecimalToDecimal(number.getHexaDecimal()));
                break;

            case 3:
                System.out.println("=====================* HexaDecimal to Octal *=====================");
                System.out.print("Insert a HexaDecimal Number : ");
                number.setHexaDecimal();
                System.out.println("HexaDecimal Number : " + number.getHexaDecimal());
                ans = Formula.hexadecimalToDecimal(number.getHexaDecimal());

                System.out.println("Octal Number       : " + Formula.decimalToOctal(ans));
                break;

            case 4:
                return;

            default:
                System.out.println("Invalid Input");

        }
    }

    public static void runexc() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        boolean flag = true;

        do {
            System.out.println("=====================* Decimal,Hexa,Biner,Octal Converter *=====================");
            System.out.println("1.Decimal");
            System.out.println("2.Octal");
            System.out.println("3.Biner");
            System.out.println("4.HexaDecimal");
            System.out.println("5.Exit");
            System.out.print("Insert your option : ");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                decimalMenu(number);
            }

            else if (input == 2) {
                octalMenu(number);
            }

            else if (input == 3) {
                binerMenu(number);
            }

            else if (input == 4) {
                hexaDecimalMenu(number);
            }
            else if (input == 5) {
                System.out.println("bye!");
                flag = false;
            }
            else {
                System.out.println("Invalid input");
            }

        } while (flag);
    }
    public static void run(){
        try {
            runexc();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input.");
        }
    }
}
