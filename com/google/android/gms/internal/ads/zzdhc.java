package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdhc {
    public final HashMap i;

    public zzdhc(Set set0) {
        this.i = new HashMap();
        this.zzm(set0);
    }

    public final void a(zzdhb zzdhb0) {
        synchronized(this) {
            for(Object object0: this.i.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                ((Executor)((Map.Entry)object0).getValue()).execute(new zzdha(zzdhb0, object1));
            }
        }
    }

    public final void zzg(zzdiz zzdiz0) {
        synchronized(this) {
            this.zzj(zzdiz0.zza, zzdiz0.zzb);
        }
    }

    public final void zzj(Object object0, Executor executor0) {
        synchronized(this) {
            this.i.put(object0, executor0);
        }
    }

    public final void zzm(Set set0) {
        synchronized(this) {
            for(Object object0: set0) {
                this.zzg(((zzdiz)object0));
            }
        }
    }
}

