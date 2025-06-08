package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class zzfjc {
    public final ArrayList a;
    public final ArrayList b;
    public static final zzfjc c;

    static {
        zzfjc.c = new zzfjc();
    }

    public zzfjc() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public static zzfjc zza() {
        return zzfjc.c;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.b);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.a);
    }

    public final void zzd(zzfir zzfir0) {
        this.a.add(zzfir0);
    }

    public final void zze(zzfir zzfir0) {
        boolean z = this.zzg();
        this.a.remove(zzfir0);
        this.b.remove(zzfir0);
        if(z && !this.zzg()) {
            zzfjj.zzb().zzf();
        }
    }

    public final void zzf(zzfir zzfir0) {
        boolean z = this.zzg();
        this.b.add(zzfir0);
        if(!z) {
            zzfjj.zzb().zze();
        }
    }

    public final boolean zzg() {
        return this.b.size() > 0;
    }
}

