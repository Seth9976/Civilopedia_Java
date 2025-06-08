package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

public final class o1 implements zzatx, zzawz, zzaxj, zzayt {
    public boolean A;
    public boolean B;
    public int C;
    public zzaxq D;
    public long E;
    public boolean[] F;
    public boolean[] G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public boolean M;
    public boolean N;
    public final zzaym O;
    public final Uri i;
    public final zzayj j;
    public final int k;
    public final Handler l;
    public final zzaww m;
    public final zzawx n;
    public final long o;
    public final zzayx p;
    public final S8 q;
    public final zzazb r;
    public final l1 s;
    public final l1 t;
    public final Handler u;
    public final SparseArray v;
    public zzawy w;
    public zzaud x;
    public boolean y;
    public boolean z;

    public o1(Uri uri0, zzayj zzayj0, zzatw[] arr_zzatw, int v, Handler handler0, zzaww zzaww0, zzawx zzawx0, zzaym zzaym0, int v1) {
        this.i = uri0;
        this.j = zzayj0;
        this.k = v;
        this.l = handler0;
        this.m = zzaww0;
        this.n = zzawx0;
        this.O = zzaym0;
        this.o = (long)v1;
        this.p = new zzayx("Loader:ExtractorMediaPeriod");
        this.q = new S8(arr_zzatw, this);
        this.r = new zzazb();
        this.s = new l1(this, 0);
        this.t = new l1(this, 1);
        this.u = new Handler();
        this.K = 0x8000000000000001L;
        this.v = new SparseArray();
        this.I = -1L;
    }

    public final int a() {
        SparseArray sparseArray0 = this.v;
        int v = sparseArray0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((zzaxk)sparseArray0.valueAt(v1)).zze();
        }
        return v2;
    }

    public final void b() {
        m1 m10 = new m1(this, this.i, this.j, this.q, this.r);
        if(this.z) {
            zzayz.zze(this.c());
            if(this.E != 0x8000000000000001L && this.K >= this.E) {
                this.M = true;
                this.K = 0x8000000000000001L;
                return;
            }
            m10.e.zza = this.x.zzb(this.K);
            m10.h = this.K;
            m10.g = true;
            this.K = 0x8000000000000001L;
        }
        this.L = this.a();
        int v = this.k != -1 || !this.z || this.I != -1L || this.x != null && this.x.zza() != 0x8000000000000001L ? this.k : 6;
        this.p.zza(m10, this, v);
    }

    public final boolean c() {
        return this.K != 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzB(zzaxu[] arr_zzaxu, boolean[] arr_z, zzaxl[] arr_zzaxl, boolean[] arr_z1, long v) {
        SparseArray sparseArray0;
        zzayz.zze(this.z);
        for(int v2 = 0; true; ++v2) {
            sparseArray0 = this.v;
            if(v2 >= arr_zzaxu.length) {
                break;
            }
            zzaxl zzaxl0 = arr_zzaxl[v2];
            if(zzaxl0 != null && (arr_zzaxu[v2] == null || !arr_z[v2])) {
                zzayz.zze(this.F[((n1)zzaxl0).a]);
                --this.C;
                this.F[((n1)zzaxl0).a] = false;
                ((zzaxk)sparseArray0.valueAt(((n1)zzaxl0).a)).zzi();
                arr_zzaxl[v2] = null;
            }
        }
        boolean z = false;
        for(int v3 = 0; v3 < arr_zzaxu.length; ++v3) {
            if(arr_zzaxl[v3] == null) {
                zzaxu zzaxu0 = arr_zzaxu[v3];
                if(zzaxu0 != null) {
                    zzayz.zze(zzaxu0.zza(0) == 0);
                    int v4 = this.D.zza(zzaxu0.zzd());
                    zzayz.zze(!this.F[v4]);
                    ++this.C;
                    this.F[v4] = true;
                    arr_zzaxl[v3] = new n1(this, v4);
                    arr_z1[v3] = true;
                    z = true;
                }
            }
        }
        if(!this.A) {
            int v5 = sparseArray0.size();
            for(int v6 = 0; v6 < v5; ++v6) {
                if(!this.F[v6]) {
                    ((zzaxk)sparseArray0.valueAt(v6)).zzi();
                }
            }
        }
        if(this.C == 0) {
            this.B = false;
            zzayx zzayx0 = this.p;
            if(zzayx0.zzi()) {
                zzayx0.zzf();
            }
        }
        else if(!this.A) {
            if(v == 0L) {
                v = 0L;
            }
            else {
                v = this.zzi(v);
            label_52:
                for(int v1 = 0; v1 < arr_zzaxl.length; ++v1) {
                    if(arr_zzaxl[v1] != null) {
                        arr_z1[v1] = true;
                    }
                }
            }
        }
        else if(z) {
            v = this.zzi(v);
            goto label_52;
        }
        this.A = true;
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zza() {
        return this.C == 0 ? 0x8000000000000000L : this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzatx
    public final void zzb() {
        this.y = true;
        this.u.post(this.s);
    }

    @Override  // com.google.android.gms.internal.ads.zzatx
    public final zzauf zzbi(int v, int v1) {
        SparseArray sparseArray0 = this.v;
        zzauf zzauf0 = (zzaxk)sparseArray0.get(v);
        if(zzauf0 == null) {
            zzauf0 = new zzaxk(this.O, null);
            ((zzaxk)zzauf0).zzk(this);
            sparseArray0.put(v, zzauf0);
        }
        return zzauf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final boolean zzbj(long v) {
        if(!this.M && (!this.z || this.C != 0)) {
            boolean z = this.r.zzc();
            if(!this.p.zzi()) {
                this.b();
                return true;
            }
            return z;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzatx
    public final void zzc(zzaud zzaud0) {
        this.x = zzaud0;
        this.u.post(this.s);
    }

    @Override  // com.google.android.gms.internal.ads.zzayt
    public final int zzd(zzayv zzayv0, long v, long v1, IOException iOException0) {
        if(this.I == -1L) {
            this.I = ((m1)zzayv0).i;
        }
        Handler handler0 = this.l;
        if(handler0 != null) {
            handler0.post(new m0(3, this, iOException0));
        }
        if(iOException0 instanceof zzaxr) {
            return 3;
        }
        int v2 = this.a();
        int v3 = this.L;
        if(this.I == -1L && (this.x == null || this.x.zza() == 0x8000000000000001L)) {
            this.J = 0L;
            this.B = this.z;
            SparseArray sparseArray0 = this.v;
            int v4 = sparseArray0.size();
            for(int v5 = 0; v5 < v4; ++v5) {
                ((zzaxk)sparseArray0.valueAt(v5)).zzj(!this.z || this.F[v5]);
            }
            ((m1)zzayv0).e.zza = 0L;
            ((m1)zzayv0).h = 0L;
            ((m1)zzayv0).g = true;
        }
        this.L = this.a();
        return v2 > v3 ? 1 : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzg() {
        long v2;
        if(this.M) {
            return 0x8000000000000000L;
        }
        if(this.c()) {
            return this.K;
        }
        int v = 0;
        SparseArray sparseArray0 = this.v;
        if(this.H) {
            int v1 = sparseArray0.size();
            v2 = 0x7FFFFFFFFFFFFFFFL;
            while(v < v1) {
                if(this.G[v]) {
                    v2 = Math.min(v2, ((zzaxk)sparseArray0.valueAt(v)).zzg());
                }
                ++v;
            }
            return v2 == 0x8000000000000000L ? this.J : v2;
        }
        int v3 = sparseArray0.size();
        v2 = 0x8000000000000000L;
        while(v < v3) {
            v2 = Math.max(v2, ((zzaxk)sparseArray0.valueAt(v)).zzg());
            ++v;
        }
        return v2 == 0x8000000000000000L ? this.J : v2;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzh() {
        if(this.B) {
            this.B = false;
            return this.J;
        }
        return 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final long zzi(long v) {
        if(!this.x.zzc()) {
            v = 0L;
        }
        this.J = v;
        SparseArray sparseArray0 = this.v;
        int v1 = sparseArray0.size();
        int v2 = true ^ this.c();
        for(int v3 = 0; v2 != 0; ++v3) {
            if(v3 >= v1) {
                this.B = false;
                return v;
            }
            if(this.F[v3]) {
                v2 = ((zzaxk)sparseArray0.valueAt(v3)).zzn(v, false);
            }
        }
        this.K = v;
        this.M = false;
        zzayx zzayx0 = this.p;
        if(zzayx0.zzi()) {
            zzayx0.zzf();
        }
        else {
            for(int v4 = 0; v4 < v1; ++v4) {
                ((zzaxk)sparseArray0.valueAt(v4)).zzj(this.F[v4]);
            }
        }
        this.B = false;
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final zzaxq zzn() {
        return this.D;
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final void zzq(long v) {
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final void zzs() {
        this.p.zzg(0x80000000);
    }

    @Override  // com.google.android.gms.internal.ads.zzayt
    public final void zzt(zzayv zzayv0, long v, long v1, boolean z) {
        if(this.I == -1L) {
            this.I = ((m1)zzayv0).i;
        }
        if(!z && this.C > 0) {
            SparseArray sparseArray0 = this.v;
            int v2 = sparseArray0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                ((zzaxk)sparseArray0.valueAt(v3)).zzj(this.F[v3]);
            }
            this.w.zze(this);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzayt
    public final void zzu(zzayv zzayv0, long v, long v1) {
        if(this.I == -1L) {
            this.I = ((m1)zzayv0).i;
        }
        this.M = true;
        if(this.E == 0x8000000000000001L) {
            SparseArray sparseArray0 = this.v;
            int v2 = sparseArray0.size();
            long v4 = 0x8000000000000000L;
            for(int v3 = 0; v3 < v2; ++v3) {
                v4 = Math.max(v4, ((zzaxk)sparseArray0.valueAt(v3)).zzg());
            }
            long v5 = v4 == 0x8000000000000000L ? 0L : v4 + 10000L;
            this.E = v5;
            zzaxo zzaxo0 = new zzaxo(v5, this.x.zzc());
            this.n.zzg(zzaxo0, null);
        }
        this.w.zze(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzaxj
    public final void zzv(zzart zzart0) {
        this.u.post(this.s);
    }

    @Override  // com.google.android.gms.internal.ads.zzawz
    public final void zzw(zzawy zzawy0, long v) {
        this.w = zzawy0;
        this.r.zzc();
        this.b();
    }
}

