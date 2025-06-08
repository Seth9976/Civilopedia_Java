package s3;

import J2.j;
import java.util.ArrayList;
import java.util.List;
import x2.b;
import x2.g;
import x2.h;
import x2.i;
import x2.r;

public abstract class a {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public a(int[] arr_v) {
        j.f(arr_v, "numbers");
        List list0;
        super();
        this.a = arr_v;
        Integer integer0 = g.I(arr_v, 0);
        int v = -1;
        this.b = integer0 == null ? -1 : ((int)integer0);
        Integer integer1 = g.I(arr_v, 1);
        this.c = integer1 == null ? -1 : ((int)integer1);
        Integer integer2 = g.I(arr_v, 2);
        if(integer2 != null) {
            v = (int)integer2;
        }
        this.d = v;
        if(arr_v.length > 3) {
            if(arr_v.length > 0x400) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + arr_v.length + '.');
            }
            list0 = i.o0(new b(new h(arr_v), 3, arr_v.length));
        }
        else {
            list0 = r.i;
        }
        this.e = list0;
    }

    public final boolean a(int v, int v1, int v2) {
        int v3 = this.b;
        if(v3 > v) {
            return true;
        }
        if(v3 < v) {
            return false;
        }
        int v4 = this.c;
        if(v4 > v1) {
            return true;
        }
        return v4 >= v1 ? this.d >= v2 : false;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 != null && this.getClass().equals(object0.getClass()) && this.b == ((a)object0).b && this.c == ((a)object0).c && this.d == ((a)object0).d && j.a(this.e, ((a)object0).e);
    }

    // 去混淆评级： 低(40)
    @Override
    public final int hashCode() {
        return this.e.hashCode() + 0x20 * this.d + 0x8000 * this.b + 0x400 * this.c;
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        int[] arr_v = this.a;
        for(int v = 0; v < arr_v.length; ++v) {
            int v1 = arr_v[v];
            if(v1 == -1) {
                break;
            }
            arrayList0.add(v1);
        }
        return arrayList0.isEmpty() ? "unknown" : i.Y(arrayList0, ".", null, null, null, 62);
    }
}

