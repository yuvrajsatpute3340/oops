package generics;

public class Fourth {

    public static void main(String[] args) {

        converter<String, Integer> con = new converterimpl();
        System.out.println(con.converter("Well"));
    }
}

interface converter<T, R> {
    R converter(T t1);
}

class converterimpl implements converter<String, Integer> {

    @Override
    public Integer converter(String t1) {
        return t1.length();
    }
}
