package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Set;

public final class zzdwk implements zzfgg {
    public final HashMap i;
    public final zzdwc j;
    public final Clock k;
    public final HashMap l;

    public zzdwk(zzdwc zzdwc0, Set set0, Clock clock0) {
        this.j = zzdwc0;
        this.i = new HashMap();
        this.l = new HashMap();
        for(Object object0: set0) {
            this.l.put(((N4)object0).c, ((N4)object0));
        }
        this.k = clock0;
    }

    public final void a(zzffz zzffz0, boolean z) {
        HashMap hashMap0 = this.l;
        zzffz zzffz1 = ((N4)hashMap0.get(zzffz0)).b;
        HashMap hashMap1 = this.i;
        if(hashMap1.containsKey(zzffz1)) {
            long v = this.k.elapsedRealtime();
            long v1 = (long)(((Long)hashMap1.get(zzffz1)));
            String s = "label." + ((N4)hashMap0.get(zzffz0)).a;
            this.j.zza().put(s, (z ? "s." : "f.") + Long.toString(v - v1));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffz0, String s) {
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffz0, String s, Throwable throwable0) {
        HashMap hashMap0 = this.i;
        if(hashMap0.containsKey(zzffz0)) {
            long v = this.k.elapsedRealtime();
            long v1 = (long)(((Long)hashMap0.get(zzffz0)));
            this.j.zza().put("task." + s, "f." + Long.toString(v - v1));
        }
        if(this.l.containsKey(zzffz0)) {
            this.a(zzffz0, false);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffz0, String s) {
        Long long0 = this.k.elapsedRealtime();
        this.i.put(zzffz0, long0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffz0, String s) {
        HashMap hashMap0 = this.i;
        if(hashMap0.containsKey(zzffz0)) {
            long v = this.k.elapsedRealtime();
            long v1 = (long)(((Long)hashMap0.get(zzffz0)));
            this.j.zza().put("task." + s, "s." + Long.toString(v - v1));
        }
        if(this.l.containsKey(zzffz0)) {
            this.a(zzffz0, true);
        }
    }
}

