package q;

public class b {
    public f a;
    public float b;
    public final a c;
    public boolean d;

    public b(B1.a a0) {
        this.a = null;
        this.b = 0.0f;
        this.d = false;
        this.c = new a(this, a0);
    }

    public final void a(d d0, int v) {
        f f0 = d0.i(v);
        this.c.g(f0, 1.0f);
        f f1 = d0.i(v);
        this.c.g(f1, -1.0f);
    }

    public void b(f f0) {
        float f1 = 1.0f;
        switch(f0.c) {
            case 2: {
                f1 = 1000.0f;
                break;
            }
            case 3: {
                f1 = 1000000.0f;
                break;
            }
            case 4: {
                f1 = 1000000000.0f;
                break;
            }
            case 5: {
                f1 = 999999995904.0f;
            }
        }
        this.c.g(f0, f1);
    }

    public final void c(f f0, f f1, f f2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        a a0 = this.c;
        if(!z) {
            a0.g(f0, -1.0f);
            a0.g(f1, 1.0f);
            a0.g(f2, 1.0f);
            return;
        }
        a0.g(f0, 1.0f);
        a0.g(f1, -1.0f);
        a0.g(f2, -1.0f);
    }

    public final void d(f f0, f f1, f f2, int v) {
        boolean z = false;
        if(v != 0) {
            if(v < 0) {
                v = -v;
                z = true;
            }
            this.b = (float)v;
        }
        a a0 = this.c;
        if(!z) {
            a0.g(f0, -1.0f);
            a0.g(f1, 1.0f);
            a0.g(f2, -1.0f);
            return;
        }
        a0.g(f0, 1.0f);
        a0.g(f1, -1.0f);
        a0.g(f2, 1.0f);
    }

    public final void e(f f0) {
        f f1 = this.a;
        a a0 = this.c;
        if(f1 != null) {
            a0.g(f1, -1.0f);
            this.a = null;
        }
        float f2 = a0.h(f0, true);
        this.a = f0;
        if(f2 * -1.0f == 1.0f) {
            return;
        }
        this.b /= f2 * -1.0f;
        int v = a0.h;
        for(int v1 = 0; v != -1 && v1 < a0.a; ++v1) {
            a0.g[v] /= f2 * -1.0f;
            v = a0.f[v];
        }
    }

    @Override
    public final String toString() {
        boolean z;
        String s = e.b((this.a == null ? "0" : "" + this.a), " = ");
        if(this.b == 0.0f) {
            z = false;
        }
        else {
            s = s + this.b;
            z = true;
        }
        a a0 = this.c;
        int v1 = a0.a;
        for(int v = 0; v < v1; ++v) {
            if(a0.e(v) != null) {
                float f = a0.f(v);
                int v2 = Float.compare(f, 0.0f);
                if(v2 != 0) {
                    if(z) {
                        if(v2 > 0) {
                            s = e.b(s, " + ");
                        }
                        else {
                            s = e.b(s, " - ");
                            f *= -1.0f;
                        }
                    }
                    else if(f < 0.0f) {
                        s = e.b(s, "- ");
                        f *= -1.0f;
                    }
                    s = f == 1.0f ? e.b(s, "null") : s + f + " null";
                    z = true;
                }
            }
        }
        return z ? s : e.b(s, "0.0");
    }
}

