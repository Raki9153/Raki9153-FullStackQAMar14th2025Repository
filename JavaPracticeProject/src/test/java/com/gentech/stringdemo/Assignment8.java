package com.gentech.stringdemo;
public class Assignment8 {
    public static void main(String[] args) {
        palindrome("DAD");
        palindrome("Abuzar");

    }static void palindrome(String s)
    {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(s1))
        {
            System.out.println(s1+":The given output is Palindrome");
        }else {
            System.out.println(s1+":The given output is not Palindrome");
        }

    }
}
