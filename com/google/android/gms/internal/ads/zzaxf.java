package com.google.android.gms.internal.ads;

import B.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzaxf implements zzaxb {
    public final zzaxb[] i;
    public final ArrayList j;
    public final zzasd k;
    public zzaxa l;
    public zzase m;
    public int n;
    public zzaxe o;

    public zzaxf(zzaxb[] arr_zzaxb) {
        this.i = arr_zzaxb;
        this.j = new ArrayList(Arrays.asList(arr_zzaxb));
        this.k = new zzasd();
        this.n = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zza() throws IOException {
        zzaxe zzaxe0 = this.o;
        if(zzaxe0 != null) {
            throw zzaxe0;
        }
        zzaxb[] arr_zzaxb = this.i;
        for(int v = 0; v < arr_zzaxb.length; ++v) {
            arr_zzaxb[v].zza();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zzb(zzarj zzarj0, boolean z, zzaxa zzaxa0) {
        this.l = zzaxa0;
        for(int v = 0; true; ++v) {
            zzaxb[] arr_zzaxb = this.i;
            if(v >= arr_zzaxb.length) {
                break;
            }
            arr_zzaxb[v].zzb(zzarj0, false, new k(this, v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zzc(zzawz zzawz0) {
        for(int v = 0; true; ++v) {
            zzaxb[] arr_zzaxb = this.i;
            if(v >= arr_zzaxb.length) {
                break;
            }
            arr_zzaxb[v].zzc(((p1)zzawz0).i[v]);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zzd() {
        zzaxb[] arr_zzaxb = this.i;
        for(int v = 0; v < arr_zzaxb.length; ++v) {
            arr_zzaxb[v].zzd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final zzawz zze(int v, zzaym zzaym0) {
        zzaxb[] arr_zzaxb = this.i;
        zzawz[] arr_zzawz = new zzawz[arr_zzaxb.length];
        for(int v1 = 0; v1 < arr_zzaxb.length; ++v1) {
            arr_zzawz[v1] = arr_zzaxb[v1].zze(v, zzaym0);
        }
        return new p1(arr_zzawz);
    }
}

