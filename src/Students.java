import java.util.Objects;

public class Students {
    private String name;
    private int rollNo;
    private double cpi;

    public Students(String name, int rollNo, double cpi) {
        this.name = name;
        this.rollNo = rollNo;
        this.cpi = cpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", cpi=" + cpi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return rollNo == students.rollNo && Double.compare(students.cpi, cpi) == 0 && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, cpi);
    }
}
