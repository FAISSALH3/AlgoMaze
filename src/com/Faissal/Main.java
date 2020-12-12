package com.Faissal;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println(Method());


    }

    public static boolean Method() {
        String testString1 = "hamdi fayssal fayssal hamdi";
        String test = "baab";


        String test2 = test.toLowerCase();
        String test3 = testString1.toLowerCase();
        String[] newSplit = test2.split("(?!^)");

        String[] newSplit2 = Split(test3);
        boolean[] newSplit4 = ToBoolean(newSplit);
        boolean[] newSplit3 = ToBoolean(newSplit2);

        System.out.println(Arrays.toString(newSplit3));
        System.out.println(Arrays.toString(newSplit4));


        boolean a =  Arrays.equals(newSplit3 , newSplit4);
        return a;


    }

    public static boolean compare(String[] a, String[] b) {
        return Arrays.equals(a, b);
    }

    public static String[] Split(String stringtoSplit) {

        String[] words2 = stringtoSplit.split("\\s+");

        for (int i = 0; i < words2.length; i++) {

            words2[i] = words2[i].replaceAll("[^\\w]", "");
        }
        return words2;
    }


    public static boolean[] ToBoolean(String[] words) {
        boolean[] bool = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = words.length - 1; j > i; j--) {
                if (words[i].equals(words[j])) {
                    if (words[i].compareTo(words[j]) == 0) {
                        bool[i] = true;
                        bool[j] = true;
                    }

                }
            }
        }
        return bool;
    }






    public static int[][] ProductOfAMatrix()
    {
        int[][] c={{0,0},{0,0}} ;
        int[][] a={{3,4},{5,5}};
        int[][] b={{3,2},{1,0}};
        for(int i =0 ; i < 2 ; i++)
        {

            for(int j =0 ; j <2 ; j++)
            {
               c[i][j]=0;

               for(int k=0 ; k <2 ; k++)
               {
                   c[i][j] = c[i][j] + a[i][k]*b[k][j];
               }
            }
        }
        return c;
    }


    public static int MakingChange(int num)
    {
       int[] n ={25, 10, 5 ,1};
        int count =0;
        for(int i =0; i <n.length ; i++)
        {
            while(num >= n[i])
            {
                count ++;
                num = num - n[i];
            }
        }
        return count ;
    }
}
