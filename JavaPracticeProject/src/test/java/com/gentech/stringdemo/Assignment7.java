package com.gentech.stringdemo;

public class Assignment7 {
    public static void main(String[] args) {
        removeday();
        insert();
        insert1();
    }

    static void removeday() {
        String s = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String s1[] = s.split("DAY");
        for (String str : s1) {
            System.out.print(str);
        }
        System.out.println();
        System.out.println("__________________________");
    }

    static void insert() {
        String s1 = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
         s1 = s1.replace("DAY", "DAY,");
        System.out.println(s1);
        System.out.println("___________________________________");
    }

    static void insert1() {
        String s1 = "SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            s2 += s1.charAt(i);
            if (s1.charAt(i) == 'Y' && i<s1.length()-1) {
                s2 += ",";
            }
        }
        System.out.println(s2);
    }
}