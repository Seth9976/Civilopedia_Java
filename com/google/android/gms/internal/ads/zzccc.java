package com.google.android.gms.internal.ads;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;

public final class zzccc implements Runnable {
    public final zzcce zza;
    public final Bitmap zzb;

    public zzccc(zzcce zzcce0, Bitmap bitmap0) {
        this.zza = zzcce0;
        this.zzb = bitmap0;
    }

    @Override
    public final void run() {
        this.zza.getClass();
        zzgjf zzgjf0 = zzgji.zzt();
        this.zzb.compress(Bitmap.CompressFormat.PNG, 0, zzgjf0);
        synchronized(this.zza.h) {
            zzgpc zzgpc0 = zzgpe.zza();
            zzgpc0.zza(zzgjf0.zzb());
            zzgpc0.zzb("image/png");
            zzgpc0.zzc(2);
            zzgpe zzgpe0 = (zzgpe)zzgpc0.zzal();
            this.zza.a.zzi(zzgpe0);
        }
    }
}

