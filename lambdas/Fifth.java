package lambdas;

public class Fifth {

    public static void main(String[] args) {

        I_add<String,String> concat = (s1,s2,s3) -> {
            return s1 + " " + s2 + " " + s3;
        };

        String result = concat.add("Java","Lambda","Example");
        System.out.println(result);
    }
}

interface I_adddd<T,R>
{
    R add(T t1,T t2,T t3);
}