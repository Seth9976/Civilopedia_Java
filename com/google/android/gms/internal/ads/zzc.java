package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class zzc {
    public static final zzl zza;
    public final long zzb;
    public final int zzc;
    public final Uri[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    static {
        zzc.zza = zzb.zza;
    }

    public zzc(int v, int[] arr_v, Uri[] arr_uri, long[] arr_v1) {
        zzcw.zzd(arr_v.length == arr_uri.length);
        this.zzb = 0L;
        this.zzc = v;
        this.zze = arr_v;
        this.zzd = arr_uri;
        this.zzf = arr_v1;
        this.zzg = 0L;
        this.zzh = false;
    }

    public zzc(long v) {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzc.class == class0 && this.zzc == ((zzc)object0).zzc && Arrays.equals(this.zzd, ((zzc)object0).zzd) && Arrays.equals(this.zze, ((zzc)object0).zze) && Arrays.equals(this.zzf, ((zzc)object0).zzf);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.zzd);
        int v1 = Arrays.hashCode(this.zze);
        return (Arrays.hashCode(this.zzf) + (v1 + (this.zzc * 961 + v) * 0x1F) * 0x1F) * 961;
    }

    public final int zza(int v) {
        int v1 = v + 1;
    alab1:
        while(true) {
            int[] arr_v = this.zze;
            if(v1 >= arr_v.length) {
                break;
            }
            switch(arr_v[v1]) {
                case 0: 
                case 1: {
                    break alab1;
                }
                default: {
                    ++v1;
                }
            }
        }
        return v1;
    }

    public final zzc zzb(int v) {
        int v1 = Math.max(0, this.zze.length);
        int[] arr_v = Arrays.copyOf(this.zze, v1);
        Arrays.fill(arr_v, this.zze.length, v1, 0);
        int v2 = Math.max(0, this.zzf.length);
        long[] arr_v1 = Arrays.copyOf(this.zzf, v2);
        Arrays.fill(arr_v1, this.zzf.length, v2, 0x8000000000000001L);
        return new zzc(0, arr_v, ((Uri[])Arrays.copyOf(this.zzd, 0)), arr_v1);
    }
}

