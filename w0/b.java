package w0;

import java.util.HashMap;
import n0.c;
import z0.a;

public final class b {
    public final a a;
    public final HashMap b;

    public b(a a0, HashMap hashMap0) {
        this.a = a0;
        this.b = hashMap0;
    }

    public final long a(c c0, long v, int v1) {
        long v2 = this.a.d();
        w0.c c1 = (w0.c)this.b.get(c0);
        return c1.a <= 1L ? Math.min(Math.max(((long)(Math.pow(3.0, v1 - 1) * ((double)c1.a) * Math.max(1.0, 9.21034 / Math.log(2L * ((long)(v1 - 1)))))), v - v2), c1.b) : Math.min(Math.max(((long)(Math.pow(3.0, v1 - 1) * ((double)c1.a) * Math.max(1.0, 9.21034 / Math.log(c1.a * ((long)(v1 - 1)))))), v - v2), c1.b);
    }

    // 去混淆评级： 低(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof b && (this.a.equals(((b)object0).a) && this.b.equals(((b)object0).b));
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}

