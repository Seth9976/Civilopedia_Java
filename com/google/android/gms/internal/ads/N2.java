package com.google.android.gms.internal.ads;

import java.util.List;

public final class n2 extends zzbyj {
    public final int i;
    public final List j;

    public n2(List list0, int v) {
        this.i = v;
        this.j = list0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzbyk
    public final void zze(String s) {
        if(this.i != 0) {
            zzcfi.zzg(("Error recording click: " + s));
            return;
        }
        zzcfi.zzg(("Error recording impression urls: " + s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(List list0) {
        if(this.i != 0) {
            zzcfi.zzi(("Recorded click: " + this.j.toString()));
            return;
        }
        zzcfi.zzi(("Recorded impression urls: " + this.j.toString()));
    }
}

