package J2;

import A.f;
import H2.a;
import O2.q;
import i3.e;

public abstract class p extends c implements q {
    public final boolean o;

    public p(Class class0, String s, String s1, int v) {
        boolean z = true;
        super(b.i, class0, s, s1, (v & 1) == 1);
        if((v & 2) != 2) {
            z = false;
        }
        this.o = z;
    }

    @Override  // J2.c
    public final O2.b c() {
        return this.o ? this : super.c();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof p) {
            return this.g().equals(((p)object0).g()) && this.l.equals(((p)object0).l) && this.m.equals(((p)object0).m) && j.a(this.j, ((p)object0).j);
        }
        return object0 instanceof q ? object0.equals(this.c()) : false;
    }

    @Override  // J2.c
    public final O2.b h() {
        return this.j();
    }

    @Override
    public final int hashCode() {
        int v = f.b(this.g().hashCode() * 0x1F, 0x1F, this.l);
        return this.m.hashCode() + v;
    }

    public final q j() {
        if(this.o) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        O2.b b0 = this.c();
        if(b0 == this) {
            throw new a();
        }
        return (q)b0;
    }

    @Override
    public final String toString() {
        O2.b b0 = this.c();
        return b0 == this ? e.h(new StringBuilder("property "), this.l, " (Kotlin reflection is not available)") : b0.toString();
    }
}

