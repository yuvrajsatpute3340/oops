package hash_code;

public class Fifth {
    private int id;
    private String name;

    public Fifth(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result = 23;
        result = 37 * result + id;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fifth)) return false;

        Fifth s = (Fifth) o;

        if (id != s.id) return false;

        if (name == null) {
            return s.name == null;
        } else {
            return name.equals(s.name);
        }
    }
}