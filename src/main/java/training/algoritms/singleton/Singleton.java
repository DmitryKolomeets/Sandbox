//package singleton;
//
//public class Singleton {
//
//    //      DBcon.get();
//    Dog dog = new Dog("hasky", "sharik", 3, 18);
//    FileOutputStream fileOut = new FileOutputStream("src/alexshabinskiy/dog.ser");
//    ObjectOutputStream out = new ObjectOutputStream(fileOut);
//        out.writeObject(dog);
//        out.close();
//        fileOut.close(); // use pls try-catch with resources
//
//
//    FileInputStream fileIn = new FileInputStream("src/alexshabinskiy/dog.ser");
//    ObjectInputStream in = new ObjectInputStream(fileIn);
//    Dog dogSerializable = (Dog) in.readObject();
//        in.close();
//        fileIn.close();
//
//        System.out.println(dogSerializable.equals(dog));
//        System.out.println(dogSerializable);
//        dog.setAge(1);
//        System.out.println(dogSerializable.equals(dog));
//
//
//}
//}
