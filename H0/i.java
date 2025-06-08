package h0;

import Y.c;
import Y.f;
import q.e;

public final class i {
    public String a;
    public int b;
    public String c;
    public String d;
    public f e;
    public f f;
    public long g;
    public long h;
    public long i;
    public c j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    static {
        new String("WM-WorkSpec");
    }

    public i(String s, String s1) {
        this.b = 1;
        this.e = f.c;
        this.f = f.c;
        this.j = c.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = s;
        this.c = s1;
    }

    public final long a() {
        if(this.b == 1) {
            int v = this.k;
            if(v > 0) {
                return this.l == 2 ? Math.min(18000000L, this.m * ((long)v)) + this.n : Math.min(18000000L, ((long)Math.scalb(this.m, v - 1))) + this.n;
            }
        }
        long v1 = 0L;
        if(this.c()) {
            long v2 = System.currentTimeMillis();
            long v3 = this.n;
            int v4 = Long.compare(v3, 0L);
            if(v4 == 0) {
                v3 = this.g + v2;
            }
            long v5 = this.i;
            long v6 = this.h;
            if(v5 != v6) {
                if(v4 == 0) {
                    v1 = -v5;
                }
                return v3 + v6 + v1;
            }
            if(v4 != 0) {
                v1 = v6;
            }
            return v3 + v1;
        }
        return (this.n == 0L ? System.currentTimeMillis() : this.n) + this.g;
    }

    public final boolean b() {
        return !c.i.equals(this.j);
    }

    public final boolean c() {
        return this.h != 0L;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(i.class != class0 || this.g != ((i)object0).g) {
                return false;
            }
            if(this.h != ((i)object0).h) {
                return false;
            }
            if(this.i != ((i)object0).i) {
                return false;
            }
            if(this.k != ((i)object0).k) {
                return false;
            }
            if(this.m != ((i)object0).m) {
                return false;
            }
            if(this.n != ((i)object0).n) {
                return false;
            }
            if(this.o != ((i)object0).o) {
                return false;
            }
            if(this.p != ((i)object0).p) {
                return false;
            }
            if(this.q != ((i)object0).q) {
                return false;
            }
            if(!this.a.equals(((i)object0).a)) {
                return false;
            }
            if(this.b != ((i)object0).b) {
                return false;
            }
            if(!this.c.equals(((i)object0).c)) {
                return false;
            }
            String s = this.d;
            if(s != null) {
                if(!s.equals(((i)object0).d)) {
                    return false;
                }
            }
            else if(((i)object0).d != null) {
                return false;
            }
            if(!this.e.equals(((i)object0).e)) {
                return false;
            }
            if(!this.f.equals(((i)object0).f)) {
                return false;
            }
            if(!this.j.equals(((i)object0).j)) {
                return false;
            }
            return this.l == ((i)object0).l ? this.r == ((i)object0).r : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = A.f.b((e.c(this.b) + v * 0x1F) * 0x1F, 0x1F, this.c);
        int v2 = ((this.j.hashCode() + ((((this.f.hashCode() + (this.e.hashCode() + (v1 + (this.d == null ? 0 : this.d.hashCode())) * 0x1F) * 0x1F) * 0x1F + ((int)(this.g ^ this.g >>> 0x20))) * 0x1F + ((int)(this.h ^ this.h >>> 0x20))) * 0x1F + ((int)(this.i ^ this.i >>> 0x20))) * 0x1F) * 0x1F + this.k) * 0x1F;
        int v3 = ((((((e.c(this.l) + v2) * 0x1F + ((int)(this.m ^ this.m >>> 0x20))) * 0x1F + ((int)(this.n ^ this.n >>> 0x20))) * 0x1F + ((int)(this.o ^ this.o >>> 0x20))) * 0x1F + ((int)(this.p ^ this.p >>> 0x20))) * 0x1F + this.q) * 0x1F;
        return e.c(this.r) + v3;
    }

    @Override
    public final String toString() {
        return i3.e.h(new StringBuilder("{WorkSpec: "), this.a, "}");
    }
}

