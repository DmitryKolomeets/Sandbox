package JavaRush.Javarush_14.StringLinkedList;

import javax.imageio.stream.ImageInputStream;



public class StringLinkedList {

    private Node first = new Node();
    private Node last = new Node();


    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }


    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

//    Node node = new Node(); //создали объект в очереди
//    node.value = value; //объект имеет собственное значение
//// у данного объекта node.prev ссылается на first и равен null, node.next ссылается на last и также равен null
//
//    Node lastNode = last.prev; // данной командой присвоили ссылку lastNode, теперь lastNode стоит в очереди ПОСЛЕ node
//    lastNode.next = node; // данной командой взяли ссылку, которой node обращалась к last, теперь lastNode обращается к last
//    node.prev = lastNode; // вот тут у меня затык(абсолютное непонимание). я понимаю так, что node.prev изначально имеет ссылку на first и у нас изначально
//// была следующая очерёдность: first --> node --> last. Мы же вставляем переменную lastNode в конец?? По итогу у нас должна получиться такая очерёдность:
//// first --> node --> lastNode --> last
//// Данная команда:  node.prev = lastNode; (на сколько я понимаю) присваивает ссылку node.prev переменной lastNode, тем самым очерёдность получается такая:
//// first --> lastNode --> node --> last; Вот тут у меня никак не стыкуется.
//    last.prev = node; // здесь также ссылка от "last" идёт к  node, а я думал, что должна от "last" идти к "lastNode"
//0


    public void add(String value) {
        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;


    }
}
