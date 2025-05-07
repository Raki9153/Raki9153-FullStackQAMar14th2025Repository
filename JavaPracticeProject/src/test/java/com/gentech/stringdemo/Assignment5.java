package com.gentech.stringdemo;

public class Assignment5 {
    public static void main(String[] args) {
        countofword();

    }static void countofword()
    {
        String s="java jre java jre java jre java";
        String[] words=s.split(" ");
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(words[i].equals("java"))
            {
                count++;
            }
        }
        System.out.println("Number of Words :"+count);
    }
}
