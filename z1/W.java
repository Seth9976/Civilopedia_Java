package z1;

import i3.e;

public final class w extends W {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;

    public w(int v, String s, int v1, int v2, long v3, long v4, long v5, String s1) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = v4;
        this.g = v5;
        this.h = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof W && (this.a == ((w)(((W)object0))).a && this.b.equals(((w)(((W)object0))).b) && this.c == ((w)(((W)object0))).c && this.d == ((w)(((W)object0))).d && this.e == ((w)(((W)object0))).e && this.f == ((w)(((W)object0))).f && this.g == ((w)(((W)object0))).g)) {
            String s = ((w)(((W)object0))).h;
            return this.h == null ? s == null : this.h.equals(s);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = (((((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20))) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20))) * 1000003;
        return this.h == null ? v : v ^ this.h.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ApplicationExitInfo{pid=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", processName=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", reasonCode=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", importance=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", pss=");
        stringBuilder0.append(this.e);
        stringBuilder0.append(", rss=");
        stringBuilder0.append(this.f);
        stringBuilder0.append(", timestamp=");
        stringBuilder0.append(this.g);
        stringBuilder0.append(", traceFile=");
        return e.h(stringBuilder0, this.h, "}");
    }
}

