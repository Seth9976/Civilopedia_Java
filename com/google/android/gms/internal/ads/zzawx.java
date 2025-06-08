package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

public final class zzawx implements zzaxa, zzaxb {
    public final Uri i;
    public final zzayi j;
    public final zzaty k;
    public final int l;
    public final Handler m;
    public final zzaww n;
    public final zzasc o;
    public final int p;
    public zzaxa q;
    public boolean r;

    public zzawx(Uri uri0, zzayi zzayi0, zzaty zzaty0, int v, Handler handler0, zzaww zzaww0, String s, int v1) {
        this.i = uri0;
        this.j = zzayi0;
        this.k = zzaty0;
        this.l = v;
        this.m = handler0;
        this.n = zzaww0;
        this.p = v1;
        this.o = new zzasc();
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zza() throws IOException {
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zzb(zzarj zzarj0, boolean z, zzaxa zzaxa0) {
        this.q = zzaxa0;
        zzaxa0.zzg(new zzaxo(0x8000000000000001L, false), null);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zzc(zzawz zzawz0) {
        m0 m00 = new m0(2, ((o1)zzawz0), ((o1)zzawz0).q);
        ((o1)zzawz0).p.zzh(m00);
        ((o1)zzawz0).u.removeCallbacksAndMessages(null);
        ((o1)zzawz0).N = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final void zzd() {
        this.q = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzaxb
    public final zzawz zze(int v, zzaym zzaym0) {
        zzayz.zzc(v == 0);
        zzayj zzayj0 = this.j.zza();
        zzatw[] arr_zzatw = this.k.zza();
        return new o1(this.i, zzayj0, arr_zzatw, this.l, this.m, this.n, this, zzaym0, this.p);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxa
    public final void zzg(zzase zzase0, Object object0) {
        boolean z = false;
        zzase0.zzd(0, this.o, false);
        if(this.o.zzc != 0x8000000000000001L) {
            z = true;
        }
        if(this.r && !z) {
            return;
        }
        this.r = z;
        this.q.zzg(zzase0, null);
    }
}

