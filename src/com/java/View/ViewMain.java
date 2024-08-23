package com.java.View;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.java.Model.Number;
import com.java.Controller.Formula;

public class ViewMain {
    public static void runexc() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        boolean flag = true;
        do {
            System.out.println("=====================* Decimal Converter *=====================");
            System.out.println("1.Decimal to Biner");
            System.out.println("2.Decimal to Octal");
            System.out.println("3.Decimal to HexaDecimal");
            System.out.println("4.Biner to Decimal");
            System.out.println("5.Octal to Decimal");
            System.out.println("6.HexaDecimal to Decimal");
            System.out.println("7.Exit");
            System.out.print("Insert your option : ");
            int input = scanner.nextInt();

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
                    System.out.println("=====================* Biner to Decimal *=====================");
                    System.out.println("Insert a Biner Number : ");
                    number.setBiner();
                    System.out.println("Biner Number   : " + number.getBiner());
                    System.out.println("Decimal Number : " + Formula.binerToDecimal(number.getBiner()));
                    break;

                case 5:
                    System.out.println("=====================* Octal to Decimal *=====================");
                    System.out.println("Insert a Octal Number : ");
                    number.setOctal();
                    System.out.println("Octal Number   : " + number.getOctal());
                    System.out.println("Decimal Number : " + Formula.octalToDecimal(number.getOctal()));
                    break;

                case 6:
                    System.out.println("=====================* HexaDecimal to Decimal *=====================");
                    System.out.println("Insert a HexaDecimal Number : ");
                    number.setHexaDecimal();
                    System.out.println("HexaDecimal Number : " + number.getHexaDecimal());
                    System.out.println("Decimal Number     : " + Formula.hexadecimalToDecimal(number.getHexaDecimal()));
                    break;

                case 7:
                    System.out.println("Bye!");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        } while (flag);
    }
    public static void run(){
        try{
            runexc();
        }catch (InputMismatchException e){
            System.out.println("Wrong input.");
        }
    }
}
