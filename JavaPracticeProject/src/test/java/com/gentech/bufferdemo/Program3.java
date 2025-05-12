package com.gentech.bufferdemo;

import java.io.*;

public class Program3 {
    public static void main(String[] args) {
        Readonly10lines();
    }
    private static void Readonly10lines()
    {
        BufferedWriter bw=null;
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader("F:\\Demo\\Test\\Program1.txt"));
            bw =new BufferedWriter( new FileWriter("F:\\Demo\\Test\\Program3.1.txt"));
            int totalLines = 0;
            String read="";
            while ((read=br.readLine()) != null) {
                totalLines++;
                System.out.println(read);
            }
            br.close();
            br=new BufferedReader(new FileReader("F:\\Demo\\Test\\Program1.txt"));
            String[] lines = new String[totalLines];
            int index = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lines[index++] = line;
            }
            for (int i = totalLines - 1; i >= 0; i--) {
                bw.write(lines[i]);
                bw.newLine();
            }

            System.out.println("Successfully written content in reverse order");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }
}
