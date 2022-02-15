package 复习.java基础;

import java.util.Objects;

public class Super2 extends Super1 {
    protected int z;

    public Super2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void func1() {
        super.func1();
        System.out.println("super2");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Super2 super2 = (Super2) o;
        return z == super2.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(z);
    }
}
