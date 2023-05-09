package JavaRush.JavaRush_12.Outer;

public class Solution {
    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();


    }

}
