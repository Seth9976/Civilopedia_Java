package V2;

import J2.j;
import v3.c;
import v3.f;

public abstract class k {
    public final c a;
    public final String b;

    public k(String s, c c0) {
        j.f(c0, "packageFqName");
        super();
        this.a = c0;
        this.b = s;
    }

    public final f a(int v) {
        return f.e((this.b + v));
    }

    @Override
    public final String toString() {
        return this.a + '.' + this.b + 'N';
    }
}

