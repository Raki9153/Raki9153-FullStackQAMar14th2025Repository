package com.gentech.ioassignment;

import java.io.File;


public class Fileoperation {
    public static void main(String[] args) {
       //createfile();
       // deletefile();
        rename();

    }
    private static void createfile()
    {
        try
        {
            File f1=new File("F:\\Demo\\Test\\Sample.txt");
            f1.createNewFile();

        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
    private static void deletefile()
    {
        try
        {
            File f1=new File("F:\\Demo\\Test\\Sample.txt");
            f1.deleteOnExit();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private static void rename()
    {
        try{
            File f1=new File("F:\\Demo\\Test\\Sample.txt");
            File f2=new File("F:\\Demo\\Test\\SampleNew.txt");
            f1.renameTo(f2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
