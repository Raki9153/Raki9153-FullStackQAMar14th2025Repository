package com.gentech.bufferdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Program1 {
    public static void main(String[] args) {

        ReadandWritecontenthalf();
    }

    private static void ReadandWritecontenthalf() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("F:\\Demo\\Test\\Program1.txt");
            fw = new FileWriter("F:\\Demo\\Test\\Program2.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                count++;
                if (count <= 5)
                    fw.write(line+"\n");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

