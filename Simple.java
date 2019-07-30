package collection;

public class Simple {

    private int a;
    private long b;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.a;
        hash = 31 * hash + (int) (this.b ^ (this.b >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Simple other = (Simple) obj;
        if (this.a != other.a) {
            return false;
        }
        if (this.b != other.b) {
            return false;
        }
        return true;
    }

    public Simple(int a, long b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Simple{" + "a=" + a + ", b=" + b + '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }
}
