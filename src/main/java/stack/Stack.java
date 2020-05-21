package stack;

/**
 * Created by GraceLove on 2020/05/22.
 * Contact : govlmo91@gmail.com
 */
public class Stack<T> {
    private T[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        data = (T[])new Object[capacity];
        size = 0;
    }

    public Stack() {
        this(10);
    }

    public void push(T data) {
        this.data[size++] = data;
    }

    public T pop() {
        return this.data[--size];
    }

    public int getSize() {
        return size;
    }
}
