package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

public final class zzddn extends zzdhc implements zzbnm {
    public final Bundle j;

    public zzddn(Set set0) {
        super(set0);
        this.j = new Bundle();
    }

    @Override  // com.google.android.gms.internal.ads.zzbnm
    public final void zza(String s, Bundle bundle0) {
        synchronized(this) {
            this.j.putAll(bundle0);
            this.a(zzddm.zza);
        }
    }

    public final Bundle zzb() {
        synchronized(this) {
            return new Bundle(this.j);
        }
    }
}

