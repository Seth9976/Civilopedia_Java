package N3;

import I2.c;
import J2.h;
import J2.j;
import J2.r;
import M3.w;
import O2.e;

public final class s extends h implements c {
    public final int q;

    public s(int v, int v1, Object object0) {
        this.q = v1;
        super(v, object0);
    }

    @Override  // I2.c
    public final Object a(Object object0, Object object1) {
        if(this.q != 0) {
            j.f(((w)object0), "p0");
            j.f(((w)object1), "p1");
            return Boolean.valueOf(((l)this.j).a(((w)object0), ((w)object1)));
        }
        j.f(((w)object0), "p0");
        j.f(((w)object1), "p1");
        ((t)this.j).getClass();
        k.b.getClass();
        return !N3.j.b.b(((w)object0), ((w)object1)) || N3.j.b.b(((w)object1), ((w)object0)) ? false : true;
    }

    @Override  // J2.c
    public final e g() {
        return this.q == 0 ? r.a.b(t.class) : r.a.b(l.class);
    }

    @Override  // J2.c, O2.b
    public final String getName() {
        return this.q == 0 ? "isStrictSupertype" : "equalTypes";
    }

    @Override  // J2.c
    public final String i() {
        return this.q == 0 ? "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z" : "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}

