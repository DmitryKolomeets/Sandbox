package lara_dz_18;

public class User_12 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }



    public static class Worker {
        public void workHard() {

        }

    }

    public static interface Businessman {
        void workHard();
    }





    public static class CTO extends Worker  implements Businessman {

    }

}
