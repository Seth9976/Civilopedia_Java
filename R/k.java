package r;

import java.util.HashSet;

public abstract class k {
    public final HashSet a;
    public int b;

    public k() {
        this.a = new HashSet(2);
        this.b = 0;
    }

    public final void a(k k0) {
        this.a.add(k0);
    }

    public final void b() {
        this.b = 1;
        for(Object object0: this.a) {
            ((k)object0).e();
        }
    }

    public final void c() {
        this.b = 0;
        for(Object object0: this.a) {
            ((k)object0).c();
        }
    }

    public final boolean d() {
        return this.b == 1;
    }

    public void e() {
    }
}

