package generics;

interface Container<T> {
    T get();
}

class Data<T> implements Container<T> {
    private T value;

    Data(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Seven {
    public static void main(String[] args) {
        Data<String> d1 = new Data<>("Generic Interface");
        System.out.println(d1.get());

        Data<Integer> d2 = new Data<>(100);
        System.out.println(d2.get());
    }
}
