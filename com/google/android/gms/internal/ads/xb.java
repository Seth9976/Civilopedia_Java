package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import f0.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class xb implements zzry, zzto, zzwb, zzwg, zzyu {
    public boolean A;
    public g B;
    public zzzu C;
    public long D;
    public boolean E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public long L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public final zzvv Q;
    public static final Map R;
    public static final zzad S;
    public final Uri i;
    public final zzeq j;
    public final zzpi k;
    public final zzsj l;
    public final zzth m;
    public final long n;
    public final zzwj o;
    public final zzrd p;
    public final zzcz q;
    public final zzsu r;
    public final zzsv s;
    public final Handler t;
    public zzrx u;
    public zzabk v;
    public zztp[] w;
    public wb[] x;
    public boolean y;
    public boolean z;

    static {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("Icy-MetaData", "1");
        xb.R = Collections.unmodifiableMap(hashMap0);
        zzab zzab0 = new zzab();
        zzab0.zzH("icy");
        zzab0.zzS("application/x-icy");
        xb.S = zzab0.zzY();
    }

    public xb(Uri uri0, zzeq zzeq0, zzrd zzrd0, zzpi zzpi0, zzpc zzpc0, zzsj zzsj0, zzth zzth0, zzvv zzvv0, int v) {
        this.i = uri0;
        this.j = zzeq0;
        this.k = zzpi0;
        this.l = zzsj0;
        this.m = zzth0;
        this.Q = zzvv0;
        this.n = (long)v;
        this.o = new zzwj("ProgressiveMediaPeriod");
        this.p = zzrd0;
        this.q = new zzcz(zzcx.zza);
        this.r = new zzsu(this);
        this.s = new zzsv(this);
        this.t = zzeg.zzC(null);
        this.x = new wb[0];
        this.w = new zztp[0];
        this.L = 0x8000000000000001L;
        this.J = -1L;
        this.D = 0x8000000000000001L;
        this.F = 1;
    }

    public final int a() {
        zztp[] arr_zztp = this.w;
        int v1 = 0;
        for(int v = 0; v < arr_zztp.length; ++v) {
            v1 += arr_zztp[v].zzc();
        }
        return v1;
    }

    public final long b() {
        zztp[] arr_zztp = this.w;
        long v = 0x8000000000000000L;
        for(int v1 = 0; v1 < arr_zztp.length; ++v1) {
            v = Math.max(v, arr_zztp[v1].zzg());
        }
        return v;
    }

    public final zztp c(wb wb0) {
        int v = this.w.length;
        for(int v1 = 0; v1 < v; ++v1) {
            if(wb0.equals(this.x[v1])) {
                return this.w[v1];
            }
        }
        this.k.getClass();
        zztp zztp0 = new zztp(this.Q, this.k);
        zztp0.zzu(this);
        wb[] arr_wb = (wb[])Arrays.copyOf(this.x, v + 1);
        arr_wb[v] = wb0;
        this.x = arr_wb;
        zztp[] arr_zztp = (zztp[])Arrays.copyOf(this.w, v + 1);
        arr_zztp[v] = zztp0;
        this.w = arr_zztp;
        return zztp0;
    }

    public final void d() {
        zzcw.zzf(this.z);
        this.B.getClass();
        this.C.getClass();
    }

    public final void e() {
        if(!this.P && !this.z && this.y && this.C != null) {
            zztp[] arr_zztp = this.w;
            for(int v = 0; v < arr_zztp.length; ++v) {
                if(arr_zztp[v].zzh() == null) {
                    return;
                }
            }
            this.q.zzc();
            int v1 = this.w.length;
            zzck[] arr_zzck = new zzck[v1];
            boolean[] arr_z = new boolean[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                zzad zzad0 = this.w[v2].zzh();
                zzad0.getClass();
                boolean z = zzbo.zzg(zzad0.zzm);
                boolean z1 = z || zzbo.zzh(zzad0.zzm);
                arr_z[v2] = z1;
                this.A |= z1;
                zzabk zzabk0 = this.v;
                if(zzabk0 != null) {
                    if(z || this.x[v2].b) {
                        zzbl zzbl0 = zzad0.zzk == null ? new zzbl(new zzbk[]{zzabk0}) : zzad0.zzk.zzc(new zzbk[]{zzabk0});
                        zzab zzab0 = zzad0.zzb();
                        zzab0.zzM(zzbl0);
                        zzad0 = zzab0.zzY();
                    }
                    if(z && zzad0.zzg == -1 && zzad0.zzh == -1) {
                        int v3 = zzabk0.zza;
                        if(v3 != -1) {
                            zzab zzab1 = zzad0.zzb();
                            zzab1.zzv(v3);
                            zzad0 = zzab1.zzY();
                        }
                    }
                }
                arr_zzck[v2] = new zzck(Integer.toString(v2), new zzad[]{zzad0.zzc(this.k.zza(zzad0))});
            }
            this.B = new g(new zzty(arr_zzck), arr_z);
            this.z = true;
            zzrx zzrx0 = this.u;
            zzrx0.getClass();
            zzrx0.zzi(this);
        }
    }

    public final void f(int v) {
        this.d();
        g g0 = this.B;
        boolean[] arr_z = (boolean[])g0.m;
        if(!arr_z[v]) {
            zzad zzad0 = ((zzty)g0.j).zzb(v).zzb(0);
            int v1 = zzbo.zzb(zzad0.zzm);
            this.l.zzd(v1, zzad0, 0, null, this.K);
            arr_z[v] = true;
        }
    }

    public final void g(int v) {
        this.d();
        if(this.M && ((boolean[])this.B.k)[v] && !this.w[v].zzx(false)) {
            this.L = 0L;
            this.M = false;
            this.H = true;
            this.K = 0L;
            this.N = 0;
            zztp[] arr_zztp = this.w;
            for(int v1 = 0; v1 < arr_zztp.length; ++v1) {
                arr_zztp[v1].zzp(false);
            }
            zzrx zzrx0 = this.u;
            zzrx0.getClass();
            zzrx0.zzg(this);
        }
    }

    public final void h() {
        ub ub0 = new ub(this, this.i, this.j, this.p, this, this.q);
        if(this.z) {
            zzcw.zzf(this.i());
            if(this.D != 0x8000000000000001L && this.L > this.D) {
                this.O = true;
                this.L = 0x8000000000000001L;
                return;
            }
            zzzu zzzu0 = this.C;
            zzzu0.getClass();
            ub0.g.zza = zzzu0.zzg(this.L).zza.zzc;
            ub0.j = this.L;
            ub0.i = true;
            ub0.n = false;
            zztp[] arr_zztp = this.w;
            for(int v = 0; v < arr_zztp.length; ++v) {
                arr_zztp[v].zzt(this.L);
            }
            this.L = 0x8000000000000001L;
        }
        this.N = this.a();
        long v1 = this.o.zza(ub0, this, zzvz.zza(this.F));
        zzev zzev0 = ub0.k;
        Map map0 = Collections.emptyMap();
        zzrr zzrr0 = new zzrr(ub0.a, zzev0, zzev0.zza, map0, v1, 0L, 0L);
        this.l.zzl(zzrr0, 1, -1, null, 0, null, ub0.j, this.D);
    }

    public final boolean i() {
        return this.L != 0x8000000000000001L;
    }

    // 去混淆评级： 低(20)
    public final boolean j() {
        return this.H || this.i();
    }

    @Override  // com.google.android.gms.internal.ads.zzyu
    public final void zzB() {
        this.y = true;
        this.t.post(this.r);
    }

    @Override  // com.google.android.gms.internal.ads.zzwb
    public final void zzG(zzwf zzwf0, long v, long v1, boolean z) {
        zzev zzev0 = ((ub)zzwf0).k;
        Uri uri0 = ((ub)zzwf0).c.zzh();
        Map map0 = ((ub)zzwf0).c.zzi();
        long v2 = ((ub)zzwf0).c.zzg();
        zzrr zzrr0 = new zzrr(((ub)zzwf0).a, zzev0, uri0, map0, v, v1, v2);
        this.l.zzf(zzrr0, 1, -1, null, 0, null, ((ub)zzwf0).j, this.D);
        if(!z) {
            if(this.J == -1L) {
                this.J = ((ub)zzwf0).l;
            }
            zztp[] arr_zztp = this.w;
            for(int v3 = 0; v3 < arr_zztp.length; ++v3) {
                arr_zztp[v3].zzp(false);
            }
            if(this.I > 0) {
                zzrx zzrx0 = this.u;
                zzrx0.getClass();
                zzrx0.zzg(this);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzwb
    public final void zzH(zzwf zzwf0, long v, long v1) {
        if(this.D == 0x8000000000000001L) {
            zzzu zzzu0 = this.C;
            if(zzzu0 != null) {
                boolean z = zzzu0.zzh();
                long v2 = this.b();
                long v3 = v2 == 0x8000000000000000L ? 0L : v2 + 10000L;
                this.D = v3;
                this.m.zza(v3, z, this.E);
            }
        }
        zzev zzev0 = ((ub)zzwf0).k;
        Uri uri0 = ((ub)zzwf0).c.zzh();
        Map map0 = ((ub)zzwf0).c.zzi();
        long v4 = ((ub)zzwf0).c.zzg();
        zzrr zzrr0 = new zzrr(((ub)zzwf0).a, zzev0, uri0, map0, v, v1, v4);
        this.l.zzh(zzrr0, 1, -1, null, 0, null, ((ub)zzwf0).j, this.D);
        if(this.J == -1L) {
            this.J = ((ub)zzwf0).l;
        }
        this.O = true;
        zzrx zzrx0 = this.u;
        zzrx0.getClass();
        zzrx0.zzg(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzwg
    public final void zzI() {
        zztp[] arr_zztp = this.w;
        for(int v = 0; v < arr_zztp.length; ++v) {
            arr_zztp[v].zzo();
        }
        this.p.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzto
    public final void zzJ(zzad zzad0) {
        this.t.post(this.r);
    }

    @Override  // com.google.android.gms.internal.ads.zzyu
    public final void zzL(zzzu zzzu0) {
        zzsw zzsw0 = new zzsw(this, zzzu0);
        this.t.post(zzsw0);
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zza(long v, zzjw zzjw0) {
        long v4;
        this.d();
        if(!this.C.zzh()) {
            return 0L;
        }
        zzzs zzzs0 = this.C.zzg(v);
        long v1 = zzzs0.zza.zzb;
        long v2 = zzzs0.zzb.zzb;
        long v3 = zzjw0.zzf;
        if(v3 == 0L) {
            if(zzjw0.zzg == 0L) {
                return v;
            }
            v4 = 0L;
        }
        else {
            v4 = v3;
        }
        long v5 = zzeg.zzx(v, v4, 0x8000000000000000L);
        long v6 = zzeg.zzq(v, zzjw0.zzg, 0x7FFFFFFFFFFFFFFFL);
        boolean z = true;
        boolean z1 = v5 <= v1 && v1 <= v6;
        if(v5 > v2 || v2 > v6) {
            z = false;
        }
        if(z1 && z) {
            return Math.abs(v1 - v) <= Math.abs(v2 - v) ? v1 : v2;
        }
        if(z1) {
            return v1;
        }
        return z ? v2 : v5;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzb() {
        long v1;
        this.d();
        boolean[] arr_z = (boolean[])this.B.k;
        if(this.O) {
            return 0x8000000000000000L;
        }
        if(this.i()) {
            return this.L;
        }
        if(this.A) {
            v1 = 0x7FFFFFFFFFFFFFFFL;
            for(int v = 0; v < this.w.length; ++v) {
                if(arr_z[v] && !this.w[v].zzw()) {
                    v1 = Math.min(v1, this.w[v].zzg());
                }
            }
        }
        else {
            v1 = 0x7FFFFFFFFFFFFFFFL;
        }
        if(v1 == 0x7FFFFFFFFFFFFFFFL) {
            v1 = this.b();
        }
        return v1 == 0x8000000000000000L ? this.K : v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzc() {
        return this.I == 0 ? 0x8000000000000000L : this.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        if(this.H && (this.O || this.a() > this.N)) {
            this.H = false;
            return this.K;
        }
        return 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zze(long v) {
        this.d();
        boolean[] arr_z = (boolean[])this.B.k;
        if(!this.C.zzh()) {
            v = 0L;
        }
        this.H = false;
        this.K = v;
        if(this.i()) {
            this.L = v;
            return v;
        }
        if(this.F != 7) {
            int v2 = 0;
            while(v2 < this.w.length) {
                if(!this.w[v2].zzy(v, false) && (arr_z[v2] || !this.A)) {
                    goto label_17;
                }
                ++v2;
            }
            return v;
        }
    label_17:
        this.M = false;
        this.L = v;
        this.O = false;
        zzwj zzwj0 = this.o;
        if(zzwj0.zzl()) {
            zztp[] arr_zztp = this.w;
            for(int v1 = 0; v1 < arr_zztp.length; ++v1) {
                arr_zztp[v1].zzj();
            }
            zzwj0.zzg();
            return v;
        }
        zzwj0.zzh();
        zztp[] arr_zztp1 = this.w;
        for(int v3 = 0; v3 < arr_zztp1.length; ++v3) {
            arr_zztp1[v3].zzp(false);
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final long zzf(zzvg[] arr_zzvg, boolean[] arr_z, zztq[] arr_zztq, boolean[] arr_z1, long v) {
        boolean z;
        boolean[] arr_z2;
        this.d();
        g g0 = this.B;
        zzty zzty0 = (zzty)g0.j;
        int v1 = this.I;
        int v2 = 0;
        for(int v3 = 0; true; ++v3) {
            arr_z2 = (boolean[])g0.l;
            if(v3 >= arr_zzvg.length) {
                break;
            }
            zztq zztq0 = arr_zztq[v3];
            if(zztq0 != null && (arr_zzvg[v3] == null || !arr_z[v3])) {
                zzcw.zzf(arr_z2[((vb)zztq0).a]);
                --this.I;
                arr_z2[((vb)zztq0).a] = false;
                arr_zztq[v3] = null;
            }
        }
        if(!this.G) {
            if(v == 0L) {
                v = 0L;
                z = false;
            }
            else {
                z = true;
            }
        }
        else if(v1 != 0) {
            z = false;
        }
        else {
            z = true;
        }
        for(int v4 = 0; v4 < arr_zzvg.length; ++v4) {
            if(arr_zztq[v4] == null) {
                zzvg zzvg0 = arr_zzvg[v4];
                if(zzvg0 != null) {
                    zzcw.zzf(zzvg0.zzc() == 1);
                    zzcw.zzf(zzvg0.zza(0) == 0);
                    int v5 = zzty0.zza(zzvg0.zze());
                    zzcw.zzf(!arr_z2[v5]);
                    ++this.I;
                    arr_z2[v5] = true;
                    arr_zztq[v4] = new vb(this, v5);
                    arr_z1[v4] = true;
                    if(!z) {
                        zztp zztp0 = this.w[v5];
                        z = !zztp0.zzy(v, true) && zztp0.zza() != 0;
                    }
                }
            }
        }
        if(this.I == 0) {
            this.M = false;
            this.H = false;
            zzwj zzwj0 = this.o;
            if(zzwj0.zzl()) {
                zztp[] arr_zztp = this.w;
                while(v2 < arr_zztp.length) {
                    arr_zztp[v2].zzj();
                    ++v2;
                }
                zzwj0.zzg();
            }
            else {
                zztp[] arr_zztp1 = this.w;
                for(int v6 = 0; v6 < arr_zztp1.length; ++v6) {
                    arr_zztp1[v6].zzp(false);
                }
            }
        }
        else if(z) {
            v = this.zze(v);
            while(v2 < arr_zztq.length) {
                if(arr_zztq[v2] != null) {
                    arr_z1[v2] = true;
                }
                ++v2;
            }
        }
        this.G = true;
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        this.d();
        return (zzty)this.B.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzj(long v, boolean z) {
        this.d();
        if(this.i()) {
            return;
        }
        boolean[] arr_z = (boolean[])this.B.l;
        for(int v1 = 0; v1 < this.w.length; ++v1) {
            this.w[v1].zzi(v, false, arr_z[v1]);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzk() {
        this.o.zzi(zzvz.zza(this.F));
        if(this.O && !this.z) {
            throw zzbp.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrx0, long v) {
        this.u = zzrx0;
        this.q.zze();
        this.h();
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final void zzm(long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzo(long v) {
        if(!this.O) {
            zzwj zzwj0 = this.o;
            if(!zzwj0.zzk() && !this.M && (!this.z || this.I != 0)) {
                boolean z = this.q.zze();
                if(!zzwj0.zzl()) {
                    this.h();
                    return true;
                }
                return z;
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzry
    public final boolean zzp() {
        return this.o.zzl() && this.q.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzwb
    public final zzwd zzt(zzwf zzwf0, long v, long v1, IOException iOException0, int v2) {
        zzwd zzwd0;
        long v4;
        if(this.J == -1L) {
            this.J = ((ub)zzwf0).l;
        }
        zzev zzev0 = ((ub)zzwf0).k;
        Uri uri0 = ((ub)zzwf0).c.zzh();
        Map map0 = ((ub)zzwf0).c.zzi();
        long v3 = ((ub)zzwf0).c.zzg();
        zzrr zzrr0 = new zzrr(((ub)zzwf0).a, zzev0, uri0, map0, v, v1, v3);
        zzwa zzwa0 = new zzwa(zzrr0, new zzrw(1, -1, null, 0, null, zzeg.zzz(((ub)zzwf0).j), zzeg.zzz(this.D)), iOException0, v2);
        Throwable throwable0 = zzwa0.zzc;
        if(throwable0 instanceof zzbp || throwable0 instanceof FileNotFoundException || throwable0 instanceof zzfi || throwable0 instanceof zzwi) {
        label_16:
            v4 = 0x8000000000000001L;
        }
        else {
            while(throwable0 != null) {
                if(throwable0 instanceof zzer && ((zzer)throwable0).zza == 2008) {
                    goto label_16;
                }
                throwable0 = throwable0.getCause();
            }
            v4 = (long)Math.min((zzwa0.zzd - 1) * 1000, 5000);
        }
        if(v4 == 0x8000000000000001L) {
            zzwd0 = zzwj.zzd;
        }
        else {
            int v5 = this.a();
            boolean z = v5 > this.N;
            if(this.J != -1L || this.C != null && this.C.zze() != 0x8000000000000001L) {
                this.N = v5;
                zzwd0 = zzwj.zzb(z, v4);
            }
            else {
                boolean z1 = this.z;
                if(!z1 || this.j()) {
                    this.H = z1;
                    this.K = 0L;
                    this.N = 0;
                    zztp[] arr_zztp = this.w;
                    for(int v6 = 0; v6 < arr_zztp.length; ++v6) {
                        arr_zztp[v6].zzp(false);
                    }
                    ((ub)zzwf0).g.zza = 0L;
                    ((ub)zzwf0).j = 0L;
                    ((ub)zzwf0).i = true;
                    ((ub)zzwf0).n = false;
                    zzwd0 = zzwj.zzb(z, v4);
                }
                else {
                    this.M = true;
                    zzwd0 = zzwj.zzc;
                }
            }
        }
        boolean z2 = zzwd0.zzc();
        this.l.zzj(zzrr0, 1, -1, null, 0, null, ((ub)zzwf0).j, this.D, iOException0, !z2);
        return zzwd0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyu
    public final zzzy zzv(int v, int v1) {
        return this.c(new wb(v, false));
    }
}

