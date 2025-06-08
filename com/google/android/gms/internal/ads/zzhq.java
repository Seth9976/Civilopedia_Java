package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

public final class zzhq implements Runnable {
    public final ta zza;
    public final zziu zzb;

    public zzhq(ta ta0, zziu zziu0) {
        this.zza = ta0;
        this.zzb = zziu0;
    }

    @Override
    public final void run() {
        boolean z1;
        long v2;
        ta ta0 = this.zza;
        zziu zziu0 = this.zzb;
        int v = ta0.v - zziu0.zzb;
        ta0.v = v;
        boolean z = true;
        if(zziu0.zzc) {
            ta0.w = zziu0.zzd;
            ta0.x = true;
        }
        if(zziu0.zze) {
            ta0.y = zziu0.zzf;
        }
        if(v == 0) {
            zzci zzci0 = zziu0.zza.a;
            if(!ta0.N.a.zzo() && zzci0.zzo()) {
                ta0.O = -1;
                ta0.P = 0L;
            }
            if(!zzci0.zzo()) {
                List list0 = Arrays.asList(((Ga)zzci0).g);
                zzcw.zzf(list0.size() == ta0.m.size());
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    sa sa0 = (sa)ta0.m.get(v1);
                    sa0.b = (zzci)list0.get(v1);
                }
            }
            if(ta0.x) {
                if(zziu0.zza.b.equals(ta0.N.b) && zziu0.zza.d == ta0.N.s) {
                    z = false;
                    v2 = 0x8000000000000001L;
                }
                else if(zzci0.zzo() || zziu0.zza.b.zzb()) {
                    v2 = zziu0.zza.d;
                }
                else {
                    v2 = zziu0.zza.d;
                    zzci0.zzn(zziu0.zza.b.zza, ta0.l);
                }
                z1 = z;
            }
            else {
                v2 = 0x8000000000000001L;
                z1 = false;
            }
            ta0.x = false;
            ta0.l(zziu0.zza, 1, ta0.y, false, z1, ta0.w, v2, -1);
        }
    }
}

