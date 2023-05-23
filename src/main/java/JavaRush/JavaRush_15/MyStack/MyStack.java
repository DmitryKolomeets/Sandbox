package JavaRush.JavaRush_15.MyStack;

import java.util.LinkedList;
import java.util.List;

public class MyStack {


    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);
    }

    public String pop() {
      String element =  storage.get(0);
       storage.remove(0);
        return element;
    }

    public String peek() {
        String element =  storage.get(0);
        return element;
    }

    public boolean empty() {
       boolean isEmpty = storage.isEmpty();
       return isEmpty;
    }

    public int search(String s) {
       int index = storage.indexOf(s);
       return index;
    }

}
