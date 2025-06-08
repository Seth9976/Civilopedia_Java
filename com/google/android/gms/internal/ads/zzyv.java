package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

public final class zzyv {
    public static int zza(zzys zzys0, byte[] arr_b, int v, int v1) throws IOException {
        int v2;
        for(v2 = 0; v2 < v1; v2 += v3) {
            int v3 = zzys0.zzb(arr_b, v + v2, v1 - v2);
            if(v3 == -1) {
                break;
            }
        }
        return v2;
    }

    @Pure
    public static void zzb(boolean z, String s) throws zzbp {
        if(!z) {
            throw zzbp.zza(s, null);
        }
    }

    public static boolean zzc(zzys zzys0, byte[] arr_b, int v, int v1, boolean z) throws IOException {
        try {
            return zzys0.zzm(arr_b, 0, v1, z);
        }
        catch(EOFException eOFException0) {
            if(!z) {
                throw eOFException0;
            }
            return false;
        }
    }

    public static boolean zzd(zzys zzys0, byte[] arr_b, int v, int v1) throws IOException {
        try {
            ((zzyl)zzys0).zzn(arr_b, v, v1, false);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }

    public static boolean zze(zzys zzys0, int v) throws IOException {
        try {
            ((zzyl)zzys0).zzo(v, false);
            return true;
        }
        catch(EOFException unused_ex) {
            return false;
        }
    }
}

