package Nail.Test_1;

public class Solution_23 {

    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";



        String onPress(Object o);



    }
}
