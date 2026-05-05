package com.washie;
import javax.xml.transform.Source;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] result = Kata.countBy(2, 8);
//        System.out.println(Arrays.toString(result));

//        String test1 = "hello I AM DONALD";
////        System.out.println(Kata2.isUpperCase(test1));
//
//        System.out.println(Kata3.otherAngle(45,12));
//
//        System.out.println(Kata4.hoopCount(9));

        System.out.println(Kata5.toAlternativeString("hello world") );
//"HELLO WORLD"











// list or 1 DIMENSIONAL ARRAY
        int[] numbers = {40,25,15,35,20,5,30,10};
        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//MUTLIDIMENSIONAL(2 and 3D) ARRAYS
        int [][] numberss = new int[3][3];
        numberss[0][0] = 1;
//        System.out.println(Arrays.deepToString(numberss));
//other ways to write it:
        int[][] numbersss = {{1,1,1}, {7,8,9}, {5,4,9}};
//        System.out.println(Arrays.deepToString(numbersss));




    }


}