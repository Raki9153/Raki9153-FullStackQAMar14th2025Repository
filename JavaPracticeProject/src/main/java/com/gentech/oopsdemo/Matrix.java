package com.gentech.oopsdemo;
class Addition
{
   static int a=10,b=20;
    int result;
    void add()
    {
        result=a+b;
    }
}

public class Matrix {
    public static void main(String[] args) {
        int r=Addition.a+Addition.b;
        System.out.println("Result :"+r);

    }
}
