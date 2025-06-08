package com.google.android.gms.internal.ads;

import android.util.Log;

public final class zzaeu {
    public final boolean zza;
    public final String zzb;
    public final zzzx zzc;
    public final int zzd;
    public final byte[] zze;

    public zzaeu(boolean z, String s, int v, byte[] arr_b, int v1, int v2, byte[] arr_b1) {
        int v3 = 0;
        int v4 = 1;
        zzcw.zzd(((boolean)((v == 0 ? 1 : 0) ^ (arr_b1 == null ? 1 : 0))));
        this.zza = z;
        this.zzb = s;
        this.zzd = v;
        this.zze = arr_b1;
        if(s != null) {
            switch(s) {
                case "cbc1": {
                    v3 = 2;
                    break;
                }
                case "cbcs": {
                    v3 = 3;
                    break;
                }
                case "cenc": {
                    break;
                }
                case "cens": {
                    v3 = 1;
                    break;
                }
                default: {
                    v3 = -1;
                }
            }
            switch(v3) {
                case 0: 
                case 1: {
                    break;
                }
                case 2: 
                case 3: {
                    v4 = 2;
                    break;
                }
                default: {
                    Log.w("TrackEncryptionBox", "Unsupported protection scheme type \'" + s + "\'. Assuming AES-CTR crypto mode.");
                }
            }
        }
        this.zzc = new zzzx(v4, arr_b, v1, v2);
    }
}

