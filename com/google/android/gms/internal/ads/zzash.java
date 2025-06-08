package com.google.android.gms.internal.ads;

import A.f;

public final class zzash extends Exception {
    public zzash(int v, int v1, int v2) {
        StringBuilder stringBuilder0 = f.n("Unhandled format: ", v, " Hz, ", v1, " channels in encoding ");
        stringBuilder0.append(v2);
        super(stringBuilder0.toString());
    }
}

