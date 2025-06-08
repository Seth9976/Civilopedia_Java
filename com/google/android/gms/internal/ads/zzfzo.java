package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzfzo extends zzgau {
    public static final byte[] d;

    static {
        zzfzo.d = new byte[0];
    }

    public zzfzo() {
        zzgat[] arr_zzgat = {new G8(zzfwm.class, 10)};
        super(zzgdz.class, arr_zzgat);
    }

    public static zzgaq a(int v, zzfwr zzfwr0, byte[] arr_b, int v1) {
        zzgds zzgds0 = zzgdt.zza();
        zzgee zzgee0 = zzgef.zza();
        int v2 = 4;
        zzgee0.zzb(4);
        zzgee0.zzc(5);
        zzgee0.zza(zzgji.zzv(arr_b));
        zzgef zzgef0 = (zzgef)zzgee0.zzal();
        zzgfn zzgfn0 = zzgfo.zza();
        zzgfn0.zza(zzfwr0.zzb());
        zzgfn0.zzb(zzgji.zzv(zzfwr0.zzc()));
        switch(zzfwr0.zzd() - 1) {
            case 0: {
                v2 = 3;
                break;
            }
            case 1: {
                break;
            }
            case 2: {
                v2 = 5;
                break;
            }
            default: {
                v2 = 6;
            }
        }
        zzgfn0.zzc(v2);
        zzgfo zzgfo0 = (zzgfo)zzgfn0.zzal();
        zzgdp zzgdp0 = zzgdq.zza();
        zzgdp0.zza(zzgfo0);
        zzgdq zzgdq0 = (zzgdq)zzgdp0.zzal();
        zzgdv zzgdv0 = zzgdw.zzc();
        zzgdv0.zzb(zzgef0);
        zzgdv0.zza(zzgdq0);
        zzgdv0.zzc(v);
        zzgds0.zza(((zzgdw)zzgdv0.zzal()));
        return new zzgaq(((zzgdt)zzgds0.zzal()), v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgar zza() {
        return new H8(zzgdt.class, 9);
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final zzgma zzb(zzgji zzgji0) throws zzglc {
        return zzgdz.zze(zzgji0, zzgkc.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final void zzd(zzgma zzgma0) throws GeneralSecurityException {
        if(((zzgdz)zzgma0).zzg().zzD()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzgim.zzb(((zzgdz)zzgma0).zza(), 0);
        h.j(((zzgdz)zzgma0).zzf().zzc());
    }

    @Override  // com.google.android.gms.internal.ads.zzgas
    public final int zzf() {
        return 4;
    }
}

