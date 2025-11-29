package generics;

public class Fifth {

    public static void main(String[] args) {

        obj<String,Integer> ob = new Objects2();
        
       System.out.println(ob.obj("Hello"));
    }
}

interface obj<Y, R> {
    R obj(Y t1);
}

class Objects2 implements obj<String, Integer> {

    @Override
    public Integer obj(String t1) {
        return t1.length();
    }
}
