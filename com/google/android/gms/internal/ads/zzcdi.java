package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzcdi implements Callable {
    public final zzcdn zza;
    public final Context zzb;

    public zzcdi(zzcdn zzcdn0, Context context0) {
        this.zza = zzcdn0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return (String)this.zza.h(this.zzb, "getAppInstanceId");
    }
}

