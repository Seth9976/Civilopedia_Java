package com.google.android.gms.internal.measurement;

public final class r0 {
    public final zzll a;
    public final String b;
    public final Object[] c;
    public final int d;

    public r0(zzll zzll0, String s, Object[] arr_object) {
        this.a = zzll0;
        this.b = s;
        this.c = arr_object;
        int v = s.charAt(0);
        if(v < 0xD800) {
            this.d = v;
            return;
        }
        int v1 = v & 0x1FFF;
        int v3 = 13;
        int v4;
        for(int v2 = 1; (v4 = s.charAt(v2)) >= 0xD800; ++v2) {
            v1 |= (v4 & 0x1FFF) << v3;
            v3 += 13;
        }
        this.d = v1 | v4 << v3;
    }

    public final zzll a() {
        return this.a;
    }

    public final int b() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    public final String c() {
        return this.b;
    }

    public final Object[] d() {
        return this.c;
    }
}

