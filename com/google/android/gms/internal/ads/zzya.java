package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

public final class zzya {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final float zze;
    public final String zzf;

    public zzya(ArrayList arrayList0, int v, int v1, int v2, float f, String s) {
        this.zza = arrayList0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = f;
        this.zzf = s;
    }

    public static zzya zza(zzdy zzdy0) throws zzbp {
        float f;
        int v9;
        int v8;
        String s;
        try {
            zzdy0.zzG(4);
            int v = zzdy0.zzk();
            int v1 = (v & 3) + 1;
            if(v1 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList0 = new ArrayList();
            int v2 = zzdy0.zzk();
            for(int v3 = 0; v3 < (v2 & 0x1F); ++v3) {
                int v4 = zzdy0.zzo();
                zzdy0.zzG(v4);
                arrayList0.add(zzcy.zzc(zzdy0.zzH(), zzdy0.zzc(), v4));
            }
            int v5 = zzdy0.zzk();
            for(int v6 = 0; v6 < v5; ++v6) {
                int v7 = zzdy0.zzo();
                zzdy0.zzG(v7);
                arrayList0.add(zzcy.zzc(zzdy0.zzH(), zzdy0.zzc(), v7));
            }
            if((v2 & 0x1F) > 0) {
                byte[] arr_b = (byte[])arrayList0.get(0);
                zzzn zzzn0 = zzzo.zzd(((byte[])arrayList0.get(0)), (v & 3) + 2, arr_b.length);
                s = zzcy.zza(zzzn0.zza, zzzn0.zzb, zzzn0.zzc);
                v8 = zzzn0.zze;
                v9 = zzzn0.zzf;
                f = zzzn0.zzg;
            }
            else {
                s = null;
                v8 = -1;
                v9 = -1;
                f = 1.0f;
            }
            return new zzya(arrayList0, v1, v8, v9, f, s);
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException0) {
        }
        throw zzbp.zza("Error parsing AVC config", arrayIndexOutOfBoundsException0);
    }
}

