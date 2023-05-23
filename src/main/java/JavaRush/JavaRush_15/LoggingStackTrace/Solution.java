package JavaRush.JavaRush_15.LoggingStackTrace;

public class Solution {


    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }





    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }

}
