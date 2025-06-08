package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzece implements Callable {
    public final zzeco zza;
    public final zzfvl zzb;
    public final zzfvl zzc;
    public final zzbzv zzd;
    public final zzfhh zze;

    public zzece(zzeco zzeco0, zzfvl zzfvl0, zzfvl zzfvl1, zzbzv zzbzv0, zzfhh zzfhh0) {
        this.zza = zzeco0;
        this.zzb = zzfvl0;
        this.zzc = zzfvl1;
        this.zzd = zzbzv0;
        this.zze = zzfhh0;
    }

    @Override
    public final Object call() {
        this.zza.getClass();
        String s = ((zzbzy)this.zzb.get()).zzc();
        Object object0 = this.zzc.get();
        zzecl zzecl0 = new zzecl(((zzbzy)this.zzb.get()), ((JSONObject)object0), this.zzd.zzh, s, this.zze);
        synchronized(this.zza) {
            this.zza.d();
            this.zza.n.addLast(zzecl0);
        }
        return new ByteArrayInputStream(s.getBytes(zzfoi.zzc));
    }
}

