package com.google.android.gms.internal.ads;

import A.f;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

public final class zzo {
    public int a;
    public static final zzl zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final byte[] zze;

    static {
        zzo.zza = zzn.zza;
    }

    public zzo(int v, int v1, int v2, byte[] arr_b) {
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return zzo.class == class0 && this.zzb == ((zzo)object0).zzb && this.zzc == ((zzo)object0).zzc && this.zzd == ((zzo)object0).zzd && Arrays.equals(this.zze, ((zzo)object0).zze);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        if(v == 0) {
            int v1 = Arrays.hashCode(this.zze) + (((this.zzb + 0x20F) * 0x1F + this.zzc) * 0x1F + this.zzd) * 0x1F;
            this.a = v1;
            return v1;
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = f.n("ColorInfo(", this.zzb, ", ", this.zzc, ", ");
        stringBuilder0.append(this.zzd);
        stringBuilder0.append(", ");
        stringBuilder0.append(this.zze != null);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Pure
    public static int zza(int v) {
        switch(v) {
            case 1: {
                return 1;
            }
            case 4: {
                return 2;
            }
            case 9: {
                return 6;
            }
            default: {
                return v == 5 || v == 6 || v == 7 ? 2 : -1;
            }
        }
    }

    @Pure
    public static int zzb(int v) {
        switch(v) {
            case 1: 
            case 6: 
            case 7: {
                return 3;
            }
            case 16: {
                return 6;
            }
            case 18: {
                return 7;
            }
            default: {
                return -1;
            }
        }
    }
}

