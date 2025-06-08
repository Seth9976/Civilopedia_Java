package com.google.android.gms.internal.ads;

import A.f;
import java.util.UUID;

public final class zzaeq {
    public static UUID zza(byte[] arr_b) {
        zzdy zzdy0 = new zzdy(arr_b);
        if(zzdy0.zzd() >= 0x20) {
            zzdy0.zzF(0);
            if(zzdy0.zze() == zzdy0.zza() + 4 && zzdy0.zze() == 0x70737368) {
                int v = u.a(zzdy0.zze());
                if(v > 1) {
                    f.p(v, "Unsupported pssh version: ", "PsshAtomUtil");
                    return null;
                }
                UUID uUID0 = new UUID(zzdy0.zzr(), zzdy0.zzr());
                if(v == 1) {
                    zzdy0.zzG(zzdy0.zzn() * 16);
                }
                int v1 = zzdy0.zzn();
                if(v1 == zzdy0.zza()) {
                    zzdy0.zzB(new byte[v1], 0, v1);
                    E9 e90 = new E9(uUID0, 2);
                    return e90 == null ? null : ((UUID)e90.j);
                }
            }
        }
        return null;
    }
}

