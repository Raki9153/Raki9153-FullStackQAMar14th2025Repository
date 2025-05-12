package com.gentech.stringdemo;
class Demo
{
    static void show(String s)
    {
        System.out.println(s);
    }
    static void show(int i)
    {
        System.out.println(i);
    }
}

public class Example {
    public static void main(String[] args) {
        Demo.show('A');
        Demo.show(100);
    }
}
