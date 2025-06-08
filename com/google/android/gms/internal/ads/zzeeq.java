package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzeeq implements zzffi {
    public final zzees zza;
    public final zzcfn zzb;
    public final String zzc;

    public zzeeq(zzees zzees0, zzcfn zzcfn0, String s) {
        this.zza = zzees0;
        this.zzb = zzcfn0;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        this.zza.getClass();
        zzeem zzeem0 = new zzeem(((SQLiteDatabase)object0), this.zzc, this.zzb);
        this.zza.j.execute(zzeem0);
        return null;
    }
}

