package com.gentech.ioassignment;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;

public class Assignment3 {
    public static void main(String[] args) {
        // readfile();
       // delete();
        rename();
    }

    private static void readfile() {
        File F1 = new File("F:\\Demo\\Nest");
        File[] Folder = F1.listFiles((dir, name) -> name.endsWith("xlsx"));

        if (Folder != null) {
            for (File f : Folder) {
                try {
                    FileInputStream fis = new FileInputStream(f);
                    byte[] data = new byte[(int) f.length()];
                    fis.read(data);
                    String s = new String(data);
                    System.out.println(s);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }

    private static void delete() {
        File f2 = new File("F:\\Demo\\Nest");
        File[] folder = f2.listFiles((dir, name) -> name.endsWith("doc"));
        if (folder != null) {
            for (File f : folder) {
                try {
                    f.delete();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private static void rename()
    {
        File f1=new File("F:\\Demo\\Nest");
        File [] folder=f1.listFiles(dir->dir.getName().endsWith(".txt"));
        if(folder !=null)
        {
            for(File f:folder)
            {
                try{
                  File f2=  new File("F:\\Demo\\Nest\\new"+f.getName());
                    f.renameTo(f2);
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}