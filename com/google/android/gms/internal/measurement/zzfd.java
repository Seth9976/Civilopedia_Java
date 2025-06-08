package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzfd extends zzka implements zzlm {
    public final int zza() {
        return ((zzfe)this.j).zzb();
    }

    public final zzfc zzb(int v) {
        return ((zzfe)this.j).zzd(v);
    }

    public final zzfd zzc() {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfe.k(((zzfe)this.j));
        return this;
    }

    public final zzfd zzd(int v, zzfb zzfb0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzfe.j(((zzfe)this.j), v, ((zzfc)zzfb0.zzaE()));
        return this;
    }

    // 去混淆评级： 低(20)
    public final String zze() {
        return "";
    }

    public final List zzf() {
        return Collections.unmodifiableList(((zzfe)this.j).zzj());
    }

    public final List zzg() {
        return Collections.unmodifiableList(((zzfe)this.j).zzk());
    }
}

