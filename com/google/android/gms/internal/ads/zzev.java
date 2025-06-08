package com.google.android.gms.internal.ads;

import android.net.Uri;
import i3.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzev {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbc.zzb("media3.datasource");
    }

    public zzev(Uri uri0, long v, Map map0, long v1, long v2, int v3) {
        long v4 = v + v1;
        boolean z = false;
        zzcw.zzd(v4 >= 0L);
        zzcw.zzd(v1 >= 0L);
        if(v2 > 0L) {
            z = true;
        }
        else if(v2 == -1L) {
            v2 = -1L;
            z = true;
        }
        zzcw.zzd(z);
        this.zza = uri0;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map0));
        this.zzf = v1;
        this.zze = v4;
        this.zzg = v2;
        this.zzh = null;
        this.zzi = v3;
    }

    @Deprecated
    public zzev(Uri uri0, byte[] arr_b, long v, long v1, long v2, String s, int v3) {
        this(uri0, v - v1, Collections.emptyMap(), v1, v2, v3);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DataSpec[");
        stringBuilder0.append("GET");
        stringBuilder0.append(" ");
        stringBuilder0.append(String.valueOf(this.zza));
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzf);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zzg);
        stringBuilder0.append(", null, ");
        return e.g(stringBuilder0, this.zzi, "]");
    }

    public static String zza(int v) [...] // Inlined contents

    public final boolean zzb(int v) {
        return (this.zzi & v) == v;
    }
}

