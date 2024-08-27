package com.java.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Formula {

    public static int binerToDecimal(String biner) {
        int esksponent = 1;
        int ans = 0;

        if (biner.equals(0) ) return 0;

        else if (biner.equals(1) ) return 1;

        else{

            for(int i=1; i<=biner.length()-1; ++i) {
                esksponent *= 2;
            }

            for(int i = 0; i < biner.length(); ++i) {
                char temp = biner.charAt(i);
                ans += (esksponent * Character.getNumericValue(temp));
                esksponent /=2;
            }

        }
        if(ans > 255) return -1;

        return ans;
    }

    public static String decimalToBiner(int num) {

        StringBuilder s = new StringBuilder();
        int temp = num;

        while(temp >= 1) {

            if(temp % 2 == 0) {
                s.append("0");
            }

            else {
                s.append("1");
            }

            temp/=2;
        }

        while (s.length() < 8) {
            s.append("0");
        }

        return s.reverse().toString().trim();
    }

    public static String decimalToOctal(int num) {
        StringBuilder ans = new StringBuilder();

        while(num >= 1){
            int temp = num % 8;
            ans.append(temp);
            num /=8;
        }
        return ans.reverse().toString().trim();
    }

    public static int octalToDecimal(String num) {

        int ans = 0;
        int eksponent = 1;

        for (int i = 0; i<num.length()-1; ++i) {
            if (Character.getNumericValue(num.charAt(i)) > 7 || Character.getNumericValue(num.charAt(i + 1)) > 7) return -1;

            eksponent*=8;
        }

        for (int i = 0; i<num.length()-1; ++i) {
            char temp = num.charAt(i);
            ans += eksponent * Character.getNumericValue(temp);
            eksponent/=8;
        }
        ans += Character.getNumericValue( num.charAt(num.length()-1 ) );
        return ans;
    }

    public static String decimalToHexaDecimal(int num) {
        Map<Integer,String> hexa = new HashMap<>();
        hexa.put(10,"A");
        hexa.put(11,"B");
        hexa.put(12,"C");
        hexa.put(13,"D");
        hexa.put(14,"E");
        hexa.put(15,"F");

        StringBuilder stringBuilder = new StringBuilder();

        while(num >= 1) {
            int ans = num % 16;
            if (ans > 9 && ans < 16) {
                stringBuilder.append(hexa.get(ans));
            }
            else {
                stringBuilder.append(ans);
            }
            num/=16;
        }
        return stringBuilder.reverse().toString().toUpperCase().trim() ;
    }
    public static int hexadecimalToDecimal(String num) {
        int ans = 0;
        int eksponent = 1;
        StringBuilder stringBuilder = new StringBuilder(num.toUpperCase());

        for (int i = 1; i<num.length(); ++i) {
            eksponent *=16;
        }

        for (int i = 0; i<stringBuilder.length(); ++i) {
            Integer add = 0;

            switch (stringBuilder.charAt(i)) {
                case 'A' -> add = 10;
                case 'B' -> add = 11;
                case 'C' -> add = 12;
                case 'D' -> add = 13;
                case 'E' -> add = 14;
                case 'F' -> add = 15;
            }
            ans += ( (!add.equals(0)) ? add : Character.getNumericValue(stringBuilder.charAt(i)) ) * eksponent;

            eksponent/=16;
        }
        return ans;
    }
    
}
