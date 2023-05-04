package com.stackroute;

import java.util.Arrays;
import java.util.List;

public class Calculator {


   static List<String> list = Arrays.asList("Ram","Sham","Gopal");


   static int  array[] = {1,2,34,5};








    public int multiply(String a,String b){


        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        if(num1<0){
            throw  new IllegalArgumentException("Num1 cannot be less then 0");
        }
        return num1 * num2;
    }
    public String concateTwoString(String str1 , String str2) {
        if(str1==null|| str2==null){
            return "String cannot be null";
        }
        return  str1.concat(str2).toUpperCase();
    }
    public  int arr(int [] abc){
        abc= new int[]{1, 2, 3};
        return abc[0]+abc[1]+abc[2];
    }

    public boolean isEven(int number){
        return  number%2==0;
    }

}
