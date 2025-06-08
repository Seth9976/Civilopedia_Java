package com.google.android.gms.internal.ads;

public enum zzbfz implements zzgks {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    public final int i;

    public zzbfz(int v1) {
        this.i = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }

    public final int zza() {
        return this.i;
    }

    public static zzbfz zzb(int v) {
        switch(v) {
            case 0: {
                return zzbfz.zza;
            }
            case 1: {
                return zzbfz.zzb;
            }
            case 2: {
                return zzbfz.zzc;
            }
            case 3: {
                return zzbfz.zzd;
            }
            case 4: {
                return zzbfz.zze;
            }
            case 5: {
                return zzbfz.zzf;
            }
            default: {
                return null;
            }
        }
    }

    public static zzgku zzc() {
        return w0.q;
    }
}

