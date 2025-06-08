package com.google.android.gms.internal.ads;

public final class zzfwr {
    public final zzgfo a;

    public zzfwr(zzgfo zzgfo0) {
        this.a = zzgfo0;
    }

    public final String zzb() {
        return this.a.zzf();
    }

    public final byte[] zzc() {
        return this.a.zze().zzE();
    }

    public final int zzd() {
        int v = this.a.zzi();
        int v1 = 1;
        if(v - 2 != 1 && v - 2 != 2) {
            v1 = 3;
            switch(v - 2) {
                case 3: {
                    break;
                }
                case 4: {
                    return 4;
                }
                default: {
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return v1;
    }

    public static zzfwr zze(String s, byte[] arr_b, int v) {
        int v1;
        zzgfn zzgfn0 = zzgfo.zza();
        zzgfn0.zza(s);
        zzgfn0.zzb(zzgji.zzv(arr_b));
        switch(v - 1) {
            case 0: {
                v1 = 3;
                break;
            }
            case 1: {
                v1 = 4;
                break;
            }
            default: {
                v1 = 5;
            }
        }
        zzgfn0.zzc(v1);
        return new zzfwr(((zzgfo)zzgfn0.zzal()));
    }
}

