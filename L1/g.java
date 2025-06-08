package l1;

import I3.A;
import J2.j;
import M3.K;
import N3.c;
import X2.T;
import X2.b;
import X2.h;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import jeb.synthetic.FIN;

public final class g implements c {
    public boolean a;
    public final Object b;
    public Object c;

    public g() {
        this.b = new Object();
    }

    public g(b b0, b b1, boolean z) {
        this.a = z;
        this.b = b0;
        this.c = b1;
    }

    @Override  // N3.c
    public boolean a(K k0, K k1) {
        b b0 = (b)this.b;
        j.f(b0, "$a");
        b b1 = (b)this.c;
        j.f(b1, "$b");
        j.f(k0, "c1");
        j.f(k1, "c2");
        if(k0.equals(k1)) {
            return true;
        }
        h h0 = k0.q();
        h h1 = k1.q();
        if(h0 instanceof T && h1 instanceof T) {
            A a0 = new A(b0, b1);
            return y3.b.a.d(((T)h0), ((T)h1), this.a, a0);
        }
        return false;
    }

    public void b(f f0) {
        synchronized(this.b) {
            if(((ArrayDeque)this.c) == null) {
                this.c = new ArrayDeque();
            }
            ((ArrayDeque)this.c).add(f0);
        }
    }

    public void c(Task task0) {
        f f0;
        int v1;
        synchronized(this.b) {
            if(((ArrayDeque)this.c) != null && !this.a) {
                this.a = true;
                while(true) {
                    Object object1 = this.b;
                    synchronized(object1) {
                        v1 = FIN.finallyOpen$NT();
                        f0 = (f)((ArrayDeque)this.c).poll();
                        if(f0 == null) {
                            break;
                        }
                        FIN.finallyCodeBegin$NT(v1);
                    }
                    FIN.finallyCodeEnd$NT(v1);
                    f0.a(task0);
                }
                this.a = false;
                FIN.finallyExec$NT(v1);
            }
        }
    }
}

