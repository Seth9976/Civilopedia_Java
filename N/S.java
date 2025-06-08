package N;

import android.view.View;
import com.google.android.gms.internal.ads.zzcw;
import java.util.Arrays;

public final class s {
    public final int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public s() {
        this.a = 0;
        super();
        this.d();
    }

    public s(int v) {
        this.a = 1;
        super();
        this.b = v;
        byte[] arr_b = new byte[0x83];
        this.f = arr_b;
        arr_b[2] = 1;
    }

    public void a() {
        this.e = this.c ? ((v)this.f).g() : ((v)this.f).j();
    }

    public void b(View view0, int v) {
        if(this.c) {
            int v1 = ((v)this.f).b(view0);
            this.e = ((v)this.f).l() + v1;
        }
        else {
            this.e = ((v)this.f).e(view0);
        }
        this.b = v;
    }

    public void c(View view0, int v) {
        int v1 = ((v)this.f).l();
        if(v1 >= 0) {
            this.b(view0, v);
            return;
        }
        this.b = v;
        if(this.c) {
            int v2 = ((v)this.f).g() - v1 - ((v)this.f).b(view0);
            this.e = ((v)this.f).g() - v2;
            if(v2 > 0) {
                int v3 = ((v)this.f).c(view0);
                int v4 = this.e - v3;
                int v5 = ((v)this.f).j();
                int v6 = v4 - (Math.min(((v)this.f).e(view0) - v5, 0) + v5);
                if(v6 < 0) {
                    this.e = Math.min(v2, -v6) + this.e;
                }
            }
        }
        else {
            int v7 = ((v)this.f).e(view0);
            int v8 = v7 - ((v)this.f).j();
            this.e = v7;
            if(v8 > 0) {
                int v9 = ((v)this.f).c(view0);
                int v10 = ((v)this.f).g();
                int v11 = ((v)this.f).b(view0);
                int v12 = ((v)this.f).g() - Math.min(0, v10 - v1 - v11) - (v9 + v7);
                if(v12 < 0) {
                    this.e -= Math.min(v8, -v12);
                }
            }
        }
    }

    public void d() {
        this.b = -1;
        this.e = 0x80000000;
        this.c = false;
        this.d = false;
    }

    public void e(byte[] arr_b, int v, int v1) {
        if(!this.c) {
            return;
        }
        int v2 = v1 - v;
        byte[] arr_b1 = (byte[])this.f;
        int v3 = this.e + v2;
        if(arr_b1.length < v3) {
            this.f = Arrays.copyOf(arr_b1, v3 + v3);
        }
        System.arraycopy(arr_b, v, ((byte[])this.f), this.e, v2);
        this.e += v2;
    }

    public void f() {
        this.c = false;
        this.d = false;
    }

    public void g(int v) {
        boolean z = true;
        zzcw.zzf(!this.c);
        if(v != this.b) {
            z = false;
        }
        this.c = z;
        if(z) {
            this.e = 3;
            this.d = false;
        }
    }

    public boolean h(int v) {
        if(!this.c) {
            return false;
        }
        this.e -= v;
        this.c = false;
        this.d = true;
        return true;
    }

    @Override
    public String toString() {
        return this.a == 0 ? "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}' : super.toString();
    }
}

