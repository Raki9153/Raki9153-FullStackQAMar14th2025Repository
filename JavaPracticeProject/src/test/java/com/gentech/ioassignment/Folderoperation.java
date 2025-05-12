package com.gentech.ioassignment;

import java.io.File;
import java.nio.file.Files;

public class Folderoperation {
    public static void main(String[] args) {
        //createfolder();
       // nestedfolder();
       // renamefolder();
        filecollection();
    }
    private static void createfolder()
    {
        File f1=new File("F:\\Demo\\Test\\Folder1");
        f1.mkdir();
    }
    private static void nestedfolder()
    {
        File f1=new File("F:\\Demo\\Test\\Folder1\\Folder2\\Folder3");
        f1.mkdirs();
    }
    private static void renamefolder()
    {
        File f1=new File("F:\\Demo\\Test\\Folder1");
        File f2=new File("F:\\Demo\\Test\\FolderNew");
        f1.renameTo(f2);
    }
    private static void filecollection()
    {
        File f1=new File("F:\\Demo\\Test");
       File arr[]=f1.listFiles();
       for(int i=0;i<arr.length;i++) {
           File f2=arr[i];
           System.out.println(f2);
           }
       }
    }
