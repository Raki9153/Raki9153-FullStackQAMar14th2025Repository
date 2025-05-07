package com.gentech.stringdemo;

public class Assignment1 {
    public static void main(String[] args) {
        reverse();
        reverse1();
        reverse2();
    }

    static void reverse() {
        String s = new String("Gentech");
        char ch[] = s.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
        System.out.println();
        System.out.println("_______________________");
    }static void reverse1()
    {
        String s ="Gentech";
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }System.out.println("Reverse1:"+s1);
        System.out.println("______________________");

    }static void reverse2() {
        String s = "Gentech";
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 +=s.substring(i, i + 1);
        }
        System.out.println("Reverse2:" + s1);
    }
}