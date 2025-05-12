package com.gentech.ioassignment;

import java.io.File;

public class Assignment1 {
    public static void main(String[] args) {
        subfolder10();
    }
    private static void subfolder10(){
       for(int i=1;i<=10;i++)
       {
           File f1=new File("F:\\Demo\\Test\\Folder"+i);
           f1.mkdir();
       }
    }
}
