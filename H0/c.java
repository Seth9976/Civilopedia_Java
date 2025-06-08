package h0;

public final class c {
    public final String a;
    public final Long b;

    public c(String s, long v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        if(!this.a.equals(((c)object0).a)) {
            return false;
        }
        Long long0 = ((c)object0).b;
        return this.b == null ? long0 == null : this.b.equals(long0);
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }
}

