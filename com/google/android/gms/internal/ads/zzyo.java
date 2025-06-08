package com.google.android.gms.internal.ads;

public final class zzyo {
    public final String zza;

    public zzyo(String s) {
        this.zza = s;
    }

    public static zzyo zza(zzdy zzdy0) {
        zzdy0.zzG(2);
        int v = zzdy0.zzk();
        int v1 = zzdy0.zzk() >> 3 | (v & 1) << 5;
        if(v >> 1 != 4 && v >> 1 != 5) {
            switch(v >> 1) {
                case 7: {
                    break;
                }
                case 8: {
                    return v1 >= 10 ? new zzyo("hev1.0" + (v >> 1) + "." + v1) : new zzyo("hev1.0" + (v >> 1) + ".0" + v1);
                }
                case 9: {
                    return v1 >= 10 ? new zzyo("avc3.0" + (v >> 1) + "." + v1) : new zzyo("avc3.0" + (v >> 1) + ".0" + v1);
                }
                default: {
                    return null;
                }
            }
        }
        return v1 >= 10 ? new zzyo("dvhe.0" + (v >> 1) + "." + v1) : new zzyo("dvhe.0" + (v >> 1) + ".0" + v1);
    }
}

