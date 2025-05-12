package com.gentech.bufferdemo;

import java.io.FileWriter;

public class Program2 {
    public static void main(String[] args) {
        Writecontent10lines();
    }
    private static void Writecontent10lines()
    {
        FileWriter fw=null;
        try {
            fw=new FileWriter("F:\\Demo\\Test\\ProgramNew.txt");
            for(int i=1;i<=10;i++)
            {
                fw.write("Line number "+i+"\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
