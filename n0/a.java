package n0;

public final class a {
    public final Object a;
    public final c b;

    public a(Object object0, c c0) {
        if(object0 == null) {
            throw new NullPointerException("Null payload");
        }
        this.a = object0;
        this.b = c0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            ((a)object0).getClass();
            return this.a.equals(((a)object0).a) && this.b.equals(((a)object0).b);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (0xD5009D89 ^ this.a.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + this.b + "}";
    }
}

