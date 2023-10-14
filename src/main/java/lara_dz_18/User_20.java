package lara_dz_18;

public class User_20 {


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
