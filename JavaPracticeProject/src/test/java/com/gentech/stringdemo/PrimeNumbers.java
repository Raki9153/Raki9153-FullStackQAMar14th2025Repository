package com.gentech.stringdemo;

public class PrimeNumbers {
    public static void main(String[] args) {
    int num=6;
    int flag=0;
    for (int i=2;i<num;i++){
        if(num%i==0)
        {
            flag=flag+i;
            break;
        }
    }if (flag==0)
    {
        System.out.println("Prime Number");
    }else {
        System.out.println("Not Prime Number");
    }

    }
}
