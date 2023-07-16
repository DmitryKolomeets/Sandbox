package linkedlist;


import java.util.*;

public class MyLinkedList<E> extends AbstractSequentialList<E> implements List<E> {


    //------------------Nested class Node-----------------------------------------------------
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    //------------------------------------------------------------------------------------------


    transient int size = 0;


    transient Node<E> first;


    transient Node<E> last;

    //--------------------------My methods--------------------------------------------

    public MyLinkedList() {
    }


    //-------------------------- Utility methods --------------------------------------------

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    /**
     * Returns the (non-null) Node at the specified element index.
     */

    Node<E> node(int index) {
        // assert isElementIndex(index);

        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }




    E unlink(Node<E> x) {
        // assert x != null;
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        modCount++;
        return element;
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }


    //--------------------------Method [1] ------------------------------------------------


    @Override
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    //--------------------------Method [2] ------------------------------------------------


    @Override
    public int size() {
        return size;
    }


    //--------------------------Method [3] ------------------------------------------------

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }


    //--------------------------Method [4] ------------------------------------------------


    @Override
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }


    //--------------------------Method [5] ------------------------------------------------


    @Override
    public boolean add(E e) {
        linkLast(e);
        return true;
    }


    //--------------------------Method [6] ------------------------------------------------

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    //--------------------------Method [7] ------------------------------------------------


    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    //--------------------------Method [8] ------------------------------------------------



    @Override
    public void clear() {
        for (Node<E> x = first; x != null; ) {
            Node<E> next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
            x = next;
        }

        first = last = null;
        size = 0;
        modCount++;
    }

    //--------------------------Method [9] ------------------------------------------------

//    @Override
//    public boolean addAll(Collection c) {
//        return false;
//    }
//
//
//    public boolean addAll(Collection<? extends E> c) {
//        return addAll(size, c);
//    }
//



    //--------------------------Method [10] ------------------------------------------------


    @Override
    public boolean addAll(int index, Collection c) {
       checkPositionIndex(index);

       Object[] a = c.toArray();
       int numNew = a.length;
       if(numNew ==0)
           return false;

       Node<E> pred, succ;
       if(index == size) {
           succ = null;
           pred = last;
       } else {
           succ = node(index);
           pred= succ.prev;
       }

       for (Object o : a) {
           @SuppressWarnings("unchecked") E e = (E) o;
           Node<E> newNode = new Node<>(pred, e, null);
           if(pred == null)
               first = newNode;
           else
               pred.next = newNode;
           pred = newNode;
       }
       if(succ==null) {
           last=pred;
       } else {
           pred.next = succ;
           succ.prev = pred;
       }

       size+=numNew;
       modCount++;
       return true;
    }


    //--------------------------Method [11] ------------------------------------------------

    @Override
    public void add(int index, Object element) {

    }





    //--------------------------overrided methods--------------------------------------------






    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }







    @Override
    public Object set(int index, Object element) {
        return null;
    }




    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }


    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
