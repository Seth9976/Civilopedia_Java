package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import i3.e;
import java.io.IOException;

public final class zzgt extends zzbr {
    public final boolean i;
    public static final zzl zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzad zzh;
    public final int zzi;
    public final zzbi zzj;

    static {
        zzgt.zzd = zzgs.zza;
    }

    public zzgt(int v, Exception exception0, int v1) {
        this(v, exception0, v1, null, -1, null, 4, false);
    }

    public zzgt(int v, Throwable throwable0, int v1, String s, int v2, zzad zzad0, int v3, boolean z) {
        String s1;
        switch(v) {
            case 0: {
                s1 = "Source error";
                break;
            }
            case 1: {
                String s2 = zzeg.zzL(v3);
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s);
                stringBuilder0.append(" error, index=");
                stringBuilder0.append(v2);
                stringBuilder0.append(", format=");
                stringBuilder0.append(String.valueOf(zzad0));
                s1 = e.h(stringBuilder0, ", format_supported=", s2);
                break;
            }
            default: {
                s1 = "Unexpected runtime error";
            }
        }
        if(!TextUtils.isEmpty(null)) {
            s1 = s1 + ": null";
        }
        this(s1, throwable0, v1, v, s, v2, zzad0, v3, null, SystemClock.elapsedRealtime(), z);
    }

    public zzgt(String s, Throwable throwable0, int v, int v1, String s1, int v2, zzad zzad0, int v3, zzbi zzbi0, long v4, boolean z) {
        super(s, throwable0, v, v4);
        boolean z2;
        int v5;
        boolean z1 = false;
        if(z) {
            v5 = v1;
            if(v5 == 1) {
                v5 = 1;
                z2 = true;
            }
            else {
                z2 = false;
            }
        }
        else {
            v5 = v1;
            z2 = true;
        }
        zzcw.zzd(z2);
        if(throwable0 != null) {
            z1 = true;
        }
        zzcw.zzd(z1);
        this.zze = v5;
        this.zzf = s1;
        this.zzg = v2;
        this.zzh = zzad0;
        this.zzi = v3;
        this.zzj = zzbi0;
        this.i = z;
    }

    public final zzgt a(zzbi zzbi0) {
        return new zzgt(this.getMessage(), this.getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzbi0, this.zzc, this.i);
    }

    public static zzgt zzb(Throwable throwable0, String s, int v, zzad zzad0, int v1, boolean z, int v2) {
        return zzad0 == null ? new zzgt(1, throwable0, v2, s, v, null, 4, z) : new zzgt(1, throwable0, v2, s, v, zzad0, v1, z);
    }

    public static zzgt zzc(IOException iOException0, int v) {
        return new zzgt(0, iOException0, v);
    }

    public static zzgt zzd(RuntimeException runtimeException0, int v) {
        return new zzgt(2, runtimeException0, v);
    }
}

