package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        MyLinkedList<Integer> myList = new MyLinkedList<>();


        System.out.println(myList.isEmpty());
        myList.add(189);
        System.out.println(myList.isEmpty());



    }

}
