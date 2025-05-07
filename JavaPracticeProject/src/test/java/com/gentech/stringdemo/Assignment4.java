package com.gentech.stringdemo;

public class Assignment4 {
    public static void main(String[] args) {
        noofcharacters();

    }static void noofcharacters()
    {
        String s="Programmer";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count++;
        }
        System.out.println("Number of Characters :"+count);
    }
}
