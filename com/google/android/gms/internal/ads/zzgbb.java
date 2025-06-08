package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgbb extends zzgas {
    public zzgbb() {
        zzgat[] arr_zzgat = {new G8(zzfwx.class, 15)};
        super(zzgem.class, arr_zzgat);
    }

    public static zzgaq a(int v, int v1, int v2, int v3) {
        zzgeo zzgeo0 = zzgep.zzc();
        zzger zzger0 = zzges.zzc();
        zzger0.zzb(v2);
        zzger0.zza(v1);
        zzgeo0.zzb(((zzges)zzger0.zzal()));
        zzgeo0.zza(v);
        return new zzgaq(((zzgep)zzgeo0.zzal()), v3);
    }

    public static void b(zzges zzges0) {
        if(zzges0.zza() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch(zzges0.zzg() - 2) {
            case 1: {
                if(zzges0.zza() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 2: {
                if(zzges0.zza() > 0x30) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 3: {
                if(zzges0.zza() > 0x20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 4: {
                if(zzges0.zza() > 0x40) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            case 5: {
                if(zzges0.zza() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
                break;
            }
            default: {
                throw new GeneralSecurityException("unknown hash type");
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgep.class, 12);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgem.zzf(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        zzgbb.zzh(((zzgem)zzgma0));
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zze() {
        return 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 3;
    }

    public static final void zzh(zzgem zzgem0) throws GeneralSecurityException {
        zzgim.zzb(zzgem0.zza(), 0);
        if(zzgem0.zzh().zzd() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzgbb.b(zzgem0.zzg());
    }
}

