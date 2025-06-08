package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfwt {
    public final zzgfw a;

    public zzfwt(zzgfw zzgfw0) {
        this.a = zzgfw0;
    }

    public static final zzfwt a(zzgfw zzgfw0) {
        if(zzgfw0 == null || zzgfw0.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzfwt(zzgfw0);
    }

    @Override
    public final String toString() {
        zzgfy zzgfy0 = zzggb.zza();
        zzgfy0.zzb(this.a.zzc());
        for(Object object0: this.a.zzh()) {
            zzgfz zzgfz0 = zzgga.zza();
            zzgfz0.zzb("");
            zzgfz0.zzd(((zzgfv)object0).zzi());
            zzgfz0.zzc(((zzgfv)object0).zzj());
            zzgfz0.zza(((zzgfv)object0).zza());
            zzgfy0.zza(((zzgga)zzgfz0.zzal()));
        }
        return ((zzggb)zzgfy0.zzal()).toString();
    }

    public static final zzfwt zzb(zzfwr zzfwr0) throws GeneralSecurityException {
        zzfwu zzfwu0 = zzfwu.zzd();
        zzfwu0.zzc(zzfwr0.a);
        return zzfwu0.zzb();
    }

    public final Object zzd(Class class0) throws GeneralSecurityException {
        Class class1 = zzfxk.zze(class0);
        if(class1 == null) {
            throw new GeneralSecurityException("No wrapper found for " + class0.getName());
        }
        zzgfw zzgfw0 = this.a;
        int v = zzgfw0.zzc();
        int v1 = 0;
        boolean z = false;
        int v2 = 1;
        for(Object object0: zzgfw0.zzh()) {
            zzgfv zzgfv0 = (zzgfv)object0;
            if(zzgfv0.zzi() == 3) {
                if(!zzgfv0.zzh()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", zzgfv0.zza()));
                }
                if(zzgfv0.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", zzgfv0.zza()));
                }
                if(zzgfv0.zzi() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", zzgfv0.zza()));
                }
                if(zzgfv0.zza() == v) {
                    if(z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                v2 &= (zzgfv0.zzc().zzi() == 5 ? 1 : 0);
                ++v1;
            }
        }
        if(v1 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if(!z && v2 == 0) {
            throw new GeneralSecurityException("keyset doesn\'t contain a valid primary key");
        }
        zzfxc zzfxc0 = zzfxc.zzc(class1);
        for(Object object1: zzgfw0.zzh()) {
            zzgfv zzgfv1 = (zzgfv)object1;
            if(zzgfv1.zzi() == 3) {
                zzfwz zzfwz0 = zzfxc0.zza(zzfxk.zzf(zzgfv1.zzc(), class1), zzgfv1);
                if(zzgfv1.zza() == zzgfw0.zzc()) {
                    zzfxc0.zzf(zzfwz0);
                }
            }
        }
        return zzfxk.zzi(zzfxc0, class0);
    }
}

