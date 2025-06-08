package com.google.android.gms.internal.ads;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class xa implements Handler.Callback, zzgq, zzjl, zzjo, zzrx, zzvl {
    public zzjw A;
    public Fa B;
    public zziu C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public wa O;
    public long P;
    public int Q;
    public boolean R;
    public zzgt S;
    public long T;
    public final zzhp U;
    public final zzgo V;
    public final zzjt[] i;
    public final Set j;
    public final zzju[] k;
    public final zzvm l;
    public final zzvn m;
    public final zzja n;
    public final zzvy o;
    public final zzdg p;
    public final HandlerThread q;
    public final Looper r;
    public final zzch s;
    public final zzcf t;
    public final long u;
    public final oa v;
    public final ArrayList w;
    public final zzcx x;
    public final Aa y;
    public final Ea z;

    public xa(zzjt[] arr_zzjt, zzvm zzvm0, zzvn zzvn0, zzja zzja0, zzvy zzvy0, zzkh zzkh0, zzjw zzjw0, zzgo zzgo0, Looper looper0, zzcx zzcx0, zzhp zzhp0, zzmu zzmu0) {
        this.U = zzhp0;
        this.i = arr_zzjt;
        this.l = zzvm0;
        this.m = zzvn0;
        this.n = zzja0;
        this.o = zzvy0;
        this.I = 0;
        this.J = false;
        this.A = zzjw0;
        this.V = zzgo0;
        this.E = false;
        this.x = zzcx0;
        this.T = 0x8000000000000001L;
        this.u = zzja0.zza();
        zzja0.zzf();
        Fa fa0 = Fa.h(zzvn0);
        this.B = fa0;
        this.C = new zziu(fa0);
        this.k = new zzju[2];
        for(int v = 0; v < 2; ++v) {
            arr_zzjt[v].zzq(v, zzmu0);
            this.k[v] = arr_zzjt[v].zzj();
        }
        this.v = new oa(this, zzcx0);
        this.w = new ArrayList();
        this.j = Collections.newSetFromMap(new IdentityHashMap());
        this.s = new zzch();
        this.t = new zzcf();
        zzvm0.zzm(this, zzvy0);
        this.R = true;
        Handler handler0 = new Handler(looper0);
        this.y = new Aa(zzkh0, handler0);
        this.z = new Ea(this, zzkh0, handler0, zzmu0);
        HandlerThread handlerThread0 = new HandlerThread("ExoPlayer:Playback", -16);
        this.q = handlerThread0;
        handlerThread0.start();
        Looper looper1 = handlerThread0.getLooper();
        this.r = looper1;
        this.p = zzcx0.zzb(looper1, this);
    }

    public final boolean A() {
        return this.B.l && this.B.m == 0;
    }

    public final boolean B(zzci zzci0, zzsa zzsa0) {
        if(!zzsa0.zzb() && !zzci0.zzo()) {
            zzci0.zze(zzci0.zzn(zzsa0.zza, this.t).zzd, this.s, 0L);
            return this.s.zzb() && this.s.zzi && this.s.zzf != 0x8000000000000001L;
        }
        return false;
    }

    public static final void C(zzjq zzjq0) {
        try {
            zzjq0.zzc().zzp(zzjq0.zza(), zzjq0.zzg());
        }
        finally {
            zzjq0.zzh(true);
        }
    }

    public static Object D(zzch zzch0, zzcf zzcf0, int v, boolean z, Object object0, zzci zzci0, zzci zzci1) {
        int v1 = zzci0.zza(object0);
        int v2 = zzci0.zzb();
        int v4 = v1;
        int v5 = -1;
        for(int v3 = 0; v3 < v2 && v5 == -1; ++v3) {
            v4 = zzci0.zzi(v4, zzcf0, zzch0, v, z);
            if(v4 == -1) {
                return null;
            }
            v5 = zzci1.zza(zzci0.zzf(v4));
        }
        return v5 == -1 ? null : zzci1.zzf(v5);
    }

    public final long E(zzci zzci0, Object object0, long v) {
        zzci0.zze(zzci0.zzn(object0, this.t).zzd, this.s, 0L);
        return this.s.zzf == 0x8000000000000001L || !this.s.zzb() || !this.s.zzi ? 0x8000000000000001L : zzeg.zzv(zzeg.zzt(this.s.zzg) - this.s.zzf) - v;
    }

    public final long F(zzsa zzsa0, long v, boolean z, boolean z1) {
        ya ya2;
        long v1 = v;
        this.s();
        this.G = false;
        if(z1 || this.B.e == 3) {
            this.p(2);
        }
        Aa aa0 = this.y;
        ya ya0 = aa0.h;
        ya ya1;
        for(ya1 = ya0; ya1 != null && !zzsa0.equals(ya1.f.a); ya1 = ya1.l) {
        }
        if(z || ya0 != ya1 || ya1 != null && ya1.o + v1 < 0L) {
            zzjt[] arr_zzjt = this.i;
            for(int v2 = 0; v2 < 2; ++v2) {
                this.a(arr_zzjt[v2]);
            }
            if(ya1 != null) {
                while(aa0.h != ya1) {
                    aa0.c();
                }
                aa0.k(ya1);
                ya1.o = 1000000000000L;
                this.b(new boolean[2]);
            }
        }
        if(ya1 == null) {
            aa0.j();
            this.k(v1);
        }
        else {
            aa0.k(ya1);
            if(!ya1.d) {
                za za0 = ya1.f;
                if(v1 == za0.b) {
                    ya2 = ya1;
                }
                else {
                    ya2 = ya1;
                    za0 = new za(za0.a, v, za0.c, za0.d, za0.e, za0.f, za0.g, za0.h);
                }
                ya2.f = za0;
            }
            else if(ya1.e) {
                long v3 = ((zzry)ya1.a).zze(v1);
                ((zzry)ya1.a).zzj(v3 - this.u, false);
                v1 = v3;
            }
            this.k(v1);
            this.g();
        }
        this.d(false);
        this.p.zzh(2);
        return v1;
    }

    public final Pair G(zzci zzci0) {
        if(zzci0.zzo()) {
            return Pair.create(Fa.t, 0L);
        }
        int v = zzci0.zzg(this.J);
        Pair pair0 = zzci0.zzl(this.s, this.t, v, 0x8000000000000001L);
        zzsa zzsa0 = this.y.i(zzci0, pair0.first, 0L);
        long v1 = (long)(((Long)pair0.second));
        if(zzsa0.zzb()) {
            zzci0.zzn(zzsa0.zza, this.t);
            return Pair.create(zzsa0, 0L);
        }
        return Pair.create(zzsa0, v1);
    }

    public static Pair H(zzci zzci0, wa wa0, int v, boolean z, zzch zzch0, zzcf zzcf0) {
        Pair pair0;
        zzci zzci1 = wa0.a;
        if(zzci0.zzo()) {
            return null;
        }
        zzci zzci2 = zzci1.zzo() ? zzci0 : zzci1;
        try {
            pair0 = zzci2.zzl(zzch0, zzcf0, wa0.b, wa0.c);
        }
        catch(IndexOutOfBoundsException unused_ex) {
            return null;
        }
        if(zzci0.equals(zzci2)) {
            return pair0;
        }
        if(zzci0.zza(pair0.first) != -1) {
            return !zzci2.zzn(pair0.first, zzcf0).zzg || zzci2.zze(zzcf0.zzd, zzch0, 0L).zzo != zzci2.zza(pair0.first) ? pair0 : zzci0.zzl(zzch0, zzcf0, zzci0.zzn(pair0.first, zzcf0).zzd, wa0.c);
        }
        Object object0 = xa.D(zzch0, zzcf0, v, z, pair0.first, zzci2, zzci0);
        return object0 == null ? null : zzci0.zzl(zzch0, zzcf0, zzci0.zzn(object0, zzcf0).zzd, 0x8000000000000001L);
    }

    public final Fa I(zzsa zzsa0, long v, long v1, long v2, boolean z, int v3) {
        zzvn zzvn3;
        zzty zzty3;
        List list1;
        zzvn zzvn2;
        zzty zzty2;
        this.R = this.R || v != this.B.s || !zzsa0.equals(this.B.b);
        this.j();
        Fa fa0 = this.B;
        zzty zzty0 = fa0.h;
        zzvn zzvn0 = fa0.i;
        List list0 = fa0.j;
        if(this.z.j) {
            ya ya0 = this.y.h;
            zzty zzty1 = ya0 == null ? zzty.zza : ya0.m;
            zzvn zzvn1 = ya0 == null ? this.m : ya0.n;
            zzvg[] arr_zzvg = zzvn1.zzc;
            zzfrg zzfrg0 = new zzfrg();
            boolean z1 = false;
            for(int v4 = 0; v4 < arr_zzvg.length; ++v4) {
                zzvg zzvg0 = arr_zzvg[v4];
                if(zzvg0 != null) {
                    zzbl zzbl0 = zzvg0.zzd(0).zzk;
                    if(zzbl0 == null) {
                        zzfrg0.zze(new zzbl(new zzbk[0]));
                    }
                    else {
                        zzfrg0.zze(zzbl0);
                        z1 = true;
                    }
                }
            }
            zzfrj zzfrj0 = z1 ? zzfrg0.zzg() : zzfrj.zzo();
            if(ya0 == null) {
                zzty2 = zzty1;
                zzvn2 = zzvn1;
            }
            else {
                za za0 = ya0.f;
                long v5 = za0.c;
                if(v5 == v1) {
                    zzty2 = zzty1;
                    zzvn2 = zzvn1;
                }
                else {
                    if(v1 == v5) {
                        zzty2 = zzty1;
                        zzvn2 = zzvn1;
                    }
                    else {
                        zzty2 = zzty1;
                        zzvn2 = zzvn1;
                        za0 = new za(za0.a, za0.b, v1, za0.d, za0.e, za0.f, za0.g, za0.h);
                    }
                    ya0.f = za0;
                }
            }
            list1 = zzfrj0;
            zzty3 = zzty2;
            zzvn3 = zzvn2;
        }
        else if(zzsa0.equals(fa0.b)) {
            zzty3 = zzty0;
            zzvn3 = zzvn0;
            list1 = list0;
        }
        else {
            zzty3 = zzty.zza;
            zzvn3 = this.m;
            list1 = zzfrj.zzo();
        }
        if(z) {
            this.C.zzd(v3);
        }
        Fa fa1 = this.B;
        ya ya1 = this.y.j;
        return ya1 == null ? fa1.b(zzsa0, v, v1, v2, 0L, zzty3, zzvn3, list1) : fa1.b(zzsa0, v, v1, v2, Math.max(0L, fa1.q - (this.P - ya1.o)), zzty3, zzvn3, list1);
    }

    public final void a(zzjt zzjt0) {
        if(!xa.y(zzjt0)) {
            return;
        }
        oa oa0 = this.v;
        if(zzjt0 == oa0.k) {
            oa0.l = null;
            oa0.k = null;
            oa0.m = true;
        }
        if(zzjt0.zzbe() == 2) {
            zzjt0.zzF();
        }
        zzjt0.zzn();
        --this.N;
    }

    public final void b(boolean[] arr_z) {
        Set set0;
        zzjt[] arr_zzjt;
        Aa aa0 = this.y;
        ya ya0 = aa0.i;
        zzvn zzvn0 = ya0.n;
        for(int v = 0; true; ++v) {
            arr_zzjt = this.i;
            set0 = this.j;
            if(v >= 2) {
                break;
            }
            if(!zzvn0.zzb(v) && set0.remove(arr_zzjt[v])) {
                arr_zzjt[v].zzA();
            }
        }
        for(int v1 = 0; v1 < 2; ++v1) {
            if(zzvn0.zzb(v1)) {
                boolean z = arr_z[v1];
                zzjt zzjt0 = arr_zzjt[v1];
                if(!xa.y(zzjt0)) {
                    ya ya1 = aa0.i;
                    boolean z1 = ya1 == aa0.h;
                    zzvn zzvn1 = ya1.n;
                    zzjv zzjv0 = zzvn1.zzb[v1];
                    zzvg zzvg0 = zzvn1.zzc[v1];
                    int v2 = zzvg0 == null ? 0 : zzvg0.zzc();
                    zzad[] arr_zzad = new zzad[v2];
                    for(int v3 = 0; v3 < v2; ++v3) {
                        arr_zzad[v3] = zzvg0.zzd(v3);
                    }
                    boolean z2 = this.A() && this.B.e == 3;
                    ++this.N;
                    set0.add(zzjt0);
                    zzjt0.zzo(zzjv0, arr_zzad, ya1.c[v1], this.P, !z && z2, z1, ya1.d(), ya1.o);
                    zzjt0.zzp(11, new ua(this));
                    oa oa0 = this.v;
                    oa0.getClass();
                    zzjb zzjb0 = zzjt0.zzi();
                    if(zzjb0 != null) {
                        zzjb zzjb1 = oa0.l;
                        if(zzjb0 != zzjb1) {
                            if(zzjb1 != null) {
                                throw zzgt.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                            }
                            oa0.l = zzjb0;
                            oa0.k = zzjt0;
                            zzjb0.zzg(oa0.i.zzc());
                        }
                    }
                    if(z2) {
                        zzjt0.zzE();
                    }
                }
            }
        }
        ya0.g = true;
    }

    public final void c(IOException iOException0, int v) {
        zzgt zzgt0 = zzgt.zzc(iOException0, v);
        ya ya0 = this.y.h;
        if(ya0 != null) {
            zzgt0 = zzgt0.a(ya0.f.a);
        }
        zzdn.zza("ExoPlayerImplInternal", "Playback error", zzgt0);
        this.r(false, false);
        this.B = this.B.e(zzgt0);
    }

    public final void d(boolean z) {
        ya ya0 = this.y.j;
        zzsa zzsa0 = ya0 == null ? this.B.b : ya0.f.a;
        boolean z1 = this.B.k.equals(zzsa0);
        if(!z1) {
            this.B = this.B.a(zzsa0);
        }
        Fa fa0 = this.B;
        fa0.q = ya0 == null ? fa0.s : ya0.c();
        ya ya1 = this.y.j;
        this.B.r = ya1 == null ? 0L : Math.max(0L, this.B.q - (this.P - ya1.o));
        if((!z1 || z) && ya0 != null && ya0.d) {
            this.n.zze(this.i, ya0.m, ya0.n.zzc);
        }
    }

    public final void e(zzci zzci0, boolean z) {
        int v25;
        zzjt zzjt0;
        long v22;
        int v23;
        long v21;
        long v16;
        int v12;
        zzsa zzsa2;
        Object object1;
        boolean z5;
        int v11;
        int v10;
        boolean z4;
        int v9;
        int v8;
        long v7;
        int v6;
        int v15;
        int v14;
        int v13;
        long v4;
        int v3;
        boolean z2;
        int v2;
        zzsa zzsa0;
        Fa fa0 = this.B;
        wa wa0 = this.O;
        Aa aa0 = this.y;
        int v = this.I;
        boolean z1 = this.J;
        zzch zzch0 = this.s;
        zzcf zzcf0 = this.t;
        long v1 = 0x8000000000000001L;
        if(zzci0.zzo()) {
            zzsa0 = Fa.t;
            v2 = 1;
            z2 = false;
            v3 = 0;
            v4 = 0L;
        }
        else {
            zzsa zzsa1 = fa0.b;
            Object object0 = zzsa1.zza;
            boolean z3 = fa0.a.zzo() || fa0.a.zzn(zzsa1.zza, zzcf0).zzg;
            long v5 = fa0.b.zzb() || z3 ? fa0.c : fa0.s;
            if(wa0 == null) {
                if(fa0.a.zzo()) {
                    v13 = zzci0.zzg(z1);
                    goto label_65;
                }
                else if(zzci0.zza(object0) == -1) {
                    Object object2 = xa.D(zzch0, zzcf0, v, z1, object0, fa0.a, zzci0);
                    if(object2 == null) {
                        v14 = zzci0.zzg(z1);
                        v15 = 1;
                    }
                    else {
                        v14 = zzci0.zzn(object2, zzcf0).zzd;
                        v15 = 0;
                    }
                    v6 = v14;
                    v11 = v15;
                    object1 = object0;
                    v7 = v5;
                    zzsa2 = zzsa1;
                    goto label_70;
                }
                else if(v5 == 0x8000000000000001L) {
                    v13 = zzci0.zzn(object0, zzcf0).zzd;
                label_65:
                    v6 = v13;
                    object1 = object0;
                    v7 = v5;
                    zzsa2 = zzsa1;
                    v11 = 0;
                label_70:
                    v12 = 0;
                }
                else if(z3) {
                    zzsa2 = zzsa1;
                    fa0.a.zzn(zzsa2.zza, zzcf0);
                    if(fa0.a.zze(zzcf0.zzd, zzch0, 0L).zzo == fa0.a.zza(zzsa2.zza)) {
                        Pair pair1 = zzci0.zzl(zzch0, zzcf0, zzci0.zzn(object0, zzcf0).zzd, v5);
                        object0 = pair1.first;
                        v7 = (long)(((Long)pair1.second));
                    }
                    else {
                        v7 = v5;
                    }
                    object1 = object0;
                    v6 = -1;
                    v11 = 0;
                    v12 = 1;
                }
                else {
                    zzsa2 = zzsa1;
                    object1 = object0;
                    v7 = v5;
                    v6 = -1;
                    v11 = 0;
                    v12 = 0;
                }
                z5 = false;
            }
            else {
                Pair pair0 = xa.H(zzci0, wa0, v, z1, zzch0, zzcf0);
                if(pair0 == null) {
                    v6 = zzci0.zzg(z1);
                    v7 = v5;
                    v8 = 1;
                    v9 = 0;
                    z4 = false;
                }
                else {
                    if(wa0.c == 0x8000000000000001L) {
                        v6 = zzci0.zzn(pair0.first, zzcf0).zzd;
                        v7 = v5;
                        v10 = 0;
                    }
                    else {
                        object0 = pair0.first;
                        v7 = (long)(((Long)pair0.second));
                        v10 = 1;
                        v6 = -1;
                    }
                    z4 = fa0.e == 4;
                    v9 = v10;
                    v8 = 0;
                }
                v11 = v8;
                z5 = z4;
                object1 = object0;
                zzsa2 = zzsa1;
                v12 = v9;
            }
            if(v6 == -1) {
                v16 = v7;
            }
            else {
                Pair pair2 = zzci0.zzl(zzch0, zzcf0, v6, 0x8000000000000001L);
                object1 = pair2.first;
                v16 = (long)(((Long)pair2.second));
                v7 = 0x8000000000000001L;
            }
            zzsa zzsa3 = aa0.i(zzci0, object1, v16);
            int v17 = !zzsa2.zza.equals(object1) || zzsa2.zzb() || zzsa3.zzb() || zzsa3.zze != -1 && (zzsa2.zze == -1 || zzsa3.zze < zzsa2.zze) ? 0 : 1;
            zzci0.zzn(object1, zzcf0);
            if(!z3 && v5 == v7 && zzsa2.zza.equals(zzsa3.zza)) {
                boolean z6 = !zzsa2.zzb();
                boolean z7 = !zzsa3.zzb();
            }
            if(1 == v17) {
                zzsa3 = zzsa2;
            }
            if(zzsa3.zzb()) {
                if(zzsa3.equals(zzsa2)) {
                    v16 = fa0.s;
                }
                else {
                    zzci0.zzn(zzsa3.zza, zzcf0);
                    v16 = 0L;
                }
            }
            v1 = v7;
            zzsa0 = zzsa3;
            v2 = v11;
            v3 = v12;
            v4 = v16;
            z2 = z5;
        }
        int v18 = this.B.b.equals(zzsa0) && v4 == this.B.s ? 0 : 1;
        int v19 = 3;
        try {
            if(v2 != 0) {
                if(this.B.e != 1) {
                    this.p(4);
                }
                this.i(false, false, false, true);
            }
            if(v18 == 0) {
                Aa aa1 = this.y;
                long v20 = this.P;
                ya ya0 = aa1.i;
                if(ya0 == null) {
                    goto label_152;
                }
                else {
                    v21 = ya0.o;
                    if(ya0.d) {
                        v23 = 0;
                        while(true) {
                        label_136:
                            zzjt[] arr_zzjt = this.i;
                            v22 = v1;
                            goto label_138;
                        }
                    }
                    else {
                        v22 = v1;
                    }
                }
                goto label_154;
            }
            else {
                goto label_163;
            }
            goto label_194;
        }
        catch(Throwable throwable0) {
            v22 = v1;
            v25 = v18;
            goto label_176;
        }
        try {
        label_138:
            if(v23 >= 2) {
                goto label_154;
            }
            if(xa.y(arr_zzjt[v23]) && this.i[v23].zzm() == ya0.c[v23]) {
                zzjt0 = this.i[v23];
                goto label_141;
            }
            ++v23;
            v1 = v22;
            goto label_136;
        }
        catch(Throwable throwable0) {
            v25 = 0;
            goto label_176;
        }
        try {
        label_141:
            long v24 = zzjt0.zzf();
            if(v24 == 0x8000000000000000L) {
                v21 = 0x8000000000000000L;
                goto label_160;
            }
            v21 = Math.max(v24, v21);
        }
        catch(Throwable throwable0) {
            goto label_176;
        }
        try {
            ++v23;
            v1 = v22;
            goto label_136;
        }
        catch(Throwable throwable0) {
            v25 = 0;
            goto label_176;
        }
        try {
        label_152:
            v22 = v1;
            v21 = 0L;
        label_154:
            v25 = 0;
        }
        catch(Throwable throwable0) {
            v22 = v1;
            v25 = v18;
            goto label_176;
        }
        try {
        label_160:
            if(!aa1.m(zzci0, v20, v21)) {
                this.m(false);
                goto label_194;
            label_163:
                v22 = v1;
                v25 = v18;
                if(!zzci0.zzo()) {
                    for(ya ya1 = this.y.h; ya1 != null; ya1 = ya1.l) {
                        if(ya1.f.a.equals(zzsa0)) {
                            ya1.f = this.y.h(zzci0, ya1.f);
                            ya1.j();
                        }
                    }
                    v4 = this.F(zzsa0, v4, this.y.h != this.y.i, z2);
                }
            }
            goto label_194;
        }
        catch(Throwable throwable0) {
        }
    label_176:
        boolean z8 = true;
        this.v(zzci0, zzsa0, this.B.a, this.B.b, (1 == v3 ? v4 : 0x8000000000000001L));
        if(v25 != 0 || v22 != this.B.c) {
            Object object3 = this.B.b.zza;
            zzci zzci1 = this.B.a;
            if(v25 == 0 || !z || zzci1.zzo() || zzci1.zzn(object3, this.t).zzg) {
                z8 = false;
            }
            long v26 = this.B.d;
            if(zzci0.zza(object3) == -1) {
                v19 = 4;
            }
            this.B = this.I(zzsa0, v4, v22, v26, z8, v19);
        }
        this.j();
        this.l(zzci0, this.B.a);
        this.B = this.B.g(zzci0);
        if(!zzci0.zzo()) {
            this.O = null;
        }
        this.d(false);
        throw throwable0;
    label_194:
        this.v(zzci0, zzsa0, this.B.a, this.B.b, (1 == v3 ? v4 : 0x8000000000000001L));
        if(v25 != 0 || v22 != this.B.c) {
            Object object4 = this.B.b.zza;
            zzci zzci2 = this.B.a;
            boolean z9 = v25 != 0 && z && !zzci2.zzo() && !zzci2.zzn(object4, this.t).zzg;
            long v27 = this.B.d;
            if(zzci0.zza(object4) == -1) {
                v19 = 4;
            }
            this.B = this.I(zzsa0, v4, v22, v27, z9, v19);
        }
        this.j();
        this.l(zzci0, this.B.a);
        this.B = this.B.g(zzci0);
        if(!zzci0.zzo()) {
            this.O = null;
        }
        this.d(false);
    }

    public final void f(zzbt zzbt0, float f, boolean z, boolean z1) {
        int v;
        if(z) {
            if(z1) {
                this.C.zza(1);
            }
            new Fa(this.B.a, this.B.b, this.B.c, this.B.d, this.B.e, this.B.f, this.B.g, this.B.h, this.B.i, this.B.j, this.B.k, this.B.l, this.B.m, zzbt0, this.B.q, this.B.r, this.B.s, this.B.o, this.B.p);
            this.B = null;
        }
        for(ya ya0 = this.y.h; true; ya0 = ya0.l) {
            v = 0;
            if(ya0 == null) {
                break;
            }
            zzvg[] arr_zzvg = ya0.n.zzc;
            while(v < arr_zzvg.length) {
                zzvg zzvg0 = arr_zzvg[v];
                ++v;
            }
        }
        zzjt[] arr_zzjt = this.i;
        while(v < 2) {
            zzjt zzjt0 = arr_zzjt[v];
            if(zzjt0 != null) {
                zzjt0.zzD(f, zzbt0.zzc);
            }
            ++v;
        }
    }

    public final void g() {
        boolean z2;
        long v3;
        long v2;
        boolean z = this.x();
        boolean z1 = false;
        Aa aa0 = this.y;
        if(z) {
            ya ya0 = aa0.j;
            long v = 0L;
            long v1 = ya0.d ? ((zzry)ya0.a).zzc() : 0L;
            ya ya1 = aa0.j;
            if(ya1 != null) {
                v = Math.max(0L, v1 - (this.P - ya1.o));
            }
            if(ya0 == aa0.h) {
                v2 = this.P;
                v3 = ya0.o;
            }
            else {
                v2 = this.P - ya0.o;
                v3 = ya0.f.b;
            }
            zzbt zzbt0 = this.v.zzc();
            z2 = this.n.zzg(v2 - v3, v, zzbt0.zzc);
        }
        else {
            z2 = false;
        }
        this.H = z2;
        if(z2) {
            ya ya2 = aa0.j;
            long v4 = this.P;
            if(ya2.l == null) {
                z1 = true;
            }
            zzcw.zzf(z1);
            ((zzry)ya2.a).zzo(v4 - ya2.o);
        }
        this.t();
    }

    public final void h() {
        this.C.zzc(this.B);
        zziu zziu0 = this.C;
        if(zziu0.a) {
            this.U.zza.getClass();
            zzhq zzhq0 = new zzhq(this.U.zza, zziu0);
            this.U.zza.h.zzg(zzhq0);
            this.C = new zziu(this.B);
        }
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        int v37;
        zzgt zzgt1;
        zzpa zzpa1;
        zzbp zzbp1;
        zzer zzer1;
        zzrc zzrc1;
        IOException iOException1;
        RuntimeException runtimeException1;
        Throwable throwable2;
        Fa fa4;
        long v25;
        Fa fa3;
        int v18;
        int v19;
        boolean z5;
        boolean z4;
        int v23;
        long v22;
        zzsa zzsa3;
        long v20;
        wa wa0;
        int v10;
        zzvn zzvn1;
        zzvn zzvn0;
        ya ya2;
        long v1;
        try {
            try {
                switch(message0.what) {
                    case 0: {
                        goto label_17;
                    }
                    case 1: {
                        goto label_24;
                    }
                    case 2: {
                        goto label_26;
                    }
                    case 3: {
                        goto label_281;
                    }
                    case 4: {
                        goto label_344;
                    }
                    case 5: {
                        this.A = (zzjw)message0.obj;
                        goto label_576;
                    }
                    case 6: {
                        goto label_350;
                    }
                    case 7: {
                        this.i(true, false, true, false);
                        this.n.zzc();
                        this.p(1);
                        this.q.quit();
                        synchronized(this) {
                            this.D = true;
                            this.notifyAll();
                            return true;
                        }
                    }
                    case 8: {
                        goto label_352;
                    }
                    case 9: {
                        goto label_363;
                    }
                    case 10: {
                        goto label_372;
                    }
                    case 11: {
                        goto label_430;
                    }
                    case 12: {
                        goto label_435;
                    }
                    case 13: {
                        goto label_440;
                    }
                    case 14: {
                        goto label_462;
                    }
                    case 15: {
                        goto label_464;
                    }
                    case 16: {
                        goto label_472;
                    }
                    case 17: {
                        goto label_474;
                    }
                    case 18: {
                        goto label_480;
                    }
                    case 19: {
                        u9.q(message0.obj);
                        this.C.zza(1);
                        break;
                    }
                    case 20: {
                        goto label_488;
                    }
                    case 21: {
                        goto label_494;
                    }
                    case 22: {
                        goto label_498;
                    }
                    case 23: {
                        goto label_500;
                    }
                    case 24: {
                        goto label_506;
                    }
                    case 25: {
                        goto label_515;
                    }
                    default: {
                        return false;
                    }
                }
            }
            catch(zzgt zzgt0) {
                goto label_536;
            }
            catch(zzpa zzpa0) {
                zzpa1 = zzpa0;
                goto label_555;
            }
            catch(zzbp zzbp0) {
                zzbp1 = zzbp0;
                goto label_557;
            }
            catch(zzer zzer0) {
                zzer1 = zzer0;
                goto label_566;
            }
            catch(zzrc zzrc0) {
                zzrc1 = zzrc0;
                goto label_568;
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                goto label_570;
            }
            throw null;
            try {
            label_17:
                this.C.zza(1);
                this.i(false, false, false, true);
                this.n.zzb();
                this.p((this.B.a.zzo() ? 4 : 2));
                this.z.b(this.o);
                this.p.zzh(2);
                goto label_576;
            label_24:
                this.o(message0.arg2, 1, message0.arg1 != 0, true);
                goto label_576;
            label_26:
                v1 = SystemClock.uptimeMillis();
                if(!this.B.a.zzo() && this.z.d()) {
                    long v2 = this.P;
                    ya ya0 = this.y.j;
                    if(ya0 != null) {
                        zzcw.zzf(ya0.l == null);
                        if(ya0.d) {
                            ((zzry)ya0.a).zzm(v2 - ya0.o);
                        }
                    }
                    if(this.y.l()) {
                        za za0 = this.y.g(this.P, this.B);
                        if(za0 != null) {
                            zzvv zzvv0 = this.n.zzi();
                            ya ya1 = this.y.p(this.k, this.l, zzvv0, this.z, za0, this.m);
                            ((zzry)ya1.a).zzl(this, za0.b);
                            if(this.y.e() == ya1) {
                                this.k(za0.b);
                            }
                            this.d(false);
                        }
                    }
                    if(this.H) {
                        this.H = this.x();
                        this.t();
                    }
                    else {
                        this.g();
                    }
                    ya2 = this.y.f();
                    if(ya2 != null) {
                        if(ya2.e() == null || this.F) {
                            goto label_93;
                        }
                        else {
                            ya ya3 = this.y.f();
                            if(ya3.d) {
                                int v3 = 0;
                                while(true) {
                                    zzjt[] arr_zzjt = this.i;
                                    if(v3 >= 2) {
                                        break;
                                    }
                                    zzjt zzjt0 = arr_zzjt[v3];
                                    zztq zztq0 = ya3.c[v3];
                                    if(zzjt0.zzm() != zztq0 || zztq0 != null && !zzjt0.zzG()) {
                                        goto label_105;
                                    }
                                    ++v3;
                                }
                                if(ya2.e().d || this.P >= ya2.e().d()) {
                                    zzvn0 = ya2.g();
                                    ya ya4 = this.y.d();
                                    zzvn1 = ya4.g();
                                    this.v(this.B.a, ya4.f.a, this.B.a, ya2.f.a, 0x8000000000000001L);
                                    if(!ya4.d || ((zzry)ya4.a).zzd() == 0x8000000000000001L) {
                                        goto label_78;
                                    }
                                    else {
                                        zzjt[] arr_zzjt1 = this.i;
                                        for(int v4 = 0; true; ++v4) {
                                            if(v4 >= 2) {
                                                break;
                                            }
                                            zzjt zzjt1 = arr_zzjt1[v4];
                                            if(zzjt1.zzm() != null) {
                                                zzjt1.zzC();
                                                if(zzjt1 instanceof zzub) {
                                                    throw null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    goto label_105;
                }
                goto label_158;
            }
            catch(zzgt zzgt0) {
                goto label_536;
            }
            catch(zzpa zzpa0) {
                zzpa1 = zzpa0;
                goto label_555;
            }
            catch(zzbp zzbp0) {
                zzbp1 = zzbp0;
                goto label_557;
            }
            catch(zzer zzer0) {
                zzer1 = zzer0;
                goto label_566;
            }
            catch(zzrc zzrc0) {
                zzrc1 = zzrc0;
                goto label_568;
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                goto label_570;
            }
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_572;
        }
        goto label_105;
        try {
        label_78:
            for(int v5 = 0; v5 < 2; ++v5) {
                boolean z = zzvn0.zzb(v5);
                boolean z1 = zzvn1.zzb(v5);
                if(z && !this.i[v5].zzH()) {
                    this.k[v5].zzb();
                    if(!z1 || !zzvn1.zzb[v5].equals(zzvn0.zzb[v5])) {
                        zzjt zzjt2 = this.i[v5];
                        zzjt2.zzC();
                        if(zzjt2 instanceof zzub) {
                            zzub zzub0 = (zzub)zzjt2;
                            throw null;
                        }
                    }
                }
            }
            goto label_105;
        label_93:
            if(ya2.f.h || this.F) {
                for(int v6 = 0; true; ++v6) {
                    zzjt[] arr_zzjt2 = this.i;
                    if(v6 >= 2) {
                        break;
                    }
                    zzjt zzjt3 = arr_zzjt2[v6];
                    zztq zztq1 = ya2.c[v6];
                    if(zztq1 != null && zzjt3.zzm() == zztq1 && zzjt3.zzG()) {
                        zzjt3.zzC();
                        if(zzjt3 instanceof zzub) {
                            throw null;
                        }
                    }
                }
            }
        label_105:
            ya ya5 = this.y.f();
            if(ya5 != null && this.y.e() != ya5 && !ya5.g) {
                ya ya6 = this.y.f();
                zzvn zzvn2 = ya6.g();
                boolean z2 = false;
                for(int v7 = 0; true; ++v7) {
                    zzjt[] arr_zzjt3 = this.i;
                    if(v7 >= 2) {
                        break;
                    }
                    zzjt zzjt4 = arr_zzjt3[v7];
                    if(xa.y(zzjt4) && (!zzvn2.zzb(v7) || zzjt4.zzm() != ya6.c[v7])) {
                        if(!zzjt4.zzH()) {
                            zzvg zzvg0 = zzvn2.zzc[v7];
                            int v8 = zzvg0 == null ? 0 : zzvg0.zzc();
                            zzad[] arr_zzad = new zzad[v8];
                            for(int v9 = 0; v9 < v8; ++v9) {
                                arr_zzad[v9] = zzvg0.zzd(v9);
                            }
                            zzjt4.zzz(arr_zzad, ya6.c[v7], ya6.d(), ya6.o);
                        }
                        else if(zzjt4.zzM()) {
                            this.a(zzjt4);
                        }
                        else {
                            z2 = true;
                        }
                    }
                }
                if(!z2) {
                    this.b(new boolean[2]);
                }
            }
            for(boolean z3 = false; this.A() && !this.F; z3 = true) {
                ya ya7 = this.y.e();
                if(ya7 == null) {
                    break;
                }
                ya ya8 = ya7.e();
                if(ya8 == null || this.P < ya8.d() || !ya8.g) {
                    break;
                }
                if(z3) {
                    this.h();
                }
                ya ya9 = this.y.c();
                if(ya9 == null) {
                    throw null;
                }
                if(this.B.b.zza.equals(ya9.f.a.zza)) {
                    zzsa zzsa0 = this.B.b;
                    if(zzsa0.zzb == -1) {
                        zzsa zzsa1 = ya9.f.a;
                        if(zzsa1.zzb == -1 && zzsa0.zze != zzsa1.zze) {
                            v10 = 1;
                        }
                    }
                }
                else {
                    v10 = 0;
                }
                this.B = this.I(ya9.f.a, ya9.f.b, ya9.f.c, ya9.f.b, ((boolean)(v10 ^ 1)), 0);
                this.j();
                this.u();
            }
        label_158:
            if(this.B.e == 1 || this.B.e == 4) {
                this.p.zze(2);
                goto label_576;
            label_281:
                wa0 = (wa)message0.obj;
                this.C.zza(1);
                Pair pair0 = xa.H(this.B.a, wa0, this.I, this.J, this.s, this.t);
                if(pair0 == null) {
                    Pair pair1 = this.G(this.B.a);
                    zzsa zzsa4 = (zzsa)pair1.first;
                    v20 = (long)(((Long)pair1.second));
                    v22 = 0x8000000000000001L;
                    v23 = !this.B.a.zzo();
                    zzsa3 = zzsa4;
                }
                else {
                    Object object0 = pair0.first;
                    v20 = (long)(((Long)pair0.second));
                    long v21 = wa0.c == 0x8000000000000001L ? 0x8000000000000001L : v20;
                    zzsa zzsa2 = this.y.i(this.B.a, object0, v20);
                    if(zzsa2.zzb()) {
                        this.B.a.zzn(zzsa2.zza, this.t);
                        boolean z8 = this.t.zze(zzsa2.zzb) != zzsa2.zzc;
                        zzsa3 = zzsa2;
                        v22 = v21;
                        v23 = 1;
                        v20 = 0L;
                    }
                    else {
                        v23 = wa0.c == 0x8000000000000001L ? 1 : 0;
                        zzsa3 = zzsa2;
                        v22 = v21;
                    }
                }
                goto label_307;
            }
            else {
                ya ya10 = this.y.e();
                if(ya10 == null) {
                    this.p.zze(2);
                    this.p.zzi(2, v1 + 10L);
                }
                else {
                    Trace.beginSection("doSomeWork");
                    this.u();
                    if(ya10.d) {
                        long v11 = SystemClock.elapsedRealtime();
                        ((zzry)ya10.a).zzj(this.B.s - this.u, false);
                        z4 = true;
                        z5 = true;
                        for(int v12 = 0; true; ++v12) {
                            zzjt[] arr_zzjt4 = this.i;
                            if(v12 >= 2) {
                                break;
                            }
                            zzjt zzjt5 = arr_zzjt4[v12];
                            if(xa.y(zzjt5)) {
                                zzjt5.zzL(this.P, v11 * 1000L);
                                z5 = z5 && zzjt5.zzM();
                                zztq zztq2 = ya10.c[v12];
                                zztq zztq3 = zzjt5.zzm();
                                boolean z6 = zztq2 != zztq3 || zztq2 == zztq3 && zzjt5.zzG() || zzjt5.zzN() || zzjt5.zzM();
                                z4 = z4 && z6;
                                if(!z6) {
                                    zzjt5.zzr();
                                }
                            }
                        }
                    }
                    else {
                        ((zzry)ya10.a).zzk();
                        z4 = true;
                        z5 = true;
                    }
                    long v13 = ya10.f.e;
                    if(!z5 || !ya10.d || v13 != 0x8000000000000001L && v13 > this.B.s) {
                    label_195:
                        Fa fa0 = this.B;
                        if(fa0.e != 2) {
                        label_212:
                            if(this.B.e == 3) {
                                if(this.N != 0) {
                                    if(!z4) {
                                    label_217:
                                        this.G = this.A();
                                        this.p(2);
                                        if(this.G) {
                                            for(ya ya13 = this.y.e(); ya13 != null; ya13 = ya13.e()) {
                                                zzvg[] arr_zzvg = ya13.g().zzc;
                                                for(int v15 = 0; v15 < arr_zzvg.length; ++v15) {
                                                    zzvg zzvg1 = arr_zzvg[v15];
                                                }
                                            }
                                            this.V.zzc();
                                        }
                                        this.s();
                                    }
                                }
                                else if(!this.z()) {
                                    goto label_217;
                                }
                            }
                        }
                        else if(this.N != 0) {
                            if(!z4) {
                                goto label_212;
                            }
                            else if(fa0.g) {
                                long v14 = this.B(fa0.a, this.y.e().f.a) ? this.V.zzb() : 0x8000000000000001L;
                                ya ya11 = this.y.j;
                                if(ya11.d && (!ya11.e || ((zzry)ya11.a).zzb() == 0x8000000000000000L) && ya11.f.h || ya11.f.a.zzb() && !ya11.d) {
                                    goto label_207;
                                }
                                else {
                                    ya ya12 = this.y.j;
                                    if(this.n.zzh((ya12 == null ? 0L : Math.max(0L, this.B.q - (this.P - ya12.o))), this.v.zzc().zzc, this.G, v14)) {
                                        goto label_207;
                                    }
                                    else {
                                        goto label_212;
                                    }
                                }
                            }
                            else {
                            label_207:
                                this.p(3);
                                this.S = null;
                                if(this.A()) {
                                    this.q();
                                }
                            }
                        }
                        else if(this.z()) {
                            goto label_207;
                        }
                        else {
                            goto label_212;
                        }
                    }
                    else {
                        if(this.F) {
                            this.F = false;
                            this.o(this.B.m, 5, false, false);
                        }
                        if(ya10.f.h) {
                            this.p(4);
                            this.s();
                            goto label_232;
                        }
                        goto label_195;
                    }
                label_232:
                    if(this.B.e == 2) {
                        for(int v16 = 0; true; ++v16) {
                            zzjt[] arr_zzjt5 = this.i;
                            if(v16 >= 2) {
                                break;
                            }
                            if(xa.y(arr_zzjt5[v16]) && this.i[v16].zzm() == ya10.c[v16]) {
                                this.i[v16].zzr();
                            }
                        }
                        if(this.B.g || this.B.r >= 500000L || !this.x()) {
                            this.T = 0x8000000000000001L;
                        }
                        else if(this.T == 0x8000000000000001L) {
                            this.T = SystemClock.elapsedRealtime();
                        }
                        else if(SystemClock.elapsedRealtime() - this.T >= 4000L) {
                            throw new IllegalStateException("Playback stuck buffering and not loading");
                        }
                    }
                    else {
                        this.T = 0x8000000000000001L;
                    }
                    boolean z7 = this.M;
                    Fa fa1 = this.B;
                    if(z7 != fa1.o) {
                        this.B = fa1.c(z7);
                    }
                    if(this.A() && this.B.e == 3) {
                    label_263:
                        if(!this.M || !this.L) {
                            this.p.zze(2);
                            this.p.zzi(2, v1 + 10L);
                            v19 = 1;
                        }
                        else {
                            v19 = 0;
                        }
                        v18 = v19 ^ 1;
                    }
                    else {
                        int v17 = this.B.e;
                        if(v17 != 2) {
                            if(this.N == 0 || v17 == 4) {
                                this.p.zze(2);
                            }
                            else {
                                this.p.zze(2);
                                this.p.zzi(2, v1 + 1000L);
                            }
                            v18 = 0;
                            goto label_270;
                        }
                        goto label_263;
                    }
                label_270:
                    Fa fa2 = this.B;
                    if(fa2.p != v18) {
                        this.B = new Fa(fa2.a, fa2.b, fa2.c, fa2.d, fa2.e, fa2.f, fa2.g, fa2.h, fa2.i, fa2.j, fa2.k, fa2.l, fa2.m, fa2.n, fa2.q, fa2.r, fa2.s, fa2.o, ((boolean)v18));
                    }
                    this.L = false;
                    Trace.endSection();
                }
            }
            goto label_576;
        }
        catch(zzgt zzgt0) {
            goto label_536;
        }
        catch(zzpa zzpa0) {
            zzpa1 = zzpa0;
            goto label_555;
        }
        catch(zzbp zzbp0) {
            zzbp1 = zzbp0;
            goto label_557;
        }
        catch(zzer zzer0) {
            zzer1 = zzer0;
            goto label_566;
        }
        catch(zzrc zzrc0) {
            zzrc1 = zzrc0;
            goto label_568;
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            goto label_570;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_572;
        }
        try {
        label_307:
            if(this.B.a.zzo()) {
                this.O = wa0;
                fa4 = this.I(zzsa3, v20, v22, v20, ((boolean)v23), 2);
                this.B = fa4;
                goto label_576;
            }
            else if(pair0 == null) {
                goto label_331;
            }
            else if(zzsa3.equals(this.B.b)) {
                ya ya14 = this.y.e();
                long v24 = ya14 == null || !ya14.d || v20 == 0L ? v20 : ((zzry)ya14.a).zza(v20, this.A);
                if(zzeg.zzz(v24) == zzeg.zzz(this.B.s)) {
                    fa3 = this.B;
                    if(fa3.e != 2 && fa3.e != 3) {
                        v25 = this.F(zzsa3, v24, this.y.h != this.y.i, this.B.e == 4);
                        goto label_322;
                    }
                    fa4 = this.I(zzsa3, fa3.s, v22, fa3.s, ((boolean)v23), 2);
                    this.B = fa4;
                    goto label_576;
                }
                else {
                    v25 = this.F(zzsa3, v24, this.y.h != this.y.i, this.B.e == 4);
                    goto label_322;
                }
            }
            else {
                goto label_321;
            }
            this.B = fa4;
            goto label_576;
        }
        catch(Throwable throwable0) {
            goto label_338;
        }
        try {
            fa4 = this.I(zzsa3, fa3.s, v22, fa3.s, ((boolean)v23), 2);
            this.B = fa4;
            goto label_576;
        }
        catch(zzgt zzgt0) {
            goto label_536;
        }
        catch(zzpa zzpa0) {
            zzpa1 = zzpa0;
            goto label_555;
        }
        catch(zzbp zzbp0) {
            zzbp1 = zzbp0;
            goto label_557;
        }
        catch(zzer zzer0) {
            zzer1 = zzer0;
            goto label_566;
        }
        catch(zzrc zzrc0) {
            zzrc1 = zzrc0;
            goto label_568;
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            goto label_570;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_572;
        }
        try {
        label_321:
            v25 = this.F(zzsa3, v20, this.y.h != this.y.i, this.B.e == 4);
        }
        catch(Throwable throwable0) {
            goto label_338;
        }
        try {
        label_322:
            v23 |= (v20 == v25 ? 0 : 1);
            this.v(this.B.a, zzsa3, this.B.a, this.B.b, v22);
            fa4 = this.I(zzsa3, v25, v22, v25, ((boolean)v23), 2);
            this.B = fa4;
            goto label_576;
        }
        catch(Throwable throwable1) {
            try {
                throwable2 = throwable1;
                v20 = v25;
                this.B = this.I(zzsa3, v20, v22, v20, ((boolean)v23), 2);
                throw throwable2;
            }
            catch(zzgt zzgt0) {
                goto label_536;
            }
            catch(zzpa zzpa0) {
                zzpa1 = zzpa0;
                goto label_555;
            }
            catch(zzbp zzbp0) {
                zzbp1 = zzbp0;
                goto label_557;
            }
            catch(zzer zzer0) {
                zzer1 = zzer0;
                goto label_566;
            }
            catch(zzrc zzrc0) {
                zzrc1 = zzrc0;
                goto label_568;
            }
            catch(IOException iOException0) {
                iOException1 = iOException0;
                goto label_570;
            }
            catch(RuntimeException runtimeException0) {
                runtimeException1 = runtimeException0;
                goto label_572;
            }
        }
        try {
        label_331:
            if(this.B.e != 1) {
                this.p(4);
            }
            this.i(false, true, false, true);
            fa4 = this.I(zzsa3, v20, v22, v20, ((boolean)v23), 2);
            this.B = fa4;
            goto label_576;
        }
        catch(Throwable throwable0) {
        label_338:
            throwable2 = throwable0;
        }
        try {
            this.B = this.I(zzsa3, v20, v22, v20, ((boolean)v23), 2);
            throw throwable2;
        label_344:
            this.v.zzg(((zzbt)message0.obj));
            zzbt zzbt0 = this.v.zzc();
            this.f(zzbt0, zzbt0.zzc, true, true);
            goto label_576;
        label_350:
            this.r(false, true);
            goto label_576;
        label_352:
            ya ya15 = this.y.j;
            if(ya15 != null && ya15.a == ((zzry)message0.obj)) {
                this.v.zzc();
                ya15.h(this.B.a);
                this.n.zze(this.i, ya15.f(), ya15.g().zzc);
                if(ya15 == this.y.e()) {
                    this.k(ya15.f.b);
                    this.b(new boolean[2]);
                    this.B = this.I(this.B.b, ya15.f.b, this.B.c, ya15.f.b, false, 5);
                }
                this.g();
                goto label_576;
            label_363:
                ya ya16 = this.y.j;
                if(ya16 != null && ya16.a == ((zzry)message0.obj)) {
                    long v26 = this.P;
                    if(ya16 != null) {
                        zzcw.zzf(ya16.l == null);
                        if(ya16.d) {
                            ((zzry)ya16.a).zzm(v26 - ya16.o);
                        }
                    }
                    this.g();
                    goto label_576;
                label_372:
                    this.v.zzc();
                    ya ya17 = this.y.e();
                    ya ya18 = this.y.f();
                    int v27 = 1;
                    while(true) {
                        if(ya17 == null || !ya17.d) {
                            break;
                        }
                        zzvn zzvn3 = ya17.j.zzj(ya17.i, ya17.m, ya17.f.a, this.B.a);
                        zzvg[] arr_zzvg1 = zzvn3.zzc;
                        for(int v28 = 0; v28 < arr_zzvg1.length; ++v28) {
                            zzvg zzvg2 = arr_zzvg1[v28];
                        }
                        zzvn zzvn4 = ya17.g();
                        if(zzvn4 == null || zzvn4.zzc.length != zzvn3.zzc.length) {
                        label_394:
                            if(v27 == 0) {
                                this.y.k(ya17);
                                if(ya17.d) {
                                    ya17.a(zzvn3, Math.max(ya17.f.b, this.P - ya17.o));
                                }
                            }
                            else {
                                ya ya19 = this.y.e();
                                boolean z9 = this.y.k(ya19);
                                boolean[] arr_z = new boolean[2];
                                long v30 = ya19.b(zzvn3, this.B.s, z9, arr_z);
                                boolean z10 = this.B.e != 4 && v30 != this.B.s;
                                this.B = this.I(this.B.b, v30, this.B.c, this.B.d, z10, 5);
                                if(z10) {
                                    this.k(v30);
                                }
                                boolean[] arr_z1 = new boolean[2];
                                for(int v31 = 0; true; ++v31) {
                                    zzjt[] arr_zzjt6 = this.i;
                                    if(v31 >= 2) {
                                        break;
                                    }
                                    zzjt zzjt6 = arr_zzjt6[v31];
                                    boolean z11 = xa.y(zzjt6);
                                    arr_z1[v31] = z11;
                                    zztq zztq4 = ya19.c[v31];
                                    if(z11) {
                                        if(zztq4 != zzjt6.zzm()) {
                                            this.a(zzjt6);
                                        }
                                        else if(arr_z[v31]) {
                                            zzjt6.zzB(this.P);
                                        }
                                    }
                                }
                                this.b(arr_z1);
                            }
                        }
                        else {
                            int v29 = 0;
                            while(v29 < zzvn3.zzc.length) {
                                if(!zzvn3.zza(zzvn4, v29)) {
                                    goto label_394;
                                }
                                ++v29;
                            }
                            v27 &= (ya17 == ya18 ? 0 : 1);
                            ya17 = ya17.e();
                            continue;
                        }
                        this.d(true);
                        if(this.B.e != 4) {
                            this.g();
                            this.u();
                            this.p.zzh(2);
                            break;
                        label_430:
                            this.I = message0.arg1;
                            if(!this.y.n(this.B.a, message0.arg1)) {
                                this.m(true);
                            }
                            this.d(false);
                            break;
                        label_435:
                            this.J = message0.arg1 != 0;
                            if(!this.y.o(this.B.a, message0.arg1 != 0)) {
                                this.m(true);
                            }
                            this.d(false);
                            break;
                        label_440:
                            boolean z12 = message0.arg1 != 0;
                            AtomicBoolean atomicBoolean0 = (AtomicBoolean)message0.obj;
                            if(this.K != z12) {
                                this.K = z12;
                                if(!z12) {
                                    zzjt[] arr_zzjt7 = this.i;
                                    for(int v32 = 0; v32 < 2; ++v32) {
                                        zzjt zzjt7 = arr_zzjt7[v32];
                                        if(!xa.y(zzjt7) && this.j.remove(zzjt7)) {
                                            zzjt7.zzA();
                                        }
                                    }
                                }
                            }
                            if(atomicBoolean0 != null) {
                                synchronized(this) {
                                    atomicBoolean0.set(true);
                                    this.notifyAll();
                                }
                                break;
                            label_462:
                                this.n(((zzjq)message0.obj));
                                break;
                            label_464:
                                zzjq zzjq0 = (zzjq)message0.obj;
                                Looper looper0 = zzjq0.zzb();
                                if(looper0.getThread().isAlive()) {
                                    this.x.zzb(looper0, null).zzg(new zzio(this, zzjq0));
                                    break;
                                label_472:
                                    this.f(((zzbt)message0.obj), ((zzbt)message0.obj).zzc, true, false);
                                    break;
                                label_474:
                                    va va0 = (va)message0.obj;
                                    this.C.zza(1);
                                    if(va0.b != -1) {
                                        this.O = new wa(new Ga(va0.a, va0.d), va0.b, va0.c);
                                    }
                                    this.e(this.z.g(va0.a, va0.d), false);
                                    break;
                                label_480:
                                    va va1 = (va)message0.obj;
                                    int v34 = message0.arg1;
                                    this.C.zza(1);
                                    Ea ea0 = this.z;
                                    if(v34 == -1) {
                                        v34 = ea0.b.size();
                                    }
                                    this.e(ea0.e(v34, va1.a, va1.d), false);
                                    break;
                                label_488:
                                    int v35 = message0.arg1;
                                    int v36 = message0.arg2;
                                    zztt zztt0 = (zztt)message0.obj;
                                    this.C.zza(1);
                                    this.e(this.z.f(v35, v36, zztt0), false);
                                    break;
                                label_494:
                                    zztt zztt1 = (zztt)message0.obj;
                                    this.C.zza(1);
                                    this.e(this.z.h(zztt1), false);
                                    break;
                                label_498:
                                    this.e(this.z.a(), true);
                                    break;
                                label_500:
                                    this.E = message0.arg1 != 0;
                                    this.j();
                                    if(this.F && this.y.f() != this.y.e()) {
                                        this.m(true);
                                        this.d(false);
                                        break;
                                    label_506:
                                        boolean z13 = message0.arg1 == 1;
                                        if(z13 != this.M) {
                                            this.M = z13;
                                            Fa fa5 = this.B;
                                            if(z13 || (fa5.e == 1 || fa5.e == 4)) {
                                                this.B = fa5.c(z13);
                                                break;
                                            label_515:
                                                this.m(true);
                                                break;
                                            label_536:
                                                zzgt1 = zzgt0;
                                                if(zzgt1.zze == 1) {
                                                    goto label_538;
                                                }
                                                goto label_541;
                                            }
                                            else {
                                                this.p.zzh(2);
                                            }
                                        }
                                    }
                                }
                                else {
                                    Log.w("TAG", "Trying to send message on a dead thread.");
                                    zzjq0.zzh(false);
                                }
                            }
                        }
                        break;
                    }
                }
            }
            goto label_576;
        }
        catch(zzgt zzgt0) {
            goto label_536;
        }
        catch(zzpa zzpa0) {
            zzpa1 = zzpa0;
            goto label_555;
        }
        catch(zzbp zzbp0) {
            zzbp1 = zzbp0;
            goto label_557;
        }
        catch(zzer zzer0) {
            zzer1 = zzer0;
            goto label_566;
        }
        catch(zzrc zzrc0) {
            zzrc1 = zzrc0;
            goto label_568;
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            goto label_570;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_572;
        }
    label_538:
        ya ya20 = this.y.f();
        if(ya20 != null) {
            zzgt1 = zzgt1.a(ya20.f.a);
        }
    label_541:
        if(!zzgt1.i || this.S != null) {
            zzgt zzgt2 = this.S;
            if(zzgt2 != null) {
                try {
                    zzgt2.addSuppressed(zzgt1);
                }
                catch(Exception unused_ex) {
                }
                zzgt1 = this.S;
            }
            zzdn.zza("ExoPlayerImplInternal", "Playback error", zzgt1);
            this.r(true, false);
            this.B = this.B.e(zzgt1);
            goto label_576;
        label_555:
            this.c(zzpa1, zzpa1.zza);
            goto label_576;
        label_557:
            if(zzbp1.zzb != 1) {
                v37 = 1000;
            }
            else if(!zzbp1.zza) {
                v37 = 3003;
            }
            else {
                v37 = 3001;
            }
            this.c(zzbp1, v37);
            goto label_576;
        label_566:
            this.c(zzer1, zzer1.zza);
            goto label_576;
        label_568:
            this.c(zzrc1, 1002);
            goto label_576;
        label_570:
            this.c(iOException1, 2000);
            goto label_576;
        label_572:
            zzgt zzgt3 = zzgt.zzd(runtimeException1, (!(runtimeException1 instanceof IllegalStateException) && !(runtimeException1 instanceof IllegalArgumentException) ? 1000 : 1004));
            zzdn.zza("ExoPlayerImplInternal", "Playback error", zzgt3);
            this.r(true, false);
            this.B = this.B.e(zzgt3);
        }
        else {
            zzdn.zzb("ExoPlayerImplInternal", "Recoverable renderer error", zzgt1);
            this.S = zzgt1;
            zzdf zzdf0 = this.p.zzb(25, zzgt1);
            this.p.zzj(zzdf0);
        }
    label_576:
        this.h();
        return true;
    }

    public final void i(boolean z, boolean z1, boolean z2, boolean z3) {
        long v5;
        long v4;
        zzsa zzsa2;
        boolean z4;
        long v3;
        this.p.zze(2);
        zzgt zzgt0 = null;
        this.S = null;
        this.G = false;
        this.v.n = false;
        this.v.i.zze();
        this.P = 1000000000000L;
        zzjt[] arr_zzjt = this.i;
        for(int v = 0; v < 2; ++v) {
            zzjt zzjt0 = arr_zzjt[v];
            try {
                this.a(zzjt0);
            }
            catch(zzgt | RuntimeException zzgt1) {
                zzdn.zza("ExoPlayerImplInternal", "Disable failed.", zzgt1);
            }
        }
        if(z) {
            zzjt[] arr_zzjt1 = this.i;
            for(int v1 = 0; v1 < 2; ++v1) {
                zzjt zzjt1 = arr_zzjt1[v1];
                if(this.j.remove(zzjt1)) {
                    try {
                        zzjt1.zzA();
                    }
                    catch(RuntimeException runtimeException0) {
                        zzdn.zza("ExoPlayerImplInternal", "Reset failed.", runtimeException0);
                    }
                }
            }
        }
        this.N = 0;
        zzsa zzsa0 = this.B.b;
        long v2 = this.B.s;
        if(this.B.b.zzb()) {
            v3 = this.B.c;
        }
        else {
            zzsa zzsa1 = this.B.b;
            zzci zzci0 = this.B.a;
            v3 = zzci0.zzo() || zzci0.zzn(zzsa1.zza, this.t).zzg ? this.B.c : this.B.s;
        }
        if(z1) {
            this.O = null;
            Pair pair0 = this.G(this.B.a);
            zzsa0 = (zzsa)pair0.first;
            v2 = (long)(((Long)pair0.second));
            v3 = 0x8000000000000001L;
            if(!zzsa0.equals(this.B.b)) {
                z4 = true;
                zzsa2 = zzsa0;
                v4 = v2;
                v5 = 0x8000000000000001L;
                goto label_57;
            }
            goto label_53;
        }
        else {
        label_53:
            zzsa2 = zzsa0;
            v4 = v2;
            v5 = v3;
            z4 = false;
        }
    label_57:
        this.y.j();
        this.H = false;
        Fa fa0 = this.B;
        zzci zzci1 = fa0.a;
        int v6 = fa0.e;
        if(!z3) {
            zzgt0 = fa0.f;
        }
        zzty zzty0 = z4 ? zzty.zza : fa0.h;
        zzvn zzvn0 = z4 ? this.m : fa0.i;
        List list0 = z4 ? zzfrj.zzo() : fa0.j;
        this.B = new Fa(zzci1, zzsa2, v5, v4, v6, zzgt0, false, zzty0, zzvn0, list0, zzsa2, this.B.l, this.B.m, this.B.n, v4, 0L, v4, this.M, false);
        if(z2) {
            Ea ea0 = this.z;
            HashMap hashMap0 = ea0.h;
            for(Object object0: hashMap0.values()) {
                Ca ca0 = (Ca)object0;
                try {
                    ca0.a.zzp(ca0.b);
                }
                catch(RuntimeException runtimeException1) {
                    zzdn.zza("MediaSourceList", "Failed to release child source.", runtimeException1);
                }
                ca0.a.zzs(ca0.c);
                ca0.a.zzr(ca0.c);
            }
            hashMap0.clear();
            ea0.i.clear();
            ea0.j = false;
        }
    }

    public final void j() {
        ya ya0 = this.y.h;
        this.F = ya0 != null && ya0.f.g && this.E;
    }

    public final void k(long v) {
        Aa aa0 = this.y;
        long v1 = v + (aa0.h == null ? 1000000000000L : aa0.h.o);
        this.P = v1;
        this.v.i.zzb(v1);
        zzjt[] arr_zzjt = this.i;
        for(int v2 = 0; v2 < 2; ++v2) {
            zzjt zzjt0 = arr_zzjt[v2];
            if(xa.y(zzjt0)) {
                zzjt0.zzB(this.P);
            }
        }
        for(ya ya0 = aa0.h; ya0 != null; ya0 = ya0.l) {
            zzvg[] arr_zzvg = ya0.n.zzc;
            for(int v3 = 0; v3 < arr_zzvg.length; ++v3) {
                zzvg zzvg0 = arr_zzvg[v3];
            }
        }
    }

    public final void l(zzci zzci0, zzci zzci1) {
        if(zzci0.zzo() && zzci1.zzo()) {
            return;
        }
        ArrayList arrayList0 = this.w;
        int v = arrayList0.size();
        if(v - 1 < 0) {
            Collections.sort(arrayList0);
            return;
        }
        arrayList0.get(v - 1).getClass();
        throw new ClassCastException();
    }

    public final void m(boolean z) {
        zzsa zzsa0 = this.y.h.f.a;
        long v = this.F(zzsa0, this.B.s, true, false);
        if(v != this.B.s) {
            this.B = this.I(zzsa0, v, this.B.c, this.B.d, z, 5);
        }
    }

    public final void n(zzjq zzjq0) {
        zzdg zzdg0 = this.p;
        if(zzjq0.zzb() == this.r) {
            xa.C(zzjq0);
            if(this.B.e != 2 && this.B.e != 3) {
                return;
            }
            zzdg0.zzh(2);
            return;
        }
        zzdg0.zzb(15, zzjq0).zza();
    }

    public final void o(int v, int v1, boolean z, boolean z1) {
        this.C.zza(((int)z1));
        this.C.zzb(v1);
        this.B = this.B.d(v, z);
        this.G = false;
        for(ya ya0 = this.y.h; ya0 != null; ya0 = ya0.l) {
            zzvg[] arr_zzvg = ya0.n.zzc;
            for(int v2 = 0; v2 < arr_zzvg.length; ++v2) {
                zzvg zzvg0 = arr_zzvg[v2];
            }
        }
        if(!this.A()) {
            this.s();
            this.u();
            return;
        }
        int v3 = this.B.e;
        zzdg zzdg0 = this.p;
        if(v3 == 3) {
            this.q();
            zzdg0.zzh(2);
            return;
        }
        if(v3 == 2) {
            zzdg0.zzh(2);
        }
    }

    public final void p(int v) {
        Fa fa0 = this.B;
        if(fa0.e != v) {
            if(v != 2) {
                this.T = 0x8000000000000001L;
            }
            this.B = fa0.f(v);
        }
    }

    public final void q() {
        this.G = false;
        this.v.n = true;
        this.v.i.zzd();
        zzjt[] arr_zzjt = this.i;
        for(int v = 0; v < 2; ++v) {
            zzjt zzjt0 = arr_zzjt[v];
            if(xa.y(zzjt0)) {
                zzjt0.zzE();
            }
        }
    }

    public final void r(boolean z, boolean z1) {
        this.i(z || !this.K, false, true, false);
        this.C.zza(((int)z1));
        this.n.zzd();
        this.p(1);
    }

    public final void s() {
        this.v.n = false;
        this.v.i.zze();
        zzjt[] arr_zzjt = this.i;
        for(int v = 0; v < 2; ++v) {
            zzjt zzjt0 = arr_zzjt[v];
            if(xa.y(zzjt0) && zzjt0.zzbe() == 2) {
                zzjt0.zzF();
            }
        }
    }

    public final void t() {
        ya ya0 = this.y.j;
        boolean z = this.H || ya0 != null && ((zzry)ya0.a).zzp();
        Fa fa0 = this.B;
        if(z != fa0.g) {
            this.B = new Fa(fa0.a, fa0.b, fa0.c, fa0.d, fa0.e, fa0.f, z, fa0.h, fa0.i, fa0.j, fa0.k, fa0.l, fa0.m, fa0.n, fa0.q, fa0.r, fa0.s, fa0.o, fa0.p);
        }
    }

    public final void u() {
        long v2;
        ya ya0 = this.y.h;
        if(ya0 == null) {
            return;
        }
        long v = ya0.d ? ((zzry)ya0.a).zzd() : 0x8000000000000001L;
        if(v == 0x8000000000000001L) {
            oa oa0 = this.v;
            boolean z = ya0 != this.y.i;
            zzjz zzjz0 = oa0.i;
            if(oa0.k == null || oa0.k.zzM() || !oa0.k.zzN() && (z || oa0.k.zzG())) {
                oa0.m = true;
                if(oa0.n) {
                    zzjz0.zzd();
                }
            }
            else {
                zzjb zzjb0 = oa0.l;
                zzjb0.getClass();
                long v1 = zzjb0.zza();
                if(!oa0.m) {
                label_23:
                    zzjz0.zzb(v1);
                    zzbt zzbt0 = zzjb0.zzc();
                    if(!zzbt0.equals(zzjz0.zzc())) {
                        zzjz0.zzg(zzbt0);
                        oa0.j.zza(zzbt0);
                    }
                }
                else if(v1 < zzjz0.zza()) {
                    zzjz0.zze();
                }
                else {
                    oa0.m = false;
                    if(oa0.n) {
                        zzjz0.zzd();
                    }
                    goto label_23;
                }
            }
            if(oa0.m) {
                v2 = zzjz0.zza();
            }
            else {
                zzjb zzjb1 = oa0.l;
                zzjb1.getClass();
                v2 = zzjb1.zza();
            }
            this.P = v2;
            long v3 = v2 - ya0.o;
            if(!this.w.isEmpty() && !this.B.b.zzb()) {
                if(this.R) {
                    this.R = false;
                }
                this.B.a.zza(this.B.b.zza);
                int v4 = Math.min(this.Q, this.w.size());
                if(v4 > 0 && this.w.get(v4 - 1) != null) {
                    throw new ClassCastException();
                }
                if(v4 < this.w.size() && this.w.get(v4) != null) {
                    throw new ClassCastException();
                }
                this.Q = v4;
            }
            this.B.s = v3;
        }
        else {
            this.k(v);
            if(v != this.B.s) {
                this.B = this.I(this.B.b, v, this.B.c, v, true, 5);
            }
        }
        Fa fa0 = this.B;
        fa0.q = this.y.j.c();
        ya ya1 = this.y.j;
        long v5 = 0L;
        this.B.r = ya1 == null ? 0L : Math.max(0L, this.B.q - (this.P - ya1.o));
        if(this.B.l && this.B.e == 3 && this.B(this.B.a, this.B.b)) {
            Fa fa1 = this.B;
            if(fa1.n.zzc == 1.0f) {
                zzgo zzgo0 = this.V;
                long v6 = this.E(fa1.a, fa1.b.zza, fa1.s);
                long v7 = this.B.q;
                ya ya2 = this.y.j;
                if(ya2 != null) {
                    v5 = Math.max(0L, v7 - (this.P - ya2.o));
                }
                float f = zzgo0.zza(v6, v5);
                if(this.v.zzc().zzc != f) {
                    zzbt zzbt1 = new zzbt(f, this.B.n.zzd);
                    this.v.zzg(zzbt1);
                    this.f(this.B.n, this.v.zzc().zzc, false, false);
                }
            }
        }
    }

    public final void v(zzci zzci0, zzsa zzsa0, zzci zzci1, zzsa zzsa1, long v) {
        if(!this.B(zzci0, zzsa0)) {
            zzbt zzbt0 = zzsa0.zzb() ? zzbt.zza : this.B.n;
            oa oa0 = this.v;
            if(!oa0.zzc().equals(zzbt0)) {
                oa0.zzg(zzbt0);
            }
            return;
        }
        zzcf zzcf0 = this.t;
        zzcf zzcf1 = zzci0.zzn(zzsa0.zza, zzcf0);
        zzch zzch0 = this.s;
        zzci0.zze(zzcf1.zzd, zzch0, 0L);
        zzgo zzgo0 = this.V;
        zzgo0.zzd(zzch0.zzk);
        if(v != 0x8000000000000001L) {
            zzgo0.zze(this.E(zzci0, zzsa0.zza, v));
            return;
        }
        Object object0 = zzch0.zzc;
        if(!zzeg.zzS((zzci1.zzo() ? null : zzci1.zze(zzci1.zzn(zzsa1.zza, zzcf0).zzd, zzch0, 0L).zzc), object0)) {
            zzgo0.zze(0x8000000000000001L);
        }
    }

    public final void w(zzin zzin0) {
        synchronized(this) {
            long v1 = SystemClock.elapsedRealtime();
            boolean z = false;
            for(long v2 = 500L; !zzin0.zza.D && v2 > 0L; v2 = v1 + 500L - SystemClock.elapsedRealtime()) {
                try {
                    this.wait(v2);
                }
                catch(InterruptedException unused_ex) {
                    z = true;
                }
            }
            if(z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final boolean x() {
        ya ya0 = this.y.j;
        return ya0 == null ? false : (ya0.d ? ((zzry)ya0.a).zzc() : 0L) != 0x8000000000000000L;
    }

    public static boolean y(zzjt zzjt0) {
        return zzjt0.zzbe() != 0;
    }

    public final boolean z() {
        long v = this.y.h.f.e;
        return this.y.h.d && (v == 0x8000000000000001L || this.B.s < v || !this.A());
    }

    @Override  // com.google.android.gms.internal.ads.zzgq
    public final void zza(zzbt zzbt0) {
        this.p.zzb(16, zzbt0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zztr
    public final void zzg(zzts zzts0) {
        this.p.zzb(9, ((zzry)zzts0)).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzjl
    public final void zzh() {
        this.p.zzh(22);
    }

    @Override  // com.google.android.gms.internal.ads.zzrx
    public final void zzi(zzry zzry0) {
        this.p.zzb(8, zzry0).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzvl
    public final void zzj() {
        this.p.zzh(10);
    }

    @Override  // com.google.android.gms.internal.ads.zzjo
    public final void zzm(zzjq zzjq0) {
        synchronized(this) {
            if(!this.D && this.q.isAlive()) {
                this.p.zzb(14, zzjq0).zza();
                return;
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzjq0.zzh(false);
        }
    }
}

