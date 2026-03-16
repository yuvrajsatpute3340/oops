package lambdas;

public class Fourth {

    public static void main(String[] args) {

        I_add<Integer,String> multiply = (a,b,c) -> {
            return "Multiplication Result: " + (a*b*c);
        };

        String result = multiply.add(2,3,4);
        System.out.println(result);
    }
}

interface I_addd<T,R>
{
    R add(T t1,T t2,T t3);
}
