package q;

import java.util.Arrays;

public final class f {
    public int a;
    public int b;
    public int c;
    public float d;
    public final float[] e;
    public int f;
    public b[] g;
    public int h;
    public int i;

    public f(int v) {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.e = new float[7];
        this.g = new b[8];
        this.h = 0;
        this.i = 0;
        this.f = v;
    }

    public final void a(b b0) {
        for(int v = 0; true; ++v) {
            int v1 = this.h;
            if(v >= v1) {
                break;
            }
            if(this.g[v] == b0) {
                return;
            }
        }
        b[] arr_b = this.g;
        if(v1 >= arr_b.length) {
            this.g = (b[])Arrays.copyOf(arr_b, arr_b.length * 2);
        }
        int v2 = this.h;
        this.g[v2] = b0;
        this.h = v2 + 1;
    }

    public final void b(b b0) {
        int v = this.h;
        for(int v2 = 0; v2 < v; ++v2) {
            if(this.g[v2] == b0) {
                for(int v1 = 0; v1 < v - v2 - 1; ++v1) {
                    this.g[v2 + v1] = this.g[v2 + v1 + 1];
                }
                --this.h;
                return;
            }
        }
    }

    public final void c() {
        this.f = 5;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.h = 0;
        this.i = 0;
    }

    public final void d(b b0) {
        int v = this.h;
        for(int v1 = 0; v1 < v; ++v1) {
            b b1 = this.g[v1];
            a a0 = b1.c;
            int v2 = a0.h;
        alab1:
            while(true) {
                for(int v3 = 0; true; ++v3) {
                    if(v2 == -1 || v3 >= a0.a) {
                        break alab1;
                    }
                    f f0 = b0.a;
                    if(a0.e[v2] == f0.a) {
                        float f1 = a0.g[v2];
                        a0.h(f0, false);
                        a a1 = b0.c;
                        int v4 = a1.h;
                        for(int v5 = 0; v4 != -1 && v5 < a1.a; ++v5) {
                            a0.a(((f[])a0.c.l)[a1.e[v4]], a1.g[v4] * f1, false);
                            v4 = a1.f[v4];
                        }
                        b1.b = b0.b * f1 + b1.b;
                        v2 = a0.h;
                        break;
                    }
                    v2 = a0.f[v2];
                }
            }
        }
        this.h = 0;
    }

    @Override
    public final String toString() {
        return "null";
    }
}

