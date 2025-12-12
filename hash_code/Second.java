package hash_code;

public class Second {
    private String title;
    private String author;

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (title == null ? 0 : title.hashCode());
        result = 31 * result + (author == null ? 0 : author.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Second)) return false;
        Second b = (Second) o;
        return title.equals(b.title) && author.equals(b.author);
    }
}

