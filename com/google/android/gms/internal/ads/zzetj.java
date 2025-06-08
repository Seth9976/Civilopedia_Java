package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

public final class zzetj {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final zzfhs d;
    public final zzdwh e;

    public zzetj(Context context0, Executor executor0, Set set0, zzfhs zzfhs0, zzdwh zzdwh0) {
        this.a = context0;
        this.c = executor0;
        this.b = set0;
        this.d = zzfhs0;
        this.e = zzdwh0;
    }

    public final zzfvl zza(Object object0) {
        zzfhh zzfhh0 = zzfhg.zza(this.a, 8);
        zzfhh0.zzf();
        ArrayList arrayList0 = new ArrayList(this.b.size());
        for(Object object1: this.b) {
            zzfvl zzfvl0 = ((zzetg)object1).zzb();
            zzfvl0.zzc(new zzeth(this, ((zzetg)object1)), zzcfv.zzf);
            arrayList0.add(zzfvl0);
        }
        zzfvl zzfvl1 = zzfvc.zzc(arrayList0).zza(new zzeti(arrayList0, object0), this.c);
        if(zzfhu.zza()) {
            zzfhr.zza(zzfvl1, this.d, zzfhh0);
        }
        return zzfvl1;
    }
}

