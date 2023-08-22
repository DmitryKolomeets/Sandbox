package Nail.Test_1;

public class Solution_17 {

    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject <String>
    {

        @Override
        public SimpleObject <String> getInstance() {
            return null;
        }
    }
}
