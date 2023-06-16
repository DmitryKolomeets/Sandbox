package JavaRush.JavaRush_18.Test_1;

public class Test_1 {


    public  void main(String[] args) {

        Cow cow = new Cow();
        cow.printName();

        Whale whale = new Whale();
        whale.printName();

    }



    class Cow
    {
        public void printColor ()
        {
            System.out.println("Я — белая");
        }

        public void printName()
        {
            System.out.println("Я — корова");
        }
    }

    class Whale extends Cow
    {
        public void printName()
        {
            System.out.println("Я — кит");
        }
    }

}
