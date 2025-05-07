package com.gentech.stringdemo;

public class Assignment2 {
    public static void main(String[] args) {
        Pattern();
        pattern1();
    }
    static void Pattern()
    {
        String s="PROGRAM";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println("_____________________________________________");
    }static void pattern1()
    {
        String s="PROGRAM";
        for(int i=s.length();i>=0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
