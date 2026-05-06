package com.washie;

public class ReverseString {
    public static String main(String str) {
//        StringBuilder rev = new StringBuilder();
//        for (int i = str.length() -1; i>=0; i--){
//            rev.append(str.charAt(i));
//        }
//        return rev.toString();
        String rev = "";
        char a[] = str.toCharArray();


        for (int i = a.length -1; i >= 0; i--){
            rev+=a[i];
        }
        return rev;
    }
}
