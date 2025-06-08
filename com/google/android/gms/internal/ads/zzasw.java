package com.google.android.gms.internal.ads;

import A.f;

public final class zzasw extends Exception {
    public zzasw(int v, int v1, int v2, int v3) {
        StringBuilder stringBuilder0 = f.n("AudioTrack init failed: ", v, ", Config(", v1, ", ");
        stringBuilder0.append(v2);
        stringBuilder0.append(", ");
        stringBuilder0.append(v3);
        stringBuilder0.append(")");
        super(stringBuilder0.toString());
    }
}

