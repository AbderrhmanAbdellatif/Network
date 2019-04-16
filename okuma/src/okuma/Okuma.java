package okuma;

import java.io.*;
import java.util.Scanner;

public class Okuma {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("cse22502.html");
        File ignoreList = new File("ignoreList.txt");
        Scanner mainFile = new Scanner(file);
        Scanner ignoreFile = new Scanner(ignoreList);
        boolean durum = false;
        while (mainFile.hasNext()) {
            String word = mainFile.next();
            while (ignoreFile.hasNext()) {
                String ignore = ignoreFile.next();
                if (0 != stringCompare(word, ignore) && !word.startsWith("<") && word.length()>4) { // < baslmiyor 
                    durum = true;

                } 
                else {
                    durum = false;
                    break;
                }

            }
            if (durum) {
                System.out.println(word);
               // ignoreList = new File("ignoreList.txt");
               // ignoreFile = new Scanner(ignoreList);
                durum = false;
            }
             ignoreFile = new Scanner(ignoreList);
               
        }
    }


    public static int stringCompare(String str1, String str2) {

        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int) str1.charAt(i);
            int str2_ch = (int) str2.charAt(i);

            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        // Edge case for strings like 
        // String 1="Geeks" and String 2="Geeksforgeeks" 
        if (l1 != l2) {
            return l1 - l2;
        } // If none of the above conditions is true, 
        // it implies both the strings are equal 
        else {
            return 0;
        }
    }

}
