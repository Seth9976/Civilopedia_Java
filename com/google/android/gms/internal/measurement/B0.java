package com.google.android.gms.internal.measurement;

public final class b0 extends c0 {
    @Override  // com.google.android.gms.internal.measurement.c0
    public final void a(long v, Object object0) {
        ((zzkl)F0.c.m(v, object0)).zzb();
    }

    @Override  // com.google.android.gms.internal.measurement.c0
    public final void b(zzke zzke0, zzke zzke1, long v) {
        zzkl zzkl0 = (zzkl)F0.c.m(v, zzke0);
        zzkl zzkl1 = (zzkl)F0.c.m(v, zzke1);
        int v1 = zzkl0.size();
        int v2 = zzkl1.size();
        if(v1 > 0 && v2 > 0) {
            if(!zzkl0.zzc()) {
                zzkl0 = zzkl0.zzd(v2 + v1);
            }
            zzkl0.addAll(zzkl1);
        }
        if(v1 > 0) {
            zzkl1 = zzkl0;
        }
        F0.o(v, zzke0, zzkl1);
    }
}

