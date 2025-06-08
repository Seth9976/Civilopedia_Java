package com.google.android.gms.internal.ads;

import java.util.Set;

public final class d8 extends h {
    @Override  // com.google.android.gms.internal.ads.h
    public final int b(b8 b80) {
        int v;
        synchronized(b80) {
            v = b80.q - 1;
            b80.q = v;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.h
    public final void u(b8 b80, Set set0) {
        synchronized(b80) {
            if(b80.p == null) {
                b80.p = set0;
            }
        }
    }
}

