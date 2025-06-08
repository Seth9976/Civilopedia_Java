package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzhe;

public final class v extends zzch {
    public final zzhe i;

    public v(zzhe zzhe0) {
        this.i = zzhe0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.i);
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final void zze(String s, String s1, Bundle bundle0, long v) {
        this.i.interceptEvent(s, s1, bundle0, v);
    }
}

