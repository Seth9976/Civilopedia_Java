package l3;

import J2.j;
import M3.A;
import M3.V;
import java.util.Set;

public final class a {
    public final V a;
    public final b b;
    public final boolean c;
    public final boolean d;
    public final Set e;
    public final A f;

    public a(V v0, b b0, boolean z, boolean z1, Set set0, A a0) {
        this.a = v0;
        this.b = b0;
        this.c = z;
        this.d = z1;
        this.e = set0;
        this.f = a0;
    }

    public a(V v0, boolean z, boolean z1, Set set0, int v1) {
        b b0 = b.i;
        if((v1 & 16) != 0) {
            set0 = null;
        }
        this(v0, b0, ((v1 & 4) == 0 ? z : false), ((v1 & 8) == 0 ? z1 : false), set0, null);
    }

    public static a a(a a0, b b0, boolean z, Set set0, A a1, int v) {
        V v1 = a0.a;
        if((v & 2) != 0) {
            b0 = a0.b;
        }
        if((v & 4) != 0) {
            z = a0.c;
        }
        boolean z1 = a0.d;
        if((v & 16) != 0) {
            set0 = a0.e;
        }
        if((v & 0x20) != 0) {
            a1 = a0.f;
        }
        a0.getClass();
        j.f(v1, "howThisTypeIsUsed");
        j.f(b0, "flexibility");
        return new a(v1, b0, z, z1, set0, a1);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof a ? j.a(((a)object0).f, this.f) && ((a)object0).a == this.a && ((a)object0).b == this.b && ((a)object0).c == this.c && ((a)object0).d == this.d : false;
    }

    @Override
    public final int hashCode() {
        int v = this.f == null ? 0 : this.f.hashCode();
        int v1 = this.a.hashCode() + v * 0x1F + v;
        int v2 = 0x400 * v + this.b.hashCode() + 0x20 * this.a.hashCode();
        int v3 = v2 * 0x1F + this.c + v2;
        return v3 * 0x1F + this.d + v3;
    }

    @Override
    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.a + ", flexibility=" + this.b + ", isRaw=" + this.c + ", isForAnnotationParameter=" + this.d + ", visitedTypeParameters=" + this.e + ", defaultType=" + this.f + ')';
    }
}

