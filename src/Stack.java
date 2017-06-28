import java.util.EmptyStackException;

/**
 * @project: Stack
 * @author: liangb.dev
 * @version: 1.0
 * @date: 6/22/2017
 *
 * LIFO
 */
public class Stack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> nd = top;
        top.data = item;
        top.next = nd;

        /*
        StackNode<T> t = new StackNode<T>(item);
        t.next = top;
        top = t;
         */
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
