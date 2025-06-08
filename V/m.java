package V;

import o2.C;
import x.c;

public abstract class m extends l {
    public c[] a;
    public String b;
    public int c;

    public m() {
        this.a = null;
        this.c = 0;
    }

    public m(m m0) {
        this.c = 0;
        this.b = m0.b;
        this.a = C.g(m0.a);
    }

    public c[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(c[] arr_c) {
        if(!C.b(this.a, arr_c)) {
            this.a = C.g(arr_c);
            return;
        }
        c[] arr_c1 = this.a;
        for(int v = 0; v < arr_c.length; ++v) {
            arr_c1[v].a = arr_c[v].a;
            for(int v1 = 0; true; ++v1) {
                float[] arr_f = arr_c[v].b;
                if(v1 >= arr_f.length) {
                    break;
                }
                arr_c1[v].b[v1] = arr_f[v1];
            }
        }
    }
}

