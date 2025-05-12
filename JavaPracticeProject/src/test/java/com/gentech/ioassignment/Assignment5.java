package com.gentech.ioassignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Assignment5 {
    public static void main(String[] args) {
        readandwritesometext();
    }
    private static void readandwritesometext()
    {
        FileInputStream f1=null;
        FileOutputStream f2=null;
        {
            try{
                f1=new FileInputStream("F:\\Demo\\Test\\Sample.txt");
                f2=new FileOutputStream("F:\\Demo\\Test\\Welcome1.txt");
                int byteData;
                while ((byteData = f1.read()) != -1) {
                    f2.write(byteData);
                }
                System.out.println("File copied successfully using byte stream.");

            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    f1.close();
                    f2.close();
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        }

    }