package Nail.Exeptions.ArrayIndexOfBound;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Solution {

    public static void main(String[] args) {


        File f = new File("text8.txt");


        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem xoroshego dnya!");
        } catch (FileNotFoundException e) {
            System.out.println();
            System.out.println("Bjl poiman exception  :" + e);
        } finally {
            System.out.println("eto finally block");

        }

        System.out.println("Dannji block ne imeet otnosheniya k isklucheniyam");

    }


}
