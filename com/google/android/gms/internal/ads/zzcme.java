package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

public final class zzcme extends zzdj {
    public final zzchr i;
    public final Object j;
    public final boolean k;
    public final boolean l;
    public int m;
    public zzdn n;
    public boolean o;
    public boolean p;
    public float q;
    public float r;
    public float s;
    public boolean t;
    public boolean u;
    public zzbmj v;

    public zzcme(zzchr zzchr0, float f, boolean z, boolean z1) {
        this.j = new Object();
        this.p = true;
        this.i = zzchr0;
        this.q = f;
        this.k = z;
        this.l = z1;
    }

    public final void b(String s, Map map0) {
        HashMap hashMap0 = map0 == null ? new HashMap() : new HashMap(map0);
        hashMap0.put("action", s);
        zzcmc zzcmc0 = new zzcmc(this, hashMap0);
        zzcfv.zze.execute(zzcmc0);
    }

    public final void zzc(float f, float f1, int v, boolean z, float f2) {
        int v2;
        boolean z2;
        boolean z1 = true;
        synchronized(this.j) {
            if(f1 == this.q && f2 == this.s) {
                z1 = false;
            }
            this.q = f1;
            this.r = f;
            z2 = this.p;
            this.p = z;
            v2 = this.m;
            this.m = v;
            float f3 = this.s;
            this.s = f2;
            if(Math.abs(f2 - f3) > 0.0001f) {
                this.i.zzH().invalidate();
            }
        }
        if(z1) {
            zzbmj zzbmj0 = this.v;
            if(zzbmj0 != null) {
                try {
                    zzbmj0.zze();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
        zzcmd zzcmd0 = new zzcmd(this, v2, v, z2, z);
        zzcfv.zze.execute(zzcmd0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        synchronized(this.j) {
        }
        return this.s;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        synchronized(this.j) {
        }
        return this.r;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        synchronized(this.j) {
        }
        return this.q;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        synchronized(this.j) {
        }
        return this.m;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() throws RemoteException {
        synchronized(this.j) {
        }
        return this.n;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z) {
        this.b((z ? "mute" : "unmute"), null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        this.b("pause", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        this.b("play", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdn0) {
        synchronized(this.j) {
            this.n = zzdn0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        this.b("stop", null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        boolean z = false;
        boolean z1 = this.zzp();
        synchronized(this.j) {
            if(!z1 && this.u && this.l) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        boolean z = false;
        synchronized(this.j) {
            if(this.k && this.t) {
                z = true;
            }
        }
        return z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        synchronized(this.j) {
        }
        return this.p;
    }

    public final void zzs(zzff zzff0) {
        synchronized(this.j) {
            this.t = zzff0.zzb;
            this.u = zzff0.zzc;
        }
        this.b("initialState", CollectionUtils.mapOf("muteStart", (zzff0.zza ? "1" : "0"), "customControlsRequested", (zzff0.zzb ? "1" : "0"), "clickToExpandRequested", (zzff0.zzc ? "1" : "0")));
    }

    public final void zzt(float f) {
        synchronized(this.j) {
            this.r = f;
        }
    }

    public final void zzu() {
        int v;
        synchronized(this.j) {
            v = this.m;
            this.m = 3;
        }
        zzcmd zzcmd0 = new zzcmd(this, v, 3, this.p, this.p);
        zzcfv.zze.execute(zzcmd0);
    }

    public final void zzv(zzbmj zzbmj0) {
        synchronized(this.j) {
            this.v = zzbmj0;
        }
    }
}

