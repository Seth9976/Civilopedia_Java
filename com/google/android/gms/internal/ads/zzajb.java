package com.google.android.gms.internal.ads;

import A.f;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import f0.g;
import java.util.Collections;
import java.util.Map;

public abstract class zzajb implements Comparable {
    public final r0 i;
    public final int j;
    public final String k;
    public final int l;
    public final Object m;
    public final zzajf n;
    public Integer o;
    public zzaje p;
    public boolean q;
    public zzaik r;
    public g s;
    public final zzaip t;

    public zzajb(int v, String s, zzajf zzajf0) {
        this.i = r0.c ? new r0() : null;
        this.m = new Object();
        int v1 = 0;
        this.q = false;
        this.r = null;
        this.j = v;
        this.k = s;
        this.n = zzajf0;
        this.t = new zzaip();
        if(!TextUtils.isEmpty(s)) {
            Uri uri0 = Uri.parse(s);
            if(uri0 != null) {
                String s1 = uri0.getHost();
                if(s1 != null) {
                    v1 = s1.hashCode();
                }
            }
        }
        this.l = v1;
    }

    public abstract zzajh a(zzaix arg1);

    public abstract void b(Object arg1);

    public final void c(String s) {
        zzaje zzaje0 = this.p;
        if(zzaje0 != null) {
            synchronized(zzaje0.b) {
                zzaje0.b.remove(this);
            }
            synchronized(zzaje0.i) {
                for(Object object0: zzaje0.i) {
                    ((zzajd)object0).zza();
                }
            }
            zzaje0.a();
        }
        if(r0.c) {
            long v2 = Thread.currentThread().getId();
            if(Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new p0(this, s, v2, 0));
                return;
            }
            this.i.a(s, v2);
            this.i.b(this.toString());
        }
    }

    @Override
    public final int compareTo(Object object0) {
        return ((int)this.o) - ((int)((zzajb)object0).o);
    }

    public final void d() {
        g g0;
        synchronized(this.m) {
            g0 = this.s;
        }
        if(g0 != null) {
            g0.t(this);
        }
    }

    public final void e(zzajh zzajh0) {
        g g0;
        synchronized(this.m) {
            g0 = this.s;
        }
        if(g0 != null) {
            g0.u(this, zzajh0);
        }
    }

    public final void f() {
        zzaje zzaje0 = this.p;
        if(zzaje0 != null) {
            zzaje0.a();
        }
    }

    public final void g(g g0) {
        synchronized(this.m) {
            this.s = g0;
        }
    }

    @Override
    public final String toString() {
        return "[ ] " + this.k + " " + ("0x" + Integer.toHexString(this.l)) + " NORMAL " + this.o;
    }

    public final int zza() {
        return this.j;
    }

    public final int zzb() {
        return this.t.zzb();
    }

    public final int zzc() {
        return this.l;
    }

    public final zzaik zzd() {
        return this.r;
    }

    public final zzajb zze(zzaik zzaik0) {
        this.r = zzaik0;
        return this;
    }

    public final zzajb zzf(zzaje zzaje0) {
        this.p = zzaje0;
        return this;
    }

    public final zzajb zzg(int v) {
        this.o = v;
        return this;
    }

    public final String zzj() {
        return this.j == 0 ? this.k : f.i("1", "-", this.k);
    }

    public final String zzk() {
        return this.k;
    }

    public Map zzl() throws zzaij {
        return Collections.emptyMap();
    }

    public final void zzm(String s) {
        if(r0.c) {
            this.i.a(s, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzajk zzajk0) {
        zzajf zzajf0;
        synchronized(this.m) {
            zzajf0 = this.n;
        }
        if(zzajf0 != null) {
            zzajf0.zza(zzajk0);
        }
    }

    public final void zzq() {
        synchronized(this.m) {
            this.q = true;
        }
    }

    public final boolean zzv() {
        synchronized(this.m) {
        }
        return this.q;
    }

    public final boolean zzw() {
        synchronized(this.m) {
        }
        return false;
    }

    public byte[] zzx() throws zzaij {
        return null;
    }

    public final zzaip zzy() {
        return this.t;
    }
}

