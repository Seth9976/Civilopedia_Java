package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

public final class s extends u {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public s(int v, long v1) {
        super(v);
        this.b = v1;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final s c(int v) {
        ArrayList arrayList0 = this.d;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            s s0 = (s)arrayList0.get(v2);
            if(s0.a == v) {
                return s0;
            }
        }
        return null;
    }

    public final t d(int v) {
        ArrayList arrayList0 = this.c;
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            t t0 = (t)arrayList0.get(v2);
            if(t0.a == v) {
                return t0;
            }
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.u
    public final String toString() {
        String s = Arrays.toString(this.c.toArray());
        String s1 = Arrays.toString(this.d.toArray());
        return u.b(this.a) + " leaves: " + s + " containers: " + s1;
    }
}

