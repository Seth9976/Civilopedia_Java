package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioTrack;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

public final class ta extends zzk implements zzhe {
    public zzbh A;
    public AudioTrack B;
    public Surface C;
    public Surface D;
    public int E;
    public int F;
    public final int G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public zzr L;
    public zzbh M;
    public Fa N;
    public int O;
    public long P;
    public final zzhp Q;
    public zztt R;
    public static final int S;
    public final zzvn b;
    public final zzbx c;
    public final zzcz d;
    public final zzjy e;
    public final zzjt[] f;
    public final zzvm g;
    public final zzdg h;
    public final xa i;
    public final zzdm j;
    public final CopyOnWriteArraySet k;
    public final zzcf l;
    public final ArrayList m;
    public final boolean n;
    public final zzkh o;
    public final Looper p;
    public final zzvy q;
    public final zzcx r;
    public final e9 s;
    public final Ha t;
    public final long u;
    public int v;
    public int w;
    public boolean x;
    public int y;
    public zzbx z;

    static {
        zzbc.zzb("media3.exoplayer");
    }

    public ta(zzhd zzhd0, zzjy zzjy0) {
        zzcz zzcz0 = new zzcz(zzcx.zza);
        this.d = zzcz0;
        try {
            Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.0.0-alpha03] [" + zzeg.zze + "]");
            Context context0 = zzhd0.a;
            Context context1 = context0.getApplicationContext();
            Object object0 = zzhd0.h.apply(zzhd0.b);
            this.o = object0;
            this.I = false;
            this.u = 2000L;
            qa qa0 = new qa(this);
            ra ra0 = new ra();  // 初始化器: Ljava/lang/Object;-><init>()V
            Handler handler0 = new Handler(zzhd0.i);
            zzjt[] arr_zzjt = zzhd0.c.zza.zza(handler0, qa0, qa0, qa0, qa0);
            this.f = arr_zzjt;
            zzvm zzvm0 = (zzvm)zzhd0.e.zza();
            this.g = zzvm0;
            zzyn zzyn0 = new zzyn();
            new zzrn(zzhd0.d.zza, zzyn0);
            zzvy zzvy0 = zzvy.zzg(zzhd0.g.zza);
            this.q = zzvy0;
            this.n = true;
            Looper looper0 = zzhd0.i;
            this.p = looper0;
            this.r = zzhd0.b;
            this.e = zzjy0;
            zzdm zzdm0 = new zzdm(looper0, zzhd0.b, new zzho(this));
            this.j = zzdm0;
            CopyOnWriteArraySet copyOnWriteArraySet0 = new CopyOnWriteArraySet();
            this.k = copyOnWriteArraySet0;
            this.m = new ArrayList();
            zzi zzi0 = zzhd0.j;
            this.R = new zztt(0);
            zzvn zzvn0 = new zzvn(new zzjv[2], new zzvg[2], zzct.zza, null);
            this.b = zzvn0;
            this.l = new zzcf();
            zzbv zzbv0 = new zzbv();
            zzbv0.zzc(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28});
            zzvm0.zzh();
            zzbv0.zzd(29, true);
            zzbx zzbx0 = zzbv0.zze();
            this.c = zzbx0;
            zzbv zzbv1 = new zzbv();
            zzbv1.zzb(zzbx0);
            zzbv1.zza(4);
            zzbv1.zza(10);
            this.z = zzbv1.zze();
            this.h = zzhd0.b.zzb(looper0, null);
            zzhp zzhp0 = new zzhp(this);
            this.Q = zzhp0;
            this.N = Fa.h(zzvn0);
            ((zzkh)object0).zzS(zzjy0, looper0);
            zzmu zzmu0 = zzeg.zza >= 0x1F ? pa.a(context1, this, true) : new zzmu();
            this.i = new xa(arr_zzjt, zzvm0, zzvn0, ((zzja)zzhd0.f.zza()), zzvy0, ((zzkh)object0), zzhd0.k, zzhd0.m, looper0, zzhd0.b, zzhp0, zzmu0);
            this.H = 1.0f;
            this.A = zzbh.zza;
            this.M = zzbh.zza;
            this.O = -1;
            if(zzeg.zza < 21) {
                if(this.B != null && this.B.getAudioSessionId() != 0) {
                    this.B.release();
                    this.B = null;
                }
                if(this.B == null) {
                    this.B = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.G = this.B.getAudioSessionId();
            }
            else {
                this.G = zzeg.zzi(context1);
            }
            this.J = true;
            zzdm0.zzb(object0);
            zzvy0.zze(new Handler(looper0), ((zzvt)object0));
            copyOnWriteArraySet0.add(qa0);
            context0.getApplicationContext();
            new W8(handler0, qa0);
            this.s = new e9(context0, handler0, qa0);
            zzeg.zzS(null, null);
            Ha ha0 = new Ha(context0, handler0, qa0);
            this.t = ha0;
            ha0.a();
            PowerManager powerManager0 = (PowerManager)context0.getApplicationContext().getSystemService("power");
            WifiManager wifiManager0 = (WifiManager)context0.getApplicationContext().getSystemService("wifi");
            this.L = ta.e(ha0);
            this.h(1, 10, this.G);
            this.h(2, 10, this.G);
            this.h(1, 3, zzi0);
            this.h(2, 4, 1);
            this.h(2, 5, 0);
            this.h(1, 9, Boolean.valueOf(this.I));
            this.h(2, 7, ra0);
            this.h(6, 8, ra0);
        }
        catch(Throwable throwable0) {
            this.d.zze();
            throw throwable0;
        }
        zzcz0.zze();
    }

    // 去混淆评级： 低(20)
    public final int a() {
        return this.N.a.zzo() ? this.O : this.N.a.zzn(this.N.b.zza, this.l).zzd;
    }

    public final long b(Fa fa0) {
        if(fa0.a.zzo()) {
            return zzeg.zzv(this.P);
        }
        if(fa0.b.zzb()) {
            return fa0.s;
        }
        long v = fa0.s;
        fa0.a.zzn(fa0.b.zza, this.l);
        return v;
    }

    public static long c(Fa fa0) {
        zzch zzch0 = new zzch();
        zzcf zzcf0 = new zzcf();
        fa0.a.zzn(fa0.b.zza, zzcf0);
        long v = fa0.c;
        if(v == 0x8000000000000001L) {
            fa0.a.zze(zzcf0.zzd, zzch0, 0L);
            return 0L;
        }
        return v;
    }

    public final Pair d(zzci zzci0, int v, long v1) {
        if(zzci0.zzo()) {
            this.O = v;
            if(v1 == 0x8000000000000001L) {
                v1 = 0L;
            }
            this.P = v1;
            return null;
        }
        if(v == -1 || v >= zzci0.zzc()) {
            v = zzci0.zzg(false);
            zzci0.zze(v, this.a, 0L);
            v1 = zzeg.zzz(0L);
        }
        return zzci0.zzl(this.a, this.l, v, zzeg.zzv(v1));
    }

    public static zzr e(Ha ha0) {
        ha0.getClass();
        return zzeg.zza < 28 ? new zzr(0, 0, ha0.d.getStreamMaxVolume(ha0.f)) : new zzr(0, ha0.d.getStreamMinVolume(ha0.f), ha0.d.getStreamMaxVolume(ha0.f));
    }

    public final Fa f(Fa fa0, zzci zzci0, Pair pair0) {
        zzvn zzvn0;
        zzsa zzsa1;
        zzcw.zzd(zzci0.zzo() || pair0 != null);
        zzci zzci1 = fa0.a;
        Fa fa1 = fa0.g(zzci0);
        if(zzci0.zzo()) {
            long v = zzeg.zzv(this.P);
            Fa fa2 = fa1.b(Fa.t, v, v, v, 0L, zzty.zza, this.b, zzfrj.zzo()).a(Fa.t);
            fa2.q = fa2.s;
            return fa2;
        }
        Object object0 = fa1.b.zza;
        boolean z = object0.equals(pair0.first);
        zzsa zzsa0 = z ? fa1.b : new zzsa(pair0.first);
        long v1 = (long)(((Long)pair0.second));
        long v2 = zzeg.zzv(this.zzk());
        if(!zzci1.zzo()) {
            zzci1.zzn(object0, this.l);
        }
        if(z) {
            int v3 = Long.compare(v1, v2);
            if(v3 >= 0) {
                if(v3 != 0) {
                    goto label_26;
                }
                int v4 = zzci0.zza(fa1.k.zza);
                if(v4 == -1 || zzci0.zzd(v4, this.l, false).zzd != zzci0.zzn(zzsa0.zza, this.l).zzd) {
                    zzci0.zzn(zzsa0.zza, this.l);
                    long v5 = zzsa0.zzb() ? this.l.zzg(zzsa0.zzb, zzsa0.zzc) : this.l.zze;
                    fa1 = fa1.b(zzsa0, fa1.s, fa1.s, fa1.d, v5 - fa1.s, fa1.h, fa1.i, fa1.j).a(zzsa0);
                    fa1.q = v5;
                    return fa1;
                label_26:
                    zzcw.zzf(!zzsa0.zzb());
                    long v6 = Math.max(0L, fa1.r - (v1 - v2));
                    long v7 = fa1.k.equals(fa1.b) ? v1 + v6 : fa1.q;
                    fa1 = fa1.b(zzsa0, v1, v1, v1, v6, fa1.h, fa1.i, fa1.j);
                    fa1.q = v7;
                    return fa1;
                }
            }
            else {
                goto label_32;
            }
        }
        else {
        label_32:
            zzcw.zzf(!zzsa0.zzb());
            zzty zzty0 = z ? fa1.h : zzty.zza;
            if(z) {
                zzsa1 = zzsa0;
                zzvn0 = fa1.i;
            }
            else {
                zzsa1 = zzsa0;
                zzvn0 = this.b;
            }
            List list0 = z ? fa1.j : zzfrj.zzo();
            fa1 = fa1.b(zzsa1, v1, v1, v1, 0L, zzty0, zzvn0, list0).a(zzsa1);
            fa1.q = v1;
        }
        return fa1;
    }

    public final void g(int v, int v1) {
        if(v == this.E && v1 == this.F) {
            return;
        }
        this.E = v;
        this.F = v1;
        zzhs zzhs0 = new zzhs(v, v1);
        this.j.zzd(24, zzhs0);
        this.j.zzc();
    }

    public final void h(int v, int v1, Object object0) {
        zzjt[] arr_zzjt = this.f;
        for(int v2 = 0; v2 < 2; ++v2) {
            zzjt zzjt0 = arr_zzjt[v2];
            if(zzjt0.zzb() == v) {
                int v3 = this.a();
                zzjq zzjq0 = new zzjq(this.i, zzjt0, this.N.a, (v3 == -1 ? 0 : v3), this.r, this.i.r);
                zzjq0.zzf(v1);
                zzjq0.zze(object0);
                zzjq0.zzd();
            }
        }
    }

    public final void i(Surface surface0) {
        ArrayList arrayList0 = new ArrayList();
        zzjt[] arr_zzjt = this.f;
        boolean z = false;
        for(int v = 0; v < 2; ++v) {
            zzjt zzjt0 = arr_zzjt[v];
            if(zzjt0.zzb() == 2) {
                int v1 = this.a();
                zzjq zzjq0 = new zzjq(this.i, zzjt0, this.N.a, (v1 == -1 ? 0 : v1), this.r, this.i.r);
                zzjq0.zzf(1);
                zzjq0.zze(surface0);
                zzjq0.zzd();
                arrayList0.add(zzjq0);
            }
        }
        if(this.C != null && this.C != surface0) {
            try {
                for(Object object0: arrayList0) {
                    ((zzjq)object0).zzi(this.u);
                }
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
            catch(TimeoutException unused_ex) {
                z = true;
            }
            Surface surface1 = this.D;
            if(this.C == surface1) {
                surface1.release();
                this.D = null;
            }
        }
        this.C = surface0;
        if(z) {
            this.j(zzgt.zzd(new zziy(3), 1003));
        }
    }

    public final void j(zzgt zzgt0) {
        Fa fa0 = this.N.a(this.N.b);
        fa0.q = fa0.s;
        fa0.r = 0L;
        Fa fa1 = fa0.f(1);
        if(zzgt0 != null) {
            fa1 = fa1.e(zzgt0);
        }
        ++this.v;
        this.i.p.zza(6).zza();
        this.l(fa1, 0, 1, false, fa1.a.zzo() && !this.N.a.zzo(), 4, this.b(fa1), -1);
    }

    public final void k(int v, int v1, boolean z) {
        int v2 = 0;
        boolean z1 = z && v != -1;
        if(z1 && v != 1) {
            v2 = 1;
        }
        Fa fa0 = this.N;
        if(fa0.l == z1 && fa0.m == v2) {
            return;
        }
        ++this.v;
        Fa fa1 = fa0.d(v2, z1);
        this.i.p.zzc(1, ((int)z1), v2).zza();
        this.l(fa1, 0, v1, false, false, 5, 0x8000000000000001L, -1);
    }

    public final void l(Fa fa0, int v, int v1, boolean z, boolean z1, int v2, long v3, int v4) {
        Object object4;
        zzbb zzbb3;
        Object object3;
        int v19;
        long v17;
        long v16;
        int v15;
        zzbb zzbb2;
        Object object1;
        Object object0;
        int v14;
        int v13;
        int v12;
        boolean z10;
        boolean z9;
        zzbb zzbb0;
        Pair pair0;
        Fa fa1 = this.N;
        this.N = fa0;
        boolean z2 = fa1.a.equals(fa0.a);
        zzci zzci0 = fa1.a;
        zzci zzci1 = fa0.a;
        if(zzci1.zzo() && zzci0.zzo()) {
            pair0 = new Pair(Boolean.FALSE, -1);
        }
        else if(zzci1.zzo() != zzci0.zzo()) {
            pair0 = new Pair(Boolean.TRUE, 3);
        }
        else if(zzci0.zze(zzci0.zzn(fa1.b.zza, this.l).zzd, this.a, 0L).zzc.equals(zzci1.zze(zzci1.zzn(fa0.b.zza, this.l).zzd, this.a, 0L).zzc)) {
            pair0 = !z1 || v2 != 0 || fa1.b.zzd >= fa0.b.zzd ? new Pair(Boolean.FALSE, -1) : new Pair(Boolean.TRUE, 0);
        }
        else if(z1 && v2 == 0) {
            pair0 = new Pair(Boolean.TRUE, 1);
        }
        else if(!z1 || v2 != 1) {
            if(z2) {
                throw new IllegalStateException();
            }
            pair0 = new Pair(Boolean.TRUE, 3);
        }
        else {
            pair0 = new Pair(Boolean.TRUE, 2);
        }
        boolean z3 = ((Boolean)pair0.first).booleanValue();
        int v6 = (int)(((Integer)pair0.second));
        zzbh zzbh0 = this.A;
        if(z3) {
            if(fa0.a.zzo()) {
                zzbb0 = null;
            }
            else {
                zzcf zzcf0 = fa0.a.zzn(fa0.b.zza, this.l);
                zzbb0 = fa0.a.zze(zzcf0.zzd, this.a, 0L).zzd;
            }
            this.M = zzbh.zza;
        }
        else {
            zzbb0 = null;
        }
        if(z3 || !fa1.j.equals(fa0.j)) {
            zzbf zzbf0 = this.M.zza();
            List list0 = fa0.j;
            int v7 = 0;
            for(int v5 = 0; v7 < list0.size(); v5 = 0) {
                zzbl zzbl0 = (zzbl)list0.get(v7);
                while(v5 < zzbl0.zza()) {
                    zzbl0.zzb(v5).zza(zzbf0);
                    ++v5;
                }
                ++v7;
            }
            this.M = zzbf0.zzv();
            zzci zzci2 = this.zzn();
            if(zzci2.zzo()) {
                zzbh0 = this.M;
            }
            else {
                zzbb zzbb1 = zzci2.zze(this.zzf(), this.a, 0L).zzd;
                zzbf zzbf1 = this.M.zza();
                zzbf1.zzb(zzbb1.zzg);
                zzbh0 = zzbf1.zzv();
            }
        }
        boolean z4 = zzbh0.equals(this.A);
        this.A = zzbh0;
        boolean z5 = fa1.l;
        boolean z6 = fa0.l;
        int v8 = fa1.e;
        int v9 = fa0.e;
        if(v8 != v9 || z5 != z6) {
            switch(this.zzh()) {
                case 2: 
                case 3: {
                    this.m();
                    this.zzq();
                    this.zzq();
                }
            }
        }
        boolean z7 = fa1.g;
        boolean z8 = fa0.g;
        if(fa1.a.equals(fa0.a)) {
            z9 = z5;
        }
        else {
            z9 = z5;
            zzhu zzhu0 = new zzhu(fa0, v);
            this.j.zzd(0, zzhu0);
        }
        if(z1) {
            zzcf zzcf1 = new zzcf();
            if(fa1.a.zzo()) {
                z10 = z6;
                v12 = v8;
                v13 = v9;
                v15 = v4;
                object1 = null;
                zzbb2 = null;
                object0 = null;
                v14 = -1;
            }
            else {
                fa1.a.zzn(fa1.b.zza, zzcf1);
                int v10 = zzcf1.zzd;
                z10 = z6;
                int v11 = fa1.a.zza(fa1.b.zza);
                v12 = v8;
                v13 = v9;
                zzch zzch0 = fa1.a.zze(v10, this.a, 0L);
                v14 = v11;
                object0 = fa1.b.zza;
                object1 = zzch0.zzc;
                zzbb2 = this.a.zzd;
                v15 = v10;
            }
            if(v2 != 0) {
                if(fa1.b.zzb()) {
                    v16 = fa1.s;
                    v17 = ta.c(fa1);
                }
                else {
                    v16 = fa1.s;
                    v17 = v16;
                }
            }
            else if(fa1.b.zzb()) {
                v16 = zzcf1.zzg(fa1.b.zzb, fa1.b.zzc);
                v17 = ta.c(fa1);
            }
            else {
                v16 = fa1.b.zze == -1 ? zzcf1.zze : ta.c(this.N);
                v17 = v16;
            }
            zzca zzca0 = new zzca(object1, v15, zzbb2, object0, v14, zzeg.zzz(v16), zzeg.zzz(v17), fa1.b.zzb, fa1.b.zzc);
            int v18 = this.zzf();
            if(this.N.a.zzo()) {
                object3 = null;
                zzbb3 = null;
                object4 = null;
                v19 = -1;
            }
            else {
                Object object2 = this.N.b.zza;
                this.N.a.zzn(object2, this.l);
                v19 = this.N.a.zza(object2);
                object3 = this.N.a.zze(v18, this.a, 0L).zzc;
                zzbb3 = this.a.zzd;
                object4 = object2;
            }
            long v20 = zzeg.zzz(v3);
            zzia zzia0 = new zzia(v2, zzca0, new zzca(object3, v18, zzbb3, object4, v19, v20, (this.N.b.zzb() ? zzeg.zzz(ta.c(this.N)) : v20), this.N.b.zzb, this.N.b.zzc));
            this.j.zzd(11, zzia0);
        }
        else {
            z10 = z6;
            v12 = v8;
            v13 = v9;
        }
        if(z3) {
            zzhf zzhf0 = new zzhf(zzbb0, v6);
            this.j.zzd(1, zzhf0);
        }
        if(fa1.f != fa0.f) {
            zzhg zzhg0 = new zzhg(fa0);
            this.j.zzd(10, zzhg0);
            if(fa0.f != null) {
                zzhh zzhh0 = new zzhh(fa0);
                this.j.zzd(10, zzhh0);
            }
        }
        zzvn zzvn0 = fa0.i;
        if(fa1.i != zzvn0) {
            this.g.zzk(zzvn0.zze);
            zzhi zzhi0 = new zzhi(fa0);
            this.j.zzd(2, zzhi0);
        }
        if(!z4) {
            zzhj zzhj0 = new zzhj(this.A);
            this.j.zzd(14, zzhj0);
        }
        if(z7 != z8) {
            zzhk zzhk0 = new zzhk(fa0);
            this.j.zzd(3, zzhk0);
        }
        if(v12 != v13 || z9 != z10) {
            zzhl zzhl0 = new zzhl(fa0);
            this.j.zzd(-1, zzhl0);
        }
        if(v12 != v13) {
            zzhm zzhm0 = new zzhm(fa0);
            this.j.zzd(4, zzhm0);
        }
        if(z9 != z10) {
            zzhv zzhv0 = new zzhv(fa0, v1);
            this.j.zzd(5, zzhv0);
        }
        if(fa1.m != fa0.m) {
            zzhw zzhw0 = new zzhw(fa0);
            this.j.zzd(6, zzhw0);
        }
        if(ta.n(fa1) != ta.n(fa0)) {
            zzhx zzhx0 = new zzhx(fa0);
            this.j.zzd(7, zzhx0);
        }
        if(!fa1.n.equals(fa0.n)) {
            zzhy zzhy0 = new zzhy(fa0);
            this.j.zzd(12, zzhy0);
        }
        if(z) {
            this.j.zzd(-1, zzhz.zza);
        }
        zzbx zzbx0 = this.z;
        zzbx zzbx1 = zzeg.zzF(this.e, this.c);
        this.z = zzbx1;
        if(!zzbx1.equals(zzbx0)) {
            zzhn zzhn0 = new zzhn(this);
            this.j.zzd(13, zzhn0);
        }
        this.j.zzc();
        if(fa1.o != fa0.o) {
            for(Object object5: this.k) {
                ((zzgu)object5).zza(fa0.o);
            }
        }
        if(fa1.p != fa0.p) {
            for(Object object6: this.k) {
                ((zzgu)object6).zzb(fa0.p);
            }
        }
    }

    public final void m() {
        this.d.zzb();
        Looper looper0 = this.p;
        if(Thread.currentThread() != looper0.getThread()) {
            String s = zzeg.zzH("Player is accessed on the wrong thread.\nCurrent thread: \'%s\'\nExpected thread: \'%s\'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", new Object[]{"dexdec-sb-st-5", looper0.getThread().getName()});
            if(this.J) {
                throw new IllegalStateException(s);
            }
            zzdn.zzb("ExoPlayerImpl", s, (this.K ? null : new IllegalStateException()));
            this.K = true;
        }
    }

    public static boolean n(Fa fa0) {
        return fa0.e == 3 && fa0.l && fa0.m == 0;
    }

    public final long o() {
        this.m();
        if(!this.zzs()) {
            zzci zzci0 = this.zzn();
            return zzci0.zzo() ? 0x8000000000000001L : zzeg.zzz(zzci0.zze(this.zzf(), this.a, 0L).zzn);
        }
        zzsa zzsa0 = this.N.b;
        this.N.a.zzn(zzsa0.zza, this.l);
        return zzeg.zzz(this.l.zzg(zzsa0.zzb, zzsa0.zzc));
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzd() {
        this.m();
        return this.zzs() ? this.N.b.zzb : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zze() {
        this.m();
        return this.zzs() ? this.N.b.zzc : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzf() {
        this.m();
        int v = this.a();
        return v == -1 ? 0 : v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzg() {
        this.m();
        return this.N.a.zzo() ? 0 : this.N.a.zza(this.N.b.zza);
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzh() {
        this.m();
        return this.N.e;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzi() {
        this.m();
        return this.N.m;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final int zzj() {
        this.m();
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final long zzk() {
        this.m();
        if(this.zzs()) {
            this.N.a.zzn(this.N.b.zza, this.l);
            Fa fa0 = this.N;
            if(fa0.c == 0x8000000000000001L) {
                int v = this.zzf();
                fa0.a.zze(v, this.a, 0L);
                return zzeg.zzz(0L);
            }
            return zzeg.zzz(0L) + zzeg.zzz(this.N.c);
        }
        return this.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final long zzl() {
        this.m();
        return zzeg.zzz(this.b(this.N));
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final long zzm() {
        this.m();
        return zzeg.zzz(this.N.r);
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final zzci zzn() {
        this.m();
        return this.N.a;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final zzct zzo() {
        this.m();
        return this.N.i.zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final void zzp(int v, long v1) {
        this.m();
        this.o.zzx();
        zzci zzci0 = this.N.a;
        if(v < 0 || !zzci0.zzo() && v >= zzci0.zzc()) {
            throw new zzae(zzci0, v, v1);
        }
        int v2 = 1;
        ++this.v;
        if(this.zzs()) {
            Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            zziu zziu0 = new zziu(this.N);
            zziu0.zza(1);
            this.Q.zza.getClass();
            zzhq zzhq0 = new zzhq(this.Q.zza, zziu0);
            this.Q.zza.h.zzg(zzhq0);
            return;
        }
        if(this.zzh() != 1) {
            v2 = 2;
        }
        int v3 = this.zzf();
        Fa fa0 = this.f(this.N.f(v2), zzci0, this.d(zzci0, v, v1));
        this.i.getClass();
        wa wa0 = new wa(zzci0, v, zzeg.zzv(v1));
        this.i.p.zzb(3, wa0).zza();
        this.l(fa0, 0, 1, true, true, 1, this.b(fa0), v3);
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final boolean zzq() {
        this.m();
        return this.N.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final boolean zzr() {
        this.m();
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcb
    public final boolean zzs() {
        this.m();
        return this.N.b.zzb();
    }
}

