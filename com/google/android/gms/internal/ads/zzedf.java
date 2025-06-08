package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Set;

public final class zzedf implements zzfgg {
    public final HashMap i;
    public final HashMap j;
    public final zzfgo k;

    public zzedf(Set set0, zzfgo zzfgo0) {
        this.k = zzfgo0;
        this.i = new HashMap();
        this.j = new HashMap();
        for(Object object0: set0) {
            this.i.put(((e5)object0).a, "ttc");
            this.j.put(((e5)object0).b, "ttc");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffz0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffz0, String s, Throwable throwable0) {
        zzfgo zzfgo0 = this.k;
        zzfgo0.zze("task." + s, "f.");
        HashMap hashMap0 = this.j;
        if(hashMap0.containsKey(zzffz0)) {
            zzfgo0.zze("label." + ((String)hashMap0.get(zzffz0)), "f.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffz0, String s) {
        zzfgo zzfgo0 = this.k;
        zzfgo0.zzd("task." + s);
        HashMap hashMap0 = this.i;
        if(hashMap0.containsKey(zzffz0)) {
            zzfgo0.zzd("label." + ((String)hashMap0.get(zzffz0)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffz0, String s) {
        zzfgo zzfgo0 = this.k;
        zzfgo0.zze("task." + s, "s.");
        HashMap hashMap0 = this.j;
        if(hashMap0.containsKey(zzffz0)) {
            zzfgo0.zze("label." + ((String)hashMap0.get(zzffz0)), "s.");
        }
    }
}

