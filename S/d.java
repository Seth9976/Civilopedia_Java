package s;

import android.view.ViewGroup.MarginLayoutParams;
import r.g;

public final class d extends ViewGroup.MarginLayoutParams {
    public float A;
    public String B;
    public int C;
    public float D;
    public float E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public float O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public int a;
    public int a0;
    public int b;
    public int b0;
    public float c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public float f0;
    public int g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public float i0;
    public int j;
    public r.d j0;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public float z;

    public final void a() {
        this.X = false;
        this.U = true;
        this.V = true;
        int v = this.width;
        if(v == -2 && this.S) {
            this.U = false;
            this.H = 1;
        }
        int v1 = this.height;
        if(v1 == -2 && this.T) {
            this.V = false;
            this.I = 1;
        }
        if(v == -1 || v == 0) {
            this.U = false;
            if(v == 0 && this.H == 1) {
                this.width = -2;
                this.S = true;
            }
        }
        if(v1 == -1 || v1 == 0) {
            this.V = false;
            if(v1 == 0 && this.I == 1) {
                this.height = -2;
                this.T = true;
            }
        }
        if(this.c != -1.0f || this.a != -1 || this.b != -1) {
            this.X = true;
            this.U = true;
            this.V = true;
            if(!(this.j0 instanceof g)) {
                this.j0 = new g();
            }
            ((g)this.j0).A(this.R);
        }
    }

    @Override  // android.view.ViewGroup$MarginLayoutParams
    public final void resolveLayoutDirection(int v) {
        boolean z;
        int v1 = this.leftMargin;
        int v2 = this.rightMargin;
        super.resolveLayoutDirection(v);
        this.b0 = -1;
        this.c0 = -1;
        this.Z = -1;
        this.a0 = -1;
        this.d0 = this.t;
        this.e0 = this.v;
        this.f0 = this.z;
        this.g0 = this.a;
        this.h0 = this.b;
        this.i0 = this.c;
        if(1 == this.getLayoutDirection()) {
            int v3 = this.p;
            if(v3 == -1) {
                int v4 = this.q;
                if(v4 == -1) {
                    z = false;
                }
                else {
                    this.c0 = v4;
                    z = true;
                }
            }
            else {
                this.b0 = v3;
                z = true;
            }
            int v5 = this.r;
            if(v5 != -1) {
                this.a0 = v5;
                z = true;
            }
            int v6 = this.s;
            if(v6 != -1) {
                this.Z = v6;
                z = true;
            }
            int v7 = this.x;
            if(v7 != -1) {
                this.e0 = v7;
            }
            int v8 = this.y;
            if(v8 != -1) {
                this.d0 = v8;
            }
            if(z) {
                this.f0 = 1.0f - this.z;
            }
            if(this.X && this.R == 1) {
                float f = this.c;
                if(f == -1.0f) {
                    int v9 = this.a;
                    if(v9 == -1) {
                        int v10 = this.b;
                        if(v10 != -1) {
                            this.g0 = v10;
                            this.h0 = -1;
                            this.i0 = -1.0f;
                        }
                    }
                    else {
                        this.h0 = v9;
                        this.g0 = -1;
                        this.i0 = -1.0f;
                    }
                }
                else {
                    this.i0 = 1.0f - f;
                    this.g0 = -1;
                    this.h0 = -1;
                }
            }
        }
        else {
            int v11 = this.p;
            if(v11 != -1) {
                this.a0 = v11;
            }
            int v12 = this.q;
            if(v12 != -1) {
                this.Z = v12;
            }
            int v13 = this.r;
            if(v13 != -1) {
                this.b0 = v13;
            }
            int v14 = this.s;
            if(v14 != -1) {
                this.c0 = v14;
            }
            int v15 = this.x;
            if(v15 != -1) {
                this.d0 = v15;
            }
            int v16 = this.y;
            if(v16 != -1) {
                this.e0 = v16;
            }
        }
        if(this.r == -1 && this.s == -1 && this.q == -1 && this.p == -1) {
            int v17 = this.f;
            if(v17 == -1) {
                int v18 = this.g;
                if(v18 != -1) {
                    this.c0 = v18;
                    if(this.rightMargin <= 0 && v2 > 0) {
                        this.rightMargin = v2;
                    }
                }
            }
            else {
                this.b0 = v17;
                if(this.rightMargin <= 0 && v2 > 0) {
                    this.rightMargin = v2;
                }
            }
            int v19 = this.d;
            if(v19 == -1) {
                int v20 = this.e;
                if(v20 != -1) {
                    this.a0 = v20;
                    if(this.leftMargin <= 0 && v1 > 0) {
                        this.leftMargin = v1;
                    }
                }
            }
            else {
                this.Z = v19;
                if(this.leftMargin <= 0 && v1 > 0) {
                    this.leftMargin = v1;
                }
            }
        }
    }
}

