package com.google.android.gms.internal.ads;

import android.util.Pair;

public final class ya {
    public final Object a;
    public final Object b;
    public final zztq[] c;
    public boolean d;
    public boolean e;
    public za f;
    public boolean g;
    public final boolean[] h;
    public final zzju[] i;
    public final zzvm j;
    public final Ea k;
    public ya l;
    public zzty m;
    public zzvn n;
    public long o;

    public ya(zzju[] arr_zzju, long v, zzvm zzvm0, zzvv zzvv0, Ea ea0, za za0, zzvn zzvn0) {
        this.i = arr_zzju;
        this.o = v;
        this.j = zzvm0;
        this.k = ea0;
        this.b = za0.a.zza;
        this.f = za0;
        this.m = zzty.zza;
        this.n = zzvn0;
        this.c = new zztq[2];
        this.h = new boolean[2];
        ea0.getClass();
        Object object0 = ((Pair)za0.a.zza).first;
        zzsa zzsa0 = za0.a.zzc(((Pair)za0.a.zza).second);
        Da da0 = (Da)ea0.d.get(object0);
        da0.getClass();
        ea0.i.add(da0);
        Ca ca0 = (Ca)ea0.h.get(da0);
        if(ca0 != null) {
            ca0.a.zzk(ca0.b);
        }
        da0.c.add(zzsa0);
        zzrs zzrs0 = da0.a.zzC(zzsa0, zzvv0, za0.b);
        ea0.c.put(zzrs0, da0);
        ea0.i();
        long v1 = za0.d;
        if(v1 != 0x8000000000000001L) {
            zzrs0 = new zzrf(zzrs0, true, 0L, v1);
        }
        this.a = zzrs0;
    }

    public final void a(zzvn zzvn0, long v) {
        this.b(zzvn0, v, false, new boolean[2]);
    }

    public final long b(zzvn zzvn0, long v, boolean z, boolean[] arr_z) {
        zzju[] arr_zzju;
        for(int v1 = 0; true; ++v1) {
            boolean z1 = true;
            if(v1 >= zzvn0.zza) {
                break;
            }
            if(z || !zzvn0.zza(this.n, v1)) {
                z1 = false;
            }
            this.h[v1] = z1;
        }
        for(int v2 = 0; true; ++v2) {
            arr_zzju = this.i;
            if(v2 >= 2) {
                break;
            }
            arr_zzju[v2].zzb();
        }
        this.k();
        this.n = zzvn0;
        if(this.l == null) {
            for(int v3 = 0; v3 < this.n.zza; ++v3) {
                zzvg zzvg0 = this.n.zzc[v3];
            }
        }
        long v4 = ((zzry)this.a).zzf(zzvn0.zzc, this.h, this.c, arr_z, v);
        for(int v5 = 0; v5 < 2; ++v5) {
            arr_zzju[v5].zzb();
        }
        this.e = false;
        for(int v6 = 0; v6 < 2; ++v6) {
            if(this.c[v6] == null) {
                zzcw.zzf(zzvn0.zzc[v6] == null);
            }
            else {
                zzcw.zzf(zzvn0.zzb(v6));
                arr_zzju[v6].zzb();
                this.e = true;
            }
        }
        return v4;
    }

    public final long c() {
        if(!this.d) {
            return this.f.b;
        }
        long v = this.e ? ((zzry)this.a).zzb() : 0x8000000000000000L;
        return v == 0x8000000000000000L ? this.f.e : v;
    }

    public final long d() {
        return this.f.b + this.o;
    }

    public final ya e() {
        return this.l;
    }

    public final zzty f() {
        return this.m;
    }

    public final zzvn g() {
        return this.n;
    }

    public final void h(zzci zzci0) {
        this.d = true;
        zzty zzty0 = ((zzry)this.a).zzh();
        this.m = zzty0;
        zzvn zzvn0 = this.j.zzj(this.i, zzty0, this.f.a, zzci0);
        zzvg[] arr_zzvg = zzvn0.zzc;
        for(int v = 0; v < arr_zzvg.length; ++v) {
            zzvg zzvg0 = arr_zzvg[v];
        }
        long v1 = this.f.b;
        long v2 = this.f.e;
        if(v2 != 0x8000000000000001L && v1 >= v2) {
            v1 = Math.max(0L, v2 - 1L);
        }
        long v3 = this.b(zzvn0, v1, false, new boolean[2]);
        za za0 = this.f;
        this.o = za0.b - v3 + this.o;
        if(v3 != za0.b) {
            za0 = new za(za0.a, v3, za0.c, za0.d, za0.e, za0.f, za0.g, za0.h);
        }
        this.f = za0;
    }

    public final void i() {
        this.k();
        Object object0 = this.a;
        Ea ea0 = this.k;
        try {
            if(object0 instanceof zzrf) {
                ea0.c(((zzrf)object0).zza);
                return;
            }
            ea0.c(((zzry)object0));
            return;
        }
        catch(RuntimeException runtimeException0) {
        }
        zzdn.zza("MediaPeriodHolder", "Period release failed.", runtimeException0);
    }

    public final void j() {
        Object object0 = this.a;
        if(object0 instanceof zzrf) {
            ((zzrf)object0).zzn(0L, (this.f.d == 0x8000000000000001L ? 0x8000000000000000L : this.f.d));
        }
    }

    public final void k() {
        if(this.l == null) {
            for(int v = 0; v < this.n.zza; ++v) {
                zzvg zzvg0 = this.n.zzc[v];
            }
        }
    }
}

