package w0;

import java.util.Set;

public final class c {
    public final long a;
    public final long b;
    public final Set c;

    public c(long v, long v1, Set set0) {
        this.a = v;
        this.b = v1;
        this.c = set0;
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof c && (this.a == ((c)object0).a && this.b == ((c)object0).b && this.c.equals(((c)object0).c));
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() ^ ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003;
    }

    @Override
    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}

