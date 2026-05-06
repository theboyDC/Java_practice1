package com.washie;

public class Kata6 {
    public static String correct(String string) {
        StringBuilder result = new StringBuilder();

        for (char c: string.toCharArray()){
            if (c == '5'){
                result.append('S');
            }else if(c == '0'){
                result.append('O');
            }else if(c == '1'){
                result.append('I');
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}