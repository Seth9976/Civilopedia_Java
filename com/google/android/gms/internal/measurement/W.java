package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzhf;

public final class w extends zzch {
    public final zzhf i;

    public w(zzhf zzhf0) {
        this.i = zzhf0;
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.i);
    }

    @Override  // com.google.android.gms.internal.measurement.zzci
    public final void zze(String s, String s1, Bundle bundle0, long v) {
        this.i.onEvent(s, s1, bundle0, v);
    }
}

