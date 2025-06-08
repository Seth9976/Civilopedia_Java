package X2;

public final class z {
    public final int a;
    public String b;

    public z(int v) {
        this.a = v;
        super();
    }

    public z(String s) {
        this.a = 0;
        super();
        this.b = s;
    }

    @Override
    public String toString() {
        return this.a == 0 ? this.b : super.toString();
    }
}

