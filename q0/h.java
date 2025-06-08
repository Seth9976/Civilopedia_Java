package q0;

import C1.d;
import java.util.HashMap;

public final class h {
    public final String a;
    public final Integer b;
    public final l c;
    public final long d;
    public final long e;
    public final HashMap f;

    public h(String s, Integer integer0, l l0, long v, long v1, HashMap hashMap0) {
        this.a = s;
        this.b = integer0;
        this.c = l0;
        this.d = v;
        this.e = v1;
        this.f = hashMap0;
    }

    public final String a(String s) {
        String s1 = (String)this.f.get(s);
        return s1 == null ? "" : s1;
    }

    public final int b(String s) {
        String s1 = (String)this.f.get(s);
        return s1 == null ? 0 : ((int)Integer.valueOf(s1));
    }

    public final d c() {
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        String s = this.a;
        if(s == null) {
            throw new NullPointerException("Null transportName");
        }
        d0.i = s;
        d0.j = this.b;
        l l0 = this.c;
        if(l0 == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        d0.k = l0;
        d0.l = this.d;
        d0.m = this.e;
        d0.n = new HashMap(this.f);
        return d0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof h && this.a.equals(((h)object0).a)) {
            Integer integer0 = ((h)object0).b;
            Integer integer1 = this.b;
            if(integer1 == null) {
                return integer0 == null ? this.c.equals(((h)object0).c) && this.d == ((h)object0).d && this.e == ((h)object0).e && this.f.equals(((h)object0).f) : false;
            }
            return integer1.equals(integer0) ? this.c.equals(((h)object0).c) && this.d == ((h)object0).d && this.e == ((h)object0).e && this.f.equals(((h)object0).f) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? ((((v ^ 1000003) * 0xD5009D89 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode() : (((((v ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}

