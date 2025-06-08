package w3;

public final class f {
    public final b a;
    public final int b;

    public f(int v, b b0) {
        this.a = b0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof f ? this.a == ((f)object0).a && this.b == ((f)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 0xFFFF + this.b;
    }
}

