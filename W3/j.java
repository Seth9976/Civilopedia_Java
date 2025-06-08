package w3;

import java.util.Map.Entry;

public abstract class j extends i implements v {
    public h j;
    public boolean k;

    public j() {
        this.j = h.c;
    }

    public final void f(l l0) {
        if(!this.k) {
            this.j = this.j.b();
            this.k = true;
        }
        h h0 = this.j;
        h h1 = l0.i;
        h0.getClass();
        for(int v = 0; true; ++v) {
            A a0 = h1.a;
            if(v >= h1.a.j.size()) {
                break;
            }
            h0.g(((Map.Entry)a0.j.get(v)));
        }
        for(Object object0: a0.d()) {
            h0.g(((Map.Entry)object0));
        }
    }
}

