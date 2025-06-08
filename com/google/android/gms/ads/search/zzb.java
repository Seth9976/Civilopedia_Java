package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class zzb {
    public final zzdq a;
    public String b;

    public zzb() {
        this.a = new zzdq();
    }

    public final zzb zzb(Class class0, Bundle bundle0) {
        this.a.zzr(class0, bundle0);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras0) {
        this.a.zzv(networkExtras0);
        return this;
    }

    public final zzb zzd(Class class0, Bundle bundle0) {
        this.a.zzu(class0, bundle0);
        return this;
    }

    public final zzb zze(String s) {
        this.b = s;
        return this;
    }
}

