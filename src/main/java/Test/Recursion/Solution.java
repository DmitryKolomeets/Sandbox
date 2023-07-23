package Test.Recursion;

public class Solution {


    public static void myRecursion() {
        System.out.println("Моя рекурсия");
        myRecursion();
    }

    public static void main(String[] args) {
        myRecursion();
    }

}
