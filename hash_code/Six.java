package hash_code;

public class Six {
    private int empId;
    private String department;

    public Six(int empId, String department) {
        this.empId = empId;
        this.department = department;
    }

    @Override
    public int hashCode() {
        int result = 19;
        result = 31 * result + empId;
        result = 31 * result + (department == null ? 0 : department.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Six)) return false;

        Six e = (Six) o;

        if (empId != e.empId) return false;

        if (department == null) {
            return e.department == null;
        } else {
            return department.equals(e.department);
        }
    }
}