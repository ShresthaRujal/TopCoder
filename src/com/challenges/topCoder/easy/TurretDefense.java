package com.challenges.topCoder.easy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Ruzal on 6/10/2017.
 */
public class TurretDefense {

    public static int firstMiss(int[] xs, int[] ys, int[] times){
        int j = 0;
        int ADx,ADy,Diff;
        if ((xs[0]+ys[0])<=times[0]) {

            for (int i = 1; i < xs.length; i++) {
                ADx = xs[i - 1] - xs[i];
                ADy = ys[i - 1] - ys[i];

                System.out.println("ADx value = " + ADx);
                System.out.println("ADy value = " + ADy);
                if (ADx < 0) {
                    ADx = -ADx;
                    System.out.println(ADx);
                }
                if (ADy < 0) {
                    ADy = -ADy;
                    System.out.println(ADy);
                }
                Diff = ADx + ADy;
                System.out.println("Diff=" + Diff);
                if (times[i] >= times[i - 1] + Diff) {
                    System.out.println(times[i]);
                    System.out.println(times[i - 1]);
                    System.out.println("matched");
                    j = -1;
                } else {
                    System.out.println("not matched");
                    j = i - 1;
                }
            }
        }else {
            j=0;
        }
       return j;
    }

    public static void main(String[] args) {
        System.out.println("enter Xs :");
        Scanner scanner= new Scanner(System.in);

        int xs[] = new int[2];
        for (int i=0;i<xs.length;i++){
            xs[i]=scanner.nextInt();
        }

        System.out.println("enter Ys :");
        int ys[] = new int[2];

        for (int i=0;i<ys.length;i++){
            ys[i]=scanner.nextInt();
        }

        System.out.println("enter time :");
        int time[] = new int[2];

        for (int i=0;i<time.length;i++){
            time[i]=scanner.nextInt();
        }

        System.out.println("returned value"+firstMiss(xs,ys,time));



    }

}
