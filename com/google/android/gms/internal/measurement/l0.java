package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.b9;

public final class l0 implements s0 {
    public final zzll a;
    public final z0 b;
    public final boolean c;

    public l0(z0 z00, U u0, zzll zzll0) {
        this.b = z00;
        this.c = zzll0 instanceof zzkb;
        this.a = zzll0;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final boolean a(Object object0) {
        U.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void b(Object object0, byte[] arr_b, int v, int v1, b9 b90) {
        if(((zzke)object0).zzc == zzmo.zzc()) {
            ((zzke)object0).zzc = zzmo.a();
        }
        zzkb zzkb0 = (zzkb)object0;
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void c(Object object0, I0 i00) {
        U.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final int d(zzke zzke0) {
        this.b.getClass();
        int v = zzke0.zzc.hashCode();
        if(!this.c) {
            return v;
        }
        U.a(zzke0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void e(zzke zzke0, zzke zzke1) {
        t0.b(this.b, zzke0, zzke1);
        if(!this.c) {
            return;
        }
        U.a(zzke1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final boolean f(zzke zzke0, zzke zzke1) {
        this.b.getClass();
        if(!zzke0.zzc.equals(zzke1.zzc)) {
            return false;
        }
        if(!this.c) {
            return true;
        }
        U.a(zzke0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final int zza(Object object0) {
        this.b.getClass();
        int v = ((zzke)object0).zzc.zzb();
        if(!this.c) {
            return v;
        }
        U.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final Object zze() {
        return this.a.zzbF().zzaG();
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void zzf(Object object0) {
        this.b.getClass();
        ((zzke)object0).zzc.zzf();
        zzkb zzkb0 = (zzkb)object0;
        throw null;
    }
}

