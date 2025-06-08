package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

public final class zzdzr implements Callable {
    public final zzaoc zza;
    public final Context zzb;

    public zzdzr(zzaoc zzaoc0, Context context0) {
        this.zza = zzaoc0;
        this.zzb = context0;
    }

    @Override
    public final Object call() {
        return this.zza.zzc().zzg(this.zzb);
    }
}

