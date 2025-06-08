package d0;

public final class a {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a ? this.a == ((a)object0).a && this.b == ((a)object0).b && this.c == ((a)object0).c && this.d == ((a)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        if(this.b) {
            v += 16;
        }
        if(this.c) {
            v += 0x100;
        }
        return this.d ? v + 0x1000 : v;
    }

    @Override
    public final String toString() {
        return "[ Connected=" + this.a + " Validated=" + this.b + " Metered=" + this.c + " NotRoaming=" + this.d + " ]";
    }
}

