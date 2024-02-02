package defaultInterface.exam02;

public class GenericBox<T> {
    private T t;

    public T get() {
        return this.t;
    }

    public void add(T obj) {
        this.t = obj;
    }
}
