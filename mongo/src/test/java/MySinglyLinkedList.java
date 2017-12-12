import java.util.Iterator;

/**
 * @author cool
 * Date 2017-12-01 15:43
 */
public class MySinglyLinkedList<T> implements Iterable<T>{

    private static class Node<T>{
        public Node<T> next;
        public T data;
        public Node(T d, Node<T> n) {
            data = d;
            next = n;
        }
    }

    private int theSize;
    //private int modCount = 0;
    private Node<T> top;

    public int size() {
        return theSize;
    }

    public boolean push(T t) {
        top = new Node<T>(t, top);
        theSize++;
        return true;
    }

    public T pop() {
        if (theSize <= 0) {
            return null;
        }
        T data = top.data;
        top = top.next;
        theSize--;
        return data;
    }











    @Override
    public Iterator<T> iterator() {
        return new MySinglyLinkedListIterator();
    }
    private class MySinglyLinkedListIterator implements java.util.Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
}
