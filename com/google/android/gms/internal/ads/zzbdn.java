package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzbdn implements Runnable {
    public final zzbds zza;
    public final Context zzb;

    public zzbdn(zzbds zzbds0, Context context0) {
        this.zza = zzbds0;
        this.zzb = context0;
    }

    @Override
    public final void run() {
        this.zza.a(this.zzb);
    }
}

