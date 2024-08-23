package com.java.Model;

import java.util.Scanner;

public class Number {
    private String biner;
    private String HexaDecimal;
    private String octal;
    private int decimal;
    private Scanner scanner = new Scanner(System.in);
    public String getHexaDecimal(){
        return HexaDecimal;
    }
    public String getOctal(){
        return octal;
    }
    public int getDecimal() {
        return decimal;
    }

    public String getBiner() {
        return biner;
    }

    public void setBiner() {
       this.biner = scanner.nextLine();
    }

    public void setDecimal() {
        this.decimal = scanner.nextInt();
    }
    public void setHexaDecimal() {
        this.HexaDecimal = scanner.nextLine();
    }
    public void setOctal(){
        this.octal = scanner.nextLine();
    }
}

