package com.gentech.ioassignment;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment2 {
    public static void main(String[] args) {
        nestedfolder();
    }
    private static void nestedfolder()
    {
        Path path= Paths.get("F:\\Demo\\Test\\Folder1\\Folder2\\Folder3");
        try
        {
            Files.createDirectories(path);
        }catch (Exception e)
        {
            System.err.println("Cannot create directories-"+e);
        }
    }
}
