package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfwu {
    public final zzgft a;

    public zzfwu(zzgft zzgft0) {
        this.a = zzgft0;
    }

    public final int a() {
        int v1;
        synchronized(this) {
            do {
                v1 = zzgav.zza();
            }
            while(this.c(v1));
            return v1;
        }
    }

    public final zzgfv b(zzgfo zzgfo0) {
        synchronized(this) {
            return this.d(zzfxk.zzc(zzgfo0), zzgfo0.zzi());
        }
    }

    public final boolean c(int v) {
        synchronized(this) {
            for(Object object0: this.a.zzc()) {
                if(((zzgfv)object0).zza() == v) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    public final zzgfv d(zzgfj zzgfj0, int v) {
        synchronized(this) {
            int v2 = this.a();
            if(v != 2) {
                zzgfu zzgfu0 = zzgfv.zzd();
                zzgfu0.zza(zzgfj0);
                zzgfu0.zzb(v2);
                zzgfu0.zzd(3);
                zzgfu0.zzc(v);
                return (zzgfv)zzgfu0.zzal();
            }
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }

    @Deprecated
    public final int zza(zzgfo zzgfo0, boolean z) throws GeneralSecurityException {
        zzgfv zzgfv0;
        synchronized(this) {
            zzgfv0 = this.b(zzgfo0);
            this.a.zza(zzgfv0);
            this.a.zzb(zzgfv0.zza());
        }
        return zzgfv0.zza();
    }

    public final zzfwt zzb() throws GeneralSecurityException {
        synchronized(this) {
            return zzfwt.a(((zzgfw)this.a.zzal()));
        }
    }

    @Deprecated
    public final zzfwu zzc(zzgfo zzgfo0) throws GeneralSecurityException {
        synchronized(this) {
            this.zza(zzgfo0, true);
            return this;
        }
    }

    public static zzfwu zzd() {
        return new zzfwu(zzgfw.zzd());
    }
}

