package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

public final class mb implements zzeq {
    public final zzeq a;
    public final int b;
    public final ub c;
    public final byte[] d;
    public int e;

    public mb(zzeq zzeq0, int v, ub ub0) {
        zzcw.zzd(v > 0);
        this.a = zzeq0;
        this.b = v;
        this.c = ub0;
        this.d = new byte[1];
        this.e = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] arr_b, int v, int v1) {
        int v2 = this.e;
        zzeq zzeq0 = this.a;
        if(v2 == 0) {
            byte[] arr_b1 = this.d;
            int v3 = 0;
            if(zzeq0.zza(arr_b1, 0, 1) != -1) {
                int v4 = (arr_b1[0] & 0xFF) << 4;
                if(v4 != 0) {
                    byte[] arr_b2 = new byte[v4];
                    for(int v5 = v4; v5 > 0; v5 -= v6) {
                        int v6 = zzeq0.zza(arr_b2, v3, v5);
                        if(v6 == -1) {
                            return -1;
                        }
                        v3 += v6;
                    }
                    while(v4 > 0 && arr_b2[v4 - 1] == 0) {
                        --v4;
                    }
                    if(v4 > 0) {
                        zzdy zzdy0 = new zzdy(arr_b2, v4);
                        this.c.zza(zzdy0);
                    }
                }
                v2 = this.b;
                this.e = v2;
                goto label_26;
            }
            return -1;
        }
    label_26:
        int v7 = zzeq0.zza(arr_b, v, Math.min(v2, v1));
        if(v7 != -1) {
            this.e -= v7;
        }
        return v7;
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzev0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final Map zze() {
        return this.a.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfs0) {
        zzfs0.getClass();
        this.a.zzf(zzfs0);
    }
}

