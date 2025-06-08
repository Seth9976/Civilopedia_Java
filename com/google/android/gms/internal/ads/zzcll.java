package com.google.android.gms.internal.ads;

import android.view.View;

public final class zzcll implements Runnable {
    public final zzclp zza;
    public final View zzb;
    public final zzccj zzc;
    public final int zzd;

    public zzcll(zzclp zzclp0, View view0, zzccj zzccj0, int v) {
        this.zza = zzclp0;
        this.zzb = view0;
        this.zzc = zzccj0;
        this.zzd = v;
    }

    @Override
    public final void run() {
        this.zza.d(this.zzb, this.zzc, this.zzd - 1);
    }
}

