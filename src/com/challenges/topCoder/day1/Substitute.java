package com.challenges.topCoder.day1;

import java.util.Scanner;

/**
 * Created by Ruzal on 6/9/2017.
 */
public class Substitute {
    private static String key="FLEAMARKET";
    public static Integer getValue(String key, String code){

        String result="";
        for (int i=0;i<key.length();i++){
            if (i<key.length()-1){

            }else{
                String temp= String.valueOf(key.charAt(i));
                key=temp+key;
                key=key.substring(0,key.length()-1);
            }
        }
        for (int c=0;c<code.length();c++) {
            for (int j=0;j<key.length();j++) {
                if (code.charAt(c) ==key.charAt(j)){
                  result=String.valueOf(result)+String.valueOf(j);

                }

            }
            }
//        System.out.println(result);

        int rs=Integer.parseInt(result);

        return rs;
    }

    public static void main(String[] args) {
        String code=null;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter product code!");
        code=scanner.nextLine();
        int r=getValue(key,code);
        System.out.println(r);
    }
}
