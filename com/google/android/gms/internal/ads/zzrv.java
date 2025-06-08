package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class zzrv extends zzrj {
    public final zzsc k;
    public final boolean l;
    public final zzch m;
    public final zzcf n;
    public nb o;
    public zzrs p;
    public boolean q;
    public boolean r;
    public boolean s;

    public zzrv(zzsc zzsc0, boolean z) {
        boolean z1;
        this.k = zzsc0;
        if(z) {
            zzsc0.zzu();
            z1 = true;
        }
        else {
            z1 = false;
        }
        this.l = z1;
        this.m = new zzch();
        this.n = new zzcf();
        zzsc0.zzG();
        this.o = new nb(new zzru(zzsc0.zzz()), zzch.zza, nb.d);
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final zzsa d(Integer integer0, zzsa zzsa0) {
        Void void0 = (Void)integer0;
        Object object0 = zzsa0.zza;
        Object object1 = this.o.c;
        if(object1 != null && object1.equals(object0)) {
            object0 = nb.d;
        }
        return zzsa0.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void e(Object object0, zzsc zzsc0, zzci zzci0) {
        long v1;
        Void void0 = (Void)object0;
        zzsa zzsa0 = null;
        if(this.r) {
            this.o = new nb(zzci0, this.o.b, this.o.c);
            zzrs zzrs0 = this.p;
            if(zzrs0 != null) {
                this.g(zzrs0.zzn());
            }
        }
        else if(zzci0.zzo()) {
            this.o = this.s ? new nb(zzci0, this.o.b, this.o.c) : new nb(zzci0, zzch.zza, nb.d);
        }
        else {
            zzch zzch0 = this.m;
            zzci0.zze(0, zzch0, 0L);
            Object object1 = zzch0.zzc;
            zzrs zzrs1 = this.p;
            if(zzrs1 == null) {
                v1 = 0L;
            }
            else {
                long v = zzrs1.zzq();
                this.o.zzn(zzrs1.zza.zza, this.n);
                this.o.zze(0, zzch0, 0L);
                v1 = v == 0L ? 0L : v;
            }
            Pair pair0 = zzci0.zzl(this.m, this.n, 0, v1);
            Object object2 = pair0.first;
            long v2 = (long)(((Long)pair0.second));
            this.o = this.s ? new nb(zzci0, this.o.b, this.o.c) : new nb(zzci0, object1, object2);
            zzrs zzrs2 = this.p;
            if(zzrs2 != null) {
                this.g(v2);
                Object object3 = this.o.c == null || !zzrs2.zza.zza.equals(nb.d) ? zzrs2.zza.zza : this.o.c;
                zzsa0 = zzrs2.zza.zzc(object3);
            }
        }
        this.s = true;
        this.r = true;
        this.c(this.o);
        if(zzsa0 != null) {
            zzrs zzrs3 = this.p;
            zzrs3.getClass();
            zzrs3.zzr(zzsa0);
        }
    }

    public final void g(long v) {
        zzrs zzrs0 = this.p;
        int v1 = this.o.zza(zzrs0.zza.zza);
        if(v1 == -1) {
            return;
        }
        this.o.zzd(v1, this.n, false);
        long v2 = this.n.zze;
        if(v2 != 0x8000000000000001L && v >= v2) {
            v = Math.max(0L, v2 - 1L);
        }
        zzrs0.zzs(v);
    }

    public final zzci zzA() {
        return this.o;
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzry0) {
        ((zzrs)zzry0).zzt();
        if(zzry0 == this.p) {
            this.p = null;
        }
    }

    public final zzrs zzC(zzsa zzsa0, zzvv zzvv0, long v) {
        zzrs zzrs0 = new zzrs(zzsa0, zzvv0, v, null);
        zzsc zzsc0 = this.k;
        zzrs0.zzu(zzsc0);
        if(this.r) {
            zzrs0.zzr(zzsa0.zzc((this.o.c == null || !zzsa0.zza.equals(nb.d) ? zzsa0.zza : this.o.c)));
            return zzrs0;
        }
        this.p = zzrs0;
        if(!this.q) {
            this.q = true;
            this.f(null, zzsc0);
        }
        return zzrs0;
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final zzry zzD(zzsa zzsa0, zzvv zzvv0, long v) {
        return this.zzC(zzsa0, zzvv0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void zzn(zzfs zzfs0) {
        super.zzn(zzfs0);
        if(!this.l) {
            this.q = true;
            this.f(null, this.k);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void zzq() {
        this.r = false;
        this.q = false;
        super.zzq();
    }

    @Override  // com.google.android.gms.internal.ads.zzrj
    public final void zzw() {
    }

    @Override  // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        return this.k.zzz();
    }
}

