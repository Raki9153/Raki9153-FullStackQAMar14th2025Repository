package com.gentech.stringdemo;
public class Assignment3 {
    public static void main(String[] args) {
        reversethestring();
    }

    static void reversethestring() {
        String s = "Mysore and Bangalore";
        String s1[]=s.split(" ");
        for(int i=s1.length-1;i>=0;i--)
        {
            System.out.print(s1[i]+" ");
        }

    }
}
