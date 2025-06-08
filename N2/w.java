package n2;

public final class w {
    public final double a;
    public final double b;

    public w(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w)) {
            return false;
        }
        return Double.compare(this.a, ((w)object0).a) == 0 ? Double.compare(this.b, ((w)object0).b) == 0 : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.a);
        long v1 = Double.doubleToLongBits(this.b);
        return ((int)(v ^ v >>> 0x20)) * 0x1F + ((int)(v1 ^ v1 >>> 0x20));
    }

    @Override
    public final String toString() {
        return "Point(x=" + this.a + ", y=" + this.b + ")";
    }
}

