package com.gentech.bufferdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program5 {
    public static void main(String[] args) {
        Program5 p=new Program5();
    }
    String fileName="F:\\Demo\\Test\\Program1.txt";
    String content="Java is Full Stack Development";
    {
        writebyMethod(fileName,content);
    }
    private void writebyMethod(String fileName, String content)
    {
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            br=new BufferedReader(new FileReader(fileName));
            bw=new BufferedWriter(new FileWriter("F:\\Demo\\Test\\Program5.txt",true));
            String line="";
            while((line=br.readLine())!=null)
            {
                bw.write(line+"\n");
            }
            bw.write(content);


        } catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
