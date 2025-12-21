package setif;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Four {

    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.of(1999, 2, 3, 12, 34);
        LocalDateTime date2 = LocalDateTime.of(2000, 1, 4, 14, 54);

        Car mustang1 = new Car(34.67, "Ford-mus",
                new LocalDateTime[]{date1, date2});

        Car mustang2 = new Car(35.67, "Ford-mus",
                new LocalDateTime[]{date1, date2});

        HashSet<Car> set = new HashSet<>();

        set.add(mustang1);
        set.add(mustang2);

        for (Car car : set) {
            System.out.println(car);
        }
    }
}

class Car {
    double price;
    String name;
    LocalDateTime[] servicing;

    public Car(double price, String name, LocalDateTime[] servicing) {
        this.price = price;
        this.name = name;
        this.servicing = servicing;
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode called...");
        return (int) price + name.length();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals called...");
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Car car = (Car) obj;
        return Double.compare(price, car.price) == 0 &&
               name.equals(car.name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (LocalDateTime local : servicing) {
            sb.append(local).append(" : ");
        }
        return name + " " + price + " " + sb;
    }
}
