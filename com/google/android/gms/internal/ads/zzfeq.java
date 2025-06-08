package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class zzfeq {
    public final zzfej a;
    public final zzfvl b;
    public boolean c;
    public boolean d;

    public zzfeq(zzfdo zzfdo0, zzfei zzfei0, zzfej zzfej0) {
        this.c = false;
        this.d = false;
        this.a = zzfej0;
        zzfvl zzfvl0 = zzfvc.zzn(zzfei0.zza(zzfej0), new zzfeo(this, zzfei0, zzfdo0, zzfej0), zzfej0.zzb());
        zzfep zzfep0 = new zzfep(this, zzfei0);
        Executor executor0 = zzfej0.zzb();
        this.b = zzfvc.zzg(zzfvl0, Exception.class, zzfep0, executor0);
    }

    public final zzfvl zza(zzfej zzfej0) {
        synchronized(this) {
            if(!this.d && !this.c) {
                if(this.a.zza() != null && zzfej0.zza() != null && this.a.zza().equals(zzfej0.zza())) {
                    this.c = true;
                    return this.b;
                }
                return null;
            }
            return null;
        }
    }

    public final void zzd(zzfuy zzfuy0) {
        synchronized(this) {
            Executor executor0 = this.a.zzb();
            zzfvc.zzr(zzfvc.zzn(this.b, zzfen.zza, executor0), zzfuy0, this.a.zzb());
        }
    }
}

