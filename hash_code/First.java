package hash_code;

import java.util.Objects;

public class First {
    private String model;
    private int year;

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof First)) return false;
        First other = (First) obj;
        return year == other.year &&
               Objects.equals(model, other.model);
    }
}
