package com.washie;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        String org_str = str;

        char a[] = org_str.toCharArray();
        int len = a.length;
        String rev = "";

        for(int i = len-1; i>=0;i--){
            rev+= a[i];
        }

        if(org_str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
