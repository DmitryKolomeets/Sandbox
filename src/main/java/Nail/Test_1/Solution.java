package Nail.Test_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {

    public static void main(String[] args) {

        try {
       FileInputStream fis = new FileInputStream("Test10.txt");
        } catch (FileNotFoundException e) {
            System.out.println("poiman Exeption");
        } finally {
            System.out.println("Eto Finally block");
        }

    }

}
