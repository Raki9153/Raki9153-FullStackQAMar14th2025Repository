package com.gentech.stringdemo;

public class Assignment6 {
    public static void main(String[] args) {
        noofwordsinstring();

    }static void noofwordsinstring()
    {
        String s="Gentech is full stack development institute";
       String[] words=s.split(" ");
       System.out.println("Number of Words :"+words.length);
    }
}
