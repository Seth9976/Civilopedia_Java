package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public final class zzdx implements Runnable {
    public final zzed zza;
    public final Context zzb;
    public final OnInitializationCompleteListener zzc;

    public zzdx(zzed zzed0, Context context0, String s, OnInitializationCompleteListener onInitializationCompleteListener0) {
        this.zza = zzed0;
        this.zzb = context0;
        this.zzc = onInitializationCompleteListener0;
    }

    @Override
    public final void run() {
        synchronized(this.zza.e) {
            this.zza.b(this.zzb);
        }
    }
}

