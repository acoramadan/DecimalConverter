package com.java;

import com.java.Controller.Formula;

import java.util.*;


public class tes {
    public static void main(String[] args) {

        Formula formula = new Formula();
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('A',10);
        System.out.println(formula.hexadecimalToDecimal("ABCD"));
    }
}
