package p;

public final class e implements Cloneable {
    public boolean i;
    public long[] j;
    public Object[] k;
    public int l;
    public static final Object m;

    static {
        e.m = new Object();
    }

    public e() {
        int v1;
        this.i = false;
        for(int v = 4; true; ++v) {
            v1 = 80;
            if(v >= 0x20) {
                break;
            }
            int v2 = (1 << v) - 12;
            if(80 <= v2) {
                v1 = v2;
                break;
            }
        }
        this.j = new long[v1 / 8];
        this.k = new Object[v1 / 8];
    }

    public final void a(long v, Long long0) {
        int v1 = this.l;
        if(v1 != 0 && v <= this.j[v1 - 1]) {
            this.e(v, long0);
            return;
        }
        if(this.i && v1 >= this.j.length) {
            this.c();
        }
        int v2 = this.l;
        if(v2 >= this.j.length) {
            int v3 = (v2 + 1) * 8;
            for(int v4 = 4; v4 < 0x20; ++v4) {
                int v5 = (1 << v4) - 12;
                if(v3 <= v5) {
                    v3 = v5;
                    break;
                }
            }
            long[] arr_v = new long[v3 / 8];
            Object[] arr_object = new Object[v3 / 8];
            System.arraycopy(this.j, 0, arr_v, 0, this.j.length);
            System.arraycopy(this.k, 0, arr_object, 0, this.k.length);
            this.j = arr_v;
            this.k = arr_object;
        }
        this.j[v2] = v;
        this.k[v2] = long0;
        this.l = v2 + 1;
    }

    public final e b() {
        try {
            e e0 = (e)super.clone();
            e0.j = (long[])this.j.clone();
            e0.k = (Object[])this.k.clone();
            return e0;
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new AssertionError(cloneNotSupportedException0);
        }
    }

    public final void c() {
        int v = this.l;
        long[] arr_v = this.j;
        Object[] arr_object = this.k;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = arr_object[v1];
            if(object0 != e.m) {
                if(v1 != v2) {
                    arr_v[v2] = arr_v[v1];
                    arr_object[v2] = object0;
                    arr_object[v1] = null;
                }
                ++v2;
            }
        }
        this.i = false;
        this.l = v2;
    }

    @Override
    public final Object clone() {
        return this.b();
    }

    public final Object d(long v, Long long0) {
        int v1 = d.b(this.j, this.l, v);
        if(v1 >= 0) {
            Object object0 = this.k[v1];
            if(object0 != e.m) {
                return object0;
            }
        }
        return long0;
    }

    public final void e(long v, Object object0) {
        int v1 = d.b(this.j, this.l, v);
        if(v1 >= 0) {
            this.k[v1] = object0;
            return;
        }
        int v2 = ~v1;
        int v3 = this.l;
        if(v2 < v3) {
            Object[] arr_object = this.k;
            if(arr_object[v2] == e.m) {
                this.j[v2] = v;
                arr_object[v2] = object0;
                return;
            }
        }
        if(this.i && v3 >= this.j.length) {
            this.c();
            v2 = ~d.b(this.j, this.l, v);
        }
        int v4 = this.l;
        if(v4 >= this.j.length) {
            int v5 = (v4 + 1) * 8;
            for(int v6 = 4; v6 < 0x20; ++v6) {
                int v7 = (1 << v6) - 12;
                if(v5 <= v7) {
                    v5 = v7;
                    break;
                }
            }
            long[] arr_v = new long[v5 / 8];
            Object[] arr_object1 = new Object[v5 / 8];
            System.arraycopy(this.j, 0, arr_v, 0, this.j.length);
            System.arraycopy(this.k, 0, arr_object1, 0, this.k.length);
            this.j = arr_v;
            this.k = arr_object1;
        }
        int v8 = this.l - v2;
        if(v8 != 0) {
            System.arraycopy(this.j, v2, this.j, v2 + 1, v8);
            System.arraycopy(this.k, v2, this.k, v2 + 1, this.l - v2);
        }
        this.j[v2] = v;
        this.k[v2] = object0;
        ++this.l;
    }

    @Override
    public final String toString() {
        if(this.i) {
            this.c();
        }
        int v = this.l;
        if(v <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder0 = new StringBuilder(v * 28);
        stringBuilder0.append('{');
        for(int v1 = 0; v1 < this.l; ++v1) {
            if(v1 > 0) {
                stringBuilder0.append(", ");
            }
            if(this.i) {
                this.c();
            }
            stringBuilder0.append(this.j[v1]);
            stringBuilder0.append('=');
            if(this.i) {
                this.c();
            }
            Object object0 = this.k[v1];
            if(object0 == this) {
                stringBuilder0.append("(this Map)");
            }
            else {
                stringBuilder0.append(object0);
            }
        }
        stringBuilder0.append('}');
        return stringBuilder0.toString();
    }
}

