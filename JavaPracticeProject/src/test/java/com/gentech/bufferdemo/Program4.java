package com.gentech.bufferdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Program4 {
    public static void main(String[] args) {
        Readandwritemultiplecontent();
    }
    private static void Readandwritemultiplecontent()
    {
        BufferedReader br=null;
        BufferedReader br1=null;
        BufferedWriter bw=null;
        try{
            FileReader fr=new FileReader("F:\\Demo\\Test\\Program4.1.txt");
            FileReader fr1=new FileReader("F:\\Demo\\Test\\Program4.2.txt");
            bw=new BufferedWriter(new FileWriter("F:\\Demo\\Test\\Program4.txt"));
            br=new BufferedReader(fr);
            br1=new BufferedReader(fr1);
            String line="";
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
            }
            while((line=br1.readLine())!=null)
           {
              bw.write(line);
              bw.newLine();
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            try {
                br.close();
                br1.close();
                bw.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
