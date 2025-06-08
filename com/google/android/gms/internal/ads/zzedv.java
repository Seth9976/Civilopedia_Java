package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

public final class zzedv implements zzffi {
    public final zzedw zza;
    public final long zzb;

    public zzedv(zzedw zzedw0, long v) {
        this.zza = zzedw0;
        this.zzb = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) {
        long v = this.zzb;
        if(!this.zza.a.zzP()) {
            zzbfu zzbfu0 = zzbfv.zzg();
            zzbfu0.zzh(v);
            byte[] arr_b = ((zzbfv)zzbfu0.zzal()).zzaw();
            zzeed.zzg(((SQLiteDatabase)object0), false, false);
            zzeed.zzd(((SQLiteDatabase)object0), v, arr_b);
        }
        return null;
    }
}

