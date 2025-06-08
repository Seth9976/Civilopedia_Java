package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public abstract class zzek implements zzeq {
    public final boolean a;
    public final ArrayList b;
    public int c;
    public zzev d;

    public zzek(boolean z) {
        this.a = z;
        this.b = new ArrayList(1);
    }

    public final void a() {
        zzev zzev0 = this.d;
        for(int v = 0; v < this.c; ++v) {
            ((zzfs)this.b.get(v)).zzb(this, zzev0, this.a);
        }
        this.d = null;
    }

    public final void b(zzev zzev0) {
        for(int v = 0; v < this.c; ++v) {
            ((zzfs)this.b.get(v)).zzc(this, zzev0, this.a);
        }
    }

    public final void c(zzev zzev0) {
        this.d = zzev0;
        for(int v = 0; v < this.c; ++v) {
            ((zzfs)this.b.get(v)).zzd(this, zzev0, this.a);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public Map zze() {
        return Collections.emptyMap();
    }

    @Override  // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfs0) {
        zzfs0.getClass();
        ArrayList arrayList0 = this.b;
        if(!arrayList0.contains(zzfs0)) {
            arrayList0.add(zzfs0);
            ++this.c;
        }
    }

    public final void zzg(int v) {
        zzev zzev0 = this.d;
        for(int v1 = 0; v1 < this.c; ++v1) {
            ((zzfs)this.b.get(v1)).zza(this, zzev0, this.a, v);
        }
    }
}

