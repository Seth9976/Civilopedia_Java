package com.google.android.gms.internal.ads;

import java.util.Map;

public final class zzdvo implements zzfgg {
    public final Map i;
    public final zzbdm j;

    public zzdvo(zzbdm zzbdm0, Map map0) {
        this.i = map0;
        this.j = zzbdm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffz0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffz0, String s, Throwable throwable0) {
        Map map0 = this.i;
        if(map0.containsKey(zzffz0)) {
            int v = ((zzdvn)map0.get(zzffz0)).zzc;
            this.j.zzc(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffz0, String s) {
        Map map0 = this.i;
        if(map0.containsKey(zzffz0)) {
            int v = ((zzdvn)map0.get(zzffz0)).zza;
            this.j.zzc(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffz0, String s) {
        Map map0 = this.i;
        if(map0.containsKey(zzffz0)) {
            int v = ((zzdvn)map0.get(zzffz0)).zzb;
            this.j.zzc(v);
        }
    }
}

